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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import option.WooriOmmOption;

/**
 * 카카오톡 알림 응답 IO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"msgType", "mapType", "kkoMsg", "checkYn", "name", "moneyBalance", "typeDeal", "account", "moneyDeal", "serialNum", "map1", "map2", "map3", "map4", "map5"
	, "map6", "map7", "map8", "map9", "map10", "map11", "map12", "map13", "map14", "map15", "map16", "map17", "map18", "map19", "map20"
	, "imgFilePathNm", "kkoSendBtns", "isFav", "regDate", "expireDate", "uptDate", "umsTrno", "umsReqDt", "msgGrpCd", "msgGrpNm", "iconName"
}, name="INBKataNtfcRspGrid_DTO")
@XmlRootElement(name="INBKataNtfcRspGrid_DTO")
@BxmCategory(logicalName="카카오톡.알림.응답.GRID.공통.IO", description="카카오톡 알림 응답 IO") 
public class INBKataNtfcRspGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -556862398L;
	
	
	
	/**
	 * 메시지타입
	 */
	@ApiModelProperty(
		name = "msgType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgType")
	@BxmOmm_Field(length=1, decimal=0, description="메시지타입", align="left", fill="")
	private String msgType= "";
	
	
	/**
	 * 매핑타입
	 */
	@ApiModelProperty(
		name = "mapType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mapType")
	@BxmOmm_Field(length=1, decimal=0, description="매핑타입", align="left", fill="")
	private String mapType= "";
	
	
	/**
	 * 사서함메시지
	 */
	@ApiModelProperty(
		name = "kkoMsg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("kkoMsg")
	@BxmOmm_Field(length=4000, decimal=0, description="사서함메시지", align="left", fill="")
	private String kkoMsg= "";
	
	
	/**
	 * 읽음여부
	 */
	@ApiModelProperty(
		name = "checkYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("checkYn")
	@BxmOmm_Field(length=1, decimal=0, description="읽음여부", align="left", fill="")
	private String checkYn= "";
	
	
	/**
	 * 고객명
	 */
	@ApiModelProperty(
		name = "name"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("name")
	@BxmOmm_Field(length=20, decimal=0, description="고객명", align="left", fill="")
	private String name= "";
	
	
	/**
	 * 잔액
	 */
	@ApiModelProperty(
		name = "moneyBalance"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("moneyBalance")
	@BxmOmm_Field(length=30, decimal=0, description="잔액", align="left", fill="")
	private String moneyBalance= "";
	
	
	/**
	 * 업무유형
	 */
	@ApiModelProperty(
		name = "typeDeal"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("typeDeal")
	@BxmOmm_Field(length=30, decimal=0, description="업무유형", align="left", fill="")
	private String typeDeal= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "account"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("account")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String account= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "moneyDeal"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("moneyDeal")
	@BxmOmm_Field(length=30, decimal=0, description="거래금액", align="left", fill="")
	private String moneyDeal= "";
	
	
	/**
	 * 인증번호
	 */
	@ApiModelProperty(
		name = "serialNum"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("serialNum")
	@BxmOmm_Field(length=64, decimal=0, description="인증번호", align="left", fill="")
	private String serialNum= "";
	
	
	/**
	 * 매핑정보1
	 */
	@ApiModelProperty(
		name = "map1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map1")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보1", align="left", fill="")
	private String map1= "";
	
	
	/**
	 * 매핑정보2
	 */
	@ApiModelProperty(
		name = "map2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map2")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보2", align="left", fill="")
	private String map2= "";
	
	
	/**
	 * 매핑정보3
	 */
	@ApiModelProperty(
		name = "map3"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map3")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보3", align="left", fill="")
	private String map3= "";
	
	
	/**
	 * 매핑정보4
	 */
	@ApiModelProperty(
		name = "map4"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map4")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보4", align="left", fill="")
	private String map4= "";
	
	
	/**
	 * 매핑정보5
	 */
	@ApiModelProperty(
		name = "map5"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map5")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보5", align="left", fill="")
	private String map5= "";
	
	
	/**
	 * 매핑정보6
	 */
	@ApiModelProperty(
		name = "map6"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map6")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보6", align="left", fill="")
	private String map6= "";
	
	
	/**
	 * 매핑정보7
	 */
	@ApiModelProperty(
		name = "map7"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map7")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보7", align="left", fill="")
	private String map7= "";
	
	
	/**
	 * 매핑정보8
	 */
	@ApiModelProperty(
		name = "map8"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map8")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보8", align="left", fill="")
	private String map8= "";
	
	
	/**
	 * 매핑정보9
	 */
	@ApiModelProperty(
		name = "map9"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map9")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보9", align="left", fill="")
	private String map9= "";
	
	
	/**
	 * 매핑정보10
	 */
	@ApiModelProperty(
		name = "map10"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map10")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보10", align="left", fill="")
	private String map10= "";
	
	
	/**
	 * 매핑정보11
	 */
	@ApiModelProperty(
		name = "map11"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map11")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보11", align="left", fill="")
	private String map11= "";
	
	
	/**
	 * 매핑정보12
	 */
	@ApiModelProperty(
		name = "map12"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map12")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보12", align="left", fill="")
	private String map12= "";
	
	
	/**
	 * 매핑정보13
	 */
	@ApiModelProperty(
		name = "map13"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map13")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보13", align="left", fill="")
	private String map13= "";
	
	
	/**
	 * 매핑정보14
	 */
	@ApiModelProperty(
		name = "map14"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map14")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보14", align="left", fill="")
	private String map14= "";
	
	
	/**
	 * 매핑정보15
	 */
	@ApiModelProperty(
		name = "map15"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map15")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보15", align="left", fill="")
	private String map15= "";
	
	
	/**
	 * 매핑정보16
	 */
	@ApiModelProperty(
		name = "map16"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map16")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보16", align="left", fill="")
	private String map16= "";
	
	
	/**
	 * 매핑정보17
	 */
	@ApiModelProperty(
		name = "map17"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map17")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보17", align="left", fill="")
	private String map17= "";
	
	
	/**
	 * 매핑정보18
	 */
	@ApiModelProperty(
		name = "map18"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map18")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보18", align="left", fill="")
	private String map18= "";
	
	
	/**
	 * 매핑정보19
	 */
	@ApiModelProperty(
		name = "map19"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map19")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보19", align="left", fill="")
	private String map19= "";
	
	
	/**
	 * 매핑정보20
	 */
	@ApiModelProperty(
		name = "map20"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("map20")
	@BxmOmm_Field(length=1000, decimal=0, description="매핑정보20", align="left", fill="")
	private String map20= "";
	
	
	/**
	 * 이미지파일경로
	 */
	@ApiModelProperty(
		name = "imgFilePathNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgFilePathNm")
	@BxmOmm_Field(length=200, decimal=0, description="이미지파일경로", align="left", fill="")
	private String imgFilePathNm= "";
	
	
	/**
	 * 카카오버튼내용
	 */
	@ApiModelProperty(
		name = "kkoSendBtns"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("kkoSendBtns")
	@BxmOmm_Field(length=5000, decimal=0, description="카카오버튼내용", align="left", fill="")
	private String kkoSendBtns= "";
	
	
	/**
	 * 즐겨찾기여부
	 */
	@ApiModelProperty(
		name = "isFav"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("isFav")
	@BxmOmm_Field(length=1, decimal=0, description="즐겨찾기여부", align="left", fill="")
	private String isFav= "";
	
	
	/**
	 * 등록일
	 */
	@ApiModelProperty(
		name = "regDate"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("regDate")
	@BxmOmm_Field(length=14, decimal=0, description="등록일", align="left", fill="")
	private String regDate= "";
	
	
	/**
	 * 만기일
	 */
	@ApiModelProperty(
		name = "expireDate"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("expireDate")
	@BxmOmm_Field(length=14, decimal=0, description="만기일", align="left", fill="")
	private String expireDate= "";
	
	
	/**
	 * 갱신일
	 */
	@ApiModelProperty(
		name = "uptDate"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("uptDate")
	@BxmOmm_Field(length=14, decimal=0, description="갱신일", align="left", fill="")
	private String uptDate= "";
	
	
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
	 * 메시지그룹코드
	 */
	@ApiModelProperty(
		name = "msgGrpCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgGrpCd")
	@BxmOmm_Field(length=50, decimal=0, description="메시지그룹코드", align="left", fill="")
	private String msgGrpCd= "";
	
	
	/**
	 * 메시지그룹명
	 */
	@ApiModelProperty(
		name = "msgGrpNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgGrpNm")
	@BxmOmm_Field(length=200, decimal=0, description="메시지그룹명", align="left", fill="")
	private String msgGrpNm= "";
	
	
	/**
	 * 아이콘명
	 */
	@ApiModelProperty(
		name = "iconName"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconName")
	@BxmOmm_Field(length=50, decimal=0, description="아이콘명", align="left", fill="")
	private String iconName= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgType= false;
	protected final boolean isSet_msgType(){
		return this.isSet_msgType;
	}
	private void setIsSet_msgType(boolean value){
		this.isSet_msgType= value;
	}
	/**
	 * 메시지타입
	 */
	@XmlTransient
	public String getMsgType(){
		return this.msgType;
	}
	
	/**
	 * 메시지타입
	 * 
	 * @param msgType 메시지타입
	 */
	public void setMsgType(String msgType){
		this.msgType= msgType;
		this.setIsSet_msgType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mapType= false;
	protected final boolean isSet_mapType(){
		return this.isSet_mapType;
	}
	private void setIsSet_mapType(boolean value){
		this.isSet_mapType= value;
	}
	/**
	 * 매핑타입
	 */
	@XmlTransient
	public String getMapType(){
		return this.mapType;
	}
	
	/**
	 * 매핑타입
	 * 
	 * @param mapType 매핑타입
	 */
	public void setMapType(String mapType){
		this.mapType= mapType;
		this.setIsSet_mapType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_kkoMsg= false;
	protected final boolean isSet_kkoMsg(){
		return this.isSet_kkoMsg;
	}
	private void setIsSet_kkoMsg(boolean value){
		this.isSet_kkoMsg= value;
	}
	/**
	 * 사서함메시지
	 */
	@XmlTransient
	public String getKkoMsg(){
		return this.kkoMsg;
	}
	
	/**
	 * 사서함메시지
	 * 
	 * @param kkoMsg 사서함메시지
	 */
	public void setKkoMsg(String kkoMsg){
		this.kkoMsg= kkoMsg;
		this.setIsSet_kkoMsg(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_checkYn= false;
	protected final boolean isSet_checkYn(){
		return this.isSet_checkYn;
	}
	private void setIsSet_checkYn(boolean value){
		this.isSet_checkYn= value;
	}
	/**
	 * 읽음여부
	 */
	@XmlTransient
	public String getCheckYn(){
		return this.checkYn;
	}
	
	/**
	 * 읽음여부
	 * 
	 * @param checkYn 읽음여부
	 */
	public void setCheckYn(String checkYn){
		this.checkYn= checkYn;
		this.setIsSet_checkYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_name= false;
	protected final boolean isSet_name(){
		return this.isSet_name;
	}
	private void setIsSet_name(boolean value){
		this.isSet_name= value;
	}
	/**
	 * 고객명
	 */
	@XmlTransient
	public String getName(){
		return this.name;
	}
	
	/**
	 * 고객명
	 * 
	 * @param name 고객명
	 */
	public void setName(String name){
		this.name= name;
		this.setIsSet_name(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_moneyBalance= false;
	protected final boolean isSet_moneyBalance(){
		return this.isSet_moneyBalance;
	}
	private void setIsSet_moneyBalance(boolean value){
		this.isSet_moneyBalance= value;
	}
	/**
	 * 잔액
	 */
	@XmlTransient
	public String getMoneyBalance(){
		return this.moneyBalance;
	}
	
	/**
	 * 잔액
	 * 
	 * @param moneyBalance 잔액
	 */
	public void setMoneyBalance(String moneyBalance){
		this.moneyBalance= moneyBalance;
		this.setIsSet_moneyBalance(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_typeDeal= false;
	protected final boolean isSet_typeDeal(){
		return this.isSet_typeDeal;
	}
	private void setIsSet_typeDeal(boolean value){
		this.isSet_typeDeal= value;
	}
	/**
	 * 업무유형
	 */
	@XmlTransient
	public String getTypeDeal(){
		return this.typeDeal;
	}
	
	/**
	 * 업무유형
	 * 
	 * @param typeDeal 업무유형
	 */
	public void setTypeDeal(String typeDeal){
		this.typeDeal= typeDeal;
		this.setIsSet_typeDeal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_account= false;
	protected final boolean isSet_account(){
		return this.isSet_account;
	}
	private void setIsSet_account(boolean value){
		this.isSet_account= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAccount(){
		return this.account;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param account 계좌번호
	 */
	public void setAccount(String account){
		this.account= account;
		this.setIsSet_account(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_moneyDeal= false;
	protected final boolean isSet_moneyDeal(){
		return this.isSet_moneyDeal;
	}
	private void setIsSet_moneyDeal(boolean value){
		this.isSet_moneyDeal= value;
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public String getMoneyDeal(){
		return this.moneyDeal;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param moneyDeal 거래금액
	 */
	public void setMoneyDeal(String moneyDeal){
		this.moneyDeal= moneyDeal;
		this.setIsSet_moneyDeal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_serialNum= false;
	protected final boolean isSet_serialNum(){
		return this.isSet_serialNum;
	}
	private void setIsSet_serialNum(boolean value){
		this.isSet_serialNum= value;
	}
	/**
	 * 인증번호
	 */
	@XmlTransient
	public String getSerialNum(){
		return this.serialNum;
	}
	
	/**
	 * 인증번호
	 * 
	 * @param serialNum 인증번호
	 */
	public void setSerialNum(String serialNum){
		this.serialNum= serialNum;
		this.setIsSet_serialNum(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map1= false;
	protected final boolean isSet_map1(){
		return this.isSet_map1;
	}
	private void setIsSet_map1(boolean value){
		this.isSet_map1= value;
	}
	/**
	 * 매핑정보1
	 */
	@XmlTransient
	public String getMap1(){
		return this.map1;
	}
	
	/**
	 * 매핑정보1
	 * 
	 * @param map1 매핑정보1
	 */
	public void setMap1(String map1){
		this.map1= map1;
		this.setIsSet_map1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map2= false;
	protected final boolean isSet_map2(){
		return this.isSet_map2;
	}
	private void setIsSet_map2(boolean value){
		this.isSet_map2= value;
	}
	/**
	 * 매핑정보2
	 */
	@XmlTransient
	public String getMap2(){
		return this.map2;
	}
	
	/**
	 * 매핑정보2
	 * 
	 * @param map2 매핑정보2
	 */
	public void setMap2(String map2){
		this.map2= map2;
		this.setIsSet_map2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map3= false;
	protected final boolean isSet_map3(){
		return this.isSet_map3;
	}
	private void setIsSet_map3(boolean value){
		this.isSet_map3= value;
	}
	/**
	 * 매핑정보3
	 */
	@XmlTransient
	public String getMap3(){
		return this.map3;
	}
	
	/**
	 * 매핑정보3
	 * 
	 * @param map3 매핑정보3
	 */
	public void setMap3(String map3){
		this.map3= map3;
		this.setIsSet_map3(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map4= false;
	protected final boolean isSet_map4(){
		return this.isSet_map4;
	}
	private void setIsSet_map4(boolean value){
		this.isSet_map4= value;
	}
	/**
	 * 매핑정보4
	 */
	@XmlTransient
	public String getMap4(){
		return this.map4;
	}
	
	/**
	 * 매핑정보4
	 * 
	 * @param map4 매핑정보4
	 */
	public void setMap4(String map4){
		this.map4= map4;
		this.setIsSet_map4(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map5= false;
	protected final boolean isSet_map5(){
		return this.isSet_map5;
	}
	private void setIsSet_map5(boolean value){
		this.isSet_map5= value;
	}
	/**
	 * 매핑정보5
	 */
	@XmlTransient
	public String getMap5(){
		return this.map5;
	}
	
	/**
	 * 매핑정보5
	 * 
	 * @param map5 매핑정보5
	 */
	public void setMap5(String map5){
		this.map5= map5;
		this.setIsSet_map5(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map6= false;
	protected final boolean isSet_map6(){
		return this.isSet_map6;
	}
	private void setIsSet_map6(boolean value){
		this.isSet_map6= value;
	}
	/**
	 * 매핑정보6
	 */
	@XmlTransient
	public String getMap6(){
		return this.map6;
	}
	
	/**
	 * 매핑정보6
	 * 
	 * @param map6 매핑정보6
	 */
	public void setMap6(String map6){
		this.map6= map6;
		this.setIsSet_map6(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map7= false;
	protected final boolean isSet_map7(){
		return this.isSet_map7;
	}
	private void setIsSet_map7(boolean value){
		this.isSet_map7= value;
	}
	/**
	 * 매핑정보7
	 */
	@XmlTransient
	public String getMap7(){
		return this.map7;
	}
	
	/**
	 * 매핑정보7
	 * 
	 * @param map7 매핑정보7
	 */
	public void setMap7(String map7){
		this.map7= map7;
		this.setIsSet_map7(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map8= false;
	protected final boolean isSet_map8(){
		return this.isSet_map8;
	}
	private void setIsSet_map8(boolean value){
		this.isSet_map8= value;
	}
	/**
	 * 매핑정보8
	 */
	@XmlTransient
	public String getMap8(){
		return this.map8;
	}
	
	/**
	 * 매핑정보8
	 * 
	 * @param map8 매핑정보8
	 */
	public void setMap8(String map8){
		this.map8= map8;
		this.setIsSet_map8(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map9= false;
	protected final boolean isSet_map9(){
		return this.isSet_map9;
	}
	private void setIsSet_map9(boolean value){
		this.isSet_map9= value;
	}
	/**
	 * 매핑정보9
	 */
	@XmlTransient
	public String getMap9(){
		return this.map9;
	}
	
	/**
	 * 매핑정보9
	 * 
	 * @param map9 매핑정보9
	 */
	public void setMap9(String map9){
		this.map9= map9;
		this.setIsSet_map9(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map10= false;
	protected final boolean isSet_map10(){
		return this.isSet_map10;
	}
	private void setIsSet_map10(boolean value){
		this.isSet_map10= value;
	}
	/**
	 * 매핑정보10
	 */
	@XmlTransient
	public String getMap10(){
		return this.map10;
	}
	
	/**
	 * 매핑정보10
	 * 
	 * @param map10 매핑정보10
	 */
	public void setMap10(String map10){
		this.map10= map10;
		this.setIsSet_map10(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map11= false;
	protected final boolean isSet_map11(){
		return this.isSet_map11;
	}
	private void setIsSet_map11(boolean value){
		this.isSet_map11= value;
	}
	/**
	 * 매핑정보11
	 */
	@XmlTransient
	public String getMap11(){
		return this.map11;
	}
	
	/**
	 * 매핑정보11
	 * 
	 * @param map11 매핑정보11
	 */
	public void setMap11(String map11){
		this.map11= map11;
		this.setIsSet_map11(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map12= false;
	protected final boolean isSet_map12(){
		return this.isSet_map12;
	}
	private void setIsSet_map12(boolean value){
		this.isSet_map12= value;
	}
	/**
	 * 매핑정보12
	 */
	@XmlTransient
	public String getMap12(){
		return this.map12;
	}
	
	/**
	 * 매핑정보12
	 * 
	 * @param map12 매핑정보12
	 */
	public void setMap12(String map12){
		this.map12= map12;
		this.setIsSet_map12(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map13= false;
	protected final boolean isSet_map13(){
		return this.isSet_map13;
	}
	private void setIsSet_map13(boolean value){
		this.isSet_map13= value;
	}
	/**
	 * 매핑정보13
	 */
	@XmlTransient
	public String getMap13(){
		return this.map13;
	}
	
	/**
	 * 매핑정보13
	 * 
	 * @param map13 매핑정보13
	 */
	public void setMap13(String map13){
		this.map13= map13;
		this.setIsSet_map13(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map14= false;
	protected final boolean isSet_map14(){
		return this.isSet_map14;
	}
	private void setIsSet_map14(boolean value){
		this.isSet_map14= value;
	}
	/**
	 * 매핑정보14
	 */
	@XmlTransient
	public String getMap14(){
		return this.map14;
	}
	
	/**
	 * 매핑정보14
	 * 
	 * @param map14 매핑정보14
	 */
	public void setMap14(String map14){
		this.map14= map14;
		this.setIsSet_map14(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map15= false;
	protected final boolean isSet_map15(){
		return this.isSet_map15;
	}
	private void setIsSet_map15(boolean value){
		this.isSet_map15= value;
	}
	/**
	 * 매핑정보15
	 */
	@XmlTransient
	public String getMap15(){
		return this.map15;
	}
	
	/**
	 * 매핑정보15
	 * 
	 * @param map15 매핑정보15
	 */
	public void setMap15(String map15){
		this.map15= map15;
		this.setIsSet_map15(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map16= false;
	protected final boolean isSet_map16(){
		return this.isSet_map16;
	}
	private void setIsSet_map16(boolean value){
		this.isSet_map16= value;
	}
	/**
	 * 매핑정보16
	 */
	@XmlTransient
	public String getMap16(){
		return this.map16;
	}
	
	/**
	 * 매핑정보16
	 * 
	 * @param map16 매핑정보16
	 */
	public void setMap16(String map16){
		this.map16= map16;
		this.setIsSet_map16(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map17= false;
	protected final boolean isSet_map17(){
		return this.isSet_map17;
	}
	private void setIsSet_map17(boolean value){
		this.isSet_map17= value;
	}
	/**
	 * 매핑정보17
	 */
	@XmlTransient
	public String getMap17(){
		return this.map17;
	}
	
	/**
	 * 매핑정보17
	 * 
	 * @param map17 매핑정보17
	 */
	public void setMap17(String map17){
		this.map17= map17;
		this.setIsSet_map17(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map18= false;
	protected final boolean isSet_map18(){
		return this.isSet_map18;
	}
	private void setIsSet_map18(boolean value){
		this.isSet_map18= value;
	}
	/**
	 * 매핑정보18
	 */
	@XmlTransient
	public String getMap18(){
		return this.map18;
	}
	
	/**
	 * 매핑정보18
	 * 
	 * @param map18 매핑정보18
	 */
	public void setMap18(String map18){
		this.map18= map18;
		this.setIsSet_map18(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map19= false;
	protected final boolean isSet_map19(){
		return this.isSet_map19;
	}
	private void setIsSet_map19(boolean value){
		this.isSet_map19= value;
	}
	/**
	 * 매핑정보19
	 */
	@XmlTransient
	public String getMap19(){
		return this.map19;
	}
	
	/**
	 * 매핑정보19
	 * 
	 * @param map19 매핑정보19
	 */
	public void setMap19(String map19){
		this.map19= map19;
		this.setIsSet_map19(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_map20= false;
	protected final boolean isSet_map20(){
		return this.isSet_map20;
	}
	private void setIsSet_map20(boolean value){
		this.isSet_map20= value;
	}
	/**
	 * 매핑정보20
	 */
	@XmlTransient
	public String getMap20(){
		return this.map20;
	}
	
	/**
	 * 매핑정보20
	 * 
	 * @param map20 매핑정보20
	 */
	public void setMap20(String map20){
		this.map20= map20;
		this.setIsSet_map20(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgFilePathNm= false;
	protected final boolean isSet_imgFilePathNm(){
		return this.isSet_imgFilePathNm;
	}
	private void setIsSet_imgFilePathNm(boolean value){
		this.isSet_imgFilePathNm= value;
	}
	/**
	 * 이미지파일경로
	 */
	@XmlTransient
	public String getImgFilePathNm(){
		return this.imgFilePathNm;
	}
	
	/**
	 * 이미지파일경로
	 * 
	 * @param imgFilePathNm 이미지파일경로
	 */
	public void setImgFilePathNm(String imgFilePathNm){
		this.imgFilePathNm= imgFilePathNm;
		this.setIsSet_imgFilePathNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_kkoSendBtns= false;
	protected final boolean isSet_kkoSendBtns(){
		return this.isSet_kkoSendBtns;
	}
	private void setIsSet_kkoSendBtns(boolean value){
		this.isSet_kkoSendBtns= value;
	}
	/**
	 * 카카오버튼내용
	 */
	@XmlTransient
	public String getKkoSendBtns(){
		return this.kkoSendBtns;
	}
	
	/**
	 * 카카오버튼내용
	 * 
	 * @param kkoSendBtns 카카오버튼내용
	 */
	public void setKkoSendBtns(String kkoSendBtns){
		this.kkoSendBtns= kkoSendBtns;
		this.setIsSet_kkoSendBtns(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isFav= false;
	protected final boolean isSet_isFav(){
		return this.isSet_isFav;
	}
	private void setIsSet_isFav(boolean value){
		this.isSet_isFav= value;
	}
	/**
	 * 즐겨찾기여부
	 */
	@XmlTransient
	public String getIsFav(){
		return this.isFav;
	}
	
	/**
	 * 즐겨찾기여부
	 * 
	 * @param isFav 즐겨찾기여부
	 */
	public void setIsFav(String isFav){
		this.isFav= isFav;
		this.setIsSet_isFav(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_regDate= false;
	protected final boolean isSet_regDate(){
		return this.isSet_regDate;
	}
	private void setIsSet_regDate(boolean value){
		this.isSet_regDate= value;
	}
	/**
	 * 등록일
	 */
	@XmlTransient
	public String getRegDate(){
		return this.regDate;
	}
	
	/**
	 * 등록일
	 * 
	 * @param regDate 등록일
	 */
	public void setRegDate(String regDate){
		this.regDate= regDate;
		this.setIsSet_regDate(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_expireDate= false;
	protected final boolean isSet_expireDate(){
		return this.isSet_expireDate;
	}
	private void setIsSet_expireDate(boolean value){
		this.isSet_expireDate= value;
	}
	/**
	 * 만기일
	 */
	@XmlTransient
	public String getExpireDate(){
		return this.expireDate;
	}
	
	/**
	 * 만기일
	 * 
	 * @param expireDate 만기일
	 */
	public void setExpireDate(String expireDate){
		this.expireDate= expireDate;
		this.setIsSet_expireDate(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_uptDate= false;
	protected final boolean isSet_uptDate(){
		return this.isSet_uptDate;
	}
	private void setIsSet_uptDate(boolean value){
		this.isSet_uptDate= value;
	}
	/**
	 * 갱신일
	 */
	@XmlTransient
	public String getUptDate(){
		return this.uptDate;
	}
	
	/**
	 * 갱신일
	 * 
	 * @param uptDate 갱신일
	 */
	public void setUptDate(String uptDate){
		this.uptDate= uptDate;
		this.setIsSet_uptDate(true);
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
	private boolean isSet_msgGrpCd= false;
	protected final boolean isSet_msgGrpCd(){
		return this.isSet_msgGrpCd;
	}
	private void setIsSet_msgGrpCd(boolean value){
		this.isSet_msgGrpCd= value;
	}
	/**
	 * 메시지그룹코드
	 */
	@XmlTransient
	public String getMsgGrpCd(){
		return this.msgGrpCd;
	}
	
	/**
	 * 메시지그룹코드
	 * 
	 * @param msgGrpCd 메시지그룹코드
	 */
	public void setMsgGrpCd(String msgGrpCd){
		this.msgGrpCd= msgGrpCd;
		this.setIsSet_msgGrpCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgGrpNm= false;
	protected final boolean isSet_msgGrpNm(){
		return this.isSet_msgGrpNm;
	}
	private void setIsSet_msgGrpNm(boolean value){
		this.isSet_msgGrpNm= value;
	}
	/**
	 * 메시지그룹명
	 */
	@XmlTransient
	public String getMsgGrpNm(){
		return this.msgGrpNm;
	}
	
	/**
	 * 메시지그룹명
	 * 
	 * @param msgGrpNm 메시지그룹명
	 */
	public void setMsgGrpNm(String msgGrpNm){
		this.msgGrpNm= msgGrpNm;
		this.setIsSet_msgGrpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iconName= false;
	protected final boolean isSet_iconName(){
		return this.isSet_iconName;
	}
	private void setIsSet_iconName(boolean value){
		this.isSet_iconName= value;
	}
	/**
	 * 아이콘명
	 */
	@XmlTransient
	public String getIconName(){
		return this.iconName;
	}
	
	/**
	 * 아이콘명
	 * 
	 * @param iconName 아이콘명
	 */
	public void setIconName(String iconName){
		this.iconName= iconName;
		this.setIsSet_iconName(true);
	}
				
	@Override
	public INBKataNtfcRspGrid_DTO clone(){
		try{
			INBKataNtfcRspGrid_DTO object= (INBKataNtfcRspGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.msgType==null)?0:this.msgType.hashCode());
		result= prime * result + ((this.mapType==null)?0:this.mapType.hashCode());
		result= prime * result + ((this.kkoMsg==null)?0:this.kkoMsg.hashCode());
		result= prime * result + ((this.checkYn==null)?0:this.checkYn.hashCode());
		result= prime * result + ((this.name==null)?0:this.name.hashCode());
		result= prime * result + ((this.moneyBalance==null)?0:this.moneyBalance.hashCode());
		result= prime * result + ((this.typeDeal==null)?0:this.typeDeal.hashCode());
		result= prime * result + ((this.account==null)?0:this.account.hashCode());
		result= prime * result + ((this.moneyDeal==null)?0:this.moneyDeal.hashCode());
		result= prime * result + ((this.serialNum==null)?0:this.serialNum.hashCode());
		result= prime * result + ((this.map1==null)?0:this.map1.hashCode());
		result= prime * result + ((this.map2==null)?0:this.map2.hashCode());
		result= prime * result + ((this.map3==null)?0:this.map3.hashCode());
		result= prime * result + ((this.map4==null)?0:this.map4.hashCode());
		result= prime * result + ((this.map5==null)?0:this.map5.hashCode());
		result= prime * result + ((this.map6==null)?0:this.map6.hashCode());
		result= prime * result + ((this.map7==null)?0:this.map7.hashCode());
		result= prime * result + ((this.map8==null)?0:this.map8.hashCode());
		result= prime * result + ((this.map9==null)?0:this.map9.hashCode());
		result= prime * result + ((this.map10==null)?0:this.map10.hashCode());
		result= prime * result + ((this.map11==null)?0:this.map11.hashCode());
		result= prime * result + ((this.map12==null)?0:this.map12.hashCode());
		result= prime * result + ((this.map13==null)?0:this.map13.hashCode());
		result= prime * result + ((this.map14==null)?0:this.map14.hashCode());
		result= prime * result + ((this.map15==null)?0:this.map15.hashCode());
		result= prime * result + ((this.map16==null)?0:this.map16.hashCode());
		result= prime * result + ((this.map17==null)?0:this.map17.hashCode());
		result= prime * result + ((this.map18==null)?0:this.map18.hashCode());
		result= prime * result + ((this.map19==null)?0:this.map19.hashCode());
		result= prime * result + ((this.map20==null)?0:this.map20.hashCode());
		result= prime * result + ((this.imgFilePathNm==null)?0:this.imgFilePathNm.hashCode());
		result= prime * result + ((this.kkoSendBtns==null)?0:this.kkoSendBtns.hashCode());
		result= prime * result + ((this.isFav==null)?0:this.isFav.hashCode());
		result= prime * result + ((this.regDate==null)?0:this.regDate.hashCode());
		result= prime * result + ((this.expireDate==null)?0:this.expireDate.hashCode());
		result= prime * result + ((this.uptDate==null)?0:this.uptDate.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		result= prime * result + ((this.msgGrpCd==null)?0:this.msgGrpCd.hashCode());
		result= prime * result + ((this.msgGrpNm==null)?0:this.msgGrpNm.hashCode());
		result= prime * result + ((this.iconName==null)?0:this.iconName.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBKataNtfcRspGrid_DTO other= (INBKataNtfcRspGrid_DTO)obj;
		{
			Object _msgType= getMsgType();
			Object __msgType= other.getMsgType();
			if ( _msgType== null ) { if ( __msgType!= null ) return false; }
			else if ( !_msgType.equals(__msgType) ) return false;
		}
		{
			Object _mapType= getMapType();
			Object __mapType= other.getMapType();
			if ( _mapType== null ) { if ( __mapType!= null ) return false; }
			else if ( !_mapType.equals(__mapType) ) return false;
		}
		{
			Object _kkoMsg= getKkoMsg();
			Object __kkoMsg= other.getKkoMsg();
			if ( _kkoMsg== null ) { if ( __kkoMsg!= null ) return false; }
			else if ( !_kkoMsg.equals(__kkoMsg) ) return false;
		}
		{
			Object _checkYn= getCheckYn();
			Object __checkYn= other.getCheckYn();
			if ( _checkYn== null ) { if ( __checkYn!= null ) return false; }
			else if ( !_checkYn.equals(__checkYn) ) return false;
		}
		{
			Object _name= getName();
			Object __name= other.getName();
			if ( _name== null ) { if ( __name!= null ) return false; }
			else if ( !_name.equals(__name) ) return false;
		}
		{
			Object _moneyBalance= getMoneyBalance();
			Object __moneyBalance= other.getMoneyBalance();
			if ( _moneyBalance== null ) { if ( __moneyBalance!= null ) return false; }
			else if ( !_moneyBalance.equals(__moneyBalance) ) return false;
		}
		{
			Object _typeDeal= getTypeDeal();
			Object __typeDeal= other.getTypeDeal();
			if ( _typeDeal== null ) { if ( __typeDeal!= null ) return false; }
			else if ( !_typeDeal.equals(__typeDeal) ) return false;
		}
		{
			Object _account= getAccount();
			Object __account= other.getAccount();
			if ( _account== null ) { if ( __account!= null ) return false; }
			else if ( !_account.equals(__account) ) return false;
		}
		{
			Object _moneyDeal= getMoneyDeal();
			Object __moneyDeal= other.getMoneyDeal();
			if ( _moneyDeal== null ) { if ( __moneyDeal!= null ) return false; }
			else if ( !_moneyDeal.equals(__moneyDeal) ) return false;
		}
		{
			Object _serialNum= getSerialNum();
			Object __serialNum= other.getSerialNum();
			if ( _serialNum== null ) { if ( __serialNum!= null ) return false; }
			else if ( !_serialNum.equals(__serialNum) ) return false;
		}
		{
			Object _map1= getMap1();
			Object __map1= other.getMap1();
			if ( _map1== null ) { if ( __map1!= null ) return false; }
			else if ( !_map1.equals(__map1) ) return false;
		}
		{
			Object _map2= getMap2();
			Object __map2= other.getMap2();
			if ( _map2== null ) { if ( __map2!= null ) return false; }
			else if ( !_map2.equals(__map2) ) return false;
		}
		{
			Object _map3= getMap3();
			Object __map3= other.getMap3();
			if ( _map3== null ) { if ( __map3!= null ) return false; }
			else if ( !_map3.equals(__map3) ) return false;
		}
		{
			Object _map4= getMap4();
			Object __map4= other.getMap4();
			if ( _map4== null ) { if ( __map4!= null ) return false; }
			else if ( !_map4.equals(__map4) ) return false;
		}
		{
			Object _map5= getMap5();
			Object __map5= other.getMap5();
			if ( _map5== null ) { if ( __map5!= null ) return false; }
			else if ( !_map5.equals(__map5) ) return false;
		}
		{
			Object _map6= getMap6();
			Object __map6= other.getMap6();
			if ( _map6== null ) { if ( __map6!= null ) return false; }
			else if ( !_map6.equals(__map6) ) return false;
		}
		{
			Object _map7= getMap7();
			Object __map7= other.getMap7();
			if ( _map7== null ) { if ( __map7!= null ) return false; }
			else if ( !_map7.equals(__map7) ) return false;
		}
		{
			Object _map8= getMap8();
			Object __map8= other.getMap8();
			if ( _map8== null ) { if ( __map8!= null ) return false; }
			else if ( !_map8.equals(__map8) ) return false;
		}
		{
			Object _map9= getMap9();
			Object __map9= other.getMap9();
			if ( _map9== null ) { if ( __map9!= null ) return false; }
			else if ( !_map9.equals(__map9) ) return false;
		}
		{
			Object _map10= getMap10();
			Object __map10= other.getMap10();
			if ( _map10== null ) { if ( __map10!= null ) return false; }
			else if ( !_map10.equals(__map10) ) return false;
		}
		{
			Object _map11= getMap11();
			Object __map11= other.getMap11();
			if ( _map11== null ) { if ( __map11!= null ) return false; }
			else if ( !_map11.equals(__map11) ) return false;
		}
		{
			Object _map12= getMap12();
			Object __map12= other.getMap12();
			if ( _map12== null ) { if ( __map12!= null ) return false; }
			else if ( !_map12.equals(__map12) ) return false;
		}
		{
			Object _map13= getMap13();
			Object __map13= other.getMap13();
			if ( _map13== null ) { if ( __map13!= null ) return false; }
			else if ( !_map13.equals(__map13) ) return false;
		}
		{
			Object _map14= getMap14();
			Object __map14= other.getMap14();
			if ( _map14== null ) { if ( __map14!= null ) return false; }
			else if ( !_map14.equals(__map14) ) return false;
		}
		{
			Object _map15= getMap15();
			Object __map15= other.getMap15();
			if ( _map15== null ) { if ( __map15!= null ) return false; }
			else if ( !_map15.equals(__map15) ) return false;
		}
		{
			Object _map16= getMap16();
			Object __map16= other.getMap16();
			if ( _map16== null ) { if ( __map16!= null ) return false; }
			else if ( !_map16.equals(__map16) ) return false;
		}
		{
			Object _map17= getMap17();
			Object __map17= other.getMap17();
			if ( _map17== null ) { if ( __map17!= null ) return false; }
			else if ( !_map17.equals(__map17) ) return false;
		}
		{
			Object _map18= getMap18();
			Object __map18= other.getMap18();
			if ( _map18== null ) { if ( __map18!= null ) return false; }
			else if ( !_map18.equals(__map18) ) return false;
		}
		{
			Object _map19= getMap19();
			Object __map19= other.getMap19();
			if ( _map19== null ) { if ( __map19!= null ) return false; }
			else if ( !_map19.equals(__map19) ) return false;
		}
		{
			Object _map20= getMap20();
			Object __map20= other.getMap20();
			if ( _map20== null ) { if ( __map20!= null ) return false; }
			else if ( !_map20.equals(__map20) ) return false;
		}
		{
			Object _imgFilePathNm= getImgFilePathNm();
			Object __imgFilePathNm= other.getImgFilePathNm();
			if ( _imgFilePathNm== null ) { if ( __imgFilePathNm!= null ) return false; }
			else if ( !_imgFilePathNm.equals(__imgFilePathNm) ) return false;
		}
		{
			Object _kkoSendBtns= getKkoSendBtns();
			Object __kkoSendBtns= other.getKkoSendBtns();
			if ( _kkoSendBtns== null ) { if ( __kkoSendBtns!= null ) return false; }
			else if ( !_kkoSendBtns.equals(__kkoSendBtns) ) return false;
		}
		{
			Object _isFav= getIsFav();
			Object __isFav= other.getIsFav();
			if ( _isFav== null ) { if ( __isFav!= null ) return false; }
			else if ( !_isFav.equals(__isFav) ) return false;
		}
		{
			Object _regDate= getRegDate();
			Object __regDate= other.getRegDate();
			if ( _regDate== null ) { if ( __regDate!= null ) return false; }
			else if ( !_regDate.equals(__regDate) ) return false;
		}
		{
			Object _expireDate= getExpireDate();
			Object __expireDate= other.getExpireDate();
			if ( _expireDate== null ) { if ( __expireDate!= null ) return false; }
			else if ( !_expireDate.equals(__expireDate) ) return false;
		}
		{
			Object _uptDate= getUptDate();
			Object __uptDate= other.getUptDate();
			if ( _uptDate== null ) { if ( __uptDate!= null ) return false; }
			else if ( !_uptDate.equals(__uptDate) ) return false;
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
			Object _msgGrpCd= getMsgGrpCd();
			Object __msgGrpCd= other.getMsgGrpCd();
			if ( _msgGrpCd== null ) { if ( __msgGrpCd!= null ) return false; }
			else if ( !_msgGrpCd.equals(__msgGrpCd) ) return false;
		}
		{
			Object _msgGrpNm= getMsgGrpNm();
			Object __msgGrpNm= other.getMsgGrpNm();
			if ( _msgGrpNm== null ) { if ( __msgGrpNm!= null ) return false; }
			else if ( !_msgGrpNm.equals(__msgGrpNm) ) return false;
		}
		{
			Object _iconName= getIconName();
			Object __iconName= other.getIconName();
			if ( _iconName== null ) { if ( __iconName!= null ) return false; }
			else if ( !_iconName.equals(__iconName) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBKataNtfcRspGrid_DTO.class.getName()).append(":\n");
		sb.append("\tmsgType: ");
		sb.append(msgType==null?"null":getMsgType());
		sb.append("\n");
		sb.append("\tmapType: ");
		sb.append(mapType==null?"null":getMapType());
		sb.append("\n");
		sb.append("\tkkoMsg: ");
		sb.append(kkoMsg==null?"null":getKkoMsg());
		sb.append("\n");
		sb.append("\tcheckYn: ");
		sb.append(checkYn==null?"null":getCheckYn());
		sb.append("\n");
		sb.append("\tname: ");
		sb.append(name==null?"null":getName());
		sb.append("\n");
		sb.append("\tmoneyBalance: ");
		sb.append(moneyBalance==null?"null":getMoneyBalance());
		sb.append("\n");
		sb.append("\ttypeDeal: ");
		sb.append(typeDeal==null?"null":getTypeDeal());
		sb.append("\n");
		sb.append("\taccount: ");
		sb.append(account==null?"null":getAccount());
		sb.append("\n");
		sb.append("\tmoneyDeal: ");
		sb.append(moneyDeal==null?"null":getMoneyDeal());
		sb.append("\n");
		sb.append("\tserialNum: ");
		sb.append(serialNum==null?"null":getSerialNum());
		sb.append("\n");
		sb.append("\tmap1: ");
		sb.append(map1==null?"null":getMap1());
		sb.append("\n");
		sb.append("\tmap2: ");
		sb.append(map2==null?"null":getMap2());
		sb.append("\n");
		sb.append("\tmap3: ");
		sb.append(map3==null?"null":getMap3());
		sb.append("\n");
		sb.append("\tmap4: ");
		sb.append(map4==null?"null":getMap4());
		sb.append("\n");
		sb.append("\tmap5: ");
		sb.append(map5==null?"null":getMap5());
		sb.append("\n");
		sb.append("\tmap6: ");
		sb.append(map6==null?"null":getMap6());
		sb.append("\n");
		sb.append("\tmap7: ");
		sb.append(map7==null?"null":getMap7());
		sb.append("\n");
		sb.append("\tmap8: ");
		sb.append(map8==null?"null":getMap8());
		sb.append("\n");
		sb.append("\tmap9: ");
		sb.append(map9==null?"null":getMap9());
		sb.append("\n");
		sb.append("\tmap10: ");
		sb.append(map10==null?"null":getMap10());
		sb.append("\n");
		sb.append("\tmap11: ");
		sb.append(map11==null?"null":getMap11());
		sb.append("\n");
		sb.append("\tmap12: ");
		sb.append(map12==null?"null":getMap12());
		sb.append("\n");
		sb.append("\tmap13: ");
		sb.append(map13==null?"null":getMap13());
		sb.append("\n");
		sb.append("\tmap14: ");
		sb.append(map14==null?"null":getMap14());
		sb.append("\n");
		sb.append("\tmap15: ");
		sb.append(map15==null?"null":getMap15());
		sb.append("\n");
		sb.append("\tmap16: ");
		sb.append(map16==null?"null":getMap16());
		sb.append("\n");
		sb.append("\tmap17: ");
		sb.append(map17==null?"null":getMap17());
		sb.append("\n");
		sb.append("\tmap18: ");
		sb.append(map18==null?"null":getMap18());
		sb.append("\n");
		sb.append("\tmap19: ");
		sb.append(map19==null?"null":getMap19());
		sb.append("\n");
		sb.append("\tmap20: ");
		sb.append(map20==null?"null":getMap20());
		sb.append("\n");
		sb.append("\timgFilePathNm: ");
		sb.append(imgFilePathNm==null?"null":getImgFilePathNm());
		sb.append("\n");
		sb.append("\tkkoSendBtns: ");
		sb.append(kkoSendBtns==null?"null":getKkoSendBtns());
		sb.append("\n");
		sb.append("\tisFav: ");
		sb.append(isFav==null?"null":getIsFav());
		sb.append("\n");
		sb.append("\tregDate: ");
		sb.append(regDate==null?"null":getRegDate());
		sb.append("\n");
		sb.append("\texpireDate: ");
		sb.append(expireDate==null?"null":getExpireDate());
		sb.append("\n");
		sb.append("\tuptDate: ");
		sb.append(uptDate==null?"null":getUptDate());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("\tmsgGrpCd: ");
		sb.append(msgGrpCd==null?"null":getMsgGrpCd());
		sb.append("\n");
		sb.append("\tmsgGrpNm: ");
		sb.append(msgGrpNm==null?"null":getMsgGrpNm());
		sb.append("\n");
		sb.append("\ticonName: ");
		sb.append(iconName==null?"null":getIconName());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* msgType */
		messageLen+= 1; /* mapType */
		messageLen+= 4000; /* kkoMsg */
		messageLen+= 1; /* checkYn */
		messageLen+= 20; /* name */
		messageLen+= 30; /* moneyBalance */
		messageLen+= 30; /* typeDeal */
		messageLen+= 20; /* account */
		messageLen+= 30; /* moneyDeal */
		messageLen+= 64; /* serialNum */
		messageLen+= 1000; /* map1 */
		messageLen+= 1000; /* map2 */
		messageLen+= 1000; /* map3 */
		messageLen+= 1000; /* map4 */
		messageLen+= 1000; /* map5 */
		messageLen+= 1000; /* map6 */
		messageLen+= 1000; /* map7 */
		messageLen+= 1000; /* map8 */
		messageLen+= 1000; /* map9 */
		messageLen+= 1000; /* map10 */
		messageLen+= 1000; /* map11 */
		messageLen+= 1000; /* map12 */
		messageLen+= 1000; /* map13 */
		messageLen+= 1000; /* map14 */
		messageLen+= 1000; /* map15 */
		messageLen+= 1000; /* map16 */
		messageLen+= 1000; /* map17 */
		messageLen+= 1000; /* map18 */
		messageLen+= 1000; /* map19 */
		messageLen+= 1000; /* map20 */
		messageLen+= 200; /* imgFilePathNm */
		messageLen+= 5000; /* kkoSendBtns */
		messageLen+= 1; /* isFav */
		messageLen+= 14; /* regDate */
		messageLen+= 14; /* expireDate */
		messageLen+= 14; /* uptDate */
		messageLen+= 20; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
		messageLen+= 50; /* msgGrpCd */
		messageLen+= 200; /* msgGrpNm */
		messageLen+= 50; /* iconName */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("msgType");
		list.add("mapType");
		list.add("kkoMsg");
		list.add("checkYn");
		list.add("name");
		list.add("moneyBalance");
		list.add("typeDeal");
		list.add("account");
		list.add("moneyDeal");
		list.add("serialNum");
		list.add("map1");
		list.add("map2");
		list.add("map3");
		list.add("map4");
		list.add("map5");
		list.add("map6");
		list.add("map7");
		list.add("map8");
		list.add("map9");
		list.add("map10");
		list.add("map11");
		list.add("map12");
		list.add("map13");
		list.add("map14");
		list.add("map15");
		list.add("map16");
		list.add("map17");
		list.add("map18");
		list.add("map19");
		list.add("map20");
		list.add("imgFilePathNm");
		list.add("kkoSendBtns");
		list.add("isFav");
		list.add("regDate");
		list.add("expireDate");
		list.add("uptDate");
		list.add("umsTrno");
		list.add("umsReqDt");
		list.add("msgGrpCd");
		list.add("msgGrpNm");
		list.add("iconName");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("msgType", get("msgType"));
		map.put("mapType", get("mapType"));
		map.put("kkoMsg", get("kkoMsg"));
		map.put("checkYn", get("checkYn"));
		map.put("name", get("name"));
		map.put("moneyBalance", get("moneyBalance"));
		map.put("typeDeal", get("typeDeal"));
		map.put("account", get("account"));
		map.put("moneyDeal", get("moneyDeal"));
		map.put("serialNum", get("serialNum"));
		map.put("map1", get("map1"));
		map.put("map2", get("map2"));
		map.put("map3", get("map3"));
		map.put("map4", get("map4"));
		map.put("map5", get("map5"));
		map.put("map6", get("map6"));
		map.put("map7", get("map7"));
		map.put("map8", get("map8"));
		map.put("map9", get("map9"));
		map.put("map10", get("map10"));
		map.put("map11", get("map11"));
		map.put("map12", get("map12"));
		map.put("map13", get("map13"));
		map.put("map14", get("map14"));
		map.put("map15", get("map15"));
		map.put("map16", get("map16"));
		map.put("map17", get("map17"));
		map.put("map18", get("map18"));
		map.put("map19", get("map19"));
		map.put("map20", get("map20"));
		map.put("imgFilePathNm", get("imgFilePathNm"));
		map.put("kkoSendBtns", get("kkoSendBtns"));
		map.put("isFav", get("isFav"));
		map.put("regDate", get("regDate"));
		map.put("expireDate", get("expireDate"));
		map.put("uptDate", get("uptDate"));
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
		map.put("msgGrpCd", get("msgGrpCd"));
		map.put("msgGrpNm", get("msgGrpNm"));
		map.put("iconName", get("iconName"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1343750747:/* msgType */
			return getMsgType();
		case 836737718:/* mapType */
			return getMapType();
		case -1129446926:/* kkoMsg */
			return getKkoMsg();
		case 742313533:/* checkYn */
			return getCheckYn();
		case 3373707:/* name */
			return getName();
		case -1261793796:/* moneyBalance */
			return getMoneyBalance();
		case -676801850:/* typeDeal */
			return getTypeDeal();
		case -1177318867:/* account */
			return getAccount();
		case -1714015924:/* moneyDeal */
			return getMoneyDeal();
		case -573505294:/* serialNum */
			return getSerialNum();
		case 3343957:/* map1 */
			return getMap1();
		case 3343958:/* map2 */
			return getMap2();
		case 3343959:/* map3 */
			return getMap3();
		case 3343960:/* map4 */
			return getMap4();
		case 3343961:/* map5 */
			return getMap5();
		case 3343962:/* map6 */
			return getMap6();
		case 3343963:/* map7 */
			return getMap7();
		case 3343964:/* map8 */
			return getMap8();
		case 3343965:/* map9 */
			return getMap9();
		case 103662715:/* map10 */
			return getMap10();
		case 103662716:/* map11 */
			return getMap11();
		case 103662717:/* map12 */
			return getMap12();
		case 103662718:/* map13 */
			return getMap13();
		case 103662719:/* map14 */
			return getMap14();
		case 103662720:/* map15 */
			return getMap15();
		case 103662721:/* map16 */
			return getMap16();
		case 103662722:/* map17 */
			return getMap17();
		case 103662723:/* map18 */
			return getMap18();
		case 103662724:/* map19 */
			return getMap19();
		case 103662746:/* map20 */
			return getMap20();
		case -563041917:/* imgFilePathNm */
			return getImgFilePathNm();
		case -299757202:/* kkoSendBtns */
			return getKkoSendBtns();
		case 100466065:/* isFav */
			return getIsFav();
		case 1084994146:/* regDate */
			return getRegDate();
		case -835208851:/* expireDate */
			return getExpireDate();
		case -220535673:/* uptDate */
			return getUptDate();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
		case -1305615067:/* msgGrpCd */
			return getMsgGrpCd();
		case -1305614717:/* msgGrpNm */
			return getMsgGrpNm();
		case -738113884:/* iconName */
			return getIconName();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1343750747:/* msgType */
			setMsgType((String)value);
			break;
		case 836737718:/* mapType */
			setMapType((String)value);
			break;
		case -1129446926:/* kkoMsg */
			setKkoMsg((String)value);
			break;
		case 742313533:/* checkYn */
			setCheckYn((String)value);
			break;
		case 3373707:/* name */
			setName((String)value);
			break;
		case -1261793796:/* moneyBalance */
			setMoneyBalance((String)value);
			break;
		case -676801850:/* typeDeal */
			setTypeDeal((String)value);
			break;
		case -1177318867:/* account */
			setAccount((String)value);
			break;
		case -1714015924:/* moneyDeal */
			setMoneyDeal((String)value);
			break;
		case -573505294:/* serialNum */
			setSerialNum((String)value);
			break;
		case 3343957:/* map1 */
			setMap1((String)value);
			break;
		case 3343958:/* map2 */
			setMap2((String)value);
			break;
		case 3343959:/* map3 */
			setMap3((String)value);
			break;
		case 3343960:/* map4 */
			setMap4((String)value);
			break;
		case 3343961:/* map5 */
			setMap5((String)value);
			break;
		case 3343962:/* map6 */
			setMap6((String)value);
			break;
		case 3343963:/* map7 */
			setMap7((String)value);
			break;
		case 3343964:/* map8 */
			setMap8((String)value);
			break;
		case 3343965:/* map9 */
			setMap9((String)value);
			break;
		case 103662715:/* map10 */
			setMap10((String)value);
			break;
		case 103662716:/* map11 */
			setMap11((String)value);
			break;
		case 103662717:/* map12 */
			setMap12((String)value);
			break;
		case 103662718:/* map13 */
			setMap13((String)value);
			break;
		case 103662719:/* map14 */
			setMap14((String)value);
			break;
		case 103662720:/* map15 */
			setMap15((String)value);
			break;
		case 103662721:/* map16 */
			setMap16((String)value);
			break;
		case 103662722:/* map17 */
			setMap17((String)value);
			break;
		case 103662723:/* map18 */
			setMap18((String)value);
			break;
		case 103662724:/* map19 */
			setMap19((String)value);
			break;
		case 103662746:/* map20 */
			setMap20((String)value);
			break;
		case -563041917:/* imgFilePathNm */
			setImgFilePathNm((String)value);
			break;
		case -299757202:/* kkoSendBtns */
			setKkoSendBtns((String)value);
			break;
		case 100466065:/* isFav */
			setIsFav((String)value);
			break;
		case 1084994146:/* regDate */
			setRegDate((String)value);
			break;
		case -835208851:/* expireDate */
			setExpireDate((String)value);
			break;
		case -220535673:/* uptDate */
			setUptDate((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		case -1305615067:/* msgGrpCd */
			setMsgGrpCd((String)value);
			break;
		case -1305614717:/* msgGrpNm */
			setMsgGrpNm((String)value);
			break;
		case -738113884:/* iconName */
			setIconName((String)value);
			break;
		default:
			break;
		}
	}
	
}
