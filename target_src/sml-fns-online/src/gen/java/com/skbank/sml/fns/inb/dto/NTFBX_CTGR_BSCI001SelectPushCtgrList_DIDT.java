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
 * PUSH카테고리목록조회DIDT
 */
@XmlType(propOrder={
	"ntfcDscd"
}, name="NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT")
@XmlRootElement(name="NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT")
@BxmCategory(logicalName="PUSH카테고리목록조회DIDT", description="PUSH카테고리목록조회DIDT") 
public class NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -69542956L;
	
	
	
	/**
	 * 알림구분코드
	 */
	@ApiModelProperty(
		name = "ntfcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcDscd")
	@BxmOmm_Field(length=1, decimal=0, description="알림구분코드", align="left", fill="")
	private String ntfcDscd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcDscd= false;
	protected final boolean isSet_ntfcDscd(){
		return this.isSet_ntfcDscd;
	}
	private void setIsSet_ntfcDscd(boolean value){
		this.isSet_ntfcDscd= value;
	}
	/**
	 * 알림구분코드
	 */
	@XmlTransient
	public String getNtfcDscd(){
		return this.ntfcDscd;
	}
	
	/**
	 * 알림구분코드
	 * 
	 * @param ntfcDscd 알림구분코드
	 */
	public void setNtfcDscd(String ntfcDscd){
		this.ntfcDscd= ntfcDscd;
		this.setIsSet_ntfcDscd(true);
	}
				
	@Override
	public NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT clone(){
		try{
			NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT object= (NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT)super.clone();
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
		
		result= prime * result + ((this.ntfcDscd==null)?0:this.ntfcDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT other= (NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT)obj;
		{
			Object _ntfcDscd= getNtfcDscd();
			Object __ntfcDscd= other.getNtfcDscd();
			if ( _ntfcDscd== null ) { if ( __ntfcDscd!= null ) return false; }
			else if ( !_ntfcDscd.equals(__ntfcDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT.class.getName()).append(":\n");
		sb.append("\tntfcDscd: ");
		sb.append(ntfcDscd==null?"null":getNtfcDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* ntfcDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfcDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfcDscd", get("ntfcDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1320561875:/* ntfcDscd */
			return getNtfcDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1320561875:/* ntfcDscd */
			setNtfcDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
