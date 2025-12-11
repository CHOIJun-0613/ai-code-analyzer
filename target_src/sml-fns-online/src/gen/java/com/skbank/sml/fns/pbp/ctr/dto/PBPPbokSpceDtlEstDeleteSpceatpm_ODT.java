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

/**
 * 통장.쪼개기.자동납부.삭제 out
 */
@XmlType(propOrder={
	"rspRtcd", "rspMsgTxt"
}, name="PBPPbokSpceDtlEstDeleteSpceatpm_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstDeleteSpceatpm_ODT")
@BxmCategory(logicalName="통장.쪼개기.자동납부.삭제.컨트롤러.출력.IO", description="통장.쪼개기.자동납부.삭제 out") 
public class PBPPbokSpceDtlEstDeleteSpceatpm_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -526591021L;
	
	
	
	/**
	 * 응답결과코드
	 */
	@ApiModelProperty(
		name = "rspRtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rspRtcd")
	@BxmOmm_Field(length=4, decimal=0, description="응답결과코드", align="left", fill="")
	private String rspRtcd= "";
	
	
	/**
	 * 응답메시지내용
	 */
	@ApiModelProperty(
		name = "rspMsgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rspMsgTxt")
	@BxmOmm_Field(length=100, decimal=0, description="응답메시지내용", align="left", fill="")
	private String rspMsgTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rspRtcd= false;
	protected final boolean isSet_rspRtcd(){
		return this.isSet_rspRtcd;
	}
	private void setIsSet_rspRtcd(boolean value){
		this.isSet_rspRtcd= value;
	}
	/**
	 * 응답결과코드
	 */
	@XmlTransient
	public String getRspRtcd(){
		return this.rspRtcd;
	}
	
	/**
	 * 응답결과코드
	 * 
	 * @param rspRtcd 응답결과코드
	 */
	public void setRspRtcd(String rspRtcd){
		this.rspRtcd= rspRtcd;
		this.setIsSet_rspRtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rspMsgTxt= false;
	protected final boolean isSet_rspMsgTxt(){
		return this.isSet_rspMsgTxt;
	}
	private void setIsSet_rspMsgTxt(boolean value){
		this.isSet_rspMsgTxt= value;
	}
	/**
	 * 응답메시지내용
	 */
	@XmlTransient
	public String getRspMsgTxt(){
		return this.rspMsgTxt;
	}
	
	/**
	 * 응답메시지내용
	 * 
	 * @param rspMsgTxt 응답메시지내용
	 */
	public void setRspMsgTxt(String rspMsgTxt){
		this.rspMsgTxt= rspMsgTxt;
		this.setIsSet_rspMsgTxt(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstDeleteSpceatpm_ODT clone(){
		try{
			PBPPbokSpceDtlEstDeleteSpceatpm_ODT object= (PBPPbokSpceDtlEstDeleteSpceatpm_ODT)super.clone();
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
		
		result= prime * result + ((this.rspRtcd==null)?0:this.rspRtcd.hashCode());
		result= prime * result + ((this.rspMsgTxt==null)?0:this.rspMsgTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstDeleteSpceatpm_ODT other= (PBPPbokSpceDtlEstDeleteSpceatpm_ODT)obj;
		{
			Object _rspRtcd= getRspRtcd();
			Object __rspRtcd= other.getRspRtcd();
			if ( _rspRtcd== null ) { if ( __rspRtcd!= null ) return false; }
			else if ( !_rspRtcd.equals(__rspRtcd) ) return false;
		}
		{
			Object _rspMsgTxt= getRspMsgTxt();
			Object __rspMsgTxt= other.getRspMsgTxt();
			if ( _rspMsgTxt== null ) { if ( __rspMsgTxt!= null ) return false; }
			else if ( !_rspMsgTxt.equals(__rspMsgTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstDeleteSpceatpm_ODT.class.getName()).append(":\n");
		sb.append("\trspRtcd: ");
		sb.append(rspRtcd==null?"null":getRspRtcd());
		sb.append("\n");
		sb.append("\trspMsgTxt: ");
		sb.append(rspMsgTxt==null?"null":getRspMsgTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* rspRtcd */
		messageLen+= 100; /* rspMsgTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rspRtcd");
		list.add("rspMsgTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rspRtcd", get("rspRtcd"));
		map.put("rspMsgTxt", get("rspMsgTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1494548754:/* rspRtcd */
			return getRspRtcd();
		case 1598314078:/* rspMsgTxt */
			return getRspMsgTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1494548754:/* rspRtcd */
			setRspRtcd((String)value);
			break;
		case 1598314078:/* rspMsgTxt */
			setRspMsgTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
