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
 * 알림읽음여부GRID DTO
 */
@XmlType(propOrder={
	"umsTrno", "umsReqDt", "msgId"
}, name="INBNtfcReadYnGrid_DTO")
@XmlRootElement(name="INBNtfcReadYnGrid_DTO")
@BxmCategory(logicalName="알림읽음여부GRID DTO", description="알림읽음여부GRID DTO") 
public class INBNtfcReadYnGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1228948961L;
	
	
	
	/**
	 * UMS트렌젝션번호
	 */
	@ApiModelProperty(
		name = "umsTrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsTrno")
	@BxmOmm_Field(length=20, decimal=0, description="UMS트렌젝션번호", align="left", fill="")
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
	 * 메시지ID
	 */
	@ApiModelProperty(
		name = "msgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgId")
	@BxmOmm_Field(length=20, decimal=0, description="메시지ID", align="left", fill="")
	private String msgId= "";
	
	
	
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
	 * UMS트렌젝션번호
	 */
	@XmlTransient
	public String getUmsTrno(){
		return this.umsTrno;
	}
	
	/**
	 * UMS트렌젝션번호
	 * 
	 * @param umsTrno UMS트렌젝션번호
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
				
	@Override
	public INBNtfcReadYnGrid_DTO clone(){
		try{
			INBNtfcReadYnGrid_DTO object= (INBNtfcReadYnGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		result= prime * result + ((this.msgId==null)?0:this.msgId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfcReadYnGrid_DTO other= (INBNtfcReadYnGrid_DTO)obj;
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
			Object _msgId= getMsgId();
			Object __msgId= other.getMsgId();
			if ( _msgId== null ) { if ( __msgId!= null ) return false; }
			else if ( !_msgId.equals(__msgId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfcReadYnGrid_DTO.class.getName()).append(":\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("\tmsgId: ");
		sb.append(msgId==null?"null":getMsgId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
		messageLen+= 20; /* msgId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("umsTrno");
		list.add("umsReqDt");
		list.add("msgId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
		map.put("msgId", get("msgId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
		case 104191100:/* msgId */
			return getMsgId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		case 104191100:/* msgId */
			setMsgId((String)value);
			break;
		default:
			break;
		}
	}
	
}
