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
 * SMS입출금통지.내용.컨트롤러.출력.IO
 */
@XmlType(propOrder={
	"smsRawNtcSrvcJnngYn", "rtcd", "rtcdTxt"
}, name="INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT")
@BxmCategory(logicalName="SMS입출금통지.내용.컨트롤러.출력.IO", description="SMS입출금통지.내용.컨트롤러.출력.IO") 
public class INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1817218155L;
	
	
	
	/**
	 * SMS입출금통지서비스가입여부
	 */
	@ApiModelProperty(
		name = "smsRawNtcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsRawNtcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="SMS입출금통지서비스가입여부", align="left", fill="")
	private String smsRawNtcSrvcJnngYn= "";
	
	
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
	@BxmOmm_Field(length=100, decimal=0, description="결과코드내용", align="left", fill="")
	private String rtcdTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsRawNtcSrvcJnngYn= false;
	protected final boolean isSet_smsRawNtcSrvcJnngYn(){
		return this.isSet_smsRawNtcSrvcJnngYn;
	}
	private void setIsSet_smsRawNtcSrvcJnngYn(boolean value){
		this.isSet_smsRawNtcSrvcJnngYn= value;
	}
	/**
	 * SMS입출금통지서비스가입여부
	 */
	@XmlTransient
	public String getSmsRawNtcSrvcJnngYn(){
		return this.smsRawNtcSrvcJnngYn;
	}
	
	/**
	 * SMS입출금통지서비스가입여부
	 * 
	 * @param smsRawNtcSrvcJnngYn SMS입출금통지서비스가입여부
	 */
	public void setSmsRawNtcSrvcJnngYn(String smsRawNtcSrvcJnngYn){
		this.smsRawNtcSrvcJnngYn= smsRawNtcSrvcJnngYn;
		this.setIsSet_smsRawNtcSrvcJnngYn(true);
	}
	
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
	public INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT clone(){
		try{
			INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT object= (INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT)super.clone();
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
		
		result= prime * result + ((this.smsRawNtcSrvcJnngYn==null)?0:this.smsRawNtcSrvcJnngYn.hashCode());
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT other= (INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT)obj;
		{
			Object _smsRawNtcSrvcJnngYn= getSmsRawNtcSrvcJnngYn();
			Object __smsRawNtcSrvcJnngYn= other.getSmsRawNtcSrvcJnngYn();
			if ( _smsRawNtcSrvcJnngYn== null ) { if ( __smsRawNtcSrvcJnngYn!= null ) return false; }
			else if ( !_smsRawNtcSrvcJnngYn.equals(__smsRawNtcSrvcJnngYn) ) return false;
		}
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
	
		sb.append("\n[").append(INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT.class.getName()).append(":\n");
		sb.append("\tsmsRawNtcSrvcJnngYn: ");
		sb.append(smsRawNtcSrvcJnngYn==null?"null":getSmsRawNtcSrvcJnngYn());
		sb.append("\n");
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
		
		messageLen+= 1; /* smsRawNtcSrvcJnngYn */
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("smsRawNtcSrvcJnngYn");
		list.add("rtcd");
		list.add("rtcdTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("smsRawNtcSrvcJnngYn", get("smsRawNtcSrvcJnngYn"));
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1869348300:/* smsRawNtcSrvcJnngYn */
			return getSmsRawNtcSrvcJnngYn();
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
		case 1869348300:/* smsRawNtcSrvcJnngYn */
			setSmsRawNtcSrvcJnngYn((String)value);
			break;
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
