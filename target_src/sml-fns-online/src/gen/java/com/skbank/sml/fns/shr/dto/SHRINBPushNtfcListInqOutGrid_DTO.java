/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
 * PUSH알림목록조회GRID DTO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"userMsgId", "msgId", "msgGrpNm", "appLink", "iconName", "pushTitle", "pushMsg", "msgText", "map1", "map2", "map3", "map4", "map5", "map6", "map7"
	, "map8", "map9", "map10", "name", "account", "moneyDeal", "moneyBalance", "serialNum", "typeDeal", "msgType", "readYn", "category", "isFav", "expireDate", "msgGrpCd"
	, "umsTrno", "umsReqDt", "regDate"
}, name="SHRINBPushNtfcListInqOutGrid_DTO")
@XmlRootElement(name="SHRINBPushNtfcListInqOutGrid_DTO")
@BxmCategory(logicalName="PUSH알림목록조회GRID DTO", description="PUSH알림목록조회GRID DTO") 
public class SHRINBPushNtfcListInqOutGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -801365229L;
	
	
	
	/**
	 * 사용자메시지ID
	 */
	@ApiModelProperty(
		name = "userMsgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userMsgId")
	@BxmOmm_Field(length=20, decimal=0, description="사용자메시지ID", align="left", fill="")
	private String userMsgId= "";
	
	
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
	 * 메시지그룹명
	 */
	@ApiModelProperty(
		name = "msgGrpNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgGrpNm")
	@BxmOmm_Field(length=20, decimal=0, description="메시지그룹명", align="left", fill="")
	private String msgGrpNm= "";
	
	
	/**
	 * 앱링크코드
	 */
	@ApiModelProperty(
		name = "appLink"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appLink")
	@BxmOmm_Field(length=10, decimal=0, description="앱링크코드", align="left", fill="")
	private String appLink= "";
	
	
	/**
	 * icon명
	 */
	@ApiModelProperty(
		name = "iconName"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconName")
	@BxmOmm_Field(length=200, decimal=0, description="icon명", align="left", fill="")
	private String iconName= "";
	
	
	/**
	 * 푸시제목
	 */
	@ApiModelProperty(
		name = "pushTitle"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTitle")
	@BxmOmm_Field(length=500, decimal=0, description="푸시제목", align="left", fill="")
	private String pushTitle= "";
	
	
	/**
	 * 푸시내용
	 */
	@ApiModelProperty(
		name = "pushMsg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushMsg")
	@BxmOmm_Field(length=4000, decimal=0, description="푸시내용", align="left", fill="")
	private String pushMsg= "";
	
	
	/**
	 * 사서함메시지
	 */
	@ApiModelProperty(
		name = "msgText"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgText")
	@BxmOmm_Field(length=4000, decimal=0, description="사서함메시지", align="left", fill="")
	private String msgText= "";
	
	
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
	 * 고객명
	 */
	@ApiModelProperty(
		name = "name"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("name")
	@BxmOmm_Field(length=200, decimal=0, description="고객명", align="left", fill="")
	private String name= "";
	
	
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
	@BxmOmm_Field(length=30, decimal=0, description="거래금액 ", align="left", fill="")
	private String moneyDeal= "";
	
	
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
	 * 인증번호
	 */
	@ApiModelProperty(
		name = "serialNum"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("serialNum")
	@BxmOmm_Field(length=30, decimal=0, description="인증번호", align="left", fill="")
	private String serialNum= "";
	
	
	/**
	 * 업무유형
	 */
	@ApiModelProperty(
		name = "typeDeal"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("typeDeal")
	@BxmOmm_Field(length=10, decimal=0, description="업무유형", align="left", fill="")
	private String typeDeal= "";
	
	
	/**
	 * 메시지타입
	 */
	@ApiModelProperty(
		name = "msgType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgType")
	@BxmOmm_Field(length=10, decimal=0, description="메시지타입", align="left", fill="")
	private String msgType= "";
	
	
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
	 * 카테고리
	 */
	@ApiModelProperty(
		name = "category"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("category")
	@BxmOmm_Field(length=10, decimal=0, description="카테고리", align="left", fill="")
	private String category= "";
	
	
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
	 * 메시지그룹코드
	 */
	@ApiModelProperty(
		name = "msgGrpCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgGrpCd")
	@BxmOmm_Field(length=10, decimal=0, description="메시지그룹코드", align="left", fill="")
	private String msgGrpCd= "";
	
	
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
	 * 발송일
	 */
	@ApiModelProperty(
		name = "regDate"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("regDate")
	@BxmOmm_Field(length=14, decimal=0, description="발송일", align="left", fill="")
	private String regDate= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userMsgId= false;
	protected final boolean isSet_userMsgId(){
		return this.isSet_userMsgId;
	}
	private void setIsSet_userMsgId(boolean value){
		this.isSet_userMsgId= value;
	}
	/**
	 * 사용자메시지ID
	 */
	@XmlTransient
	public String getUserMsgId(){
		return this.userMsgId;
	}
	
	/**
	 * 사용자메시지ID
	 * 
	 * @param userMsgId 사용자메시지ID
	 */
	public void setUserMsgId(String userMsgId){
		this.userMsgId= userMsgId;
		this.setIsSet_userMsgId(true);
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
	private boolean isSet_appLink= false;
	protected final boolean isSet_appLink(){
		return this.isSet_appLink;
	}
	private void setIsSet_appLink(boolean value){
		this.isSet_appLink= value;
	}
	/**
	 * 앱링크코드
	 */
	@XmlTransient
	public String getAppLink(){
		return this.appLink;
	}
	
	/**
	 * 앱링크코드
	 * 
	 * @param appLink 앱링크코드
	 */
	public void setAppLink(String appLink){
		this.appLink= appLink;
		this.setIsSet_appLink(true);
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
	 * icon명
	 */
	@XmlTransient
	public String getIconName(){
		return this.iconName;
	}
	
	/**
	 * icon명
	 * 
	 * @param iconName icon명
	 */
	public void setIconName(String iconName){
		this.iconName= iconName;
		this.setIsSet_iconName(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushTitle= false;
	protected final boolean isSet_pushTitle(){
		return this.isSet_pushTitle;
	}
	private void setIsSet_pushTitle(boolean value){
		this.isSet_pushTitle= value;
	}
	/**
	 * 푸시제목
	 */
	@XmlTransient
	public String getPushTitle(){
		return this.pushTitle;
	}
	
	/**
	 * 푸시제목
	 * 
	 * @param pushTitle 푸시제목
	 */
	public void setPushTitle(String pushTitle){
		this.pushTitle= pushTitle;
		this.setIsSet_pushTitle(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushMsg= false;
	protected final boolean isSet_pushMsg(){
		return this.isSet_pushMsg;
	}
	private void setIsSet_pushMsg(boolean value){
		this.isSet_pushMsg= value;
	}
	/**
	 * 푸시내용
	 */
	@XmlTransient
	public String getPushMsg(){
		return this.pushMsg;
	}
	
	/**
	 * 푸시내용
	 * 
	 * @param pushMsg 푸시내용
	 */
	public void setPushMsg(String pushMsg){
		this.pushMsg= pushMsg;
		this.setIsSet_pushMsg(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgText= false;
	protected final boolean isSet_msgText(){
		return this.isSet_msgText;
	}
	private void setIsSet_msgText(boolean value){
		this.isSet_msgText= value;
	}
	/**
	 * 사서함메시지
	 */
	@XmlTransient
	public String getMsgText(){
		return this.msgText;
	}
	
	/**
	 * 사서함메시지
	 * 
	 * @param msgText 사서함메시지
	 */
	public void setMsgText(String msgText){
		this.msgText= msgText;
		this.setIsSet_msgText(true);
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
	private boolean isSet_category= false;
	protected final boolean isSet_category(){
		return this.isSet_category;
	}
	private void setIsSet_category(boolean value){
		this.isSet_category= value;
	}
	/**
	 * 카테고리
	 */
	@XmlTransient
	public String getCategory(){
		return this.category;
	}
	
	/**
	 * 카테고리
	 * 
	 * @param category 카테고리
	 */
	public void setCategory(String category){
		this.category= category;
		this.setIsSet_category(true);
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
	private boolean isSet_regDate= false;
	protected final boolean isSet_regDate(){
		return this.isSet_regDate;
	}
	private void setIsSet_regDate(boolean value){
		this.isSet_regDate= value;
	}
	/**
	 * 발송일
	 */
	@XmlTransient
	public String getRegDate(){
		return this.regDate;
	}
	
	/**
	 * 발송일
	 * 
	 * @param regDate 발송일
	 */
	public void setRegDate(String regDate){
		this.regDate= regDate;
		this.setIsSet_regDate(true);
	}
				
	@Override
	public SHRINBPushNtfcListInqOutGrid_DTO clone(){
		try{
			SHRINBPushNtfcListInqOutGrid_DTO object= (SHRINBPushNtfcListInqOutGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.userMsgId==null)?0:this.userMsgId.hashCode());
		result= prime * result + ((this.msgId==null)?0:this.msgId.hashCode());
		result= prime * result + ((this.msgGrpNm==null)?0:this.msgGrpNm.hashCode());
		result= prime * result + ((this.appLink==null)?0:this.appLink.hashCode());
		result= prime * result + ((this.iconName==null)?0:this.iconName.hashCode());
		result= prime * result + ((this.pushTitle==null)?0:this.pushTitle.hashCode());
		result= prime * result + ((this.pushMsg==null)?0:this.pushMsg.hashCode());
		result= prime * result + ((this.msgText==null)?0:this.msgText.hashCode());
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
		result= prime * result + ((this.name==null)?0:this.name.hashCode());
		result= prime * result + ((this.account==null)?0:this.account.hashCode());
		result= prime * result + ((this.moneyDeal==null)?0:this.moneyDeal.hashCode());
		result= prime * result + ((this.moneyBalance==null)?0:this.moneyBalance.hashCode());
		result= prime * result + ((this.serialNum==null)?0:this.serialNum.hashCode());
		result= prime * result + ((this.typeDeal==null)?0:this.typeDeal.hashCode());
		result= prime * result + ((this.msgType==null)?0:this.msgType.hashCode());
		result= prime * result + ((this.readYn==null)?0:this.readYn.hashCode());
		result= prime * result + ((this.category==null)?0:this.category.hashCode());
		result= prime * result + ((this.isFav==null)?0:this.isFav.hashCode());
		result= prime * result + ((this.expireDate==null)?0:this.expireDate.hashCode());
		result= prime * result + ((this.msgGrpCd==null)?0:this.msgGrpCd.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		result= prime * result + ((this.regDate==null)?0:this.regDate.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRINBPushNtfcListInqOutGrid_DTO other= (SHRINBPushNtfcListInqOutGrid_DTO)obj;
		{
			Object _userMsgId= getUserMsgId();
			Object __userMsgId= other.getUserMsgId();
			if ( _userMsgId== null ) { if ( __userMsgId!= null ) return false; }
			else if ( !_userMsgId.equals(__userMsgId) ) return false;
		}
		{
			Object _msgId= getMsgId();
			Object __msgId= other.getMsgId();
			if ( _msgId== null ) { if ( __msgId!= null ) return false; }
			else if ( !_msgId.equals(__msgId) ) return false;
		}
		{
			Object _msgGrpNm= getMsgGrpNm();
			Object __msgGrpNm= other.getMsgGrpNm();
			if ( _msgGrpNm== null ) { if ( __msgGrpNm!= null ) return false; }
			else if ( !_msgGrpNm.equals(__msgGrpNm) ) return false;
		}
		{
			Object _appLink= getAppLink();
			Object __appLink= other.getAppLink();
			if ( _appLink== null ) { if ( __appLink!= null ) return false; }
			else if ( !_appLink.equals(__appLink) ) return false;
		}
		{
			Object _iconName= getIconName();
			Object __iconName= other.getIconName();
			if ( _iconName== null ) { if ( __iconName!= null ) return false; }
			else if ( !_iconName.equals(__iconName) ) return false;
		}
		{
			Object _pushTitle= getPushTitle();
			Object __pushTitle= other.getPushTitle();
			if ( _pushTitle== null ) { if ( __pushTitle!= null ) return false; }
			else if ( !_pushTitle.equals(__pushTitle) ) return false;
		}
		{
			Object _pushMsg= getPushMsg();
			Object __pushMsg= other.getPushMsg();
			if ( _pushMsg== null ) { if ( __pushMsg!= null ) return false; }
			else if ( !_pushMsg.equals(__pushMsg) ) return false;
		}
		{
			Object _msgText= getMsgText();
			Object __msgText= other.getMsgText();
			if ( _msgText== null ) { if ( __msgText!= null ) return false; }
			else if ( !_msgText.equals(__msgText) ) return false;
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
			Object _name= getName();
			Object __name= other.getName();
			if ( _name== null ) { if ( __name!= null ) return false; }
			else if ( !_name.equals(__name) ) return false;
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
			Object _moneyBalance= getMoneyBalance();
			Object __moneyBalance= other.getMoneyBalance();
			if ( _moneyBalance== null ) { if ( __moneyBalance!= null ) return false; }
			else if ( !_moneyBalance.equals(__moneyBalance) ) return false;
		}
		{
			Object _serialNum= getSerialNum();
			Object __serialNum= other.getSerialNum();
			if ( _serialNum== null ) { if ( __serialNum!= null ) return false; }
			else if ( !_serialNum.equals(__serialNum) ) return false;
		}
		{
			Object _typeDeal= getTypeDeal();
			Object __typeDeal= other.getTypeDeal();
			if ( _typeDeal== null ) { if ( __typeDeal!= null ) return false; }
			else if ( !_typeDeal.equals(__typeDeal) ) return false;
		}
		{
			Object _msgType= getMsgType();
			Object __msgType= other.getMsgType();
			if ( _msgType== null ) { if ( __msgType!= null ) return false; }
			else if ( !_msgType.equals(__msgType) ) return false;
		}
		{
			Object _readYn= getReadYn();
			Object __readYn= other.getReadYn();
			if ( _readYn== null ) { if ( __readYn!= null ) return false; }
			else if ( !_readYn.equals(__readYn) ) return false;
		}
		{
			Object _category= getCategory();
			Object __category= other.getCategory();
			if ( _category== null ) { if ( __category!= null ) return false; }
			else if ( !_category.equals(__category) ) return false;
		}
		{
			Object _isFav= getIsFav();
			Object __isFav= other.getIsFav();
			if ( _isFav== null ) { if ( __isFav!= null ) return false; }
			else if ( !_isFav.equals(__isFav) ) return false;
		}
		{
			Object _expireDate= getExpireDate();
			Object __expireDate= other.getExpireDate();
			if ( _expireDate== null ) { if ( __expireDate!= null ) return false; }
			else if ( !_expireDate.equals(__expireDate) ) return false;
		}
		{
			Object _msgGrpCd= getMsgGrpCd();
			Object __msgGrpCd= other.getMsgGrpCd();
			if ( _msgGrpCd== null ) { if ( __msgGrpCd!= null ) return false; }
			else if ( !_msgGrpCd.equals(__msgGrpCd) ) return false;
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
			Object _regDate= getRegDate();
			Object __regDate= other.getRegDate();
			if ( _regDate== null ) { if ( __regDate!= null ) return false; }
			else if ( !_regDate.equals(__regDate) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRINBPushNtfcListInqOutGrid_DTO.class.getName()).append(":\n");
		sb.append("\tuserMsgId: ");
		sb.append(userMsgId==null?"null":getUserMsgId());
		sb.append("\n");
		sb.append("\tmsgId: ");
		sb.append(msgId==null?"null":getMsgId());
		sb.append("\n");
		sb.append("\tmsgGrpNm: ");
		sb.append(msgGrpNm==null?"null":getMsgGrpNm());
		sb.append("\n");
		sb.append("\tappLink: ");
		sb.append(appLink==null?"null":getAppLink());
		sb.append("\n");
		sb.append("\ticonName: ");
		sb.append(iconName==null?"null":getIconName());
		sb.append("\n");
		sb.append("\tpushTitle: ");
		sb.append(pushTitle==null?"null":getPushTitle());
		sb.append("\n");
		sb.append("\tpushMsg: ");
		sb.append(pushMsg==null?"null":getPushMsg());
		sb.append("\n");
		sb.append("\tmsgText: ");
		sb.append(msgText==null?"null":getMsgText());
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
		sb.append("\tname: ");
		sb.append(name==null?"null":getName());
		sb.append("\n");
		sb.append("\taccount: ");
		sb.append(account==null?"null":getAccount());
		sb.append("\n");
		sb.append("\tmoneyDeal: ");
		sb.append(moneyDeal==null?"null":getMoneyDeal());
		sb.append("\n");
		sb.append("\tmoneyBalance: ");
		sb.append(moneyBalance==null?"null":getMoneyBalance());
		sb.append("\n");
		sb.append("\tserialNum: ");
		sb.append(serialNum==null?"null":getSerialNum());
		sb.append("\n");
		sb.append("\ttypeDeal: ");
		sb.append(typeDeal==null?"null":getTypeDeal());
		sb.append("\n");
		sb.append("\tmsgType: ");
		sb.append(msgType==null?"null":getMsgType());
		sb.append("\n");
		sb.append("\treadYn: ");
		sb.append(readYn==null?"null":getReadYn());
		sb.append("\n");
		sb.append("\tcategory: ");
		sb.append(category==null?"null":getCategory());
		sb.append("\n");
		sb.append("\tisFav: ");
		sb.append(isFav==null?"null":getIsFav());
		sb.append("\n");
		sb.append("\texpireDate: ");
		sb.append(expireDate==null?"null":getExpireDate());
		sb.append("\n");
		sb.append("\tmsgGrpCd: ");
		sb.append(msgGrpCd==null?"null":getMsgGrpCd());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("\tregDate: ");
		sb.append(regDate==null?"null":getRegDate());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* userMsgId */
		messageLen+= 50; /* msgId */
		messageLen+= 20; /* msgGrpNm */
		messageLen+= 10; /* appLink */
		messageLen+= 200; /* iconName */
		messageLen+= 500; /* pushTitle */
		messageLen+= 4000; /* pushMsg */
		messageLen+= 4000; /* msgText */
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
		messageLen+= 200; /* name */
		messageLen+= 20; /* account */
		messageLen+= 30; /* moneyDeal */
		messageLen+= 30; /* moneyBalance */
		messageLen+= 30; /* serialNum */
		messageLen+= 10; /* typeDeal */
		messageLen+= 10; /* msgType */
		messageLen+= 1; /* readYn */
		messageLen+= 10; /* category */
		messageLen+= 1; /* isFav */
		messageLen+= 14; /* expireDate */
		messageLen+= 10; /* msgGrpCd */
		messageLen+= 20; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
		messageLen+= 14; /* regDate */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("userMsgId");
		list.add("msgId");
		list.add("msgGrpNm");
		list.add("appLink");
		list.add("iconName");
		list.add("pushTitle");
		list.add("pushMsg");
		list.add("msgText");
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
		list.add("name");
		list.add("account");
		list.add("moneyDeal");
		list.add("moneyBalance");
		list.add("serialNum");
		list.add("typeDeal");
		list.add("msgType");
		list.add("readYn");
		list.add("category");
		list.add("isFav");
		list.add("expireDate");
		list.add("msgGrpCd");
		list.add("umsTrno");
		list.add("umsReqDt");
		list.add("regDate");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("userMsgId", get("userMsgId"));
		map.put("msgId", get("msgId"));
		map.put("msgGrpNm", get("msgGrpNm"));
		map.put("appLink", get("appLink"));
		map.put("iconName", get("iconName"));
		map.put("pushTitle", get("pushTitle"));
		map.put("pushMsg", get("pushMsg"));
		map.put("msgText", get("msgText"));
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
		map.put("name", get("name"));
		map.put("account", get("account"));
		map.put("moneyDeal", get("moneyDeal"));
		map.put("moneyBalance", get("moneyBalance"));
		map.put("serialNum", get("serialNum"));
		map.put("typeDeal", get("typeDeal"));
		map.put("msgType", get("msgType"));
		map.put("readYn", get("readYn"));
		map.put("category", get("category"));
		map.put("isFav", get("isFav"));
		map.put("expireDate", get("expireDate"));
		map.put("msgGrpCd", get("msgGrpCd"));
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
		map.put("regDate", get("regDate"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 322871153:/* userMsgId */
			return getUserMsgId();
		case 104191100:/* msgId */
			return getMsgId();
		case -1305614717:/* msgGrpNm */
			return getMsgGrpNm();
		case -794188357:/* appLink */
			return getAppLink();
		case -738113884:/* iconName */
			return getIconName();
		case -779099298:/* pushTitle */
			return getPushTitle();
		case -219811321:/* pushMsg */
			return getPushMsg();
		case 1343731790:/* msgText */
			return getMsgText();
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
		case 3373707:/* name */
			return getName();
		case -1177318867:/* account */
			return getAccount();
		case -1714015924:/* moneyDeal */
			return getMoneyDeal();
		case -1261793796:/* moneyBalance */
			return getMoneyBalance();
		case -573505294:/* serialNum */
			return getSerialNum();
		case -676801850:/* typeDeal */
			return getTypeDeal();
		case 1343750747:/* msgType */
			return getMsgType();
		case -934979765:/* readYn */
			return getReadYn();
		case 50511102:/* category */
			return getCategory();
		case 100466065:/* isFav */
			return getIsFav();
		case -835208851:/* expireDate */
			return getExpireDate();
		case -1305615067:/* msgGrpCd */
			return getMsgGrpCd();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
		case 1084994146:/* regDate */
			return getRegDate();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 322871153:/* userMsgId */
			setUserMsgId((String)value);
			break;
		case 104191100:/* msgId */
			setMsgId((String)value);
			break;
		case -1305614717:/* msgGrpNm */
			setMsgGrpNm((String)value);
			break;
		case -794188357:/* appLink */
			setAppLink((String)value);
			break;
		case -738113884:/* iconName */
			setIconName((String)value);
			break;
		case -779099298:/* pushTitle */
			setPushTitle((String)value);
			break;
		case -219811321:/* pushMsg */
			setPushMsg((String)value);
			break;
		case 1343731790:/* msgText */
			setMsgText((String)value);
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
		case 3373707:/* name */
			setName((String)value);
			break;
		case -1177318867:/* account */
			setAccount((String)value);
			break;
		case -1714015924:/* moneyDeal */
			setMoneyDeal((String)value);
			break;
		case -1261793796:/* moneyBalance */
			setMoneyBalance((String)value);
			break;
		case -573505294:/* serialNum */
			setSerialNum((String)value);
			break;
		case -676801850:/* typeDeal */
			setTypeDeal((String)value);
			break;
		case 1343750747:/* msgType */
			setMsgType((String)value);
			break;
		case -934979765:/* readYn */
			setReadYn((String)value);
			break;
		case 50511102:/* category */
			setCategory((String)value);
			break;
		case 100466065:/* isFav */
			setIsFav((String)value);
			break;
		case -835208851:/* expireDate */
			setExpireDate((String)value);
			break;
		case -1305615067:/* msgGrpCd */
			setMsgGrpCd((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		case 1084994146:/* regDate */
			setRegDate((String)value);
			break;
		default:
			break;
		}
	}
	
}
