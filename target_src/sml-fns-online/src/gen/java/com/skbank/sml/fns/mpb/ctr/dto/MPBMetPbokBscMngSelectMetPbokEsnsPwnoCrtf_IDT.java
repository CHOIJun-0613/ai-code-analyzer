/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"encyPinPwno", "e2EPid"
}, name="MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT")
@BxmCategory(logicalName="모임통장.간편비밀번호.인증.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2089953494L;
	
	
	
	/**
	 * 암호화핀비밀번호
	 */
	@ApiModelProperty(
		name = "encyPinPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyPinPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화핀비밀번호", align="left", fill="")
	private String encyPinPwno= "";
	
	
	/**
	 * 기기식별검증PID
	 */
	@ApiModelProperty(
		name = "e2EPid"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("e2EPid")
	@BxmOmm_Field(length=50, decimal=0, description="기기식별검증PID", align="left", fill="")
	private String e2EPid= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyPinPwno= false;
	protected final boolean isSet_encyPinPwno(){
		return this.isSet_encyPinPwno;
	}
	private void setIsSet_encyPinPwno(boolean value){
		this.isSet_encyPinPwno= value;
	}
	/**
	 * 암호화핀비밀번호
	 */
	@XmlTransient
	public String getEncyPinPwno(){
		return this.encyPinPwno;
	}
	
	/**
	 * 암호화핀비밀번호
	 * 
	 * @param encyPinPwno 암호화핀비밀번호
	 */
	public void setEncyPinPwno(String encyPinPwno){
		this.encyPinPwno= encyPinPwno;
		this.setIsSet_encyPinPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_e2EPid= false;
	protected final boolean isSet_e2EPid(){
		return this.isSet_e2EPid;
	}
	private void setIsSet_e2EPid(boolean value){
		this.isSet_e2EPid= value;
	}
	/**
	 * 기기식별검증PID
	 */
	@XmlTransient
	public String getE2EPid(){
		return this.e2EPid;
	}
	
	/**
	 * 기기식별검증PID
	 * 
	 * @param e2EPid 기기식별검증PID
	 */
	public void setE2EPid(String e2EPid){
		this.e2EPid= e2EPid;
		this.setIsSet_e2EPid(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT object= (MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT)super.clone();
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
		
		result= prime * result + ((this.encyPinPwno==null)?0:this.encyPinPwno.hashCode());
		result= prime * result + ((this.e2EPid==null)?0:this.e2EPid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT other= (MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT)obj;
		{
			Object _encyPinPwno= getEncyPinPwno();
			Object __encyPinPwno= other.getEncyPinPwno();
			if ( _encyPinPwno== null ) { if ( __encyPinPwno!= null ) return false; }
			else if ( !_encyPinPwno.equals(__encyPinPwno) ) return false;
		}
		{
			Object _e2EPid= getE2EPid();
			Object __e2EPid= other.getE2EPid();
			if ( _e2EPid== null ) { if ( __e2EPid!= null ) return false; }
			else if ( !_e2EPid.equals(__e2EPid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT.class.getName()).append(":\n");
		sb.append("\tencyPinPwno: ");
		sb.append(encyPinPwno==null?"null":getEncyPinPwno());
		sb.append("\n");
		sb.append("\te2EPid: ");
		sb.append(e2EPid==null?"null":getE2EPid());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 32; /* encyPinPwno */
		messageLen+= 50; /* e2EPid */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("encyPinPwno");
		list.add("e2EPid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("encyPinPwno", get("encyPinPwno"));
		map.put("e2EPid", get("e2EPid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1728177502:/* encyPinPwno */
			return getEncyPinPwno();
		case -1355111181:/* e2EPid */
			return getE2EPid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1728177502:/* encyPinPwno */
			setEncyPinPwno((String)value);
			break;
		case -1355111181:/* e2EPid */
			setE2EPid((String)value);
			break;
		default:
			break;
		}
	}
	
}
