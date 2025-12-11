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
 * 
 */
@XmlType(propOrder={
	"pushTyp", "pushInf", "pushTitlTxt", "pushMsgDtlTxt", "acno", "msgTxt", "pushSndDtm"
}, name="INBPushLstInq_DTO")
@XmlRootElement(name="INBPushLstInq_DTO")
@BxmCategory(logicalName="푸시.목록.조회.공통 Sub.IO", description="") 
public class INBPushLstInq_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1202657306L;
	
	
	
	/**
	 * PUSH타입
	 */
	@ApiModelProperty(
		name = "pushTyp"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushTyp")
	@BxmOmm_Field(length=10, decimal=0, description="PUSH타입", align="left", fill="")
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
	@BxmOmm_Field(length=10, decimal=0, description="PUSH정보", align="left", fill="")
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
	@BxmOmm_Field(length=10, decimal=0, description="PUSH제목내용", align="left", fill="")
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
	@BxmOmm_Field(length=10, decimal=0, description="PUSH메시지상세내용", align="left", fill="")
	private String pushMsgDtlTxt= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=10, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
	/**
	 * 메시지내용
	 */
	@ApiModelProperty(
		name = "msgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgTxt")
	@BxmOmm_Field(length=10, decimal=0, description="메시지내용", align="left", fill="")
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
				
	@Override
	public INBPushLstInq_DTO clone(){
		try{
			INBPushLstInq_DTO object= (INBPushLstInq_DTO)super.clone();
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
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.msgTxt==null)?0:this.msgTxt.hashCode());
		result= prime * result + ((this.pushSndDtm==null)?0:this.pushSndDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBPushLstInq_DTO other= (INBPushLstInq_DTO)obj;
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
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBPushLstInq_DTO.class.getName()).append(":\n");
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
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tmsgTxt: ");
		sb.append(msgTxt==null?"null":getMsgTxt());
		sb.append("\n");
		sb.append("\tpushSndDtm: ");
		sb.append(pushSndDtm==null?"null":getPushSndDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* pushTyp */
		messageLen+= 10; /* pushInf */
		messageLen+= 10; /* pushTitlTxt */
		messageLen+= 10; /* pushMsgDtlTxt */
		messageLen+= 10; /* acno */
		messageLen+= 10; /* msgTxt */
		messageLen+= 10; /* pushSndDtm */
	
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
		list.add("acno");
		list.add("msgTxt");
		list.add("pushSndDtm");
	
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
		map.put("acno", get("acno"));
		map.put("msgTxt", get("msgTxt"));
		map.put("pushSndDtm", get("pushSndDtm"));
	
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
		case 2988387:/* acno */
			return getAcno();
		case -1065031889:/* msgTxt */
			return getMsgTxt();
		case 1593199470:/* pushSndDtm */
			return getPushSndDtm();
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
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1065031889:/* msgTxt */
			setMsgTxt((String)value);
			break;
		case 1593199470:/* pushSndDtm */
			setPushSndDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
