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
 * 카테고리분류조회IDT
 */
@XmlType(propOrder={
	"ntfcDscd", "itcsno"
}, name="INBNtfbxListInqSelectCtgrClf_IDT")
@XmlRootElement(name="INBNtfbxListInqSelectCtgrClf_IDT")
@BxmCategory(logicalName="카테고리분류조회IDT", description="카테고리분류조회IDT") 
public class INBNtfbxListInqSelectCtgrClf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 956786407L;
	
	
	
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
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
				
	@Override
	public INBNtfbxListInqSelectCtgrClf_IDT clone(){
		try{
			INBNtfbxListInqSelectCtgrClf_IDT object= (INBNtfbxListInqSelectCtgrClf_IDT)super.clone();
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
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectCtgrClf_IDT other= (INBNtfbxListInqSelectCtgrClf_IDT)obj;
		{
			Object _ntfcDscd= getNtfcDscd();
			Object __ntfcDscd= other.getNtfcDscd();
			if ( _ntfcDscd== null ) { if ( __ntfcDscd!= null ) return false; }
			else if ( !_ntfcDscd.equals(__ntfcDscd) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectCtgrClf_IDT.class.getName()).append(":\n");
		sb.append("\tntfcDscd: ");
		sb.append(ntfcDscd==null?"null":getNtfcDscd());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* ntfcDscd */
		messageLen+= 36; /* itcsno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfcDscd");
		list.add("itcsno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfcDscd", get("ntfcDscd"));
		map.put("itcsno", get("itcsno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1320561875:/* ntfcDscd */
			return getNtfcDscd();
		case -1178714660:/* itcsno */
			return getItcsno();
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
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		default:
			break;
		}
	}
	
}
