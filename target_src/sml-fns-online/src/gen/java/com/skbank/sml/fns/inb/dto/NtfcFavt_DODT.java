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
	"status", "code", "msg", "appUserId"
}, name="NtfcFavt_DODT")
@XmlRootElement(name="NtfcFavt_DODT")
@BxmCategory(logicalName="알림.즐겨찾기.DBM.출력.IO", description="") 
public class NtfcFavt_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 297418222L;
	
	
	
	/**
	 * 결과상태
	 */
	@ApiModelProperty(
		name = "status"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("status")
	@BxmOmm_Field(length=7, decimal=0, description="결과상태", align="left", fill="")
	private String status= "";
	
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "code"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("code")
	@BxmOmm_Field(length=7, decimal=0, description="결과코드", align="left", fill="")
	private String code= "";
	
	
	/**
	 * 결과코드내용
	 */
	@ApiModelProperty(
		name = "msg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msg")
	@BxmOmm_Field(length=500, decimal=0, description="결과코드내용", align="left", fill="")
	private String msg= "";
	
	
	/**
	 * 앱유저ID
	 */
	@ApiModelProperty(
		name = "appUserId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appUserId")
	@BxmOmm_Field(length=100, decimal=0, description="앱유저ID", align="left", fill="")
	private String appUserId= "";
	
	
	
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
	 * 결과상태
	 */
	@XmlTransient
	public String getStatus(){
		return this.status;
	}
	
	/**
	 * 결과상태
	 * 
	 * @param status 결과상태
	 */
	public void setStatus(String status){
		this.status= status;
		this.setIsSet_status(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_code= false;
	protected final boolean isSet_code(){
		return this.isSet_code;
	}
	private void setIsSet_code(boolean value){
		this.isSet_code= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getCode(){
		return this.code;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param code 결과코드
	 */
	public void setCode(String code){
		this.code= code;
		this.setIsSet_code(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msg= false;
	protected final boolean isSet_msg(){
		return this.isSet_msg;
	}
	private void setIsSet_msg(boolean value){
		this.isSet_msg= value;
	}
	/**
	 * 결과코드내용
	 */
	@XmlTransient
	public String getMsg(){
		return this.msg;
	}
	
	/**
	 * 결과코드내용
	 * 
	 * @param msg 결과코드내용
	 */
	public void setMsg(String msg){
		this.msg= msg;
		this.setIsSet_msg(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appUserId= false;
	protected final boolean isSet_appUserId(){
		return this.isSet_appUserId;
	}
	private void setIsSet_appUserId(boolean value){
		this.isSet_appUserId= value;
	}
	/**
	 * 앱유저ID
	 */
	@XmlTransient
	public String getAppUserId(){
		return this.appUserId;
	}
	
	/**
	 * 앱유저ID
	 * 
	 * @param appUserId 앱유저ID
	 */
	public void setAppUserId(String appUserId){
		this.appUserId= appUserId;
		this.setIsSet_appUserId(true);
	}
				
	@Override
	public NtfcFavt_DODT clone(){
		try{
			NtfcFavt_DODT object= (NtfcFavt_DODT)super.clone();
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
		
		result= prime * result + ((this.status==null)?0:this.status.hashCode());
		result= prime * result + ((this.code==null)?0:this.code.hashCode());
		result= prime * result + ((this.msg==null)?0:this.msg.hashCode());
		result= prime * result + ((this.appUserId==null)?0:this.appUserId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcFavt_DODT other= (NtfcFavt_DODT)obj;
		{
			Object _status= getStatus();
			Object __status= other.getStatus();
			if ( _status== null ) { if ( __status!= null ) return false; }
			else if ( !_status.equals(__status) ) return false;
		}
		{
			Object _code= getCode();
			Object __code= other.getCode();
			if ( _code== null ) { if ( __code!= null ) return false; }
			else if ( !_code.equals(__code) ) return false;
		}
		{
			Object _msg= getMsg();
			Object __msg= other.getMsg();
			if ( _msg== null ) { if ( __msg!= null ) return false; }
			else if ( !_msg.equals(__msg) ) return false;
		}
		{
			Object _appUserId= getAppUserId();
			Object __appUserId= other.getAppUserId();
			if ( _appUserId== null ) { if ( __appUserId!= null ) return false; }
			else if ( !_appUserId.equals(__appUserId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcFavt_DODT.class.getName()).append(":\n");
		sb.append("\tstatus: ");
		sb.append(status==null?"null":getStatus());
		sb.append("\n");
		sb.append("\tcode: ");
		sb.append(code==null?"null":getCode());
		sb.append("\n");
		sb.append("\tmsg: ");
		sb.append(msg==null?"null":getMsg());
		sb.append("\n");
		sb.append("\tappUserId: ");
		sb.append(appUserId==null?"null":getAppUserId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* status */
		messageLen+= 7; /* code */
		messageLen+= 500; /* msg */
		messageLen+= 100; /* appUserId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("status");
		list.add("code");
		list.add("msg");
		list.add("appUserId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("status", get("status"));
		map.put("code", get("code"));
		map.put("msg", get("msg"));
		map.put("appUserId", get("appUserId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -892481550:/* status */
			return getStatus();
		case 3059181:/* code */
			return getCode();
		case 108417:/* msg */
			return getMsg();
		case 1555806151:/* appUserId */
			return getAppUserId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -892481550:/* status */
			setStatus((String)value);
			break;
		case 3059181:/* code */
			setCode((String)value);
			break;
		case 108417:/* msg */
			setMsg((String)value);
			break;
		case 1555806151:/* appUserId */
			setAppUserId((String)value);
			break;
		default:
			break;
		}
	}
	
}
