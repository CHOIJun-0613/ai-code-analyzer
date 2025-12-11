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
 * 알림열람여부 DIDT
 */
@XmlType(propOrder={
	"code", "msg", "status"
}, name="NtfcReadYn_DODT")
@XmlRootElement(name="NtfcReadYn_DODT")
@BxmCategory(logicalName="알림열람여부 DIDT", description="알림열람여부 DIDT") 
public class NtfcReadYn_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1149744292L;
	
	
	
	/**
	 * 상태
	 */
	@ApiModelProperty(
		name = "code"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("code")
	@BxmOmm_Field(length=5, decimal=0, description="상태", align="left", fill="")
	private String code= "";
	
	
	/**
	 * 결과메시지
	 */
	@ApiModelProperty(
		name = "msg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msg")
	@BxmOmm_Field(length=100, decimal=0, description="결과메시지", align="left", fill="")
	private String msg= "";
	
	
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
	 * 상태
	 */
	@XmlTransient
	public String getCode(){
		return this.code;
	}
	
	/**
	 * 상태
	 * 
	 * @param code 상태
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
	 * 결과메시지
	 */
	@XmlTransient
	public String getMsg(){
		return this.msg;
	}
	
	/**
	 * 결과메시지
	 * 
	 * @param msg 결과메시지
	 */
	public void setMsg(String msg){
		this.msg= msg;
		this.setIsSet_msg(true);
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
				
	@Override
	public NtfcReadYn_DODT clone(){
		try{
			NtfcReadYn_DODT object= (NtfcReadYn_DODT)super.clone();
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
		
		result= prime * result + ((this.code==null)?0:this.code.hashCode());
		result= prime * result + ((this.msg==null)?0:this.msg.hashCode());
		result= prime * result + ((this.status==null)?0:this.status.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcReadYn_DODT other= (NtfcReadYn_DODT)obj;
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
			Object _status= getStatus();
			Object __status= other.getStatus();
			if ( _status== null ) { if ( __status!= null ) return false; }
			else if ( !_status.equals(__status) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcReadYn_DODT.class.getName()).append(":\n");
		sb.append("\tcode: ");
		sb.append(code==null?"null":getCode());
		sb.append("\n");
		sb.append("\tmsg: ");
		sb.append(msg==null?"null":getMsg());
		sb.append("\n");
		sb.append("\tstatus: ");
		sb.append(status==null?"null":getStatus());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* code */
		messageLen+= 100; /* msg */
		messageLen+= 10; /* status */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("code");
		list.add("msg");
		list.add("status");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("code", get("code"));
		map.put("msg", get("msg"));
		map.put("status", get("status"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3059181:/* code */
			return getCode();
		case 108417:/* msg */
			return getMsg();
		case -892481550:/* status */
			return getStatus();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3059181:/* code */
			setCode((String)value);
			break;
		case 108417:/* msg */
			setMsg((String)value);
			break;
		case -892481550:/* status */
			setStatus((String)value);
			break;
		default:
			break;
		}
	}
	
}
