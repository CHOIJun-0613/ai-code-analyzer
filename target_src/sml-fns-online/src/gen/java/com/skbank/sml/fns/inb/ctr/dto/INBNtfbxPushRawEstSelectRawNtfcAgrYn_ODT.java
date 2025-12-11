/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.inb.dto.INBPushNtfcSrvcInqGrid_DTO;
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
 * 입출금알림설정 IO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"cnt", "hpComCd", "hpTlenNo", "hpSerNo", "appItllCmplYn", "appItllDisNm", "appItllCmplDt", "ntfcJnngYn", "xrtntcCurYn", "ntfcSrvcUsgYn1", "ntfcSrvcUsgYn2", "ntfcSrvcUsgYn3", "ntfcSrvcUsgYn4", "ntfcSrvcUsgYn5", "ntfcSrvcUsgYn6"
	, "ntfcSrvcUsgYn99", "pushNtfcSrvcInqGrid", "rtcd", "rtcdTxt"
}, name="INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT")
@XmlRootElement(name="INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT")
@BxmCategory(logicalName="입출금.알림.설정.컨트롤러.출력.IO", description="입출금알림설정 IO") 
public class INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1875548128L;
	
	
	
	/**
	 * 건수
	 */
	@ApiModelProperty(
		name = "cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("cnt")
	@BxmOmm_Field(length=5, decimal=0, description="건수", align="right", fill="")
	private Integer cnt= 0;
	
	
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
	 * 알림가입여부
	 */
	@ApiModelProperty(
		name = "ntfcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림가입여부", align="left", fill="")
	private String ntfcJnngYn= "";
	
	
	/**
	 * 환율고시통화여부
	 */
	@ApiModelProperty(
		name = "xrtntcCurYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xrtntcCurYn")
	@BxmOmm_Field(length=1, decimal=0, description="환율고시통화여부", align="left", fill="")
	private String xrtntcCurYn= "";
	
	
	/**
	 * 알림서비스사용여부_1
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn1")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_1", align="left", fill="")
	private String ntfcSrvcUsgYn1= "";
	
	
	/**
	 * 알림서비스사용여부_2
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn2")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_2", align="left", fill="")
	private String ntfcSrvcUsgYn2= "";
	
	
	/**
	 * 알림서비스사용여부_3
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn3"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn3")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_3", align="left", fill="")
	private String ntfcSrvcUsgYn3= "";
	
	
	/**
	 * 알림서비스사용여부_4
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn4"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn4")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_4", align="left", fill="")
	private String ntfcSrvcUsgYn4= "";
	
	
	/**
	 * 알림서비스사용여부_5
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn5"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn5")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_5", align="left", fill="")
	private String ntfcSrvcUsgYn5= "";
	
	
	/**
	 * 알림서비스사용여부_6
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn6"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn6")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_6", align="left", fill="")
	private String ntfcSrvcUsgYn6= "";
	
	
	/**
	 * 알림서비스사용여부_99
	 */
	@ApiModelProperty(
		name = "ntfcSrvcUsgYn99"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcUsgYn99")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스사용여부_99", align="left", fill="")
	private String ntfcSrvcUsgYn99= "";
	
	
	/**
	 * push알림서비스조회그리드
	 */
	@ApiModelProperty(
		name = "pushNtfcSrvcInqGrid"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBPushNtfcSrvcInqGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pushNtfcSrvcInqGrid")
	@BxmOmm_Field(length=0, decimal=0, description="push알림서비스조회그리드", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<INBPushNtfcSrvcInqGrid_DTO> pushNtfcSrvcInqGrid= new ArrayList<>();
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "rtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcd")
	@BxmOmm_Field(length=7, decimal=0, description="결과코드", align="left", fill="")
	private String rtcd= "";
	
	
	/**
	 * 결과코드내용
	 */
	@ApiModelProperty(
		name = "rtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcdTxt")
	@BxmOmm_Field(length=100, decimal=0, description="결과코드내용", align="left", fill="")
	private String rtcdTxt= "";
	
	
	
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
	@XmlTransient
	public Integer getCnt(){
		return this.cnt;
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
	private boolean isSet_ntfcJnngYn= false;
	protected final boolean isSet_ntfcJnngYn(){
		return this.isSet_ntfcJnngYn;
	}
	private void setIsSet_ntfcJnngYn(boolean value){
		this.isSet_ntfcJnngYn= value;
	}
	/**
	 * 알림가입여부
	 */
	@XmlTransient
	public String getNtfcJnngYn(){
		return this.ntfcJnngYn;
	}
	
	/**
	 * 알림가입여부
	 * 
	 * @param ntfcJnngYn 알림가입여부
	 */
	public void setNtfcJnngYn(String ntfcJnngYn){
		this.ntfcJnngYn= ntfcJnngYn;
		this.setIsSet_ntfcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xrtntcCurYn= false;
	protected final boolean isSet_xrtntcCurYn(){
		return this.isSet_xrtntcCurYn;
	}
	private void setIsSet_xrtntcCurYn(boolean value){
		this.isSet_xrtntcCurYn= value;
	}
	/**
	 * 환율고시통화여부
	 */
	@XmlTransient
	public String getXrtntcCurYn(){
		return this.xrtntcCurYn;
	}
	
	/**
	 * 환율고시통화여부
	 * 
	 * @param xrtntcCurYn 환율고시통화여부
	 */
	public void setXrtntcCurYn(String xrtntcCurYn){
		this.xrtntcCurYn= xrtntcCurYn;
		this.setIsSet_xrtntcCurYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn1= false;
	protected final boolean isSet_ntfcSrvcUsgYn1(){
		return this.isSet_ntfcSrvcUsgYn1;
	}
	private void setIsSet_ntfcSrvcUsgYn1(boolean value){
		this.isSet_ntfcSrvcUsgYn1= value;
	}
	/**
	 * 알림서비스사용여부_1
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn1(){
		return this.ntfcSrvcUsgYn1;
	}
	
	/**
	 * 알림서비스사용여부_1
	 * 
	 * @param ntfcSrvcUsgYn1 알림서비스사용여부_1
	 */
	public void setNtfcSrvcUsgYn1(String ntfcSrvcUsgYn1){
		this.ntfcSrvcUsgYn1= ntfcSrvcUsgYn1;
		this.setIsSet_ntfcSrvcUsgYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn2= false;
	protected final boolean isSet_ntfcSrvcUsgYn2(){
		return this.isSet_ntfcSrvcUsgYn2;
	}
	private void setIsSet_ntfcSrvcUsgYn2(boolean value){
		this.isSet_ntfcSrvcUsgYn2= value;
	}
	/**
	 * 알림서비스사용여부_2
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn2(){
		return this.ntfcSrvcUsgYn2;
	}
	
	/**
	 * 알림서비스사용여부_2
	 * 
	 * @param ntfcSrvcUsgYn2 알림서비스사용여부_2
	 */
	public void setNtfcSrvcUsgYn2(String ntfcSrvcUsgYn2){
		this.ntfcSrvcUsgYn2= ntfcSrvcUsgYn2;
		this.setIsSet_ntfcSrvcUsgYn2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn3= false;
	protected final boolean isSet_ntfcSrvcUsgYn3(){
		return this.isSet_ntfcSrvcUsgYn3;
	}
	private void setIsSet_ntfcSrvcUsgYn3(boolean value){
		this.isSet_ntfcSrvcUsgYn3= value;
	}
	/**
	 * 알림서비스사용여부_3
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn3(){
		return this.ntfcSrvcUsgYn3;
	}
	
	/**
	 * 알림서비스사용여부_3
	 * 
	 * @param ntfcSrvcUsgYn3 알림서비스사용여부_3
	 */
	public void setNtfcSrvcUsgYn3(String ntfcSrvcUsgYn3){
		this.ntfcSrvcUsgYn3= ntfcSrvcUsgYn3;
		this.setIsSet_ntfcSrvcUsgYn3(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn4= false;
	protected final boolean isSet_ntfcSrvcUsgYn4(){
		return this.isSet_ntfcSrvcUsgYn4;
	}
	private void setIsSet_ntfcSrvcUsgYn4(boolean value){
		this.isSet_ntfcSrvcUsgYn4= value;
	}
	/**
	 * 알림서비스사용여부_4
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn4(){
		return this.ntfcSrvcUsgYn4;
	}
	
	/**
	 * 알림서비스사용여부_4
	 * 
	 * @param ntfcSrvcUsgYn4 알림서비스사용여부_4
	 */
	public void setNtfcSrvcUsgYn4(String ntfcSrvcUsgYn4){
		this.ntfcSrvcUsgYn4= ntfcSrvcUsgYn4;
		this.setIsSet_ntfcSrvcUsgYn4(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn5= false;
	protected final boolean isSet_ntfcSrvcUsgYn5(){
		return this.isSet_ntfcSrvcUsgYn5;
	}
	private void setIsSet_ntfcSrvcUsgYn5(boolean value){
		this.isSet_ntfcSrvcUsgYn5= value;
	}
	/**
	 * 알림서비스사용여부_5
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn5(){
		return this.ntfcSrvcUsgYn5;
	}
	
	/**
	 * 알림서비스사용여부_5
	 * 
	 * @param ntfcSrvcUsgYn5 알림서비스사용여부_5
	 */
	public void setNtfcSrvcUsgYn5(String ntfcSrvcUsgYn5){
		this.ntfcSrvcUsgYn5= ntfcSrvcUsgYn5;
		this.setIsSet_ntfcSrvcUsgYn5(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn6= false;
	protected final boolean isSet_ntfcSrvcUsgYn6(){
		return this.isSet_ntfcSrvcUsgYn6;
	}
	private void setIsSet_ntfcSrvcUsgYn6(boolean value){
		this.isSet_ntfcSrvcUsgYn6= value;
	}
	/**
	 * 알림서비스사용여부_6
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn6(){
		return this.ntfcSrvcUsgYn6;
	}
	
	/**
	 * 알림서비스사용여부_6
	 * 
	 * @param ntfcSrvcUsgYn6 알림서비스사용여부_6
	 */
	public void setNtfcSrvcUsgYn6(String ntfcSrvcUsgYn6){
		this.ntfcSrvcUsgYn6= ntfcSrvcUsgYn6;
		this.setIsSet_ntfcSrvcUsgYn6(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcUsgYn99= false;
	protected final boolean isSet_ntfcSrvcUsgYn99(){
		return this.isSet_ntfcSrvcUsgYn99;
	}
	private void setIsSet_ntfcSrvcUsgYn99(boolean value){
		this.isSet_ntfcSrvcUsgYn99= value;
	}
	/**
	 * 알림서비스사용여부_99
	 */
	@XmlTransient
	public String getNtfcSrvcUsgYn99(){
		return this.ntfcSrvcUsgYn99;
	}
	
	/**
	 * 알림서비스사용여부_99
	 * 
	 * @param ntfcSrvcUsgYn99 알림서비스사용여부_99
	 */
	public void setNtfcSrvcUsgYn99(String ntfcSrvcUsgYn99){
		this.ntfcSrvcUsgYn99= ntfcSrvcUsgYn99;
		this.setIsSet_ntfcSrvcUsgYn99(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushNtfcSrvcInqGrid= false;
	protected final boolean isSet_pushNtfcSrvcInqGrid(){
		return this.isSet_pushNtfcSrvcInqGrid;
	}
	private void setIsSet_pushNtfcSrvcInqGrid(boolean value){
		this.isSet_pushNtfcSrvcInqGrid= value;
	}
	/**
	 * push알림서비스조회그리드
	 */
	@XmlTransient
	public List<INBPushNtfcSrvcInqGrid_DTO> getPushNtfcSrvcInqGrid(){
		return pushNtfcSrvcInqGrid;
	}
	
	/**
	 * push알림서비스조회그리드
	 * 
	 * @param pushNtfcSrvcInqGrid push알림서비스조회그리드
	 */
	@JsonSetter("pushNtfcSrvcInqGrid")
	public void setPushNtfcSrvcInqGrid(List<INBPushNtfcSrvcInqGrid_DTO> pushNtfcSrvcInqGrid){
		this.pushNtfcSrvcInqGrid= pushNtfcSrvcInqGrid;
		this.setIsSet_pushNtfcSrvcInqGrid(true);
	}
	
	public void setPushNtfcSrvcInqGrid(INBPushNtfcSrvcInqGrid_DTO... items){
		List<INBPushNtfcSrvcInqGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBPushNtfcSrvcInqGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setPushNtfcSrvcInqGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcd= false;
	protected final boolean isSet_rtcd(){
		return this.isSet_rtcd;
	}
	private void setIsSet_rtcd(boolean value){
		this.isSet_rtcd= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getRtcd(){
		return this.rtcd;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param rtcd 결과코드
	 */
	public void setRtcd(String rtcd){
		this.rtcd= rtcd;
		this.setIsSet_rtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcdTxt= false;
	protected final boolean isSet_rtcdTxt(){
		return this.isSet_rtcdTxt;
	}
	private void setIsSet_rtcdTxt(boolean value){
		this.isSet_rtcdTxt= value;
	}
	/**
	 * 결과코드내용
	 */
	@XmlTransient
	public String getRtcdTxt(){
		return this.rtcdTxt;
	}
	
	/**
	 * 결과코드내용
	 * 
	 * @param rtcdTxt 결과코드내용
	 */
	public void setRtcdTxt(String rtcdTxt){
		this.rtcdTxt= rtcdTxt;
		this.setIsSet_rtcdTxt(true);
	}
				
	@Override
	public INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT clone(){
		try{
			INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT object= (INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT)super.clone();
			if ( this.pushNtfcSrvcInqGrid== null ) object.pushNtfcSrvcInqGrid= null;
			else{
				List<INBPushNtfcSrvcInqGrid_DTO> clonedList= new ArrayList<>(this.pushNtfcSrvcInqGrid.size());
				for( INBPushNtfcSrvcInqGrid_DTO item : pushNtfcSrvcInqGrid ){
					clonedList.add((INBPushNtfcSrvcInqGrid_DTO)item.clone());
				}
				object.pushNtfcSrvcInqGrid= clonedList;
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
		
		result= prime * result + ((this.cnt==null)?0:this.cnt.hashCode());
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlenNo==null)?0:this.hpTlenNo.hashCode());
		result= prime * result + ((this.hpSerNo==null)?0:this.hpSerNo.hashCode());
		result= prime * result + ((this.appItllCmplYn==null)?0:this.appItllCmplYn.hashCode());
		result= prime * result + ((this.appItllDisNm==null)?0:this.appItllDisNm.hashCode());
		result= prime * result + ((this.appItllCmplDt==null)?0:this.appItllCmplDt.hashCode());
		result= prime * result + ((this.ntfcJnngYn==null)?0:this.ntfcJnngYn.hashCode());
		result= prime * result + ((this.xrtntcCurYn==null)?0:this.xrtntcCurYn.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn1==null)?0:this.ntfcSrvcUsgYn1.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn2==null)?0:this.ntfcSrvcUsgYn2.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn3==null)?0:this.ntfcSrvcUsgYn3.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn4==null)?0:this.ntfcSrvcUsgYn4.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn5==null)?0:this.ntfcSrvcUsgYn5.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn6==null)?0:this.ntfcSrvcUsgYn6.hashCode());
		result= prime * result + ((this.ntfcSrvcUsgYn99==null)?0:this.ntfcSrvcUsgYn99.hashCode());
		result= prime * result + ((this.pushNtfcSrvcInqGrid==null)?0:this.pushNtfcSrvcInqGrid.hashCode());
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT other= (INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT)obj;
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
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
			Object _ntfcJnngYn= getNtfcJnngYn();
			Object __ntfcJnngYn= other.getNtfcJnngYn();
			if ( _ntfcJnngYn== null ) { if ( __ntfcJnngYn!= null ) return false; }
			else if ( !_ntfcJnngYn.equals(__ntfcJnngYn) ) return false;
		}
		{
			Object _xrtntcCurYn= getXrtntcCurYn();
			Object __xrtntcCurYn= other.getXrtntcCurYn();
			if ( _xrtntcCurYn== null ) { if ( __xrtntcCurYn!= null ) return false; }
			else if ( !_xrtntcCurYn.equals(__xrtntcCurYn) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn1= getNtfcSrvcUsgYn1();
			Object __ntfcSrvcUsgYn1= other.getNtfcSrvcUsgYn1();
			if ( _ntfcSrvcUsgYn1== null ) { if ( __ntfcSrvcUsgYn1!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn1.equals(__ntfcSrvcUsgYn1) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn2= getNtfcSrvcUsgYn2();
			Object __ntfcSrvcUsgYn2= other.getNtfcSrvcUsgYn2();
			if ( _ntfcSrvcUsgYn2== null ) { if ( __ntfcSrvcUsgYn2!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn2.equals(__ntfcSrvcUsgYn2) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn3= getNtfcSrvcUsgYn3();
			Object __ntfcSrvcUsgYn3= other.getNtfcSrvcUsgYn3();
			if ( _ntfcSrvcUsgYn3== null ) { if ( __ntfcSrvcUsgYn3!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn3.equals(__ntfcSrvcUsgYn3) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn4= getNtfcSrvcUsgYn4();
			Object __ntfcSrvcUsgYn4= other.getNtfcSrvcUsgYn4();
			if ( _ntfcSrvcUsgYn4== null ) { if ( __ntfcSrvcUsgYn4!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn4.equals(__ntfcSrvcUsgYn4) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn5= getNtfcSrvcUsgYn5();
			Object __ntfcSrvcUsgYn5= other.getNtfcSrvcUsgYn5();
			if ( _ntfcSrvcUsgYn5== null ) { if ( __ntfcSrvcUsgYn5!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn5.equals(__ntfcSrvcUsgYn5) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn6= getNtfcSrvcUsgYn6();
			Object __ntfcSrvcUsgYn6= other.getNtfcSrvcUsgYn6();
			if ( _ntfcSrvcUsgYn6== null ) { if ( __ntfcSrvcUsgYn6!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn6.equals(__ntfcSrvcUsgYn6) ) return false;
		}
		{
			Object _ntfcSrvcUsgYn99= getNtfcSrvcUsgYn99();
			Object __ntfcSrvcUsgYn99= other.getNtfcSrvcUsgYn99();
			if ( _ntfcSrvcUsgYn99== null ) { if ( __ntfcSrvcUsgYn99!= null ) return false; }
			else if ( !_ntfcSrvcUsgYn99.equals(__ntfcSrvcUsgYn99) ) return false;
		}
		{
			Object _pushNtfcSrvcInqGrid= getPushNtfcSrvcInqGrid();
			Object __pushNtfcSrvcInqGrid= other.getPushNtfcSrvcInqGrid();
			if ( _pushNtfcSrvcInqGrid== null ) { if ( __pushNtfcSrvcInqGrid!= null ) return false; }
			else if ( !_pushNtfcSrvcInqGrid.equals(__pushNtfcSrvcInqGrid) ) return false;
		}
		{
			Object _rtcd= getRtcd();
			Object __rtcd= other.getRtcd();
			if ( _rtcd== null ) { if ( __rtcd!= null ) return false; }
			else if ( !_rtcd.equals(__rtcd) ) return false;
		}
		{
			Object _rtcdTxt= getRtcdTxt();
			Object __rtcdTxt= other.getRtcdTxt();
			if ( _rtcdTxt== null ) { if ( __rtcdTxt!= null ) return false; }
			else if ( !_rtcdTxt.equals(__rtcdTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT.class.getName()).append(":\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
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
		sb.append("\tappItllCmplYn: ");
		sb.append(appItllCmplYn==null?"null":getAppItllCmplYn());
		sb.append("\n");
		sb.append("\tappItllDisNm: ");
		sb.append(appItllDisNm==null?"null":getAppItllDisNm());
		sb.append("\n");
		sb.append("\tappItllCmplDt: ");
		sb.append(appItllCmplDt==null?"null":getAppItllCmplDt());
		sb.append("\n");
		sb.append("\tntfcJnngYn: ");
		sb.append(ntfcJnngYn==null?"null":getNtfcJnngYn());
		sb.append("\n");
		sb.append("\txrtntcCurYn: ");
		sb.append(xrtntcCurYn==null?"null":getXrtntcCurYn());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn1: ");
		sb.append(ntfcSrvcUsgYn1==null?"null":getNtfcSrvcUsgYn1());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn2: ");
		sb.append(ntfcSrvcUsgYn2==null?"null":getNtfcSrvcUsgYn2());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn3: ");
		sb.append(ntfcSrvcUsgYn3==null?"null":getNtfcSrvcUsgYn3());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn4: ");
		sb.append(ntfcSrvcUsgYn4==null?"null":getNtfcSrvcUsgYn4());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn5: ");
		sb.append(ntfcSrvcUsgYn5==null?"null":getNtfcSrvcUsgYn5());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn6: ");
		sb.append(ntfcSrvcUsgYn6==null?"null":getNtfcSrvcUsgYn6());
		sb.append("\n");
		sb.append("\tntfcSrvcUsgYn99: ");
		sb.append(ntfcSrvcUsgYn99==null?"null":getNtfcSrvcUsgYn99());
		sb.append("\n");
		sb.append("\tpushNtfcSrvcInqGrid: ");
		if ( pushNtfcSrvcInqGrid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pushNtfcSrvcInqGrid.size());
			sb.append("(items)\n");
	
			int max= (10<pushNtfcSrvcInqGrid.size())?10:pushNtfcSrvcInqGrid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpushNtfcSrvcInqGrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pushNtfcSrvcInqGrid.get(i));
				sb.append("\n");
			}
	
			if ( max < pushNtfcSrvcInqGrid.size() ){
				sb.append("\tpushNtfcSrvcInqGrid[.] : ").append("more ").append((pushNtfcSrvcInqGrid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\trtcd: ");
		sb.append(rtcd==null?"null":getRtcd());
		sb.append("\n");
		sb.append("\trtcdTxt: ");
		sb.append(rtcdTxt==null?"null":getRtcdTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* cnt */
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlenNo */
		messageLen+= 4; /* hpSerNo */
		messageLen+= 1; /* appItllCmplYn */
		messageLen+= 30; /* appItllDisNm */
		messageLen+= 8; /* appItllCmplDt */
		messageLen+= 1; /* ntfcJnngYn */
		messageLen+= 1; /* xrtntcCurYn */
		messageLen+= 1; /* ntfcSrvcUsgYn1 */
		messageLen+= 1; /* ntfcSrvcUsgYn2 */
		messageLen+= 1; /* ntfcSrvcUsgYn3 */
		messageLen+= 1; /* ntfcSrvcUsgYn4 */
		messageLen+= 1; /* ntfcSrvcUsgYn5 */
		messageLen+= 1; /* ntfcSrvcUsgYn6 */
		messageLen+= 1; /* ntfcSrvcUsgYn99 */
		{/*pushNtfcSrvcInqGrid*/
			int size=1;
			int count= pushNtfcSrvcInqGrid == null ? 0 : pushNtfcSrvcInqGrid.size();
			int min= size > count?count:size;
			INBPushNtfcSrvcInqGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBPushNtfcSrvcInqGrid_DTO element= pushNtfcSrvcInqGrid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBPushNtfcSrvcInqGrid_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cnt");
		list.add("hpComCd");
		list.add("hpTlenNo");
		list.add("hpSerNo");
		list.add("appItllCmplYn");
		list.add("appItllDisNm");
		list.add("appItllCmplDt");
		list.add("ntfcJnngYn");
		list.add("xrtntcCurYn");
		list.add("ntfcSrvcUsgYn1");
		list.add("ntfcSrvcUsgYn2");
		list.add("ntfcSrvcUsgYn3");
		list.add("ntfcSrvcUsgYn4");
		list.add("ntfcSrvcUsgYn5");
		list.add("ntfcSrvcUsgYn6");
		list.add("ntfcSrvcUsgYn99");
		list.add("pushNtfcSrvcInqGrid");
		list.add("rtcd");
		list.add("rtcdTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cnt", get("cnt"));
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlenNo", get("hpTlenNo"));
		map.put("hpSerNo", get("hpSerNo"));
		map.put("appItllCmplYn", get("appItllCmplYn"));
		map.put("appItllDisNm", get("appItllDisNm"));
		map.put("appItllCmplDt", get("appItllCmplDt"));
		map.put("ntfcJnngYn", get("ntfcJnngYn"));
		map.put("xrtntcCurYn", get("xrtntcCurYn"));
		map.put("ntfcSrvcUsgYn1", get("ntfcSrvcUsgYn1"));
		map.put("ntfcSrvcUsgYn2", get("ntfcSrvcUsgYn2"));
		map.put("ntfcSrvcUsgYn3", get("ntfcSrvcUsgYn3"));
		map.put("ntfcSrvcUsgYn4", get("ntfcSrvcUsgYn4"));
		map.put("ntfcSrvcUsgYn5", get("ntfcSrvcUsgYn5"));
		map.put("ntfcSrvcUsgYn6", get("ntfcSrvcUsgYn6"));
		map.put("ntfcSrvcUsgYn99", get("ntfcSrvcUsgYn99"));
		map.put("pushNtfcSrvcInqGrid", get("pushNtfcSrvcInqGrid"));
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 98665:/* cnt */
			return getCnt();
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -307448342:/* hpTlenNo */
			return getHpTlenNo();
		case 1097340441:/* hpSerNo */
			return getHpSerNo();
		case 1443413607:/* appItllCmplYn */
			return getAppItllCmplYn();
		case 1432841377:/* appItllDisNm */
			return getAppItllDisNm();
		case 1443412962:/* appItllCmplDt */
			return getAppItllCmplDt();
		case -2082866987:/* ntfcJnngYn */
			return getNtfcJnngYn();
		case 181758674:/* xrtntcCurYn */
			return getXrtntcCurYn();
		case -292423870:/* ntfcSrvcUsgYn1 */
			return getNtfcSrvcUsgYn1();
		case -292423869:/* ntfcSrvcUsgYn2 */
			return getNtfcSrvcUsgYn2();
		case -292423868:/* ntfcSrvcUsgYn3 */
			return getNtfcSrvcUsgYn3();
		case -292423867:/* ntfcSrvcUsgYn4 */
			return getNtfcSrvcUsgYn4();
		case -292423866:/* ntfcSrvcUsgYn5 */
			return getNtfcSrvcUsgYn5();
		case -292423865:/* ntfcSrvcUsgYn6 */
			return getNtfcSrvcUsgYn6();
		case -475205073:/* ntfcSrvcUsgYn99 */
			return getNtfcSrvcUsgYn99();
		case -700878103:/* pushNtfcSrvcInqGrid */
			return getPushNtfcSrvcInqGrid();
		case 3510819:/* rtcd */
			return getRtcd();
		case 1511678285:/* rtcdTxt */
			return getRtcdTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 98665:/* cnt */
			setCnt((Integer)value);
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
		case 1443413607:/* appItllCmplYn */
			setAppItllCmplYn((String)value);
			break;
		case 1432841377:/* appItllDisNm */
			setAppItllDisNm((String)value);
			break;
		case 1443412962:/* appItllCmplDt */
			setAppItllCmplDt((String)value);
			break;
		case -2082866987:/* ntfcJnngYn */
			setNtfcJnngYn((String)value);
			break;
		case 181758674:/* xrtntcCurYn */
			setXrtntcCurYn((String)value);
			break;
		case -292423870:/* ntfcSrvcUsgYn1 */
			setNtfcSrvcUsgYn1((String)value);
			break;
		case -292423869:/* ntfcSrvcUsgYn2 */
			setNtfcSrvcUsgYn2((String)value);
			break;
		case -292423868:/* ntfcSrvcUsgYn3 */
			setNtfcSrvcUsgYn3((String)value);
			break;
		case -292423867:/* ntfcSrvcUsgYn4 */
			setNtfcSrvcUsgYn4((String)value);
			break;
		case -292423866:/* ntfcSrvcUsgYn5 */
			setNtfcSrvcUsgYn5((String)value);
			break;
		case -292423865:/* ntfcSrvcUsgYn6 */
			setNtfcSrvcUsgYn6((String)value);
			break;
		case -475205073:/* ntfcSrvcUsgYn99 */
			setNtfcSrvcUsgYn99((String)value);
			break;
		case -700878103:/* pushNtfcSrvcInqGrid */
			setPushNtfcSrvcInqGrid((List<INBPushNtfcSrvcInqGrid_DTO>)value);
			break;
		case 3510819:/* rtcd */
			setRtcd((String)value);
			break;
		case 1511678285:/* rtcdTxt */
			setRtcdTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
