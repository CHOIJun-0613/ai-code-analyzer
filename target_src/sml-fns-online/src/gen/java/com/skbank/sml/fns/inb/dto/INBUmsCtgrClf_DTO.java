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

/**
 * UMS카테고리분류코드DTO
 */
@XmlType(propOrder={
	"code", "msg", "msgs", "appUserId"
}, name="INBUmsCtgrClf_DTO")
@XmlRootElement(name="INBUmsCtgrClf_DTO")
@BxmCategory(logicalName="UMS카테고리분류코드DTO", description="UMS카테고리분류코드DTO") 
public class INBUmsCtgrClf_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1335350739L;
	
	
	
	/**
	 * 리턴코드
	 */
	@ApiModelProperty(
		name = "code"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("code")
	@BxmOmm_Field(length=3, decimal=0, description="리턴코드", align="left", fill="")
	private String code= "";
	
	
	/**
	 * 리턴메시지
	 */
	@ApiModelProperty(
		name = "msg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msg")
	@BxmOmm_Field(length=1000, decimal=0, description="리턴메시지", align="left", fill="")
	private String msg= "";
	
	
	/**
	 * 분류코드목록
	 */
	@ApiModelProperty(
		name = "msgs"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBUmsCtgrClfGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("msgs")
	@BxmOmm_Field(length=0, decimal=0, description="분류코드목록", align="left", fill="", arrayReference="1")
	private List<INBUmsCtgrClfGrid_DTO> msgs= new ArrayList<>();
	
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
	private boolean isSet_code= false;
	protected final boolean isSet_code(){
		return this.isSet_code;
	}
	private void setIsSet_code(boolean value){
		this.isSet_code= value;
	}
	/**
	 * 리턴코드
	 */
	@XmlTransient
	public String getCode(){
		return this.code;
	}
	
	/**
	 * 리턴코드
	 * 
	 * @param code 리턴코드
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
	 * 리턴메시지
	 */
	@XmlTransient
	public String getMsg(){
		return this.msg;
	}
	
	/**
	 * 리턴메시지
	 * 
	 * @param msg 리턴메시지
	 */
	public void setMsg(String msg){
		this.msg= msg;
		this.setIsSet_msg(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgs= false;
	protected final boolean isSet_msgs(){
		return this.isSet_msgs;
	}
	private void setIsSet_msgs(boolean value){
		this.isSet_msgs= value;
	}
	/**
	 * 분류코드목록
	 */
	@XmlTransient
	public List<INBUmsCtgrClfGrid_DTO> getMsgs(){
		return msgs;
	}
	
	/**
	 * 분류코드목록
	 * 
	 * @param msgs 분류코드목록
	 */
	@JsonSetter("msgs")
	public void setMsgs(List<INBUmsCtgrClfGrid_DTO> msgs){
		this.msgs= msgs;
		this.setIsSet_msgs(true);
	}
	
	public void setMsgs(INBUmsCtgrClfGrid_DTO... items){
		List<INBUmsCtgrClfGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBUmsCtgrClfGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setMsgs(_items);
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
	public INBUmsCtgrClf_DTO clone(){
		try{
			INBUmsCtgrClf_DTO object= (INBUmsCtgrClf_DTO)super.clone();
			if ( this.msgs== null ) object.msgs= null;
			else{
				List<INBUmsCtgrClfGrid_DTO> clonedList= new ArrayList<>(this.msgs.size());
				for( INBUmsCtgrClfGrid_DTO item : msgs ){
					clonedList.add((INBUmsCtgrClfGrid_DTO)item.clone());
				}
				object.msgs= clonedList;
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
		
		result= prime * result + ((this.code==null)?0:this.code.hashCode());
		result= prime * result + ((this.msg==null)?0:this.msg.hashCode());
		result= prime * result + ((this.msgs==null)?0:this.msgs.hashCode());
		result= prime * result + ((this.appUserId==null)?0:this.appUserId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBUmsCtgrClf_DTO other= (INBUmsCtgrClf_DTO)obj;
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
			Object _msgs= getMsgs();
			Object __msgs= other.getMsgs();
			if ( _msgs== null ) { if ( __msgs!= null ) return false; }
			else if ( !_msgs.equals(__msgs) ) return false;
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
	
		sb.append("\n[").append(INBUmsCtgrClf_DTO.class.getName()).append(":\n");
		sb.append("\tcode: ");
		sb.append(code==null?"null":getCode());
		sb.append("\n");
		sb.append("\tmsg: ");
		sb.append(msg==null?"null":getMsg());
		sb.append("\n");
		sb.append("\tmsgs: ");
		if ( msgs== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(msgs.size());
			sb.append("(items)\n");
	
			int max= (10<msgs.size())?10:msgs.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmsgs[");
				sb.append(i);
				sb.append("] : ");
				sb.append(msgs.get(i));
				sb.append("\n");
			}
	
			if ( max < msgs.size() ){
				sb.append("\tmsgs[.] : ").append("more ").append((msgs.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tappUserId: ");
		sb.append(appUserId==null?"null":getAppUserId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* code */
		messageLen+= 1000; /* msg */
		{/*msgs*/
			int size=1;
			int count= msgs == null ? 0 : msgs.size();
			int min= size > count?count:size;
			INBUmsCtgrClfGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBUmsCtgrClfGrid_DTO element= msgs.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBUmsCtgrClfGrid_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 100; /* appUserId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("code");
		list.add("msg");
		list.add("msgs");
		list.add("appUserId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("code", get("code"));
		map.put("msg", get("msg"));
		map.put("msgs", get("msgs"));
		map.put("appUserId", get("appUserId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3059181:/* code */
			return getCode();
		case 108417:/* msg */
			return getMsg();
		case 3361042:/* msgs */
			return getMsgs();
		case 1555806151:/* appUserId */
			return getAppUserId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3059181:/* code */
			setCode((String)value);
			break;
		case 108417:/* msg */
			setMsg((String)value);
			break;
		case 3361042:/* msgs */
			setMsgs((List<INBUmsCtgrClfGrid_DTO>)value);
			break;
		case 1555806151:/* appUserId */
			setAppUserId((String)value);
			break;
		default:
			break;
		}
	}
	
}
