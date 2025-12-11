/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.adapter.DateToStringAdapter;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 나만의알림조회DTO
 */
@XmlType(propOrder={
	"itcsno", "seqno", "userId", "trNotiYn", "alimiType", "ntfcTxt", "ntfcFm", "month", "day", "weekdayNm", "alimiTm", "tsNm", "wdrAcno", "tsAmt", "rcvBkcd"
	, "rcvAcno", "wdrPbokMrk", "rcvPbokMrk", "mretTsYn", "etc1", "etc2", "etc3", "etc4", "notiTmpTyp", "rgsDh", "chgDh", "eaiTrsmnDt", "eaiTrsmnSrno", "eaiTmsRtcd", "eaiTmsRstDtm"
}, name="INBMyNtfc_DTO")
@XmlRootElement(name="INBMyNtfc_DTO")
@BxmCategory(logicalName="나만의알림조회DTO", description="나만의알림조회DTO") 
public class INBMyNtfc_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1462522980L;
	
	private static class DateToStringAdapter_rgsDh 
	extends DateToStringAdapter{
		private DateToStringAdapter_rgsDh(){
			super("yyyyMMdd hh:mm:ss");
		}
	}
	@JsonIgnore
	transient private DateToStringAdapter_rgsDh rgsDhAdapter= new DateToStringAdapter_rgsDh();
	
	private static class DateToStringAdapter_chgDh 
	extends DateToStringAdapter{
		private DateToStringAdapter_chgDh(){
			super("yyyyMMdd hh:mm:ss");
		}
	}
	@JsonIgnore
	transient private DateToStringAdapter_chgDh chgDhAdapter= new DateToStringAdapter_chgDh();
	
	
	
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
	 * 순서번호
	 */
	@ApiModelProperty(
		name = "seqno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("seqno")
	@BxmOmm_Field(length=20, decimal=0, description="순서번호", align="left", fill="")
	private String seqno= "";
	
	
	/**
	 * 사용자ID
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=20, decimal=0, description="사용자ID", align="left", fill="")
	private String userId= "";
	
	
	/**
	 * 알림수신여부
	 */
	@ApiModelProperty(
		name = "trNotiYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trNotiYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림수신여부", align="left", fill="")
	private String trNotiYn= "";
	
	
	/**
	 * 알림구분
	 */
	@ApiModelProperty(
		name = "alimiType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("alimiType")
	@BxmOmm_Field(length=4, decimal=0, description="알림구분", align="left", fill="")
	private String alimiType= "";
	
	
	/**
	 * 알림내용
	 */
	@ApiModelProperty(
		name = "ntfcTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcTxt")
	@BxmOmm_Field(length=2000, decimal=0, description="알림내용", align="left", fill="")
	private String ntfcTxt= "";
	
	
	/**
	 * 알림방식
	 */
	@ApiModelProperty(
		name = "ntfcFm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcFm")
	@BxmOmm_Field(length=10, decimal=0, description="알림방식", align="left", fill="")
	private String ntfcFm= "";
	
	
	/**
	 * 월
	 */
	@ApiModelProperty(
		name = "month"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("month")
	@BxmOmm_Field(length=10, decimal=0, description="월", align="left", fill="")
	private String month= "";
	
	
	/**
	 * 일
	 */
	@ApiModelProperty(
		name = "day"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("day")
	@BxmOmm_Field(length=10, decimal=0, description="일", align="left", fill="")
	private String day= "";
	
	
	/**
	 * 요일명
	 */
	@ApiModelProperty(
		name = "weekdayNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("weekdayNm")
	@BxmOmm_Field(length=10, decimal=0, description="요일명", align="left", fill="")
	private String weekdayNm= "";
	
	
	/**
	 * 알림시각
	 */
	@ApiModelProperty(
		name = "alimiTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("alimiTm")
	@BxmOmm_Field(length=6, decimal=0, description="알림시각", align="left", fill="")
	private String alimiTm= "";
	
	
	/**
	 * 이체명
	 */
	@ApiModelProperty(
		name = "tsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsNm")
	@BxmOmm_Field(length=100, decimal=0, description="이체명", align="left", fill="")
	private String tsNm= "";
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=13, decimal=0, description="출금계좌번호", align="left", fill="")
	private String wdrAcno= "";
	
	
	/**
	 * 이체금액
	 */
	@ApiModelProperty(
		name = "tsAmt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsAmt")
	@BxmOmm_Field(length=100, decimal=0, description="이체금액", align="left", fill="")
	private String tsAmt= "";
	
	
	/**
	 * 입금은행코드
	 */
	@ApiModelProperty(
		name = "rcvBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="입금은행코드", align="left", fill="")
	private String rcvBkcd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=20, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rcvAcno= "";
	
	
	/**
	 * 출금통장표시내용
	 */
	@ApiModelProperty(
		name = "wdrPbokMrk"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrPbokMrk")
	@BxmOmm_Field(length=22, decimal=0, description="출금통장표시내용", align="left", fill="")
	private String wdrPbokMrk= "";
	
	
	/**
	 * 입금통장표시내용
	 */
	@ApiModelProperty(
		name = "rcvPbokMrk"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvPbokMrk")
	@BxmOmm_Field(length=22, decimal=0, description="입금통장표시내용", align="left", fill="")
	private String rcvPbokMrk= "";
	
	
	/**
	 * 월세이체여부
	 */
	@ApiModelProperty(
		name = "mretTsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mretTsYn")
	@BxmOmm_Field(length=1, decimal=0, description="월세이체여부", align="left", fill="")
	private String mretTsYn= "";
	
	
	/**
	 * 기타1
	 */
	@ApiModelProperty(
		name = "etc1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etc1")
	@BxmOmm_Field(length=1000, decimal=0, description="기타1", align="left", fill="")
	private String etc1= "";
	
	
	/**
	 * 기타2
	 */
	@ApiModelProperty(
		name = "etc2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etc2")
	@BxmOmm_Field(length=100, decimal=0, description="기타2", align="left", fill="")
	private String etc2= "";
	
	
	/**
	 * 기타3
	 */
	@ApiModelProperty(
		name = "etc3"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etc3")
	@BxmOmm_Field(length=100, decimal=0, description="기타3", align="left", fill="")
	private String etc3= "";
	
	
	/**
	 * 기타4
	 */
	@ApiModelProperty(
		name = "etc4"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etc4")
	@BxmOmm_Field(length=100, decimal=0, description="기타4", align="left", fill="")
	private String etc4= "";
	
	
	/**
	 * 알림 템플릿 유형
	 */
	@ApiModelProperty(
		name = "notiTmpTyp"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("notiTmpTyp")
	@BxmOmm_Field(length=18, decimal=0, description="알림 템플릿 유형", align="left", fill="")
	private String notiTmpTyp= "";
	
	
	/**
	 * 등록일시
	 */
	@ApiModelProperty(
		name = "rgsDh"
		, dataType = "java.util.Date"
		)
	@XmlJavaTypeAdapter(value=DateToStringAdapter_rgsDh.class)
	@JsonProperty("rgsDh")
	@BxmOmm_Field(length=12, decimal=6, description="등록일시", align="left", fill="", formatType="date", format="yyyyMMdd hh:mm:ss")
	private Date rgsDh= null;
	
	
	/**
	 * 변경일시
	 */
	@ApiModelProperty(
		name = "chgDh"
		, dataType = "java.util.Date"
		)
	@XmlJavaTypeAdapter(value=DateToStringAdapter_chgDh.class)
	@JsonProperty("chgDh")
	@BxmOmm_Field(length=12, decimal=6, description="변경일시", align="left", fill="", formatType="date", format="yyyyMMdd hh:mm:ss")
	private Date chgDh= null;
	
	
	/**
	 * EAI전송관리일자
	 */
	@ApiModelProperty(
		name = "eaiTrsmnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eaiTrsmnDt")
	@BxmOmm_Field(length=8, decimal=0, description="EAI전송관리일자", align="left", fill="")
	private String eaiTrsmnDt= "";
	
	
	/**
	 * EAI전송관리일련번호
	 */
	@ApiModelProperty(
		name = "eaiTrsmnSrno"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("eaiTrsmnSrno")
	@BxmOmm_Field(length=20, decimal=0, description="EAI전송관리일련번호", align="right", fill="")
	private BigDecimal eaiTrsmnSrno= new BigDecimal("0");
	
	
	/**
	 * EAI전송결과코드
	 */
	@ApiModelProperty(
		name = "eaiTmsRtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eaiTmsRtcd")
	@BxmOmm_Field(length=1, decimal=0, description="EAI전송결과코드", align="left", fill="")
	private String eaiTmsRtcd= "";
	
	
	/**
	 * EAI전송결과일시
	 */
	@ApiModelProperty(
		name = "eaiTmsRstDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eaiTmsRstDtm")
	@BxmOmm_Field(length=20, decimal=0, description="EAI전송결과일시", align="left", fill="")
	private String eaiTmsRstDtm= "";
	
	
	
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
	private boolean isSet_seqno= false;
	protected final boolean isSet_seqno(){
		return this.isSet_seqno;
	}
	private void setIsSet_seqno(boolean value){
		this.isSet_seqno= value;
	}
	/**
	 * 순서번호
	 */
	@XmlTransient
	public String getSeqno(){
		return this.seqno;
	}
	
	/**
	 * 순서번호
	 * 
	 * @param seqno 순서번호
	 */
	public void setSeqno(String seqno){
		this.seqno= seqno;
		this.setIsSet_seqno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userId= false;
	protected final boolean isSet_userId(){
		return this.isSet_userId;
	}
	private void setIsSet_userId(boolean value){
		this.isSet_userId= value;
	}
	/**
	 * 사용자ID
	 */
	@XmlTransient
	public String getUserId(){
		return this.userId;
	}
	
	/**
	 * 사용자ID
	 * 
	 * @param userId 사용자ID
	 */
	public void setUserId(String userId){
		this.userId= userId;
		this.setIsSet_userId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trNotiYn= false;
	protected final boolean isSet_trNotiYn(){
		return this.isSet_trNotiYn;
	}
	private void setIsSet_trNotiYn(boolean value){
		this.isSet_trNotiYn= value;
	}
	/**
	 * 알림수신여부
	 */
	@XmlTransient
	public String getTrNotiYn(){
		return this.trNotiYn;
	}
	
	/**
	 * 알림수신여부
	 * 
	 * @param trNotiYn 알림수신여부
	 */
	public void setTrNotiYn(String trNotiYn){
		this.trNotiYn= trNotiYn;
		this.setIsSet_trNotiYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_alimiType= false;
	protected final boolean isSet_alimiType(){
		return this.isSet_alimiType;
	}
	private void setIsSet_alimiType(boolean value){
		this.isSet_alimiType= value;
	}
	/**
	 * 알림구분
	 */
	@XmlTransient
	public String getAlimiType(){
		return this.alimiType;
	}
	
	/**
	 * 알림구분
	 * 
	 * @param alimiType 알림구분
	 */
	public void setAlimiType(String alimiType){
		this.alimiType= alimiType;
		this.setIsSet_alimiType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcTxt= false;
	protected final boolean isSet_ntfcTxt(){
		return this.isSet_ntfcTxt;
	}
	private void setIsSet_ntfcTxt(boolean value){
		this.isSet_ntfcTxt= value;
	}
	/**
	 * 알림내용
	 */
	@XmlTransient
	public String getNtfcTxt(){
		return this.ntfcTxt;
	}
	
	/**
	 * 알림내용
	 * 
	 * @param ntfcTxt 알림내용
	 */
	public void setNtfcTxt(String ntfcTxt){
		this.ntfcTxt= ntfcTxt;
		this.setIsSet_ntfcTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcFm= false;
	protected final boolean isSet_ntfcFm(){
		return this.isSet_ntfcFm;
	}
	private void setIsSet_ntfcFm(boolean value){
		this.isSet_ntfcFm= value;
	}
	/**
	 * 알림방식
	 */
	@XmlTransient
	public String getNtfcFm(){
		return this.ntfcFm;
	}
	
	/**
	 * 알림방식
	 * 
	 * @param ntfcFm 알림방식
	 */
	public void setNtfcFm(String ntfcFm){
		this.ntfcFm= ntfcFm;
		this.setIsSet_ntfcFm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_month= false;
	protected final boolean isSet_month(){
		return this.isSet_month;
	}
	private void setIsSet_month(boolean value){
		this.isSet_month= value;
	}
	/**
	 * 월
	 */
	@XmlTransient
	public String getMonth(){
		return this.month;
	}
	
	/**
	 * 월
	 * 
	 * @param month 월
	 */
	public void setMonth(String month){
		this.month= month;
		this.setIsSet_month(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_day= false;
	protected final boolean isSet_day(){
		return this.isSet_day;
	}
	private void setIsSet_day(boolean value){
		this.isSet_day= value;
	}
	/**
	 * 일
	 */
	@XmlTransient
	public String getDay(){
		return this.day;
	}
	
	/**
	 * 일
	 * 
	 * @param day 일
	 */
	public void setDay(String day){
		this.day= day;
		this.setIsSet_day(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_weekdayNm= false;
	protected final boolean isSet_weekdayNm(){
		return this.isSet_weekdayNm;
	}
	private void setIsSet_weekdayNm(boolean value){
		this.isSet_weekdayNm= value;
	}
	/**
	 * 요일명
	 */
	@XmlTransient
	public String getWeekdayNm(){
		return this.weekdayNm;
	}
	
	/**
	 * 요일명
	 * 
	 * @param weekdayNm 요일명
	 */
	public void setWeekdayNm(String weekdayNm){
		this.weekdayNm= weekdayNm;
		this.setIsSet_weekdayNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_alimiTm= false;
	protected final boolean isSet_alimiTm(){
		return this.isSet_alimiTm;
	}
	private void setIsSet_alimiTm(boolean value){
		this.isSet_alimiTm= value;
	}
	/**
	 * 알림시각
	 */
	@XmlTransient
	public String getAlimiTm(){
		return this.alimiTm;
	}
	
	/**
	 * 알림시각
	 * 
	 * @param alimiTm 알림시각
	 */
	public void setAlimiTm(String alimiTm){
		this.alimiTm= alimiTm;
		this.setIsSet_alimiTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsNm= false;
	protected final boolean isSet_tsNm(){
		return this.isSet_tsNm;
	}
	private void setIsSet_tsNm(boolean value){
		this.isSet_tsNm= value;
	}
	/**
	 * 이체명
	 */
	@XmlTransient
	public String getTsNm(){
		return this.tsNm;
	}
	
	/**
	 * 이체명
	 * 
	 * @param tsNm 이체명
	 */
	public void setTsNm(String tsNm){
		this.tsNm= tsNm;
		this.setIsSet_tsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsAmt= false;
	protected final boolean isSet_tsAmt(){
		return this.isSet_tsAmt;
	}
	private void setIsSet_tsAmt(boolean value){
		this.isSet_tsAmt= value;
	}
	/**
	 * 이체금액
	 */
	@XmlTransient
	public String getTsAmt(){
		return this.tsAmt;
	}
	
	/**
	 * 이체금액
	 * 
	 * @param tsAmt 이체금액
	 */
	public void setTsAmt(String tsAmt){
		this.tsAmt= tsAmt;
		this.setIsSet_tsAmt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvBkcd= false;
	protected final boolean isSet_rcvBkcd(){
		return this.isSet_rcvBkcd;
	}
	private void setIsSet_rcvBkcd(boolean value){
		this.isSet_rcvBkcd= value;
	}
	/**
	 * 입금은행코드
	 */
	@XmlTransient
	public String getRcvBkcd(){
		return this.rcvBkcd;
	}
	
	/**
	 * 입금은행코드
	 * 
	 * @param rcvBkcd 입금은행코드
	 */
	public void setRcvBkcd(String rcvBkcd){
		this.rcvBkcd= rcvBkcd;
		this.setIsSet_rcvBkcd(true);
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
	private boolean isSet_wdrPbokMrk= false;
	protected final boolean isSet_wdrPbokMrk(){
		return this.isSet_wdrPbokMrk;
	}
	private void setIsSet_wdrPbokMrk(boolean value){
		this.isSet_wdrPbokMrk= value;
	}
	/**
	 * 출금통장표시내용
	 */
	@XmlTransient
	public String getWdrPbokMrk(){
		return this.wdrPbokMrk;
	}
	
	/**
	 * 출금통장표시내용
	 * 
	 * @param wdrPbokMrk 출금통장표시내용
	 */
	public void setWdrPbokMrk(String wdrPbokMrk){
		this.wdrPbokMrk= wdrPbokMrk;
		this.setIsSet_wdrPbokMrk(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvPbokMrk= false;
	protected final boolean isSet_rcvPbokMrk(){
		return this.isSet_rcvPbokMrk;
	}
	private void setIsSet_rcvPbokMrk(boolean value){
		this.isSet_rcvPbokMrk= value;
	}
	/**
	 * 입금통장표시내용
	 */
	@XmlTransient
	public String getRcvPbokMrk(){
		return this.rcvPbokMrk;
	}
	
	/**
	 * 입금통장표시내용
	 * 
	 * @param rcvPbokMrk 입금통장표시내용
	 */
	public void setRcvPbokMrk(String rcvPbokMrk){
		this.rcvPbokMrk= rcvPbokMrk;
		this.setIsSet_rcvPbokMrk(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mretTsYn= false;
	protected final boolean isSet_mretTsYn(){
		return this.isSet_mretTsYn;
	}
	private void setIsSet_mretTsYn(boolean value){
		this.isSet_mretTsYn= value;
	}
	/**
	 * 월세이체여부
	 */
	@XmlTransient
	public String getMretTsYn(){
		return this.mretTsYn;
	}
	
	/**
	 * 월세이체여부
	 * 
	 * @param mretTsYn 월세이체여부
	 */
	public void setMretTsYn(String mretTsYn){
		this.mretTsYn= mretTsYn;
		this.setIsSet_mretTsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etc1= false;
	protected final boolean isSet_etc1(){
		return this.isSet_etc1;
	}
	private void setIsSet_etc1(boolean value){
		this.isSet_etc1= value;
	}
	/**
	 * 기타1
	 */
	@XmlTransient
	public String getEtc1(){
		return this.etc1;
	}
	
	/**
	 * 기타1
	 * 
	 * @param etc1 기타1
	 */
	public void setEtc1(String etc1){
		this.etc1= etc1;
		this.setIsSet_etc1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etc2= false;
	protected final boolean isSet_etc2(){
		return this.isSet_etc2;
	}
	private void setIsSet_etc2(boolean value){
		this.isSet_etc2= value;
	}
	/**
	 * 기타2
	 */
	@XmlTransient
	public String getEtc2(){
		return this.etc2;
	}
	
	/**
	 * 기타2
	 * 
	 * @param etc2 기타2
	 */
	public void setEtc2(String etc2){
		this.etc2= etc2;
		this.setIsSet_etc2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etc3= false;
	protected final boolean isSet_etc3(){
		return this.isSet_etc3;
	}
	private void setIsSet_etc3(boolean value){
		this.isSet_etc3= value;
	}
	/**
	 * 기타3
	 */
	@XmlTransient
	public String getEtc3(){
		return this.etc3;
	}
	
	/**
	 * 기타3
	 * 
	 * @param etc3 기타3
	 */
	public void setEtc3(String etc3){
		this.etc3= etc3;
		this.setIsSet_etc3(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etc4= false;
	protected final boolean isSet_etc4(){
		return this.isSet_etc4;
	}
	private void setIsSet_etc4(boolean value){
		this.isSet_etc4= value;
	}
	/**
	 * 기타4
	 */
	@XmlTransient
	public String getEtc4(){
		return this.etc4;
	}
	
	/**
	 * 기타4
	 * 
	 * @param etc4 기타4
	 */
	public void setEtc4(String etc4){
		this.etc4= etc4;
		this.setIsSet_etc4(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_notiTmpTyp= false;
	protected final boolean isSet_notiTmpTyp(){
		return this.isSet_notiTmpTyp;
	}
	private void setIsSet_notiTmpTyp(boolean value){
		this.isSet_notiTmpTyp= value;
	}
	/**
	 * 알림 템플릿 유형
	 */
	@XmlTransient
	public String getNotiTmpTyp(){
		return this.notiTmpTyp;
	}
	
	/**
	 * 알림 템플릿 유형
	 * 
	 * @param notiTmpTyp 알림 템플릿 유형
	 */
	public void setNotiTmpTyp(String notiTmpTyp){
		this.notiTmpTyp= notiTmpTyp;
		this.setIsSet_notiTmpTyp(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsDh= false;
	protected final boolean isSet_rgsDh(){
		return this.isSet_rgsDh;
	}
	private void setIsSet_rgsDh(boolean value){
		this.isSet_rgsDh= value;
	}
	@JsonSetter("rgsDh")
	private void setRgsDhForJson(String value){
		try{
			this.rgsDh= rgsDhAdapter.unmarshal(value);
			this.setIsSet_rgsDh(true);
		}
		catch(Exception e){
			throw new IllegalArgumentException("Invalid value : "+ value, e);
		}
	}
	
	@JsonGetter("rgsDh")
	private String getRgsDhForJson(){
		return this.rgsDhAdapter.marshal(rgsDh);
	}
	/**
	 * 등록일시
	 */
	@XmlTransient
	public Date getRgsDh(){
		return this.rgsDh;
	}
	
	/**
	 * 등록일시
	 * 
	 * @param rgsDh 등록일시
	 */
	public void setRgsDh(Date rgsDh){
		this.rgsDh= rgsDh;
		this.setIsSet_rgsDh(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgDh= false;
	protected final boolean isSet_chgDh(){
		return this.isSet_chgDh;
	}
	private void setIsSet_chgDh(boolean value){
		this.isSet_chgDh= value;
	}
	@JsonSetter("chgDh")
	private void setChgDhForJson(String value){
		try{
			this.chgDh= chgDhAdapter.unmarshal(value);
			this.setIsSet_chgDh(true);
		}
		catch(Exception e){
			throw new IllegalArgumentException("Invalid value : "+ value, e);
		}
	}
	
	@JsonGetter("chgDh")
	private String getChgDhForJson(){
		return this.chgDhAdapter.marshal(chgDh);
	}
	/**
	 * 변경일시
	 */
	@XmlTransient
	public Date getChgDh(){
		return this.chgDh;
	}
	
	/**
	 * 변경일시
	 * 
	 * @param chgDh 변경일시
	 */
	public void setChgDh(Date chgDh){
		this.chgDh= chgDh;
		this.setIsSet_chgDh(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eaiTrsmnDt= false;
	protected final boolean isSet_eaiTrsmnDt(){
		return this.isSet_eaiTrsmnDt;
	}
	private void setIsSet_eaiTrsmnDt(boolean value){
		this.isSet_eaiTrsmnDt= value;
	}
	/**
	 * EAI전송관리일자
	 */
	@XmlTransient
	public String getEaiTrsmnDt(){
		return this.eaiTrsmnDt;
	}
	
	/**
	 * EAI전송관리일자
	 * 
	 * @param eaiTrsmnDt EAI전송관리일자
	 */
	public void setEaiTrsmnDt(String eaiTrsmnDt){
		this.eaiTrsmnDt= eaiTrsmnDt;
		this.setIsSet_eaiTrsmnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eaiTrsmnSrno= false;
	protected final boolean isSet_eaiTrsmnSrno(){
		return this.isSet_eaiTrsmnSrno;
	}
	private void setIsSet_eaiTrsmnSrno(boolean value){
		this.isSet_eaiTrsmnSrno= value;
	}
	/**
	 * EAI전송관리일련번호
	 * BigDecimal - Double value setter
	 *
	 * @Param eaiTrsmnSrno EAI전송관리일련번호
	 */
	public void setEaiTrsmnSrno(double eaiTrsmnSrno) {
		setEaiTrsmnSrno(BigDecimal.valueOf(eaiTrsmnSrno));
	}
	/**
	 * EAI전송관리일련번호
	 * BigDecimal - Long value setter
	 *
	 * @Param eaiTrsmnSrno EAI전송관리일련번호
	 */
	public void setEaiTrsmnSrno(long eaiTrsmnSrno) {
		setEaiTrsmnSrno(BigDecimal.valueOf(eaiTrsmnSrno));
	}
	/**
	 * EAI전송관리일련번호
	 * BigDecimal - String value setter
	 *
	 * @Param eaiTrsmnSrno EAI전송관리일련번호
	 */
	public void setEaiTrsmnSrno(String eaiTrsmnSrno) {
		setEaiTrsmnSrno(new BigDecimal(eaiTrsmnSrno));
	}
	/**
	 * EAI전송관리일련번호
	 */
	@XmlTransient
	public BigDecimal getEaiTrsmnSrno(){
		return this.eaiTrsmnSrno;
	}
	
	/**
	 * EAI전송관리일련번호
	 * 
	 * @param eaiTrsmnSrno EAI전송관리일련번호
	 */
	@JsonSetter("eaiTrsmnSrno")
	public void setEaiTrsmnSrno(BigDecimal eaiTrsmnSrno){
		this.eaiTrsmnSrno= eaiTrsmnSrno;
		this.setIsSet_eaiTrsmnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eaiTmsRtcd= false;
	protected final boolean isSet_eaiTmsRtcd(){
		return this.isSet_eaiTmsRtcd;
	}
	private void setIsSet_eaiTmsRtcd(boolean value){
		this.isSet_eaiTmsRtcd= value;
	}
	/**
	 * EAI전송결과코드
	 */
	@XmlTransient
	public String getEaiTmsRtcd(){
		return this.eaiTmsRtcd;
	}
	
	/**
	 * EAI전송결과코드
	 * 
	 * @param eaiTmsRtcd EAI전송결과코드
	 */
	public void setEaiTmsRtcd(String eaiTmsRtcd){
		this.eaiTmsRtcd= eaiTmsRtcd;
		this.setIsSet_eaiTmsRtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eaiTmsRstDtm= false;
	protected final boolean isSet_eaiTmsRstDtm(){
		return this.isSet_eaiTmsRstDtm;
	}
	private void setIsSet_eaiTmsRstDtm(boolean value){
		this.isSet_eaiTmsRstDtm= value;
	}
	/**
	 * EAI전송결과일시
	 */
	@XmlTransient
	public String getEaiTmsRstDtm(){
		return this.eaiTmsRstDtm;
	}
	
	/**
	 * EAI전송결과일시
	 * 
	 * @param eaiTmsRstDtm EAI전송결과일시
	 */
	public void setEaiTmsRstDtm(String eaiTmsRstDtm){
		this.eaiTmsRstDtm= eaiTmsRstDtm;
		this.setIsSet_eaiTmsRstDtm(true);
	}
				
	@Override
	public INBMyNtfc_DTO clone(){
		try{
			INBMyNtfc_DTO object= (INBMyNtfc_DTO)super.clone();
			if ( this.rgsDh== null ) object.rgsDh= null;
			else object.rgsDh= (Date)this.rgsDh.clone();
			if ( this.chgDh== null ) object.chgDh= null;
			else object.chgDh= (Date)this.chgDh.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.seqno==null)?0:this.seqno.hashCode());
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.trNotiYn==null)?0:this.trNotiYn.hashCode());
		result= prime * result + ((this.alimiType==null)?0:this.alimiType.hashCode());
		result= prime * result + ((this.ntfcTxt==null)?0:this.ntfcTxt.hashCode());
		result= prime * result + ((this.ntfcFm==null)?0:this.ntfcFm.hashCode());
		result= prime * result + ((this.month==null)?0:this.month.hashCode());
		result= prime * result + ((this.day==null)?0:this.day.hashCode());
		result= prime * result + ((this.weekdayNm==null)?0:this.weekdayNm.hashCode());
		result= prime * result + ((this.alimiTm==null)?0:this.alimiTm.hashCode());
		result= prime * result + ((this.tsNm==null)?0:this.tsNm.hashCode());
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.tsAmt==null)?0:this.tsAmt.hashCode());
		result= prime * result + ((this.rcvBkcd==null)?0:this.rcvBkcd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.wdrPbokMrk==null)?0:this.wdrPbokMrk.hashCode());
		result= prime * result + ((this.rcvPbokMrk==null)?0:this.rcvPbokMrk.hashCode());
		result= prime * result + ((this.mretTsYn==null)?0:this.mretTsYn.hashCode());
		result= prime * result + ((this.etc1==null)?0:this.etc1.hashCode());
		result= prime * result + ((this.etc2==null)?0:this.etc2.hashCode());
		result= prime * result + ((this.etc3==null)?0:this.etc3.hashCode());
		result= prime * result + ((this.etc4==null)?0:this.etc4.hashCode());
		result= prime * result + ((this.notiTmpTyp==null)?0:this.notiTmpTyp.hashCode());
		result= prime * result + ((this.rgsDh==null)?0:this.rgsDh.hashCode());
		result= prime * result + ((this.chgDh==null)?0:this.chgDh.hashCode());
		result= prime * result + ((this.eaiTrsmnDt==null)?0:this.eaiTrsmnDt.hashCode());
		result= prime * result + ((this.eaiTrsmnSrno==null)?0:this.eaiTrsmnSrno.hashCode());
		result= prime * result + ((this.eaiTmsRtcd==null)?0:this.eaiTmsRtcd.hashCode());
		result= prime * result + ((this.eaiTmsRstDtm==null)?0:this.eaiTmsRstDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBMyNtfc_DTO other= (INBMyNtfc_DTO)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _seqno= getSeqno();
			Object __seqno= other.getSeqno();
			if ( _seqno== null ) { if ( __seqno!= null ) return false; }
			else if ( !_seqno.equals(__seqno) ) return false;
		}
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _trNotiYn= getTrNotiYn();
			Object __trNotiYn= other.getTrNotiYn();
			if ( _trNotiYn== null ) { if ( __trNotiYn!= null ) return false; }
			else if ( !_trNotiYn.equals(__trNotiYn) ) return false;
		}
		{
			Object _alimiType= getAlimiType();
			Object __alimiType= other.getAlimiType();
			if ( _alimiType== null ) { if ( __alimiType!= null ) return false; }
			else if ( !_alimiType.equals(__alimiType) ) return false;
		}
		{
			Object _ntfcTxt= getNtfcTxt();
			Object __ntfcTxt= other.getNtfcTxt();
			if ( _ntfcTxt== null ) { if ( __ntfcTxt!= null ) return false; }
			else if ( !_ntfcTxt.equals(__ntfcTxt) ) return false;
		}
		{
			Object _ntfcFm= getNtfcFm();
			Object __ntfcFm= other.getNtfcFm();
			if ( _ntfcFm== null ) { if ( __ntfcFm!= null ) return false; }
			else if ( !_ntfcFm.equals(__ntfcFm) ) return false;
		}
		{
			Object _month= getMonth();
			Object __month= other.getMonth();
			if ( _month== null ) { if ( __month!= null ) return false; }
			else if ( !_month.equals(__month) ) return false;
		}
		{
			Object _day= getDay();
			Object __day= other.getDay();
			if ( _day== null ) { if ( __day!= null ) return false; }
			else if ( !_day.equals(__day) ) return false;
		}
		{
			Object _weekdayNm= getWeekdayNm();
			Object __weekdayNm= other.getWeekdayNm();
			if ( _weekdayNm== null ) { if ( __weekdayNm!= null ) return false; }
			else if ( !_weekdayNm.equals(__weekdayNm) ) return false;
		}
		{
			Object _alimiTm= getAlimiTm();
			Object __alimiTm= other.getAlimiTm();
			if ( _alimiTm== null ) { if ( __alimiTm!= null ) return false; }
			else if ( !_alimiTm.equals(__alimiTm) ) return false;
		}
		{
			Object _tsNm= getTsNm();
			Object __tsNm= other.getTsNm();
			if ( _tsNm== null ) { if ( __tsNm!= null ) return false; }
			else if ( !_tsNm.equals(__tsNm) ) return false;
		}
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _tsAmt= getTsAmt();
			Object __tsAmt= other.getTsAmt();
			if ( _tsAmt== null ) { if ( __tsAmt!= null ) return false; }
			else if ( !_tsAmt.equals(__tsAmt) ) return false;
		}
		{
			Object _rcvBkcd= getRcvBkcd();
			Object __rcvBkcd= other.getRcvBkcd();
			if ( _rcvBkcd== null ) { if ( __rcvBkcd!= null ) return false; }
			else if ( !_rcvBkcd.equals(__rcvBkcd) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _wdrPbokMrk= getWdrPbokMrk();
			Object __wdrPbokMrk= other.getWdrPbokMrk();
			if ( _wdrPbokMrk== null ) { if ( __wdrPbokMrk!= null ) return false; }
			else if ( !_wdrPbokMrk.equals(__wdrPbokMrk) ) return false;
		}
		{
			Object _rcvPbokMrk= getRcvPbokMrk();
			Object __rcvPbokMrk= other.getRcvPbokMrk();
			if ( _rcvPbokMrk== null ) { if ( __rcvPbokMrk!= null ) return false; }
			else if ( !_rcvPbokMrk.equals(__rcvPbokMrk) ) return false;
		}
		{
			Object _mretTsYn= getMretTsYn();
			Object __mretTsYn= other.getMretTsYn();
			if ( _mretTsYn== null ) { if ( __mretTsYn!= null ) return false; }
			else if ( !_mretTsYn.equals(__mretTsYn) ) return false;
		}
		{
			Object _etc1= getEtc1();
			Object __etc1= other.getEtc1();
			if ( _etc1== null ) { if ( __etc1!= null ) return false; }
			else if ( !_etc1.equals(__etc1) ) return false;
		}
		{
			Object _etc2= getEtc2();
			Object __etc2= other.getEtc2();
			if ( _etc2== null ) { if ( __etc2!= null ) return false; }
			else if ( !_etc2.equals(__etc2) ) return false;
		}
		{
			Object _etc3= getEtc3();
			Object __etc3= other.getEtc3();
			if ( _etc3== null ) { if ( __etc3!= null ) return false; }
			else if ( !_etc3.equals(__etc3) ) return false;
		}
		{
			Object _etc4= getEtc4();
			Object __etc4= other.getEtc4();
			if ( _etc4== null ) { if ( __etc4!= null ) return false; }
			else if ( !_etc4.equals(__etc4) ) return false;
		}
		{
			Object _notiTmpTyp= getNotiTmpTyp();
			Object __notiTmpTyp= other.getNotiTmpTyp();
			if ( _notiTmpTyp== null ) { if ( __notiTmpTyp!= null ) return false; }
			else if ( !_notiTmpTyp.equals(__notiTmpTyp) ) return false;
		}
		{
			Object _rgsDh= getRgsDh();
			Object __rgsDh= other.getRgsDh();
			if ( _rgsDh== null ) { if ( __rgsDh!= null ) return false; }
			else if ( !_rgsDh.equals(__rgsDh) ) return false;
		}
		{
			Object _chgDh= getChgDh();
			Object __chgDh= other.getChgDh();
			if ( _chgDh== null ) { if ( __chgDh!= null ) return false; }
			else if ( !_chgDh.equals(__chgDh) ) return false;
		}
		{
			Object _eaiTrsmnDt= getEaiTrsmnDt();
			Object __eaiTrsmnDt= other.getEaiTrsmnDt();
			if ( _eaiTrsmnDt== null ) { if ( __eaiTrsmnDt!= null ) return false; }
			else if ( !_eaiTrsmnDt.equals(__eaiTrsmnDt) ) return false;
		}
		{
			Object _eaiTrsmnSrno= getEaiTrsmnSrno();
			Object __eaiTrsmnSrno= other.getEaiTrsmnSrno();
			if ( _eaiTrsmnSrno== null ) { if ( __eaiTrsmnSrno!= null ) return false; }
			else if ( !_eaiTrsmnSrno.equals(__eaiTrsmnSrno) ) return false;
		}
		{
			Object _eaiTmsRtcd= getEaiTmsRtcd();
			Object __eaiTmsRtcd= other.getEaiTmsRtcd();
			if ( _eaiTmsRtcd== null ) { if ( __eaiTmsRtcd!= null ) return false; }
			else if ( !_eaiTmsRtcd.equals(__eaiTmsRtcd) ) return false;
		}
		{
			Object _eaiTmsRstDtm= getEaiTmsRstDtm();
			Object __eaiTmsRstDtm= other.getEaiTmsRstDtm();
			if ( _eaiTmsRstDtm== null ) { if ( __eaiTmsRstDtm!= null ) return false; }
			else if ( !_eaiTmsRstDtm.equals(__eaiTmsRstDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBMyNtfc_DTO.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tseqno: ");
		sb.append(seqno==null?"null":getSeqno());
		sb.append("\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\ttrNotiYn: ");
		sb.append(trNotiYn==null?"null":getTrNotiYn());
		sb.append("\n");
		sb.append("\talimiType: ");
		sb.append(alimiType==null?"null":getAlimiType());
		sb.append("\n");
		sb.append("\tntfcTxt: ");
		sb.append(ntfcTxt==null?"null":getNtfcTxt());
		sb.append("\n");
		sb.append("\tntfcFm: ");
		sb.append(ntfcFm==null?"null":getNtfcFm());
		sb.append("\n");
		sb.append("\tmonth: ");
		sb.append(month==null?"null":getMonth());
		sb.append("\n");
		sb.append("\tday: ");
		sb.append(day==null?"null":getDay());
		sb.append("\n");
		sb.append("\tweekdayNm: ");
		sb.append(weekdayNm==null?"null":getWeekdayNm());
		sb.append("\n");
		sb.append("\talimiTm: ");
		sb.append(alimiTm==null?"null":getAlimiTm());
		sb.append("\n");
		sb.append("\ttsNm: ");
		sb.append(tsNm==null?"null":getTsNm());
		sb.append("\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\ttsAmt: ");
		sb.append(tsAmt==null?"null":getTsAmt());
		sb.append("\n");
		sb.append("\trcvBkcd: ");
		sb.append(rcvBkcd==null?"null":getRcvBkcd());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\twdrPbokMrk: ");
		sb.append(wdrPbokMrk==null?"null":getWdrPbokMrk());
		sb.append("\n");
		sb.append("\trcvPbokMrk: ");
		sb.append(rcvPbokMrk==null?"null":getRcvPbokMrk());
		sb.append("\n");
		sb.append("\tmretTsYn: ");
		sb.append(mretTsYn==null?"null":getMretTsYn());
		sb.append("\n");
		sb.append("\tetc1: ");
		sb.append(etc1==null?"null":getEtc1());
		sb.append("\n");
		sb.append("\tetc2: ");
		sb.append(etc2==null?"null":getEtc2());
		sb.append("\n");
		sb.append("\tetc3: ");
		sb.append(etc3==null?"null":getEtc3());
		sb.append("\n");
		sb.append("\tetc4: ");
		sb.append(etc4==null?"null":getEtc4());
		sb.append("\n");
		sb.append("\tnotiTmpTyp: ");
		sb.append(notiTmpTyp==null?"null":getNotiTmpTyp());
		sb.append("\n");
		sb.append("\trgsDh: ");
		sb.append(rgsDh==null?"null":getRgsDh());
		sb.append("\n");
		sb.append("\tchgDh: ");
		sb.append(chgDh==null?"null":getChgDh());
		sb.append("\n");
		sb.append("\teaiTrsmnDt: ");
		sb.append(eaiTrsmnDt==null?"null":getEaiTrsmnDt());
		sb.append("\n");
		sb.append("\teaiTrsmnSrno: ");
		sb.append(eaiTrsmnSrno==null?"null":getEaiTrsmnSrno());
		sb.append("\n");
		sb.append("\teaiTmsRtcd: ");
		sb.append(eaiTmsRtcd==null?"null":getEaiTmsRtcd());
		sb.append("\n");
		sb.append("\teaiTmsRstDtm: ");
		sb.append(eaiTmsRstDtm==null?"null":getEaiTmsRstDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno */
		messageLen+= 20; /* seqno */
		messageLen+= 20; /* userId */
		messageLen+= 1; /* trNotiYn */
		messageLen+= 4; /* alimiType */
		messageLen+= 2000; /* ntfcTxt */
		messageLen+= 10; /* ntfcFm */
		messageLen+= 10; /* month */
		messageLen+= 10; /* day */
		messageLen+= 10; /* weekdayNm */
		messageLen+= 6; /* alimiTm */
		messageLen+= 100; /* tsNm */
		messageLen+= 13; /* wdrAcno */
		messageLen+= 100; /* tsAmt */
		messageLen+= 3; /* rcvBkcd */
		messageLen+= 20; /* rcvAcno */
		messageLen+= 22; /* wdrPbokMrk */
		messageLen+= 22; /* rcvPbokMrk */
		messageLen+= 1; /* mretTsYn */
		messageLen+= 1000; /* etc1 */
		messageLen+= 100; /* etc2 */
		messageLen+= 100; /* etc3 */
		messageLen+= 100; /* etc4 */
		messageLen+= 18; /* notiTmpTyp */
		messageLen+= 12; /* rgsDh */
		messageLen+= 12; /* chgDh */
		messageLen+= 8; /* eaiTrsmnDt */
		messageLen+= 20; /* eaiTrsmnSrno */
		messageLen+= 1; /* eaiTmsRtcd */
		messageLen+= 20; /* eaiTmsRstDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("seqno");
		list.add("userId");
		list.add("trNotiYn");
		list.add("alimiType");
		list.add("ntfcTxt");
		list.add("ntfcFm");
		list.add("month");
		list.add("day");
		list.add("weekdayNm");
		list.add("alimiTm");
		list.add("tsNm");
		list.add("wdrAcno");
		list.add("tsAmt");
		list.add("rcvBkcd");
		list.add("rcvAcno");
		list.add("wdrPbokMrk");
		list.add("rcvPbokMrk");
		list.add("mretTsYn");
		list.add("etc1");
		list.add("etc2");
		list.add("etc3");
		list.add("etc4");
		list.add("notiTmpTyp");
		list.add("rgsDh");
		list.add("chgDh");
		list.add("eaiTrsmnDt");
		list.add("eaiTrsmnSrno");
		list.add("eaiTmsRtcd");
		list.add("eaiTmsRstDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("seqno", get("seqno"));
		map.put("userId", get("userId"));
		map.put("trNotiYn", get("trNotiYn"));
		map.put("alimiType", get("alimiType"));
		map.put("ntfcTxt", get("ntfcTxt"));
		map.put("ntfcFm", get("ntfcFm"));
		map.put("month", get("month"));
		map.put("day", get("day"));
		map.put("weekdayNm", get("weekdayNm"));
		map.put("alimiTm", get("alimiTm"));
		map.put("tsNm", get("tsNm"));
		map.put("wdrAcno", get("wdrAcno"));
		map.put("tsAmt", get("tsAmt"));
		map.put("rcvBkcd", get("rcvBkcd"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("wdrPbokMrk", get("wdrPbokMrk"));
		map.put("rcvPbokMrk", get("rcvPbokMrk"));
		map.put("mretTsYn", get("mretTsYn"));
		map.put("etc1", get("etc1"));
		map.put("etc2", get("etc2"));
		map.put("etc3", get("etc3"));
		map.put("etc4", get("etc4"));
		map.put("notiTmpTyp", get("notiTmpTyp"));
		map.put("rgsDh", get("rgsDh"));
		map.put("chgDh", get("chgDh"));
		map.put("eaiTrsmnDt", get("eaiTrsmnDt"));
		map.put("eaiTrsmnSrno", get("eaiTrsmnSrno"));
		map.put("eaiTmsRtcd", get("eaiTmsRtcd"));
		map.put("eaiTmsRstDtm", get("eaiTmsRstDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 109325920:/* seqno */
			return getSeqno();
		case -836030906:/* userId */
			return getUserId();
		case 737884617:/* trNotiYn */
			return getTrNotiYn();
		case 1934306836:/* alimiType */
			return getAlimiType();
		case -2035595667:/* ntfcTxt */
			return getNtfcTxt();
		case -1035496150:/* ntfcFm */
			return getNtfcFm();
		case 104080000:/* month */
			return getMonth();
		case 99228:/* day */
			return getDay();
		case -2101260537:/* weekdayNm */
			return getWeekdayNm();
		case -914187309:/* alimiTm */
			return getAlimiTm();
		case 3568798:/* tsNm */
			return getTsNm();
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 110620361:/* tsAmt */
			return getTsAmt();
		case 1041538159:/* rcvBkcd */
			return getRcvBkcd();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case -257924557:/* wdrPbokMrk */
			return getWdrPbokMrk();
		case 913404179:/* rcvPbokMrk */
			return getRcvPbokMrk();
		case 2085258536:/* mretTsYn */
			return getMretTsYn();
		case 3123485:/* etc1 */
			return getEtc1();
		case 3123486:/* etc2 */
			return getEtc2();
		case 3123487:/* etc3 */
			return getEtc3();
		case 3123488:/* etc4 */
			return getEtc4();
		case -1690523254:/* notiTmpTyp */
			return getNotiTmpTyp();
		case 108462594:/* rgsDh */
			return getRgsDh();
		case 94628038:/* chgDh */
			return getChgDh();
		case 1323221305:/* eaiTrsmnDt */
			return getEaiTrsmnDt();
		case 305802953:/* eaiTrsmnSrno */
			return getEaiTrsmnSrno();
		case 1179277904:/* eaiTmsRtcd */
			return getEaiTmsRtcd();
		case -585744521:/* eaiTmsRstDtm */
			return getEaiTmsRstDtm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 109325920:/* seqno */
			setSeqno((String)value);
			break;
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case 737884617:/* trNotiYn */
			setTrNotiYn((String)value);
			break;
		case 1934306836:/* alimiType */
			setAlimiType((String)value);
			break;
		case -2035595667:/* ntfcTxt */
			setNtfcTxt((String)value);
			break;
		case -1035496150:/* ntfcFm */
			setNtfcFm((String)value);
			break;
		case 104080000:/* month */
			setMonth((String)value);
			break;
		case 99228:/* day */
			setDay((String)value);
			break;
		case -2101260537:/* weekdayNm */
			setWeekdayNm((String)value);
			break;
		case -914187309:/* alimiTm */
			setAlimiTm((String)value);
			break;
		case 3568798:/* tsNm */
			setTsNm((String)value);
			break;
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 110620361:/* tsAmt */
			setTsAmt((String)value);
			break;
		case 1041538159:/* rcvBkcd */
			setRcvBkcd((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case -257924557:/* wdrPbokMrk */
			setWdrPbokMrk((String)value);
			break;
		case 913404179:/* rcvPbokMrk */
			setRcvPbokMrk((String)value);
			break;
		case 2085258536:/* mretTsYn */
			setMretTsYn((String)value);
			break;
		case 3123485:/* etc1 */
			setEtc1((String)value);
			break;
		case 3123486:/* etc2 */
			setEtc2((String)value);
			break;
		case 3123487:/* etc3 */
			setEtc3((String)value);
			break;
		case 3123488:/* etc4 */
			setEtc4((String)value);
			break;
		case -1690523254:/* notiTmpTyp */
			setNotiTmpTyp((String)value);
			break;
		case 108462594:/* rgsDh */
			setRgsDh((Date)value);
			break;
		case 94628038:/* chgDh */
			setChgDh((Date)value);
			break;
		case 1323221305:/* eaiTrsmnDt */
			setEaiTrsmnDt((String)value);
			break;
		case 305802953:/* eaiTrsmnSrno */
			if ( value instanceof String ){
				setEaiTrsmnSrno((String)value);
			}
			else if ( value instanceof Double ){
				setEaiTrsmnSrno((Double)value);
			}
			else if ( value instanceof Long ){
				setEaiTrsmnSrno((Long)value);
			}
			else{
				setEaiTrsmnSrno((BigDecimal)value);
			}
			break;
		case 1179277904:/* eaiTmsRtcd */
			setEaiTmsRtcd((String)value);
			break;
		case -585744521:/* eaiTmsRstDtm */
			setEaiTmsRstDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
