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

/**
 * PUSH 조회 출력 DTO
 */
@XmlType(propOrder={
	"pushTyp", "pushInf", "pushTitlTxt", "pushMsgDtlTxt", "msgTxt", "pushSndDtm", "acno", "typeCd", "status", "accNm", "accno", "bank", "name", "pushDate", "payType"
	, "payAmount", "pushCtnt"
}, name="PushListInq_DODT")
@XmlRootElement(name="PushListInq_DODT")
@BxmCategory(logicalName="푸시.목록.조회.DBM.출력.IO", description="PUSH 조회 출력 DTO") 
public class PushListInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 710443574L;
	
	
	
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
	 * PUSH정보
	 */
	@ApiModelProperty(
		name = "pushInf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushInf")
	@BxmOmm_Field(length=150, decimal=0, description="PUSH정보", align="left", fill="")
	private String pushInf= "";
	
	
	/**
	 * PUSH제목내용
	 */
	@ApiModelProperty(
		name = "pushTitlTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTitlTxt")
	@BxmOmm_Field(length=50, decimal=0, description="PUSH제목내용", align="left", fill="")
	private String pushTitlTxt= "";
	
	
	/**
	 * PUSH메시지상세내용
	 */
	@ApiModelProperty(
		name = "pushMsgDtlTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushMsgDtlTxt")
	@BxmOmm_Field(length=4000, decimal=0, description="PUSH메시지상세내용", align="left", fill="")
	private String pushMsgDtlTxt= "";
	
	
	/**
	 * 메시지내용
	 */
	@ApiModelProperty(
		name = "msgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgTxt")
	@BxmOmm_Field(length=500, decimal=0, description="메시지내용", align="left", fill="")
	private String msgTxt= "";
	
	
	/**
	 * PUSH발송일시
	 */
	@ApiModelProperty(
		name = "pushSndDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushSndDtm")
	@BxmOmm_Field(length=10, decimal=0, description="PUSH발송일시", align="left", fill="")
	private String pushSndDtm= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
	/**
	 * 타입코드
	 */
	@ApiModelProperty(
		name = "typeCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("typeCd")
	@BxmOmm_Field(length=10, decimal=0, description="타입코드", align="left", fill="")
	private String typeCd= "";
	
	
	/**
	 * 상태
	 */
	@ApiModelProperty(
		name = "status"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("status")
	@BxmOmm_Field(length=10, decimal=0, description="상태", align="left", fill="")
	private String status= "";
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "accNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("accNm")
	@BxmOmm_Field(length=50, decimal=0, description="계좌명", align="left", fill="")
	private String accNm= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "accno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("accno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="")
	private String accno= "";
	
	
	/**
	 * 은행
	 */
	@ApiModelProperty(
		name = "bank"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bank")
	@BxmOmm_Field(length=10, decimal=0, description="은행", align="left", fill="")
	private String bank= "";
	
	
	/**
	 * 이름
	 */
	@ApiModelProperty(
		name = "name"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("name")
	@BxmOmm_Field(length=10, decimal=0, description="이름", align="left", fill="")
	private String name= "";
	
	
	/**
	 * 일자
	 */
	@ApiModelProperty(
		name = "pushDate"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushDate")
	@BxmOmm_Field(length=10, decimal=0, description="일자", align="left", fill="")
	private String pushDate= "";
	
	
	/**
	 * 입출금타입
	 */
	@ApiModelProperty(
		name = "payType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payType")
	@BxmOmm_Field(length=10, decimal=0, description="입출금타입", align="left", fill="")
	private String payType= "";
	
	
	/**
	 * 입출금액
	 */
	@ApiModelProperty(
		name = "payAmount"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payAmount")
	@BxmOmm_Field(length=10, decimal=0, description="입출금액", align="left", fill="")
	private String payAmount= "";
	
	
	/**
	 * push내용
	 */
	@ApiModelProperty(
		name = "pushCtnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushCtnt")
	@BxmOmm_Field(length=10, decimal=0, description="push내용", align="left", fill="")
	private String pushCtnt= "";
	
	
	
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
	private boolean isSet_pushInf= false;
	protected final boolean isSet_pushInf(){
		return this.isSet_pushInf;
	}
	private void setIsSet_pushInf(boolean value){
		this.isSet_pushInf= value;
	}
	/**
	 * PUSH정보
	 */
	@XmlTransient
	public String getPushInf(){
		return this.pushInf;
	}
	
	/**
	 * PUSH정보
	 * 
	 * @param pushInf PUSH정보
	 */
	public void setPushInf(String pushInf){
		this.pushInf= pushInf;
		this.setIsSet_pushInf(true);
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
	private boolean isSet_pushMsgDtlTxt= false;
	protected final boolean isSet_pushMsgDtlTxt(){
		return this.isSet_pushMsgDtlTxt;
	}
	private void setIsSet_pushMsgDtlTxt(boolean value){
		this.isSet_pushMsgDtlTxt= value;
	}
	/**
	 * PUSH메시지상세내용
	 */
	@XmlTransient
	public String getPushMsgDtlTxt(){
		return this.pushMsgDtlTxt;
	}
	
	/**
	 * PUSH메시지상세내용
	 * 
	 * @param pushMsgDtlTxt PUSH메시지상세내용
	 */
	public void setPushMsgDtlTxt(String pushMsgDtlTxt){
		this.pushMsgDtlTxt= pushMsgDtlTxt;
		this.setIsSet_pushMsgDtlTxt(true);
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
	 * 메시지내용
	 */
	@XmlTransient
	public String getMsgTxt(){
		return this.msgTxt;
	}
	
	/**
	 * 메시지내용
	 * 
	 * @param msgTxt 메시지내용
	 */
	public void setMsgTxt(String msgTxt){
		this.msgTxt= msgTxt;
		this.setIsSet_msgTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushSndDtm= false;
	protected final boolean isSet_pushSndDtm(){
		return this.isSet_pushSndDtm;
	}
	private void setIsSet_pushSndDtm(boolean value){
		this.isSet_pushSndDtm= value;
	}
	/**
	 * PUSH발송일시
	 */
	@XmlTransient
	public String getPushSndDtm(){
		return this.pushSndDtm;
	}
	
	/**
	 * PUSH발송일시
	 * 
	 * @param pushSndDtm PUSH발송일시
	 */
	public void setPushSndDtm(String pushSndDtm){
		this.pushSndDtm= pushSndDtm;
		this.setIsSet_pushSndDtm(true);
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
	private boolean isSet_typeCd= false;
	protected final boolean isSet_typeCd(){
		return this.isSet_typeCd;
	}
	private void setIsSet_typeCd(boolean value){
		this.isSet_typeCd= value;
	}
	/**
	 * 타입코드
	 */
	@XmlTransient
	public String getTypeCd(){
		return this.typeCd;
	}
	
	/**
	 * 타입코드
	 * 
	 * @param typeCd 타입코드
	 */
	public void setTypeCd(String typeCd){
		this.typeCd= typeCd;
		this.setIsSet_typeCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_status= false;
	protected final boolean isSet_status(){
		return this.isSet_status;
	}
	private void setIsSet_status(boolean value){
		this.isSet_status= value;
	}
	/**
	 * 상태
	 */
	@XmlTransient
	public String getStatus(){
		return this.status;
	}
	
	/**
	 * 상태
	 * 
	 * @param status 상태
	 */
	public void setStatus(String status){
		this.status= status;
		this.setIsSet_status(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_accNm= false;
	protected final boolean isSet_accNm(){
		return this.isSet_accNm;
	}
	private void setIsSet_accNm(boolean value){
		this.isSet_accNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getAccNm(){
		return this.accNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param accNm 계좌명
	 */
	public void setAccNm(String accNm){
		this.accNm= accNm;
		this.setIsSet_accNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_accno= false;
	protected final boolean isSet_accno(){
		return this.isSet_accno;
	}
	private void setIsSet_accno(boolean value){
		this.isSet_accno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAccno(){
		return this.accno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param accno 계좌번호
	 */
	public void setAccno(String accno){
		this.accno= accno;
		this.setIsSet_accno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bank= false;
	protected final boolean isSet_bank(){
		return this.isSet_bank;
	}
	private void setIsSet_bank(boolean value){
		this.isSet_bank= value;
	}
	/**
	 * 은행
	 */
	@XmlTransient
	public String getBank(){
		return this.bank;
	}
	
	/**
	 * 은행
	 * 
	 * @param bank 은행
	 */
	public void setBank(String bank){
		this.bank= bank;
		this.setIsSet_bank(true);
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
	 * 이름
	 */
	@XmlTransient
	public String getName(){
		return this.name;
	}
	
	/**
	 * 이름
	 * 
	 * @param name 이름
	 */
	public void setName(String name){
		this.name= name;
		this.setIsSet_name(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushDate= false;
	protected final boolean isSet_pushDate(){
		return this.isSet_pushDate;
	}
	private void setIsSet_pushDate(boolean value){
		this.isSet_pushDate= value;
	}
	/**
	 * 일자
	 */
	@XmlTransient
	public String getPushDate(){
		return this.pushDate;
	}
	
	/**
	 * 일자
	 * 
	 * @param pushDate 일자
	 */
	public void setPushDate(String pushDate){
		this.pushDate= pushDate;
		this.setIsSet_pushDate(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payType= false;
	protected final boolean isSet_payType(){
		return this.isSet_payType;
	}
	private void setIsSet_payType(boolean value){
		this.isSet_payType= value;
	}
	/**
	 * 입출금타입
	 */
	@XmlTransient
	public String getPayType(){
		return this.payType;
	}
	
	/**
	 * 입출금타입
	 * 
	 * @param payType 입출금타입
	 */
	public void setPayType(String payType){
		this.payType= payType;
		this.setIsSet_payType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payAmount= false;
	protected final boolean isSet_payAmount(){
		return this.isSet_payAmount;
	}
	private void setIsSet_payAmount(boolean value){
		this.isSet_payAmount= value;
	}
	/**
	 * 입출금액
	 */
	@XmlTransient
	public String getPayAmount(){
		return this.payAmount;
	}
	
	/**
	 * 입출금액
	 * 
	 * @param payAmount 입출금액
	 */
	public void setPayAmount(String payAmount){
		this.payAmount= payAmount;
		this.setIsSet_payAmount(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushCtnt= false;
	protected final boolean isSet_pushCtnt(){
		return this.isSet_pushCtnt;
	}
	private void setIsSet_pushCtnt(boolean value){
		this.isSet_pushCtnt= value;
	}
	/**
	 * push내용
	 */
	@XmlTransient
	public String getPushCtnt(){
		return this.pushCtnt;
	}
	
	/**
	 * push내용
	 * 
	 * @param pushCtnt push내용
	 */
	public void setPushCtnt(String pushCtnt){
		this.pushCtnt= pushCtnt;
		this.setIsSet_pushCtnt(true);
	}
				
	@Override
	public PushListInq_DODT clone(){
		try{
			PushListInq_DODT object= (PushListInq_DODT)super.clone();
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
		
		result= prime * result + ((this.pushTyp==null)?0:this.pushTyp.hashCode());
		result= prime * result + ((this.pushInf==null)?0:this.pushInf.hashCode());
		result= prime * result + ((this.pushTitlTxt==null)?0:this.pushTitlTxt.hashCode());
		result= prime * result + ((this.pushMsgDtlTxt==null)?0:this.pushMsgDtlTxt.hashCode());
		result= prime * result + ((this.msgTxt==null)?0:this.msgTxt.hashCode());
		result= prime * result + ((this.pushSndDtm==null)?0:this.pushSndDtm.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.typeCd==null)?0:this.typeCd.hashCode());
		result= prime * result + ((this.status==null)?0:this.status.hashCode());
		result= prime * result + ((this.accNm==null)?0:this.accNm.hashCode());
		result= prime * result + ((this.accno==null)?0:this.accno.hashCode());
		result= prime * result + ((this.bank==null)?0:this.bank.hashCode());
		result= prime * result + ((this.name==null)?0:this.name.hashCode());
		result= prime * result + ((this.pushDate==null)?0:this.pushDate.hashCode());
		result= prime * result + ((this.payType==null)?0:this.payType.hashCode());
		result= prime * result + ((this.payAmount==null)?0:this.payAmount.hashCode());
		result= prime * result + ((this.pushCtnt==null)?0:this.pushCtnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PushListInq_DODT other= (PushListInq_DODT)obj;
		{
			Object _pushTyp= getPushTyp();
			Object __pushTyp= other.getPushTyp();
			if ( _pushTyp== null ) { if ( __pushTyp!= null ) return false; }
			else if ( !_pushTyp.equals(__pushTyp) ) return false;
		}
		{
			Object _pushInf= getPushInf();
			Object __pushInf= other.getPushInf();
			if ( _pushInf== null ) { if ( __pushInf!= null ) return false; }
			else if ( !_pushInf.equals(__pushInf) ) return false;
		}
		{
			Object _pushTitlTxt= getPushTitlTxt();
			Object __pushTitlTxt= other.getPushTitlTxt();
			if ( _pushTitlTxt== null ) { if ( __pushTitlTxt!= null ) return false; }
			else if ( !_pushTitlTxt.equals(__pushTitlTxt) ) return false;
		}
		{
			Object _pushMsgDtlTxt= getPushMsgDtlTxt();
			Object __pushMsgDtlTxt= other.getPushMsgDtlTxt();
			if ( _pushMsgDtlTxt== null ) { if ( __pushMsgDtlTxt!= null ) return false; }
			else if ( !_pushMsgDtlTxt.equals(__pushMsgDtlTxt) ) return false;
		}
		{
			Object _msgTxt= getMsgTxt();
			Object __msgTxt= other.getMsgTxt();
			if ( _msgTxt== null ) { if ( __msgTxt!= null ) return false; }
			else if ( !_msgTxt.equals(__msgTxt) ) return false;
		}
		{
			Object _pushSndDtm= getPushSndDtm();
			Object __pushSndDtm= other.getPushSndDtm();
			if ( _pushSndDtm== null ) { if ( __pushSndDtm!= null ) return false; }
			else if ( !_pushSndDtm.equals(__pushSndDtm) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _typeCd= getTypeCd();
			Object __typeCd= other.getTypeCd();
			if ( _typeCd== null ) { if ( __typeCd!= null ) return false; }
			else if ( !_typeCd.equals(__typeCd) ) return false;
		}
		{
			Object _status= getStatus();
			Object __status= other.getStatus();
			if ( _status== null ) { if ( __status!= null ) return false; }
			else if ( !_status.equals(__status) ) return false;
		}
		{
			Object _accNm= getAccNm();
			Object __accNm= other.getAccNm();
			if ( _accNm== null ) { if ( __accNm!= null ) return false; }
			else if ( !_accNm.equals(__accNm) ) return false;
		}
		{
			Object _accno= getAccno();
			Object __accno= other.getAccno();
			if ( _accno== null ) { if ( __accno!= null ) return false; }
			else if ( !_accno.equals(__accno) ) return false;
		}
		{
			Object _bank= getBank();
			Object __bank= other.getBank();
			if ( _bank== null ) { if ( __bank!= null ) return false; }
			else if ( !_bank.equals(__bank) ) return false;
		}
		{
			Object _name= getName();
			Object __name= other.getName();
			if ( _name== null ) { if ( __name!= null ) return false; }
			else if ( !_name.equals(__name) ) return false;
		}
		{
			Object _pushDate= getPushDate();
			Object __pushDate= other.getPushDate();
			if ( _pushDate== null ) { if ( __pushDate!= null ) return false; }
			else if ( !_pushDate.equals(__pushDate) ) return false;
		}
		{
			Object _payType= getPayType();
			Object __payType= other.getPayType();
			if ( _payType== null ) { if ( __payType!= null ) return false; }
			else if ( !_payType.equals(__payType) ) return false;
		}
		{
			Object _payAmount= getPayAmount();
			Object __payAmount= other.getPayAmount();
			if ( _payAmount== null ) { if ( __payAmount!= null ) return false; }
			else if ( !_payAmount.equals(__payAmount) ) return false;
		}
		{
			Object _pushCtnt= getPushCtnt();
			Object __pushCtnt= other.getPushCtnt();
			if ( _pushCtnt== null ) { if ( __pushCtnt!= null ) return false; }
			else if ( !_pushCtnt.equals(__pushCtnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PushListInq_DODT.class.getName()).append(":\n");
		sb.append("\tpushTyp: ");
		sb.append(pushTyp==null?"null":getPushTyp());
		sb.append("\n");
		sb.append("\tpushInf: ");
		sb.append(pushInf==null?"null":getPushInf());
		sb.append("\n");
		sb.append("\tpushTitlTxt: ");
		sb.append(pushTitlTxt==null?"null":getPushTitlTxt());
		sb.append("\n");
		sb.append("\tpushMsgDtlTxt: ");
		sb.append(pushMsgDtlTxt==null?"null":getPushMsgDtlTxt());
		sb.append("\n");
		sb.append("\tmsgTxt: ");
		sb.append(msgTxt==null?"null":getMsgTxt());
		sb.append("\n");
		sb.append("\tpushSndDtm: ");
		sb.append(pushSndDtm==null?"null":getPushSndDtm());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\ttypeCd: ");
		sb.append(typeCd==null?"null":getTypeCd());
		sb.append("\n");
		sb.append("\tstatus: ");
		sb.append(status==null?"null":getStatus());
		sb.append("\n");
		sb.append("\taccNm: ");
		sb.append(accNm==null?"null":getAccNm());
		sb.append("\n");
		sb.append("\taccno: ");
		sb.append(accno==null?"null":getAccno());
		sb.append("\n");
		sb.append("\tbank: ");
		sb.append(bank==null?"null":getBank());
		sb.append("\n");
		sb.append("\tname: ");
		sb.append(name==null?"null":getName());
		sb.append("\n");
		sb.append("\tpushDate: ");
		sb.append(pushDate==null?"null":getPushDate());
		sb.append("\n");
		sb.append("\tpayType: ");
		sb.append(payType==null?"null":getPayType());
		sb.append("\n");
		sb.append("\tpayAmount: ");
		sb.append(payAmount==null?"null":getPayAmount());
		sb.append("\n");
		sb.append("\tpushCtnt: ");
		sb.append(pushCtnt==null?"null":getPushCtnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* pushTyp */
		messageLen+= 150; /* pushInf */
		messageLen+= 50; /* pushTitlTxt */
		messageLen+= 4000; /* pushMsgDtlTxt */
		messageLen+= 500; /* msgTxt */
		messageLen+= 10; /* pushSndDtm */
		messageLen+= 20; /* acno */
		messageLen+= 10; /* typeCd */
		messageLen+= 10; /* status */
		messageLen+= 50; /* accNm */
		messageLen+= 20; /* accno */
		messageLen+= 10; /* bank */
		messageLen+= 10; /* name */
		messageLen+= 10; /* pushDate */
		messageLen+= 10; /* payType */
		messageLen+= 10; /* payAmount */
		messageLen+= 10; /* pushCtnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pushTyp");
		list.add("pushInf");
		list.add("pushTitlTxt");
		list.add("pushMsgDtlTxt");
		list.add("msgTxt");
		list.add("pushSndDtm");
		list.add("acno");
		list.add("typeCd");
		list.add("status");
		list.add("accNm");
		list.add("accno");
		list.add("bank");
		list.add("name");
		list.add("pushDate");
		list.add("payType");
		list.add("payAmount");
		list.add("pushCtnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pushTyp", get("pushTyp"));
		map.put("pushInf", get("pushInf"));
		map.put("pushTitlTxt", get("pushTitlTxt"));
		map.put("pushMsgDtlTxt", get("pushMsgDtlTxt"));
		map.put("msgTxt", get("msgTxt"));
		map.put("pushSndDtm", get("pushSndDtm"));
		map.put("acno", get("acno"));
		map.put("typeCd", get("typeCd"));
		map.put("status", get("status"));
		map.put("accNm", get("accNm"));
		map.put("accno", get("accno"));
		map.put("bank", get("bank"));
		map.put("name", get("name"));
		map.put("pushDate", get("pushDate"));
		map.put("payType", get("payType"));
		map.put("payAmount", get("payAmount"));
		map.put("pushCtnt", get("pushCtnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -219804399:/* pushTyp */
			return getPushTyp();
		case -219815321:/* pushInf */
			return getPushInf();
		case -1390128375:/* pushTitlTxt */
			return getPushTitlTxt();
		case 68330459:/* pushMsgDtlTxt */
			return getPushMsgDtlTxt();
		case -1065031889:/* msgTxt */
			return getMsgTxt();
		case 1593199470:/* pushSndDtm */
			return getPushSndDtm();
		case 2988387:/* acno */
			return getAcno();
		case -858803909:/* typeCd */
			return getTypeCd();
		case -892481550:/* status */
			return getStatus();
		case 92628512:/* accNm */
			return getAccNm();
		case 92629506:/* accno */
			return getAccno();
		case 3016252:/* bank */
			return getBank();
		case 3373707:/* name */
			return getName();
		case 1775498728:/* pushDate */
			return getPushDate();
		case -787406846:/* payType */
			return getPayType();
		case -1338781920:/* payAmount */
			return getPayAmount();
		case 1775487025:/* pushCtnt */
			return getPushCtnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -219804399:/* pushTyp */
			setPushTyp((String)value);
			break;
		case -219815321:/* pushInf */
			setPushInf((String)value);
			break;
		case -1390128375:/* pushTitlTxt */
			setPushTitlTxt((String)value);
			break;
		case 68330459:/* pushMsgDtlTxt */
			setPushMsgDtlTxt((String)value);
			break;
		case -1065031889:/* msgTxt */
			setMsgTxt((String)value);
			break;
		case 1593199470:/* pushSndDtm */
			setPushSndDtm((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -858803909:/* typeCd */
			setTypeCd((String)value);
			break;
		case -892481550:/* status */
			setStatus((String)value);
			break;
		case 92628512:/* accNm */
			setAccNm((String)value);
			break;
		case 92629506:/* accno */
			setAccno((String)value);
			break;
		case 3016252:/* bank */
			setBank((String)value);
			break;
		case 3373707:/* name */
			setName((String)value);
			break;
		case 1775498728:/* pushDate */
			setPushDate((String)value);
			break;
		case -787406846:/* payType */
			setPayType((String)value);
			break;
		case -1338781920:/* payAmount */
			setPayAmount((String)value);
			break;
		case 1775487025:/* pushCtnt */
			setPushCtnt((String)value);
			break;
		default:
			break;
		}
	}
	
}
