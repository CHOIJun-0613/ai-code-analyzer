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
 * Push 목록 응답 DTO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"ntfbxLrclCd", "ntfbxMclfCd", "ntfbxLrclCdNm", "ntfbxMclfCdNm", "favtYn", "ntfcRfwr", "umsTrno", "umsReqDt", "mskAcno", "acno", "mskCusNm", "rawCusNm", "readYn", "pushTitlTxt", "pushTxt"
	, "msgTxt", "ntfcDtm", "otln", "msgId", "rawDscd", "pushTyp", "kkoBtnInfList", "pageId", "prdCd", "prdDscd", "actBal"
}, name="INBPushListRsp_DTO")
@XmlRootElement(name="INBPushListRsp_DTO")
@BxmCategory(logicalName="Push 목록 응답 DTO", description="Push 목록 응답 DTO") 
public class INBPushListRsp_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -525167446L;
	
	
	
	/**
	 * 알림함대분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCd")
	@BxmOmm_Field(length=10, decimal=0, description="알림함대분류코드", align="left", fill="")
	private String ntfbxLrclCd= "";
	
	
	/**
	 * 알림함중분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCd")
	@BxmOmm_Field(length=10, decimal=0, description="알림함중분류코드", align="left", fill="")
	private String ntfbxMclfCd= "";
	
	
	/**
	 * 알림함대분류코드명
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCdNm")
	@BxmOmm_Field(length=200, decimal=0, description="알림함대분류코드명", align="left", fill="")
	private String ntfbxLrclCdNm= "";
	
	
	/**
	 * 알림함중분류코드명
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCdNm")
	@BxmOmm_Field(length=200, decimal=0, description="알림함중분류코드명", align="left", fill="")
	private String ntfbxMclfCdNm= "";
	
	
	/**
	 * 즐겨찾기여부
	 */
	@ApiModelProperty(
		name = "favtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("favtYn")
	@BxmOmm_Field(length=1, decimal=0, description="즐겨찾기여부", align="left", fill="")
	private String favtYn= "";
	
	
	/**
	 * 알림검색어
	 */
	@ApiModelProperty(
		name = "ntfcRfwr"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcRfwr")
	@BxmOmm_Field(length=10, decimal=0, description="알림검색어", align="left", fill="")
	private String ntfcRfwr= "";
	
	
	/**
	 * UMS거래번호
	 */
	@ApiModelProperty(
		name = "umsTrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsTrno")
	@BxmOmm_Field(length=20, decimal=0, description="UMS거래번호", align="left", fill="")
	private String umsTrno= "";
	
	
	/**
	 * UMS요청일자
	 */
	@ApiModelProperty(
		name = "umsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청일자", align="left", fill="")
	private String umsReqDt= "";
	
	
	/**
	 * 마스킹계좌번호
	 */
	@ApiModelProperty(
		name = "mskAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mskAcno")
	@BxmOmm_Field(length=20, decimal=0, description="마스킹계좌번호", align="left", fill="")
	private String mskAcno= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 마스킹고객명
	 */
	@ApiModelProperty(
		name = "mskCusNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mskCusNm")
	@BxmOmm_Field(length=50, decimal=0, description="마스킹고객명", align="left", fill="")
	private String mskCusNm= "";
	
	
	/**
	 * 입출금고객명
	 */
	@ApiModelProperty(
		name = "rawCusNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rawCusNm")
	@BxmOmm_Field(length=50, decimal=0, description="입출금고객명", align="left", fill="")
	private String rawCusNm= "";
	
	
	/**
	 * 읽음여부
	 */
	@ApiModelProperty(
		name = "readYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("readYn")
	@BxmOmm_Field(length=1, decimal=0, description="읽음여부", align="left", fill="")
	private String readYn= "";
	
	
	/**
	 * PUSH제목내용
	 */
	@ApiModelProperty(
		name = "pushTitlTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTitlTxt")
	@BxmOmm_Field(length=100, decimal=0, description="PUSH제목내용", align="left", fill="")
	private String pushTitlTxt= "";
	
	
	/**
	 * PUSH내용
	 */
	@ApiModelProperty(
		name = "pushTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTxt")
	@BxmOmm_Field(length=1500, decimal=0, description="PUSH내용", align="left", fill="")
	private String pushTxt= "";
	
	
	/**
	 * 사서함메시지
	 */
	@ApiModelProperty(
		name = "msgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgTxt")
	@BxmOmm_Field(length=1500, decimal=0, description="사서함메시지", align="left", fill="")
	private String msgTxt= "";
	
	
	/**
	 * 알림발송일시
	 */
	@ApiModelProperty(
		name = "ntfcDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcDtm")
	@BxmOmm_Field(length=14, decimal=0, description="알림발송일시", align="left", fill="")
	private String ntfcDtm= "";
	
	
	/**
	 * 적요
	 */
	@ApiModelProperty(
		name = "otln"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otln")
	@BxmOmm_Field(length=100, decimal=0, description="적요", align="left", fill="")
	private String otln= "";
	
	
	/**
	 * 메시지ID
	 */
	@ApiModelProperty(
		name = "msgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgId")
	@BxmOmm_Field(length=50, decimal=0, description="메시지ID", align="left", fill="")
	private String msgId= "";
	
	
	/**
	 * 입출금구분코드
	 */
	@ApiModelProperty(
		name = "rawDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rawDscd")
	@BxmOmm_Field(length=2, decimal=0, description="입출금구분코드", align="left", fill="")
	private String rawDscd= "";
	
	
	/**
	 * PUSH타입
	 */
	@ApiModelProperty(
		name = "pushTyp"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTyp")
	@BxmOmm_Field(length=2, decimal=0, description="PUSH타입", align="left", fill="")
	private String pushTyp= "";
	
	
	/**
	 * 카카오버튼정보목록
	 */
	@ApiModelProperty(
		name = "kkoBtnInfList"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBKkoBtnInfList_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("kkoBtnInfList")
	@BxmOmm_Field(length=0, decimal=0, description="카카오버튼정보목록", align="left", fill="", arrayReference="1")
	private List<INBKkoBtnInfList_DTO> kkoBtnInfList= new ArrayList<>();
	
	/**
	 * 페이지ID
	 */
	@ApiModelProperty(
		name = "pageId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pageId")
	@BxmOmm_Field(length=200, decimal=0, description="페이지ID", align="left", fill="")
	private String pageId= "";
	
	
	/**
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "prdCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdCd")
	@BxmOmm_Field(length=100, decimal=0, description="상품코드", align="left", fill="")
	private String prdCd= "";
	
	
	/**
	 * 상품구분코드
	 */
	@ApiModelProperty(
		name = "prdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdDscd")
	@BxmOmm_Field(length=100, decimal=0, description="상품구분코드", align="left", fill="")
	private String prdDscd= "";
	
	
	/**
	 * 계좌잔액
	 */
	@ApiModelProperty(
		name = "actBal"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actBal")
	@BxmOmm_Field(length=18, decimal=0, description="계좌잔액", align="left", fill="")
	private String actBal= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCd= false;
	protected final boolean isSet_ntfbxLrclCd(){
		return this.isSet_ntfbxLrclCd;
	}
	private void setIsSet_ntfbxLrclCd(boolean value){
		this.isSet_ntfbxLrclCd= value;
	}
	/**
	 * 알림함대분류코드
	 */
	@XmlTransient
	public String getNtfbxLrclCd(){
		return this.ntfbxLrclCd;
	}
	
	/**
	 * 알림함대분류코드
	 * 
	 * @param ntfbxLrclCd 알림함대분류코드
	 */
	public void setNtfbxLrclCd(String ntfbxLrclCd){
		this.ntfbxLrclCd= ntfbxLrclCd;
		this.setIsSet_ntfbxLrclCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCd= false;
	protected final boolean isSet_ntfbxMclfCd(){
		return this.isSet_ntfbxMclfCd;
	}
	private void setIsSet_ntfbxMclfCd(boolean value){
		this.isSet_ntfbxMclfCd= value;
	}
	/**
	 * 알림함중분류코드
	 */
	@XmlTransient
	public String getNtfbxMclfCd(){
		return this.ntfbxMclfCd;
	}
	
	/**
	 * 알림함중분류코드
	 * 
	 * @param ntfbxMclfCd 알림함중분류코드
	 */
	public void setNtfbxMclfCd(String ntfbxMclfCd){
		this.ntfbxMclfCd= ntfbxMclfCd;
		this.setIsSet_ntfbxMclfCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCdNm= false;
	protected final boolean isSet_ntfbxLrclCdNm(){
		return this.isSet_ntfbxLrclCdNm;
	}
	private void setIsSet_ntfbxLrclCdNm(boolean value){
		this.isSet_ntfbxLrclCdNm= value;
	}
	/**
	 * 알림함대분류코드명
	 */
	@XmlTransient
	public String getNtfbxLrclCdNm(){
		return this.ntfbxLrclCdNm;
	}
	
	/**
	 * 알림함대분류코드명
	 * 
	 * @param ntfbxLrclCdNm 알림함대분류코드명
	 */
	public void setNtfbxLrclCdNm(String ntfbxLrclCdNm){
		this.ntfbxLrclCdNm= ntfbxLrclCdNm;
		this.setIsSet_ntfbxLrclCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCdNm= false;
	protected final boolean isSet_ntfbxMclfCdNm(){
		return this.isSet_ntfbxMclfCdNm;
	}
	private void setIsSet_ntfbxMclfCdNm(boolean value){
		this.isSet_ntfbxMclfCdNm= value;
	}
	/**
	 * 알림함중분류코드명
	 */
	@XmlTransient
	public String getNtfbxMclfCdNm(){
		return this.ntfbxMclfCdNm;
	}
	
	/**
	 * 알림함중분류코드명
	 * 
	 * @param ntfbxMclfCdNm 알림함중분류코드명
	 */
	public void setNtfbxMclfCdNm(String ntfbxMclfCdNm){
		this.ntfbxMclfCdNm= ntfbxMclfCdNm;
		this.setIsSet_ntfbxMclfCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_favtYn= false;
	protected final boolean isSet_favtYn(){
		return this.isSet_favtYn;
	}
	private void setIsSet_favtYn(boolean value){
		this.isSet_favtYn= value;
	}
	/**
	 * 즐겨찾기여부
	 */
	@XmlTransient
	public String getFavtYn(){
		return this.favtYn;
	}
	
	/**
	 * 즐겨찾기여부
	 * 
	 * @param favtYn 즐겨찾기여부
	 */
	public void setFavtYn(String favtYn){
		this.favtYn= favtYn;
		this.setIsSet_favtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcRfwr= false;
	protected final boolean isSet_ntfcRfwr(){
		return this.isSet_ntfcRfwr;
	}
	private void setIsSet_ntfcRfwr(boolean value){
		this.isSet_ntfcRfwr= value;
	}
	/**
	 * 알림검색어
	 */
	@XmlTransient
	public String getNtfcRfwr(){
		return this.ntfcRfwr;
	}
	
	/**
	 * 알림검색어
	 * 
	 * @param ntfcRfwr 알림검색어
	 */
	public void setNtfcRfwr(String ntfcRfwr){
		this.ntfcRfwr= ntfcRfwr;
		this.setIsSet_ntfcRfwr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsTrno= false;
	protected final boolean isSet_umsTrno(){
		return this.isSet_umsTrno;
	}
	private void setIsSet_umsTrno(boolean value){
		this.isSet_umsTrno= value;
	}
	/**
	 * UMS거래번호
	 */
	@XmlTransient
	public String getUmsTrno(){
		return this.umsTrno;
	}
	
	/**
	 * UMS거래번호
	 * 
	 * @param umsTrno UMS거래번호
	 */
	public void setUmsTrno(String umsTrno){
		this.umsTrno= umsTrno;
		this.setIsSet_umsTrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqDt= false;
	protected final boolean isSet_umsReqDt(){
		return this.isSet_umsReqDt;
	}
	private void setIsSet_umsReqDt(boolean value){
		this.isSet_umsReqDt= value;
	}
	/**
	 * UMS요청일자
	 */
	@XmlTransient
	public String getUmsReqDt(){
		return this.umsReqDt;
	}
	
	/**
	 * UMS요청일자
	 * 
	 * @param umsReqDt UMS요청일자
	 */
	public void setUmsReqDt(String umsReqDt){
		this.umsReqDt= umsReqDt;
		this.setIsSet_umsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mskAcno= false;
	protected final boolean isSet_mskAcno(){
		return this.isSet_mskAcno;
	}
	private void setIsSet_mskAcno(boolean value){
		this.isSet_mskAcno= value;
	}
	/**
	 * 마스킹계좌번호
	 */
	@XmlTransient
	public String getMskAcno(){
		return this.mskAcno;
	}
	
	/**
	 * 마스킹계좌번호
	 * 
	 * @param mskAcno 마스킹계좌번호
	 */
	public void setMskAcno(String mskAcno){
		this.mskAcno= mskAcno;
		this.setIsSet_mskAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mskCusNm= false;
	protected final boolean isSet_mskCusNm(){
		return this.isSet_mskCusNm;
	}
	private void setIsSet_mskCusNm(boolean value){
		this.isSet_mskCusNm= value;
	}
	/**
	 * 마스킹고객명
	 */
	@XmlTransient
	public String getMskCusNm(){
		return this.mskCusNm;
	}
	
	/**
	 * 마스킹고객명
	 * 
	 * @param mskCusNm 마스킹고객명
	 */
	public void setMskCusNm(String mskCusNm){
		this.mskCusNm= mskCusNm;
		this.setIsSet_mskCusNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rawCusNm= false;
	protected final boolean isSet_rawCusNm(){
		return this.isSet_rawCusNm;
	}
	private void setIsSet_rawCusNm(boolean value){
		this.isSet_rawCusNm= value;
	}
	/**
	 * 입출금고객명
	 */
	@XmlTransient
	public String getRawCusNm(){
		return this.rawCusNm;
	}
	
	/**
	 * 입출금고객명
	 * 
	 * @param rawCusNm 입출금고객명
	 */
	public void setRawCusNm(String rawCusNm){
		this.rawCusNm= rawCusNm;
		this.setIsSet_rawCusNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_readYn= false;
	protected final boolean isSet_readYn(){
		return this.isSet_readYn;
	}
	private void setIsSet_readYn(boolean value){
		this.isSet_readYn= value;
	}
	/**
	 * 읽음여부
	 */
	@XmlTransient
	public String getReadYn(){
		return this.readYn;
	}
	
	/**
	 * 읽음여부
	 * 
	 * @param readYn 읽음여부
	 */
	public void setReadYn(String readYn){
		this.readYn= readYn;
		this.setIsSet_readYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushTitlTxt= false;
	protected final boolean isSet_pushTitlTxt(){
		return this.isSet_pushTitlTxt;
	}
	private void setIsSet_pushTitlTxt(boolean value){
		this.isSet_pushTitlTxt= value;
	}
	/**
	 * PUSH제목내용
	 */
	@XmlTransient
	public String getPushTitlTxt(){
		return this.pushTitlTxt;
	}
	
	/**
	 * PUSH제목내용
	 * 
	 * @param pushTitlTxt PUSH제목내용
	 */
	public void setPushTitlTxt(String pushTitlTxt){
		this.pushTitlTxt= pushTitlTxt;
		this.setIsSet_pushTitlTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushTxt= false;
	protected final boolean isSet_pushTxt(){
		return this.isSet_pushTxt;
	}
	private void setIsSet_pushTxt(boolean value){
		this.isSet_pushTxt= value;
	}
	/**
	 * PUSH내용
	 */
	@XmlTransient
	public String getPushTxt(){
		return this.pushTxt;
	}
	
	/**
	 * PUSH내용
	 * 
	 * @param pushTxt PUSH내용
	 */
	public void setPushTxt(String pushTxt){
		this.pushTxt= pushTxt;
		this.setIsSet_pushTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgTxt= false;
	protected final boolean isSet_msgTxt(){
		return this.isSet_msgTxt;
	}
	private void setIsSet_msgTxt(boolean value){
		this.isSet_msgTxt= value;
	}
	/**
	 * 사서함메시지
	 */
	@XmlTransient
	public String getMsgTxt(){
		return this.msgTxt;
	}
	
	/**
	 * 사서함메시지
	 * 
	 * @param msgTxt 사서함메시지
	 */
	public void setMsgTxt(String msgTxt){
		this.msgTxt= msgTxt;
		this.setIsSet_msgTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcDtm= false;
	protected final boolean isSet_ntfcDtm(){
		return this.isSet_ntfcDtm;
	}
	private void setIsSet_ntfcDtm(boolean value){
		this.isSet_ntfcDtm= value;
	}
	/**
	 * 알림발송일시
	 */
	@XmlTransient
	public String getNtfcDtm(){
		return this.ntfcDtm;
	}
	
	/**
	 * 알림발송일시
	 * 
	 * @param ntfcDtm 알림발송일시
	 */
	public void setNtfcDtm(String ntfcDtm){
		this.ntfcDtm= ntfcDtm;
		this.setIsSet_ntfcDtm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otln= false;
	protected final boolean isSet_otln(){
		return this.isSet_otln;
	}
	private void setIsSet_otln(boolean value){
		this.isSet_otln= value;
	}
	/**
	 * 적요
	 */
	@XmlTransient
	public String getOtln(){
		return this.otln;
	}
	
	/**
	 * 적요
	 * 
	 * @param otln 적요
	 */
	public void setOtln(String otln){
		this.otln= otln;
		this.setIsSet_otln(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgId= false;
	protected final boolean isSet_msgId(){
		return this.isSet_msgId;
	}
	private void setIsSet_msgId(boolean value){
		this.isSet_msgId= value;
	}
	/**
	 * 메시지ID
	 */
	@XmlTransient
	public String getMsgId(){
		return this.msgId;
	}
	
	/**
	 * 메시지ID
	 * 
	 * @param msgId 메시지ID
	 */
	public void setMsgId(String msgId){
		this.msgId= msgId;
		this.setIsSet_msgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rawDscd= false;
	protected final boolean isSet_rawDscd(){
		return this.isSet_rawDscd;
	}
	private void setIsSet_rawDscd(boolean value){
		this.isSet_rawDscd= value;
	}
	/**
	 * 입출금구분코드
	 */
	@XmlTransient
	public String getRawDscd(){
		return this.rawDscd;
	}
	
	/**
	 * 입출금구분코드
	 * 
	 * @param rawDscd 입출금구분코드
	 */
	public void setRawDscd(String rawDscd){
		this.rawDscd= rawDscd;
		this.setIsSet_rawDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushTyp= false;
	protected final boolean isSet_pushTyp(){
		return this.isSet_pushTyp;
	}
	private void setIsSet_pushTyp(boolean value){
		this.isSet_pushTyp= value;
	}
	/**
	 * PUSH타입
	 */
	@XmlTransient
	public String getPushTyp(){
		return this.pushTyp;
	}
	
	/**
	 * PUSH타입
	 * 
	 * @param pushTyp PUSH타입
	 */
	public void setPushTyp(String pushTyp){
		this.pushTyp= pushTyp;
		this.setIsSet_pushTyp(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_kkoBtnInfList= false;
	protected final boolean isSet_kkoBtnInfList(){
		return this.isSet_kkoBtnInfList;
	}
	private void setIsSet_kkoBtnInfList(boolean value){
		this.isSet_kkoBtnInfList= value;
	}
	/**
	 * 카카오버튼정보목록
	 */
	@XmlTransient
	public List<INBKkoBtnInfList_DTO> getKkoBtnInfList(){
		return kkoBtnInfList;
	}
	
	/**
	 * 카카오버튼정보목록
	 * 
	 * @param kkoBtnInfList 카카오버튼정보목록
	 */
	@JsonSetter("kkoBtnInfList")
	public void setKkoBtnInfList(List<INBKkoBtnInfList_DTO> kkoBtnInfList){
		this.kkoBtnInfList= kkoBtnInfList;
		this.setIsSet_kkoBtnInfList(true);
	}
	
	public void setKkoBtnInfList(INBKkoBtnInfList_DTO... items){
		List<INBKkoBtnInfList_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBKkoBtnInfList_DTO item: items ){
				_items.add(item);
			}
		}
		this.setKkoBtnInfList(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageId= false;
	protected final boolean isSet_pageId(){
		return this.isSet_pageId;
	}
	private void setIsSet_pageId(boolean value){
		this.isSet_pageId= value;
	}
	/**
	 * 페이지ID
	 */
	@XmlTransient
	public String getPageId(){
		return this.pageId;
	}
	
	/**
	 * 페이지ID
	 * 
	 * @param pageId 페이지ID
	 */
	public void setPageId(String pageId){
		this.pageId= pageId;
		this.setIsSet_pageId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdCd= false;
	protected final boolean isSet_prdCd(){
		return this.isSet_prdCd;
	}
	private void setIsSet_prdCd(boolean value){
		this.isSet_prdCd= value;
	}
	/**
	 * 상품코드
	 */
	@XmlTransient
	public String getPrdCd(){
		return this.prdCd;
	}
	
	/**
	 * 상품코드
	 * 
	 * @param prdCd 상품코드
	 */
	public void setPrdCd(String prdCd){
		this.prdCd= prdCd;
		this.setIsSet_prdCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdDscd= false;
	protected final boolean isSet_prdDscd(){
		return this.isSet_prdDscd;
	}
	private void setIsSet_prdDscd(boolean value){
		this.isSet_prdDscd= value;
	}
	/**
	 * 상품구분코드
	 */
	@XmlTransient
	public String getPrdDscd(){
		return this.prdDscd;
	}
	
	/**
	 * 상품구분코드
	 * 
	 * @param prdDscd 상품구분코드
	 */
	public void setPrdDscd(String prdDscd){
		this.prdDscd= prdDscd;
		this.setIsSet_prdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actBal= false;
	protected final boolean isSet_actBal(){
		return this.isSet_actBal;
	}
	private void setIsSet_actBal(boolean value){
		this.isSet_actBal= value;
	}
	/**
	 * 계좌잔액
	 */
	@XmlTransient
	public String getActBal(){
		return this.actBal;
	}
	
	/**
	 * 계좌잔액
	 * 
	 * @param actBal 계좌잔액
	 */
	public void setActBal(String actBal){
		this.actBal= actBal;
		this.setIsSet_actBal(true);
	}
				
	@Override
	public INBPushListRsp_DTO clone(){
		try{
			INBPushListRsp_DTO object= (INBPushListRsp_DTO)super.clone();
			if ( this.kkoBtnInfList== null ) object.kkoBtnInfList= null;
			else{
				List<INBKkoBtnInfList_DTO> clonedList= new ArrayList<>(this.kkoBtnInfList.size());
				for( INBKkoBtnInfList_DTO item : kkoBtnInfList ){
					clonedList.add((INBKkoBtnInfList_DTO)item.clone());
				}
				object.kkoBtnInfList= clonedList;
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
		
		result= prime * result + ((this.ntfbxLrclCd==null)?0:this.ntfbxLrclCd.hashCode());
		result= prime * result + ((this.ntfbxMclfCd==null)?0:this.ntfbxMclfCd.hashCode());
		result= prime * result + ((this.ntfbxLrclCdNm==null)?0:this.ntfbxLrclCdNm.hashCode());
		result= prime * result + ((this.ntfbxMclfCdNm==null)?0:this.ntfbxMclfCdNm.hashCode());
		result= prime * result + ((this.favtYn==null)?0:this.favtYn.hashCode());
		result= prime * result + ((this.ntfcRfwr==null)?0:this.ntfcRfwr.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		result= prime * result + ((this.mskAcno==null)?0:this.mskAcno.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.mskCusNm==null)?0:this.mskCusNm.hashCode());
		result= prime * result + ((this.rawCusNm==null)?0:this.rawCusNm.hashCode());
		result= prime * result + ((this.readYn==null)?0:this.readYn.hashCode());
		result= prime * result + ((this.pushTitlTxt==null)?0:this.pushTitlTxt.hashCode());
		result= prime * result + ((this.pushTxt==null)?0:this.pushTxt.hashCode());
		result= prime * result + ((this.msgTxt==null)?0:this.msgTxt.hashCode());
		result= prime * result + ((this.ntfcDtm==null)?0:this.ntfcDtm.hashCode());
		result= prime * result + ((this.otln==null)?0:this.otln.hashCode());
		result= prime * result + ((this.msgId==null)?0:this.msgId.hashCode());
		result= prime * result + ((this.rawDscd==null)?0:this.rawDscd.hashCode());
		result= prime * result + ((this.pushTyp==null)?0:this.pushTyp.hashCode());
		result= prime * result + ((this.kkoBtnInfList==null)?0:this.kkoBtnInfList.hashCode());
		result= prime * result + ((this.pageId==null)?0:this.pageId.hashCode());
		result= prime * result + ((this.prdCd==null)?0:this.prdCd.hashCode());
		result= prime * result + ((this.prdDscd==null)?0:this.prdDscd.hashCode());
		result= prime * result + ((this.actBal==null)?0:this.actBal.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBPushListRsp_DTO other= (INBPushListRsp_DTO)obj;
		{
			Object _ntfbxLrclCd= getNtfbxLrclCd();
			Object __ntfbxLrclCd= other.getNtfbxLrclCd();
			if ( _ntfbxLrclCd== null ) { if ( __ntfbxLrclCd!= null ) return false; }
			else if ( !_ntfbxLrclCd.equals(__ntfbxLrclCd) ) return false;
		}
		{
			Object _ntfbxMclfCd= getNtfbxMclfCd();
			Object __ntfbxMclfCd= other.getNtfbxMclfCd();
			if ( _ntfbxMclfCd== null ) { if ( __ntfbxMclfCd!= null ) return false; }
			else if ( !_ntfbxMclfCd.equals(__ntfbxMclfCd) ) return false;
		}
		{
			Object _ntfbxLrclCdNm= getNtfbxLrclCdNm();
			Object __ntfbxLrclCdNm= other.getNtfbxLrclCdNm();
			if ( _ntfbxLrclCdNm== null ) { if ( __ntfbxLrclCdNm!= null ) return false; }
			else if ( !_ntfbxLrclCdNm.equals(__ntfbxLrclCdNm) ) return false;
		}
		{
			Object _ntfbxMclfCdNm= getNtfbxMclfCdNm();
			Object __ntfbxMclfCdNm= other.getNtfbxMclfCdNm();
			if ( _ntfbxMclfCdNm== null ) { if ( __ntfbxMclfCdNm!= null ) return false; }
			else if ( !_ntfbxMclfCdNm.equals(__ntfbxMclfCdNm) ) return false;
		}
		{
			Object _favtYn= getFavtYn();
			Object __favtYn= other.getFavtYn();
			if ( _favtYn== null ) { if ( __favtYn!= null ) return false; }
			else if ( !_favtYn.equals(__favtYn) ) return false;
		}
		{
			Object _ntfcRfwr= getNtfcRfwr();
			Object __ntfcRfwr= other.getNtfcRfwr();
			if ( _ntfcRfwr== null ) { if ( __ntfcRfwr!= null ) return false; }
			else if ( !_ntfcRfwr.equals(__ntfcRfwr) ) return false;
		}
		{
			Object _umsTrno= getUmsTrno();
			Object __umsTrno= other.getUmsTrno();
			if ( _umsTrno== null ) { if ( __umsTrno!= null ) return false; }
			else if ( !_umsTrno.equals(__umsTrno) ) return false;
		}
		{
			Object _umsReqDt= getUmsReqDt();
			Object __umsReqDt= other.getUmsReqDt();
			if ( _umsReqDt== null ) { if ( __umsReqDt!= null ) return false; }
			else if ( !_umsReqDt.equals(__umsReqDt) ) return false;
		}
		{
			Object _mskAcno= getMskAcno();
			Object __mskAcno= other.getMskAcno();
			if ( _mskAcno== null ) { if ( __mskAcno!= null ) return false; }
			else if ( !_mskAcno.equals(__mskAcno) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _mskCusNm= getMskCusNm();
			Object __mskCusNm= other.getMskCusNm();
			if ( _mskCusNm== null ) { if ( __mskCusNm!= null ) return false; }
			else if ( !_mskCusNm.equals(__mskCusNm) ) return false;
		}
		{
			Object _rawCusNm= getRawCusNm();
			Object __rawCusNm= other.getRawCusNm();
			if ( _rawCusNm== null ) { if ( __rawCusNm!= null ) return false; }
			else if ( !_rawCusNm.equals(__rawCusNm) ) return false;
		}
		{
			Object _readYn= getReadYn();
			Object __readYn= other.getReadYn();
			if ( _readYn== null ) { if ( __readYn!= null ) return false; }
			else if ( !_readYn.equals(__readYn) ) return false;
		}
		{
			Object _pushTitlTxt= getPushTitlTxt();
			Object __pushTitlTxt= other.getPushTitlTxt();
			if ( _pushTitlTxt== null ) { if ( __pushTitlTxt!= null ) return false; }
			else if ( !_pushTitlTxt.equals(__pushTitlTxt) ) return false;
		}
		{
			Object _pushTxt= getPushTxt();
			Object __pushTxt= other.getPushTxt();
			if ( _pushTxt== null ) { if ( __pushTxt!= null ) return false; }
			else if ( !_pushTxt.equals(__pushTxt) ) return false;
		}
		{
			Object _msgTxt= getMsgTxt();
			Object __msgTxt= other.getMsgTxt();
			if ( _msgTxt== null ) { if ( __msgTxt!= null ) return false; }
			else if ( !_msgTxt.equals(__msgTxt) ) return false;
		}
		{
			Object _ntfcDtm= getNtfcDtm();
			Object __ntfcDtm= other.getNtfcDtm();
			if ( _ntfcDtm== null ) { if ( __ntfcDtm!= null ) return false; }
			else if ( !_ntfcDtm.equals(__ntfcDtm) ) return false;
		}
		{
			Object _otln= getOtln();
			Object __otln= other.getOtln();
			if ( _otln== null ) { if ( __otln!= null ) return false; }
			else if ( !_otln.equals(__otln) ) return false;
		}
		{
			Object _msgId= getMsgId();
			Object __msgId= other.getMsgId();
			if ( _msgId== null ) { if ( __msgId!= null ) return false; }
			else if ( !_msgId.equals(__msgId) ) return false;
		}
		{
			Object _rawDscd= getRawDscd();
			Object __rawDscd= other.getRawDscd();
			if ( _rawDscd== null ) { if ( __rawDscd!= null ) return false; }
			else if ( !_rawDscd.equals(__rawDscd) ) return false;
		}
		{
			Object _pushTyp= getPushTyp();
			Object __pushTyp= other.getPushTyp();
			if ( _pushTyp== null ) { if ( __pushTyp!= null ) return false; }
			else if ( !_pushTyp.equals(__pushTyp) ) return false;
		}
		{
			Object _kkoBtnInfList= getKkoBtnInfList();
			Object __kkoBtnInfList= other.getKkoBtnInfList();
			if ( _kkoBtnInfList== null ) { if ( __kkoBtnInfList!= null ) return false; }
			else if ( !_kkoBtnInfList.equals(__kkoBtnInfList) ) return false;
		}
		{
			Object _pageId= getPageId();
			Object __pageId= other.getPageId();
			if ( _pageId== null ) { if ( __pageId!= null ) return false; }
			else if ( !_pageId.equals(__pageId) ) return false;
		}
		{
			Object _prdCd= getPrdCd();
			Object __prdCd= other.getPrdCd();
			if ( _prdCd== null ) { if ( __prdCd!= null ) return false; }
			else if ( !_prdCd.equals(__prdCd) ) return false;
		}
		{
			Object _prdDscd= getPrdDscd();
			Object __prdDscd= other.getPrdDscd();
			if ( _prdDscd== null ) { if ( __prdDscd!= null ) return false; }
			else if ( !_prdDscd.equals(__prdDscd) ) return false;
		}
		{
			Object _actBal= getActBal();
			Object __actBal= other.getActBal();
			if ( _actBal== null ) { if ( __actBal!= null ) return false; }
			else if ( !_actBal.equals(__actBal) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBPushListRsp_DTO.class.getName()).append(":\n");
		sb.append("\tntfbxLrclCd: ");
		sb.append(ntfbxLrclCd==null?"null":getNtfbxLrclCd());
		sb.append("\n");
		sb.append("\tntfbxMclfCd: ");
		sb.append(ntfbxMclfCd==null?"null":getNtfbxMclfCd());
		sb.append("\n");
		sb.append("\tntfbxLrclCdNm: ");
		sb.append(ntfbxLrclCdNm==null?"null":getNtfbxLrclCdNm());
		sb.append("\n");
		sb.append("\tntfbxMclfCdNm: ");
		sb.append(ntfbxMclfCdNm==null?"null":getNtfbxMclfCdNm());
		sb.append("\n");
		sb.append("\tfavtYn: ");
		sb.append(favtYn==null?"null":getFavtYn());
		sb.append("\n");
		sb.append("\tntfcRfwr: ");
		sb.append(ntfcRfwr==null?"null":getNtfcRfwr());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("\tmskAcno: ");
		sb.append(mskAcno==null?"null":getMskAcno());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tmskCusNm: ");
		sb.append(mskCusNm==null?"null":getMskCusNm());
		sb.append("\n");
		sb.append("\trawCusNm: ");
		sb.append(rawCusNm==null?"null":getRawCusNm());
		sb.append("\n");
		sb.append("\treadYn: ");
		sb.append(readYn==null?"null":getReadYn());
		sb.append("\n");
		sb.append("\tpushTitlTxt: ");
		sb.append(pushTitlTxt==null?"null":getPushTitlTxt());
		sb.append("\n");
		sb.append("\tpushTxt: ");
		sb.append(pushTxt==null?"null":getPushTxt());
		sb.append("\n");
		sb.append("\tmsgTxt: ");
		sb.append(msgTxt==null?"null":getMsgTxt());
		sb.append("\n");
		sb.append("\tntfcDtm: ");
		sb.append(ntfcDtm==null?"null":getNtfcDtm());
		sb.append("\n");
		sb.append("\totln: ");
		sb.append(otln==null?"null":getOtln());
		sb.append("\n");
		sb.append("\tmsgId: ");
		sb.append(msgId==null?"null":getMsgId());
		sb.append("\n");
		sb.append("\trawDscd: ");
		sb.append(rawDscd==null?"null":getRawDscd());
		sb.append("\n");
		sb.append("\tpushTyp: ");
		sb.append(pushTyp==null?"null":getPushTyp());
		sb.append("\n");
		sb.append("\tkkoBtnInfList: ");
		if ( kkoBtnInfList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(kkoBtnInfList.size());
			sb.append("(items)\n");
	
			int max= (10<kkoBtnInfList.size())?10:kkoBtnInfList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tkkoBtnInfList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(kkoBtnInfList.get(i));
				sb.append("\n");
			}
	
			if ( max < kkoBtnInfList.size() ){
				sb.append("\tkkoBtnInfList[.] : ").append("more ").append((kkoBtnInfList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tpageId: ");
		sb.append(pageId==null?"null":getPageId());
		sb.append("\n");
		sb.append("\tprdCd: ");
		sb.append(prdCd==null?"null":getPrdCd());
		sb.append("\n");
		sb.append("\tprdDscd: ");
		sb.append(prdDscd==null?"null":getPrdDscd());
		sb.append("\n");
		sb.append("\tactBal: ");
		sb.append(actBal==null?"null":getActBal());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* ntfbxLrclCd */
		messageLen+= 10; /* ntfbxMclfCd */
		messageLen+= 200; /* ntfbxLrclCdNm */
		messageLen+= 200; /* ntfbxMclfCdNm */
		messageLen+= 1; /* favtYn */
		messageLen+= 10; /* ntfcRfwr */
		messageLen+= 20; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
		messageLen+= 20; /* mskAcno */
		messageLen+= 20; /* acno */
		messageLen+= 50; /* mskCusNm */
		messageLen+= 50; /* rawCusNm */
		messageLen+= 1; /* readYn */
		messageLen+= 100; /* pushTitlTxt */
		messageLen+= 1500; /* pushTxt */
		messageLen+= 1500; /* msgTxt */
		messageLen+= 14; /* ntfcDtm */
		messageLen+= 100; /* otln */
		messageLen+= 50; /* msgId */
		messageLen+= 2; /* rawDscd */
		messageLen+= 2; /* pushTyp */
		{/*kkoBtnInfList*/
			int size=1;
			int count= kkoBtnInfList == null ? 0 : kkoBtnInfList.size();
			int min= size > count?count:size;
			INBKkoBtnInfList_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBKkoBtnInfList_DTO element= kkoBtnInfList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBKkoBtnInfList_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 200; /* pageId */
		messageLen+= 100; /* prdCd */
		messageLen+= 100; /* prdDscd */
		messageLen+= 18; /* actBal */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfbxLrclCd");
		list.add("ntfbxMclfCd");
		list.add("ntfbxLrclCdNm");
		list.add("ntfbxMclfCdNm");
		list.add("favtYn");
		list.add("ntfcRfwr");
		list.add("umsTrno");
		list.add("umsReqDt");
		list.add("mskAcno");
		list.add("acno");
		list.add("mskCusNm");
		list.add("rawCusNm");
		list.add("readYn");
		list.add("pushTitlTxt");
		list.add("pushTxt");
		list.add("msgTxt");
		list.add("ntfcDtm");
		list.add("otln");
		list.add("msgId");
		list.add("rawDscd");
		list.add("pushTyp");
		list.add("kkoBtnInfList");
		list.add("pageId");
		list.add("prdCd");
		list.add("prdDscd");
		list.add("actBal");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfbxLrclCd", get("ntfbxLrclCd"));
		map.put("ntfbxMclfCd", get("ntfbxMclfCd"));
		map.put("ntfbxLrclCdNm", get("ntfbxLrclCdNm"));
		map.put("ntfbxMclfCdNm", get("ntfbxMclfCdNm"));
		map.put("favtYn", get("favtYn"));
		map.put("ntfcRfwr", get("ntfcRfwr"));
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
		map.put("mskAcno", get("mskAcno"));
		map.put("acno", get("acno"));
		map.put("mskCusNm", get("mskCusNm"));
		map.put("rawCusNm", get("rawCusNm"));
		map.put("readYn", get("readYn"));
		map.put("pushTitlTxt", get("pushTitlTxt"));
		map.put("pushTxt", get("pushTxt"));
		map.put("msgTxt", get("msgTxt"));
		map.put("ntfcDtm", get("ntfcDtm"));
		map.put("otln", get("otln"));
		map.put("msgId", get("msgId"));
		map.put("rawDscd", get("rawDscd"));
		map.put("pushTyp", get("pushTyp"));
		map.put("kkoBtnInfList", get("kkoBtnInfList"));
		map.put("pageId", get("pageId"));
		map.put("prdCd", get("prdCd"));
		map.put("prdDscd", get("prdDscd"));
		map.put("actBal", get("actBal"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -686513018:/* ntfbxLrclCd */
			return getNtfbxLrclCd();
		case -671474329:/* ntfbxMclfCd */
			return getNtfbxMclfCd();
		case 1685955813:/* ntfbxLrclCdNm */
			return getNtfbxLrclCdNm();
		case -1041733242:/* ntfbxMclfCdNm */
			return getNtfbxMclfCdNm();
		case -1281582674:/* favtYn */
			return getFavtYn();
		case 1320967090:/* ntfcRfwr */
			return getNtfcRfwr();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
		case 1346857608:/* mskAcno */
			return getMskAcno();
		case 2988387:/* acno */
			return getAcno();
		case -1194699941:/* mskCusNm */
			return getMskCusNm();
		case 477769880:/* rawCusNm */
			return getRawCusNm();
		case -934979765:/* readYn */
			return getReadYn();
		case -1390128375:/* pushTitlTxt */
			return getPushTitlTxt();
		case -219804426:/* pushTxt */
			return getPushTxt();
		case -1065031889:/* msgTxt */
			return getMsgTxt();
		case -2035611174:/* ntfcDtm */
			return getNtfcDtm();
		case 3421735:/* otln */
			return getOtln();
		case 104191100:/* msgId */
			return getMsgId();
		case 985270648:/* rawDscd */
			return getRawDscd();
		case -219804399:/* pushTyp */
			return getPushTyp();
		case 452825746:/* kkoBtnInfList */
			return getKkoBtnInfList();
		case -995752950:/* pageId */
			return getPageId();
		case 106928803:/* prdCd */
			return getPrdCd();
		case -320588046:/* prdDscd */
			return getPrdDscd();
		case -1422988773:/* actBal */
			return getActBal();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -686513018:/* ntfbxLrclCd */
			setNtfbxLrclCd((String)value);
			break;
		case -671474329:/* ntfbxMclfCd */
			setNtfbxMclfCd((String)value);
			break;
		case 1685955813:/* ntfbxLrclCdNm */
			setNtfbxLrclCdNm((String)value);
			break;
		case -1041733242:/* ntfbxMclfCdNm */
			setNtfbxMclfCdNm((String)value);
			break;
		case -1281582674:/* favtYn */
			setFavtYn((String)value);
			break;
		case 1320967090:/* ntfcRfwr */
			setNtfcRfwr((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		case 1346857608:/* mskAcno */
			setMskAcno((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1194699941:/* mskCusNm */
			setMskCusNm((String)value);
			break;
		case 477769880:/* rawCusNm */
			setRawCusNm((String)value);
			break;
		case -934979765:/* readYn */
			setReadYn((String)value);
			break;
		case -1390128375:/* pushTitlTxt */
			setPushTitlTxt((String)value);
			break;
		case -219804426:/* pushTxt */
			setPushTxt((String)value);
			break;
		case -1065031889:/* msgTxt */
			setMsgTxt((String)value);
			break;
		case -2035611174:/* ntfcDtm */
			setNtfcDtm((String)value);
			break;
		case 3421735:/* otln */
			setOtln((String)value);
			break;
		case 104191100:/* msgId */
			setMsgId((String)value);
			break;
		case 985270648:/* rawDscd */
			setRawDscd((String)value);
			break;
		case -219804399:/* pushTyp */
			setPushTyp((String)value);
			break;
		case 452825746:/* kkoBtnInfList */
			setKkoBtnInfList((List<INBKkoBtnInfList_DTO>)value);
			break;
		case -995752950:/* pageId */
			setPageId((String)value);
			break;
		case 106928803:/* prdCd */
			setPrdCd((String)value);
			break;
		case -320588046:/* prdDscd */
			setPrdDscd((String)value);
			break;
		case -1422988773:/* actBal */
			setActBal((String)value);
			break;
		default:
			break;
		}
	}
	
}
