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
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_GRID_IDT;
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
	"trnDscd", "atsMngNo", "atsWdrBkwAcno", "cucd", "atsRcvBkcd", "rcvAcno", "afchAtsRcvBkwAcno", "atsBasDd", "encyActPwno", "atsCycd", "atsChgAtsCycd", "atsAm", "atsStaDt", "afchAtsStaDt", "atsEndDt"
	, "afchAtsEndDt", "atsRqAdvpeEno", "rnpeNm", "afchAtsRnpeNm", "rqspeNm", "afchAtsRqspeNm", "atsTitl", "atsItcd", "atsItmTxt", "atsHldyPrcBscd", "atsAfchFndAcno", "cnt", "grid"
}, name="MnyPinFncTrnExecuteMnpAtsInf_DIDT")
@XmlRootElement(name="MnyPinFncTrnExecuteMnpAtsInf_DIDT")
@BxmCategory(logicalName="머니클립자동이체정보.컴포넌트.입력IO", description="") 
public class MnyPinFncTrnExecuteMnpAtsInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1317212695L;
	
	
	
	/**
	 * 거래구분코드
	 */
	@ApiModelProperty(
		name = "trnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDscd")
	@BxmOmm_Field(length=2, decimal=0, description="거래구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String trnDscd= "";
	
	
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
	 * 변경후자동이체입금전행계좌번호
	 */
	@ApiModelProperty(
		name = "afchAtsRcvBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afchAtsRcvBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="변경후자동이체입금전행계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String afchAtsRcvBkwAcno= "";
	
	
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
	 * 암호화계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화계좌비밀번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String encyActPwno= "";
	
	
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
	 * 자동이체변경자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsChgAtsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsChgAtsCycd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체변경자동이체주기코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsChgAtsCycd= "";
	
	
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
	 * 변경후자동이체시작일자
	 */
	@ApiModelProperty(
		name = "afchAtsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afchAtsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="변경후자동이체시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String afchAtsStaDt= "";
	
	
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
	 * 변경후자동이체종료일자
	 */
	@ApiModelProperty(
		name = "afchAtsEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afchAtsEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="변경후자동이체종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String afchAtsEndDt= "";
	
	
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
	 * 변경후자동이체수취인명
	 */
	@ApiModelProperty(
		name = "afchAtsRnpeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afchAtsRnpeNm")
	@BxmOmm_Field(length=50, decimal=0, description="변경후자동이체수취인명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String afchAtsRnpeNm= "";
	
	
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
	 * 변경후자동이체의뢰인명
	 */
	@ApiModelProperty(
		name = "afchAtsRqspeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afchAtsRqspeNm")
	@BxmOmm_Field(length=50, decimal=0, description="변경후자동이체의뢰인명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String afchAtsRqspeNm= "";
	
	
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
	 * 자동이체변경후펀드계좌번호
	 */
	@ApiModelProperty(
		name = "atsAfchFndAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsAfchFndAcno")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체변경후펀드계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsAfchFndAcno= "";
	
	
	/**
	 * 건수
	 */
	@ApiModelProperty(
		name = "cnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("cnt")
	@BxmOmm_Field(length=5, decimal=0, description="건수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer cnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_GRID_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="cnt", etcProperties={"EIMS_FLD_TYPE=G"})
	private List<IBSMR0006066_GRID_IDT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDscd= false;
	protected final boolean isSet_trnDscd(){
		return this.isSet_trnDscd;
	}
	private void setIsSet_trnDscd(boolean value){
		this.isSet_trnDscd= value;
	}
	/**
	 * 거래구분코드
	 */
	@XmlTransient
	public String getTrnDscd(){
		return this.trnDscd;
	}
	
	/**
	 * 거래구분코드
	 * 
	 * @param trnDscd 거래구분코드
	 */
	public void setTrnDscd(String trnDscd){
		this.trnDscd= trnDscd;
		this.setIsSet_trnDscd(true);
	}
	
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
	private boolean isSet_afchAtsRcvBkwAcno= false;
	protected final boolean isSet_afchAtsRcvBkwAcno(){
		return this.isSet_afchAtsRcvBkwAcno;
	}
	private void setIsSet_afchAtsRcvBkwAcno(boolean value){
		this.isSet_afchAtsRcvBkwAcno= value;
	}
	/**
	 * 변경후자동이체입금전행계좌번호
	 */
	@XmlTransient
	public String getAfchAtsRcvBkwAcno(){
		return this.afchAtsRcvBkwAcno;
	}
	
	/**
	 * 변경후자동이체입금전행계좌번호
	 * 
	 * @param afchAtsRcvBkwAcno 변경후자동이체입금전행계좌번호
	 */
	public void setAfchAtsRcvBkwAcno(String afchAtsRcvBkwAcno){
		this.afchAtsRcvBkwAcno= afchAtsRcvBkwAcno;
		this.setIsSet_afchAtsRcvBkwAcno(true);
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
	private boolean isSet_encyActPwno= false;
	protected final boolean isSet_encyActPwno(){
		return this.isSet_encyActPwno;
	}
	private void setIsSet_encyActPwno(boolean value){
		this.isSet_encyActPwno= value;
	}
	/**
	 * 암호화계좌비밀번호
	 */
	@XmlTransient
	public String getEncyActPwno(){
		return this.encyActPwno;
	}
	
	/**
	 * 암호화계좌비밀번호
	 * 
	 * @param encyActPwno 암호화계좌비밀번호
	 */
	public void setEncyActPwno(String encyActPwno){
		this.encyActPwno= encyActPwno;
		this.setIsSet_encyActPwno(true);
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
	private boolean isSet_atsChgAtsCycd= false;
	protected final boolean isSet_atsChgAtsCycd(){
		return this.isSet_atsChgAtsCycd;
	}
	private void setIsSet_atsChgAtsCycd(boolean value){
		this.isSet_atsChgAtsCycd= value;
	}
	/**
	 * 자동이체변경자동이체주기코드
	 */
	@XmlTransient
	public String getAtsChgAtsCycd(){
		return this.atsChgAtsCycd;
	}
	
	/**
	 * 자동이체변경자동이체주기코드
	 * 
	 * @param atsChgAtsCycd 자동이체변경자동이체주기코드
	 */
	public void setAtsChgAtsCycd(String atsChgAtsCycd){
		this.atsChgAtsCycd= atsChgAtsCycd;
		this.setIsSet_atsChgAtsCycd(true);
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
	private boolean isSet_afchAtsStaDt= false;
	protected final boolean isSet_afchAtsStaDt(){
		return this.isSet_afchAtsStaDt;
	}
	private void setIsSet_afchAtsStaDt(boolean value){
		this.isSet_afchAtsStaDt= value;
	}
	/**
	 * 변경후자동이체시작일자
	 */
	@XmlTransient
	public String getAfchAtsStaDt(){
		return this.afchAtsStaDt;
	}
	
	/**
	 * 변경후자동이체시작일자
	 * 
	 * @param afchAtsStaDt 변경후자동이체시작일자
	 */
	public void setAfchAtsStaDt(String afchAtsStaDt){
		this.afchAtsStaDt= afchAtsStaDt;
		this.setIsSet_afchAtsStaDt(true);
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
	private boolean isSet_afchAtsEndDt= false;
	protected final boolean isSet_afchAtsEndDt(){
		return this.isSet_afchAtsEndDt;
	}
	private void setIsSet_afchAtsEndDt(boolean value){
		this.isSet_afchAtsEndDt= value;
	}
	/**
	 * 변경후자동이체종료일자
	 */
	@XmlTransient
	public String getAfchAtsEndDt(){
		return this.afchAtsEndDt;
	}
	
	/**
	 * 변경후자동이체종료일자
	 * 
	 * @param afchAtsEndDt 변경후자동이체종료일자
	 */
	public void setAfchAtsEndDt(String afchAtsEndDt){
		this.afchAtsEndDt= afchAtsEndDt;
		this.setIsSet_afchAtsEndDt(true);
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
	private boolean isSet_afchAtsRnpeNm= false;
	protected final boolean isSet_afchAtsRnpeNm(){
		return this.isSet_afchAtsRnpeNm;
	}
	private void setIsSet_afchAtsRnpeNm(boolean value){
		this.isSet_afchAtsRnpeNm= value;
	}
	/**
	 * 변경후자동이체수취인명
	 */
	@XmlTransient
	public String getAfchAtsRnpeNm(){
		return this.afchAtsRnpeNm;
	}
	
	/**
	 * 변경후자동이체수취인명
	 * 
	 * @param afchAtsRnpeNm 변경후자동이체수취인명
	 */
	public void setAfchAtsRnpeNm(String afchAtsRnpeNm){
		this.afchAtsRnpeNm= afchAtsRnpeNm;
		this.setIsSet_afchAtsRnpeNm(true);
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
	private boolean isSet_afchAtsRqspeNm= false;
	protected final boolean isSet_afchAtsRqspeNm(){
		return this.isSet_afchAtsRqspeNm;
	}
	private void setIsSet_afchAtsRqspeNm(boolean value){
		this.isSet_afchAtsRqspeNm= value;
	}
	/**
	 * 변경후자동이체의뢰인명
	 */
	@XmlTransient
	public String getAfchAtsRqspeNm(){
		return this.afchAtsRqspeNm;
	}
	
	/**
	 * 변경후자동이체의뢰인명
	 * 
	 * @param afchAtsRqspeNm 변경후자동이체의뢰인명
	 */
	public void setAfchAtsRqspeNm(String afchAtsRqspeNm){
		this.afchAtsRqspeNm= afchAtsRqspeNm;
		this.setIsSet_afchAtsRqspeNm(true);
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
	private boolean isSet_atsAfchFndAcno= false;
	protected final boolean isSet_atsAfchFndAcno(){
		return this.isSet_atsAfchFndAcno;
	}
	private void setIsSet_atsAfchFndAcno(boolean value){
		this.isSet_atsAfchFndAcno= value;
	}
	/**
	 * 자동이체변경후펀드계좌번호
	 */
	@XmlTransient
	public String getAtsAfchFndAcno(){
		return this.atsAfchFndAcno;
	}
	
	/**
	 * 자동이체변경후펀드계좌번호
	 * 
	 * @param atsAfchFndAcno 자동이체변경후펀드계좌번호
	 */
	public void setAtsAfchFndAcno(String atsAfchFndAcno){
		this.atsAfchFndAcno= atsAfchFndAcno;
		this.setIsSet_atsAfchFndAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnt= false;
	protected final boolean isSet_cnt(){
		return this.isSet_cnt;
	}
	private void setIsSet_cnt(boolean value){
		this.isSet_cnt= value;
	}
	/**
	 * 건수
	 */
	@XmlElement
	public Integer getCnt(){
		if ( isSet_cnt )	return cnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
	}
	
	/**
	 * 건수
	 * 
	 * @param cnt 건수
	 */
	public void setCnt(Integer cnt){
		this.cnt= cnt;
		this.setIsSet_cnt(true);
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
	 * 그리드
	 */
	@XmlTransient
	public List<IBSMR0006066_GRID_IDT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<IBSMR0006066_GRID_IDT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(IBSMR0006066_GRID_IDT... items){
		List<IBSMR0006066_GRID_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( IBSMR0006066_GRID_IDT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MnyPinFncTrnExecuteMnpAtsInf_DIDT clone(){
		try{
			MnyPinFncTrnExecuteMnpAtsInf_DIDT object= (MnyPinFncTrnExecuteMnpAtsInf_DIDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<IBSMR0006066_GRID_IDT> clonedList= new ArrayList<>(this.grid.size());
				for( IBSMR0006066_GRID_IDT item : grid ){
					clonedList.add((IBSMR0006066_GRID_IDT)item.clone());
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
		
		result= prime * result + ((this.trnDscd==null)?0:this.trnDscd.hashCode());
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.atsRcvBkcd==null)?0:this.atsRcvBkcd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.afchAtsRcvBkwAcno==null)?0:this.afchAtsRcvBkwAcno.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		result= prime * result + ((this.encyActPwno==null)?0:this.encyActPwno.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsChgAtsCycd==null)?0:this.atsChgAtsCycd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.afchAtsStaDt==null)?0:this.afchAtsStaDt.hashCode());
		result= prime * result + ((this.atsEndDt==null)?0:this.atsEndDt.hashCode());
		result= prime * result + ((this.afchAtsEndDt==null)?0:this.afchAtsEndDt.hashCode());
		result= prime * result + ((this.atsRqAdvpeEno==null)?0:this.atsRqAdvpeEno.hashCode());
		result= prime * result + ((this.rnpeNm==null)?0:this.rnpeNm.hashCode());
		result= prime * result + ((this.afchAtsRnpeNm==null)?0:this.afchAtsRnpeNm.hashCode());
		result= prime * result + ((this.rqspeNm==null)?0:this.rqspeNm.hashCode());
		result= prime * result + ((this.afchAtsRqspeNm==null)?0:this.afchAtsRqspeNm.hashCode());
		result= prime * result + ((this.atsTitl==null)?0:this.atsTitl.hashCode());
		result= prime * result + ((this.atsItcd==null)?0:this.atsItcd.hashCode());
		result= prime * result + ((this.atsItmTxt==null)?0:this.atsItmTxt.hashCode());
		result= prime * result + ((this.atsHldyPrcBscd==null)?0:this.atsHldyPrcBscd.hashCode());
		result= prime * result + ((this.atsAfchFndAcno==null)?0:this.atsAfchFndAcno.hashCode());
		result= prime * result + ((this.cnt==null)?0:this.cnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnExecuteMnpAtsInf_DIDT other= (MnyPinFncTrnExecuteMnpAtsInf_DIDT)obj;
		{
			Object _trnDscd= getTrnDscd();
			Object __trnDscd= other.getTrnDscd();
			if ( _trnDscd== null ) { if ( __trnDscd!= null ) return false; }
			else if ( !_trnDscd.equals(__trnDscd) ) return false;
		}
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
			Object _afchAtsRcvBkwAcno= getAfchAtsRcvBkwAcno();
			Object __afchAtsRcvBkwAcno= other.getAfchAtsRcvBkwAcno();
			if ( _afchAtsRcvBkwAcno== null ) { if ( __afchAtsRcvBkwAcno!= null ) return false; }
			else if ( !_afchAtsRcvBkwAcno.equals(__afchAtsRcvBkwAcno) ) return false;
		}
		{
			Object _atsBasDd= getAtsBasDd();
			Object __atsBasDd= other.getAtsBasDd();
			if ( _atsBasDd== null ) { if ( __atsBasDd!= null ) return false; }
			else if ( !_atsBasDd.equals(__atsBasDd) ) return false;
		}
		{
			Object _encyActPwno= getEncyActPwno();
			Object __encyActPwno= other.getEncyActPwno();
			if ( _encyActPwno== null ) { if ( __encyActPwno!= null ) return false; }
			else if ( !_encyActPwno.equals(__encyActPwno) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsChgAtsCycd= getAtsChgAtsCycd();
			Object __atsChgAtsCycd= other.getAtsChgAtsCycd();
			if ( _atsChgAtsCycd== null ) { if ( __atsChgAtsCycd!= null ) return false; }
			else if ( !_atsChgAtsCycd.equals(__atsChgAtsCycd) ) return false;
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
			Object _afchAtsStaDt= getAfchAtsStaDt();
			Object __afchAtsStaDt= other.getAfchAtsStaDt();
			if ( _afchAtsStaDt== null ) { if ( __afchAtsStaDt!= null ) return false; }
			else if ( !_afchAtsStaDt.equals(__afchAtsStaDt) ) return false;
		}
		{
			Object _atsEndDt= getAtsEndDt();
			Object __atsEndDt= other.getAtsEndDt();
			if ( _atsEndDt== null ) { if ( __atsEndDt!= null ) return false; }
			else if ( !_atsEndDt.equals(__atsEndDt) ) return false;
		}
		{
			Object _afchAtsEndDt= getAfchAtsEndDt();
			Object __afchAtsEndDt= other.getAfchAtsEndDt();
			if ( _afchAtsEndDt== null ) { if ( __afchAtsEndDt!= null ) return false; }
			else if ( !_afchAtsEndDt.equals(__afchAtsEndDt) ) return false;
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
			Object _afchAtsRnpeNm= getAfchAtsRnpeNm();
			Object __afchAtsRnpeNm= other.getAfchAtsRnpeNm();
			if ( _afchAtsRnpeNm== null ) { if ( __afchAtsRnpeNm!= null ) return false; }
			else if ( !_afchAtsRnpeNm.equals(__afchAtsRnpeNm) ) return false;
		}
		{
			Object _rqspeNm= getRqspeNm();
			Object __rqspeNm= other.getRqspeNm();
			if ( _rqspeNm== null ) { if ( __rqspeNm!= null ) return false; }
			else if ( !_rqspeNm.equals(__rqspeNm) ) return false;
		}
		{
			Object _afchAtsRqspeNm= getAfchAtsRqspeNm();
			Object __afchAtsRqspeNm= other.getAfchAtsRqspeNm();
			if ( _afchAtsRqspeNm== null ) { if ( __afchAtsRqspeNm!= null ) return false; }
			else if ( !_afchAtsRqspeNm.equals(__afchAtsRqspeNm) ) return false;
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
			Object _atsAfchFndAcno= getAtsAfchFndAcno();
			Object __atsAfchFndAcno= other.getAtsAfchFndAcno();
			if ( _atsAfchFndAcno== null ) { if ( __atsAfchFndAcno!= null ) return false; }
			else if ( !_atsAfchFndAcno.equals(__atsAfchFndAcno) ) return false;
		}
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
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
	
		sb.append("\n[").append(MnyPinFncTrnExecuteMnpAtsInf_DIDT.class.getName()).append(":\n");
		sb.append("\ttrnDscd: ");
		sb.append(trnDscd==null?"null":getTrnDscd());
		sb.append("\n");
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
		sb.append("\tafchAtsRcvBkwAcno: ");
		sb.append(afchAtsRcvBkwAcno==null?"null":getAfchAtsRcvBkwAcno());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("\tencyActPwno: ");
		sb.append(encyActPwno==null?"null":getEncyActPwno());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsChgAtsCycd: ");
		sb.append(atsChgAtsCycd==null?"null":getAtsChgAtsCycd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatsStaDt: ");
		sb.append(atsStaDt==null?"null":getAtsStaDt());
		sb.append("\n");
		sb.append("\tafchAtsStaDt: ");
		sb.append(afchAtsStaDt==null?"null":getAfchAtsStaDt());
		sb.append("\n");
		sb.append("\tatsEndDt: ");
		sb.append(atsEndDt==null?"null":getAtsEndDt());
		sb.append("\n");
		sb.append("\tafchAtsEndDt: ");
		sb.append(afchAtsEndDt==null?"null":getAfchAtsEndDt());
		sb.append("\n");
		sb.append("\tatsRqAdvpeEno: ");
		sb.append(atsRqAdvpeEno==null?"null":getAtsRqAdvpeEno());
		sb.append("\n");
		sb.append("\trnpeNm: ");
		sb.append(rnpeNm==null?"null":getRnpeNm());
		sb.append("\n");
		sb.append("\tafchAtsRnpeNm: ");
		sb.append(afchAtsRnpeNm==null?"null":getAfchAtsRnpeNm());
		sb.append("\n");
		sb.append("\trqspeNm: ");
		sb.append(rqspeNm==null?"null":getRqspeNm());
		sb.append("\n");
		sb.append("\tafchAtsRqspeNm: ");
		sb.append(afchAtsRqspeNm==null?"null":getAfchAtsRqspeNm());
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
		sb.append("\tatsAfchFndAcno: ");
		sb.append(atsAfchFndAcno==null?"null":getAtsAfchFndAcno());
		sb.append("\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
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
		
		messageLen+= 2; /* trnDscd */
		messageLen+= 13; /* atsMngNo */
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 3; /* cucd */
		messageLen+= 3; /* atsRcvBkcd */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 20; /* afchAtsRcvBkwAcno */
		messageLen+= 2; /* atsBasDd */
		messageLen+= 32; /* encyActPwno */
		messageLen+= 2; /* atsCycd */
		messageLen+= 2; /* atsChgAtsCycd */
		messageLen+= 18; /* atsAm */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 8; /* afchAtsStaDt */
		messageLen+= 8; /* atsEndDt */
		messageLen+= 8; /* afchAtsEndDt */
		messageLen+= 8; /* atsRqAdvpeEno */
		messageLen+= 40; /* rnpeNm */
		messageLen+= 50; /* afchAtsRnpeNm */
		messageLen+= 16; /* rqspeNm */
		messageLen+= 50; /* afchAtsRqspeNm */
		messageLen+= 30; /* atsTitl */
		messageLen+= 2; /* atsItcd */
		messageLen+= 70; /* atsItmTxt */
		messageLen+= 1; /* atsHldyPrcBscd */
		messageLen+= 13; /* atsAfchFndAcno */
		messageLen+= 5; /* cnt */
		{/*grid*/
			int size=getCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			IBSMR0006066_GRID_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					IBSMR0006066_GRID_IDT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_GRID_IDT();
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
	
		list.add("trnDscd");
		list.add("atsMngNo");
		list.add("atsWdrBkwAcno");
		list.add("cucd");
		list.add("atsRcvBkcd");
		list.add("rcvAcno");
		list.add("afchAtsRcvBkwAcno");
		list.add("atsBasDd");
		list.add("encyActPwno");
		list.add("atsCycd");
		list.add("atsChgAtsCycd");
		list.add("atsAm");
		list.add("atsStaDt");
		list.add("afchAtsStaDt");
		list.add("atsEndDt");
		list.add("afchAtsEndDt");
		list.add("atsRqAdvpeEno");
		list.add("rnpeNm");
		list.add("afchAtsRnpeNm");
		list.add("rqspeNm");
		list.add("afchAtsRqspeNm");
		list.add("atsTitl");
		list.add("atsItcd");
		list.add("atsItmTxt");
		list.add("atsHldyPrcBscd");
		list.add("atsAfchFndAcno");
		list.add("cnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDscd", get("trnDscd"));
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("cucd", get("cucd"));
		map.put("atsRcvBkcd", get("atsRcvBkcd"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("afchAtsRcvBkwAcno", get("afchAtsRcvBkwAcno"));
		map.put("atsBasDd", get("atsBasDd"));
		map.put("encyActPwno", get("encyActPwno"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsChgAtsCycd", get("atsChgAtsCycd"));
		map.put("atsAm", get("atsAm"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("afchAtsStaDt", get("afchAtsStaDt"));
		map.put("atsEndDt", get("atsEndDt"));
		map.put("afchAtsEndDt", get("afchAtsEndDt"));
		map.put("atsRqAdvpeEno", get("atsRqAdvpeEno"));
		map.put("rnpeNm", get("rnpeNm"));
		map.put("afchAtsRnpeNm", get("afchAtsRnpeNm"));
		map.put("rqspeNm", get("rqspeNm"));
		map.put("afchAtsRqspeNm", get("afchAtsRqspeNm"));
		map.put("atsTitl", get("atsTitl"));
		map.put("atsItcd", get("atsItcd"));
		map.put("atsItmTxt", get("atsItmTxt"));
		map.put("atsHldyPrcBscd", get("atsHldyPrcBscd"));
		map.put("atsAfchFndAcno", get("atsAfchFndAcno"));
		map.put("cnt", get("cnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1056305408:/* trnDscd */
			return getTrnDscd();
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
		case -1185608894:/* afchAtsRcvBkwAcno */
			return getAfchAtsRcvBkwAcno();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		case 1134290395:/* encyActPwno */
			return getEncyActPwno();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case -262439467:/* atsChgAtsCycd */
			return getAtsChgAtsCycd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 321328506:/* afchAtsStaDt */
			return getAfchAtsStaDt();
		case 484573195:/* atsEndDt */
			return getAtsEndDt();
		case 308223349:/* afchAtsEndDt */
			return getAfchAtsEndDt();
		case 1248629757:/* atsRqAdvpeEno */
			return getAtsRqAdvpeEno();
		case -926220592:/* rnpeNm */
			return getRnpeNm();
		case 1337556326:/* afchAtsRnpeNm */
			return getAfchAtsRnpeNm();
		case 1440939688:/* rqspeNm */
			return getRqspeNm();
		case -1396419886:/* afchAtsRqspeNm */
			return getAfchAtsRqspeNm();
		case -676662675:/* atsTitl */
			return getAtsTitl();
		case -676980340:/* atsItcd */
			return getAtsItcd();
		case -2037758674:/* atsItmTxt */
			return getAtsItmTxt();
		case 1622868250:/* atsHldyPrcBscd */
			return getAtsHldyPrcBscd();
		case 46449333:/* atsAfchFndAcno */
			return getAtsAfchFndAcno();
		case 98665:/* cnt */
			return getCnt();
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
		case -1056305408:/* trnDscd */
			setTrnDscd((String)value);
			break;
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
		case -1185608894:/* afchAtsRcvBkwAcno */
			setAfchAtsRcvBkwAcno((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		case 1134290395:/* encyActPwno */
			setEncyActPwno((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case -262439467:/* atsChgAtsCycd */
			setAtsChgAtsCycd((String)value);
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
		case 321328506:/* afchAtsStaDt */
			setAfchAtsStaDt((String)value);
			break;
		case 484573195:/* atsEndDt */
			setAtsEndDt((String)value);
			break;
		case 308223349:/* afchAtsEndDt */
			setAfchAtsEndDt((String)value);
			break;
		case 1248629757:/* atsRqAdvpeEno */
			setAtsRqAdvpeEno((String)value);
			break;
		case -926220592:/* rnpeNm */
			setRnpeNm((String)value);
			break;
		case 1337556326:/* afchAtsRnpeNm */
			setAfchAtsRnpeNm((String)value);
			break;
		case 1440939688:/* rqspeNm */
			setRqspeNm((String)value);
			break;
		case -1396419886:/* afchAtsRqspeNm */
			setAfchAtsRqspeNm((String)value);
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
		case 46449333:/* atsAfchFndAcno */
			setAtsAfchFndAcno((String)value);
			break;
		case 98665:/* cnt */
			setCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<IBSMR0006066_GRID_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
