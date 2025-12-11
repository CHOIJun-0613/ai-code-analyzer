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
 * 카카오버튼정보목록DTO
 */
@XmlType(propOrder={
	"type", "name", "url_pc", "url_mobile"
}, name="INBKkoBtnInfList_DTO")
@XmlRootElement(name="INBKkoBtnInfList_DTO")
@BxmCategory(logicalName="카카오버튼정보목록DTO", description="카카오버튼정보목록DTO") 
public class INBKkoBtnInfList_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -448844635L;
	
	
	
	/**
	 * 타입
	 */
	@ApiModelProperty(
		name = "type"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("type")
	@BxmOmm_Field(length=10, decimal=0, description="타입", align="left", fill="")
	private String type= "";
	
	
	/**
	 * 이름
	 */
	@ApiModelProperty(
		name = "name"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("name")
	@BxmOmm_Field(length=500, decimal=0, description="이름", align="left", fill="")
	private String name= "";
	
	
	/**
	 * url_pc
	 */
	@ApiModelProperty(
		name = "url_pc"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("url_pc")
	@BxmOmm_Field(length=1000, decimal=0, description="url_pc", align="left", fill="")
	private String url_pc= "";
	
	
	/**
	 * url_mobile
	 */
	@ApiModelProperty(
		name = "url_mobile"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("url_mobile")
	@BxmOmm_Field(length=1000, decimal=0, description="url_mobile", align="left", fill="")
	private String url_mobile= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_type= false;
	protected final boolean isSet_type(){
		return this.isSet_type;
	}
	private void setIsSet_type(boolean value){
		this.isSet_type= value;
	}
	/**
	 * 타입
	 */
	@XmlTransient
	public String getType(){
		return this.type;
	}
	
	/**
	 * 타입
	 * 
	 * @param type 타입
	 */
	public void setType(String type){
		this.type= type;
		this.setIsSet_type(true);
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
	private boolean isSet_url_pc= false;
	protected final boolean isSet_url_pc(){
		return this.isSet_url_pc;
	}
	private void setIsSet_url_pc(boolean value){
		this.isSet_url_pc= value;
	}
	/**
	 * url_pc
	 */
	@XmlTransient
	public String getUrl_pc(){
		return this.url_pc;
	}
	
	/**
	 * url_pc
	 * 
	 * @param url_pc url_pc
	 */
	public void setUrl_pc(String url_pc){
		this.url_pc= url_pc;
		this.setIsSet_url_pc(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_url_mobile= false;
	protected final boolean isSet_url_mobile(){
		return this.isSet_url_mobile;
	}
	private void setIsSet_url_mobile(boolean value){
		this.isSet_url_mobile= value;
	}
	/**
	 * url_mobile
	 */
	@XmlTransient
	public String getUrl_mobile(){
		return this.url_mobile;
	}
	
	/**
	 * url_mobile
	 * 
	 * @param url_mobile url_mobile
	 */
	public void setUrl_mobile(String url_mobile){
		this.url_mobile= url_mobile;
		this.setIsSet_url_mobile(true);
	}
				
	@Override
	public INBKkoBtnInfList_DTO clone(){
		try{
			INBKkoBtnInfList_DTO object= (INBKkoBtnInfList_DTO)super.clone();
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
		
		result= prime * result + ((this.type==null)?0:this.type.hashCode());
		result= prime * result + ((this.name==null)?0:this.name.hashCode());
		result= prime * result + ((this.url_pc==null)?0:this.url_pc.hashCode());
		result= prime * result + ((this.url_mobile==null)?0:this.url_mobile.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBKkoBtnInfList_DTO other= (INBKkoBtnInfList_DTO)obj;
		{
			Object _type= getType();
			Object __type= other.getType();
			if ( _type== null ) { if ( __type!= null ) return false; }
			else if ( !_type.equals(__type) ) return false;
		}
		{
			Object _name= getName();
			Object __name= other.getName();
			if ( _name== null ) { if ( __name!= null ) return false; }
			else if ( !_name.equals(__name) ) return false;
		}
		{
			Object _url_pc= getUrl_pc();
			Object __url_pc= other.getUrl_pc();
			if ( _url_pc== null ) { if ( __url_pc!= null ) return false; }
			else if ( !_url_pc.equals(__url_pc) ) return false;
		}
		{
			Object _url_mobile= getUrl_mobile();
			Object __url_mobile= other.getUrl_mobile();
			if ( _url_mobile== null ) { if ( __url_mobile!= null ) return false; }
			else if ( !_url_mobile.equals(__url_mobile) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBKkoBtnInfList_DTO.class.getName()).append(":\n");
		sb.append("\ttype: ");
		sb.append(type==null?"null":getType());
		sb.append("\n");
		sb.append("\tname: ");
		sb.append(name==null?"null":getName());
		sb.append("\n");
		sb.append("\turl_pc: ");
		sb.append(url_pc==null?"null":getUrl_pc());
		sb.append("\n");
		sb.append("\turl_mobile: ");
		sb.append(url_mobile==null?"null":getUrl_mobile());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* type */
		messageLen+= 500; /* name */
		messageLen+= 1000; /* url_pc */
		messageLen+= 1000; /* url_mobile */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("type");
		list.add("name");
		list.add("url_pc");
		list.add("url_mobile");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("type", get("type"));
		map.put("name", get("name"));
		map.put("url_pc", get("url_pc"));
		map.put("url_mobile", get("url_mobile"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3575610:/* type */
			return getType();
		case 3373707:/* name */
			return getName();
		case -836762941:/* url_pc */
			return getUrl_pc();
		case -524051086:/* url_mobile */
			return getUrl_mobile();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3575610:/* type */
			setType((String)value);
			break;
		case 3373707:/* name */
			setName((String)value);
			break;
		case -836762941:/* url_pc */
			setUrl_pc((String)value);
			break;
		case -524051086:/* url_mobile */
			setUrl_mobile((String)value);
			break;
		default:
			break;
		}
	}
	
}
