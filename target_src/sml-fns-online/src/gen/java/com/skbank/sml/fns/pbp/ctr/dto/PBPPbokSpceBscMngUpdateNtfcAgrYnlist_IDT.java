/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"acno", "ntfcYn"
}, name="PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT")
@XmlRootElement(name="PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT")
@BxmCategory(logicalName="공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -936663926L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 알림여부
	 */
	@ApiModelProperty(
		name = "ntfcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcYn")
	@BxmOmm_Field(length=10, decimal=0, description="알림여부", align="left", fill="")
	private String ntfcYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcYn= false;
	protected final boolean isSet_ntfcYn(){
		return this.isSet_ntfcYn;
	}
	private void setIsSet_ntfcYn(boolean value){
		this.isSet_ntfcYn= value;
	}
	/**
	 * 알림여부
	 */
	@XmlTransient
	public String getNtfcYn(){
		return this.ntfcYn;
	}
	
	/**
	 * 알림여부
	 * 
	 * @param ntfcYn 알림여부
	 */
	public void setNtfcYn(String ntfcYn){
		this.ntfcYn= ntfcYn;
		this.setIsSet_ntfcYn(true);
	}
				
	@Override
	public PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT clone(){
		try{
			PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT object= (PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT)super.clone();
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.ntfcYn==null)?0:this.ntfcYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT other= (PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _ntfcYn= getNtfcYn();
			Object __ntfcYn= other.getNtfcYn();
			if ( _ntfcYn== null ) { if ( __ntfcYn!= null ) return false; }
			else if ( !_ntfcYn.equals(__ntfcYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tntfcYn: ");
		sb.append(ntfcYn==null?"null":getNtfcYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 10; /* ntfcYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("ntfcYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("ntfcYn", get("ntfcYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -1035495560:/* ntfcYn */
			return getNtfcYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1035495560:/* ntfcYn */
			setNtfcYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
