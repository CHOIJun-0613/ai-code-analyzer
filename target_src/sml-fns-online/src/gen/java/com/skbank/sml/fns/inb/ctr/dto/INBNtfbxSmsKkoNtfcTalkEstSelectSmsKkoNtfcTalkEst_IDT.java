/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
 * SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO
 */
@XmlType(propOrder={
	"smsSrvcNtfcId"
}, name="INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT")
@XmlRootElement(name="INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT")
@BxmCategory(logicalName="SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO", description="SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO") 
public class INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1038578540L;
	
	
	
	/**
	 * SMS서비스알림ID
	 */
	@ApiModelProperty(
		name = "smsSrvcNtfcId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsSrvcNtfcId")
	@BxmOmm_Field(length=10, decimal=0, description="SMS서비스알림ID", align="left", fill="")
	private String smsSrvcNtfcId= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsSrvcNtfcId= false;
	protected final boolean isSet_smsSrvcNtfcId(){
		return this.isSet_smsSrvcNtfcId;
	}
	private void setIsSet_smsSrvcNtfcId(boolean value){
		this.isSet_smsSrvcNtfcId= value;
	}
	/**
	 * SMS서비스알림ID
	 */
	@XmlTransient
	public String getSmsSrvcNtfcId(){
		return this.smsSrvcNtfcId;
	}
	
	/**
	 * SMS서비스알림ID
	 * 
	 * @param smsSrvcNtfcId SMS서비스알림ID
	 */
	public void setSmsSrvcNtfcId(String smsSrvcNtfcId){
		this.smsSrvcNtfcId= smsSrvcNtfcId;
		this.setIsSet_smsSrvcNtfcId(true);
	}
				
	@Override
	public INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT clone(){
		try{
			INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT object= (INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT)super.clone();
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
		
		result= prime * result + ((this.smsSrvcNtfcId==null)?0:this.smsSrvcNtfcId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT other= (INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT)obj;
		{
			Object _smsSrvcNtfcId= getSmsSrvcNtfcId();
			Object __smsSrvcNtfcId= other.getSmsSrvcNtfcId();
			if ( _smsSrvcNtfcId== null ) { if ( __smsSrvcNtfcId!= null ) return false; }
			else if ( !_smsSrvcNtfcId.equals(__smsSrvcNtfcId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT.class.getName()).append(":\n");
		sb.append("\tsmsSrvcNtfcId: ");
		sb.append(smsSrvcNtfcId==null?"null":getSmsSrvcNtfcId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* smsSrvcNtfcId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("smsSrvcNtfcId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("smsSrvcNtfcId", get("smsSrvcNtfcId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1795479587:/* smsSrvcNtfcId */
			return getSmsSrvcNtfcId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1795479587:/* smsSrvcNtfcId */
			setSmsSrvcNtfcId((String)value);
			break;
		default:
			break;
		}
	}
	
}
