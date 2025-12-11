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
 * PUSH 알림 설정 조회 IO
 */
@XmlType(propOrder={
	"appDscd", "userId"
}, name="NtfcDpsEst_DIDT")
@XmlRootElement(name="NtfcDpsEst_DIDT")
@BxmCategory(logicalName="알림.수신설정.DBM.입력.IO", description="PUSH 알림 설정 조회 IO") 
public class NtfcDpsEst_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1481163266L;
	
	
	
	/**
	 * 앱구분코드
	 */
	@ApiModelProperty(
		name = "appDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appDscd")
	@BxmOmm_Field(length=1, decimal=0, description="앱구분코드", align="left", fill="")
	private String appDscd= "";
	
	
	/**
	 * 사용자ID
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=320, decimal=0, description="사용자ID", align="left", fill="")
	private String userId= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appDscd= false;
	protected final boolean isSet_appDscd(){
		return this.isSet_appDscd;
	}
	private void setIsSet_appDscd(boolean value){
		this.isSet_appDscd= value;
	}
	/**
	 * 앱구분코드
	 */
	@XmlTransient
	public String getAppDscd(){
		return this.appDscd;
	}
	
	/**
	 * 앱구분코드
	 * 
	 * @param appDscd 앱구분코드
	 */
	public void setAppDscd(String appDscd){
		this.appDscd= appDscd;
		this.setIsSet_appDscd(true);
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
				
	@Override
	public NtfcDpsEst_DIDT clone(){
		try{
			NtfcDpsEst_DIDT object= (NtfcDpsEst_DIDT)super.clone();
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
		
		result= prime * result + ((this.appDscd==null)?0:this.appDscd.hashCode());
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcDpsEst_DIDT other= (NtfcDpsEst_DIDT)obj;
		{
			Object _appDscd= getAppDscd();
			Object __appDscd= other.getAppDscd();
			if ( _appDscd== null ) { if ( __appDscd!= null ) return false; }
			else if ( !_appDscd.equals(__appDscd) ) return false;
		}
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcDpsEst_DIDT.class.getName()).append(":\n");
		sb.append("\tappDscd: ");
		sb.append(appDscd==null?"null":getAppDscd());
		sb.append("\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* appDscd */
		messageLen+= 320; /* userId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("appDscd");
		list.add("userId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("appDscd", get("appDscd"));
		map.put("userId", get("userId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -794417423:/* appDscd */
			return getAppDscd();
		case -836030906:/* userId */
			return getUserId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -794417423:/* appDscd */
			setAppDscd((String)value);
			break;
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		default:
			break;
		}
	}
	
}
