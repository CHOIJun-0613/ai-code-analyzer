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
 * 알림함응답결과ODTD
 */
@XmlType(propOrder={
	"rtcd", "rtcdTxt"
}, name="INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT")
@BxmCategory(logicalName="알림함응답결과ODTD", description="알림함응답결과ODTD") 
public class INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1516609493L;
	
	
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "rtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcd")
	@BxmOmm_Field(length=7, decimal=0, description="결과코드", align="left", fill="")
	private String rtcd= "";
	
	
	/**
	 * 결과코드내용 
	 */
	@ApiModelProperty(
		name = "rtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcdTxt")
	@BxmOmm_Field(length=100, decimal=0, description="결과코드내용 ", align="left", fill="")
	private String rtcdTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcd= false;
	protected final boolean isSet_rtcd(){
		return this.isSet_rtcd;
	}
	private void setIsSet_rtcd(boolean value){
		this.isSet_rtcd= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getRtcd(){
		return this.rtcd;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param rtcd 결과코드
	 */
	public void setRtcd(String rtcd){
		this.rtcd= rtcd;
		this.setIsSet_rtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcdTxt= false;
	protected final boolean isSet_rtcdTxt(){
		return this.isSet_rtcdTxt;
	}
	private void setIsSet_rtcdTxt(boolean value){
		this.isSet_rtcdTxt= value;
	}
	/**
	 * 결과코드내용 
	 */
	@XmlTransient
	public String getRtcdTxt(){
		return this.rtcdTxt;
	}
	
	/**
	 * 결과코드내용 
	 * 
	 * @param rtcdTxt 결과코드내용 
	 */
	public void setRtcdTxt(String rtcdTxt){
		this.rtcdTxt= rtcdTxt;
		this.setIsSet_rtcdTxt(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT clone(){
		try{
			INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT object= (INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT other= (INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT)obj;
		{
			Object _rtcd= getRtcd();
			Object __rtcd= other.getRtcd();
			if ( _rtcd== null ) { if ( __rtcd!= null ) return false; }
			else if ( !_rtcd.equals(__rtcd) ) return false;
		}
		{
			Object _rtcdTxt= getRtcdTxt();
			Object __rtcdTxt= other.getRtcdTxt();
			if ( _rtcdTxt== null ) { if ( __rtcdTxt!= null ) return false; }
			else if ( !_rtcdTxt.equals(__rtcdTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT.class.getName()).append(":\n");
		sb.append("\trtcd: ");
		sb.append(rtcd==null?"null":getRtcd());
		sb.append("\n");
		sb.append("\trtcdTxt: ");
		sb.append(rtcdTxt==null?"null":getRtcdTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rtcd");
		list.add("rtcdTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			return getRtcd();
		case 1511678285:/* rtcdTxt */
			return getRtcdTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			setRtcd((String)value);
			break;
		case 1511678285:/* rtcdTxt */
			setRtcdTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
