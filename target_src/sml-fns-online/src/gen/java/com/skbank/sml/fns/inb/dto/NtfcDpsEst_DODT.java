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
 * 알림함 동의 여부 조회 io
 */
@XmlType(propOrder={
	"aplDscd", "langCd"
}, name="NtfcDpsEst_DODT")
@XmlRootElement(name="NtfcDpsEst_DODT")
@BxmCategory(logicalName="알림.수신설정.DBM.출력.IO", description="알림함 동의 여부 조회 io") 
public class NtfcDpsEst_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1481169032L;
	
	
	
	/**
	 * 업무구분코드
	 */
	@ApiModelProperty(
		name = "aplDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aplDscd")
	@BxmOmm_Field(length=10, decimal=0, description="업무구분코드", align="left", fill="")
	private String aplDscd= "";
	
	
	/**
	 * 언어구분코드
	 */
	@ApiModelProperty(
		name = "langCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("langCd")
	@BxmOmm_Field(length=2, decimal=0, description="언어구분코드", align="left", fill="")
	private String langCd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aplDscd= false;
	protected final boolean isSet_aplDscd(){
		return this.isSet_aplDscd;
	}
	private void setIsSet_aplDscd(boolean value){
		this.isSet_aplDscd= value;
	}
	/**
	 * 업무구분코드
	 */
	@XmlTransient
	public String getAplDscd(){
		return this.aplDscd;
	}
	
	/**
	 * 업무구분코드
	 * 
	 * @param aplDscd 업무구분코드
	 */
	public void setAplDscd(String aplDscd){
		this.aplDscd= aplDscd;
		this.setIsSet_aplDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_langCd= false;
	protected final boolean isSet_langCd(){
		return this.isSet_langCd;
	}
	private void setIsSet_langCd(boolean value){
		this.isSet_langCd= value;
	}
	/**
	 * 언어구분코드
	 */
	@XmlTransient
	public String getLangCd(){
		return this.langCd;
	}
	
	/**
	 * 언어구분코드
	 * 
	 * @param langCd 언어구분코드
	 */
	public void setLangCd(String langCd){
		this.langCd= langCd;
		this.setIsSet_langCd(true);
	}
				
	@Override
	public NtfcDpsEst_DODT clone(){
		try{
			NtfcDpsEst_DODT object= (NtfcDpsEst_DODT)super.clone();
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
		
		result= prime * result + ((this.aplDscd==null)?0:this.aplDscd.hashCode());
		result= prime * result + ((this.langCd==null)?0:this.langCd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcDpsEst_DODT other= (NtfcDpsEst_DODT)obj;
		{
			Object _aplDscd= getAplDscd();
			Object __aplDscd= other.getAplDscd();
			if ( _aplDscd== null ) { if ( __aplDscd!= null ) return false; }
			else if ( !_aplDscd.equals(__aplDscd) ) return false;
		}
		{
			Object _langCd= getLangCd();
			Object __langCd= other.getLangCd();
			if ( _langCd== null ) { if ( __langCd!= null ) return false; }
			else if ( !_langCd.equals(__langCd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcDpsEst_DODT.class.getName()).append(":\n");
		sb.append("\taplDscd: ");
		sb.append(aplDscd==null?"null":getAplDscd());
		sb.append("\n");
		sb.append("\tlangCd: ");
		sb.append(langCd==null?"null":getLangCd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* aplDscd */
		messageLen+= 2; /* langCd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("aplDscd");
		list.add("langCd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("aplDscd", get("aplDscd"));
		map.put("langCd", get("langCd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -798111507:/* aplDscd */
			return getAplDscd();
		case -1110059281:/* langCd */
			return getLangCd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -798111507:/* aplDscd */
			setAplDscd((String)value);
			break;
		case -1110059281:/* langCd */
			setLangCd((String)value);
			break;
		default:
			break;
		}
	}
	
}
