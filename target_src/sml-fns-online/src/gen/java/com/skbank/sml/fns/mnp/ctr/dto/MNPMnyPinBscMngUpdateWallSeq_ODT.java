/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"errMsgId", "errMsgTxt"
}, name="MNPMnyPinBscMngUpdateWallSeq_ODT")
@XmlRootElement(name="MNPMnyPinBscMngUpdateWallSeq_ODT")
@BxmCategory(logicalName="머니클립.지갑.순서.수정.컨트롤러.출력.IO", description="") 
public class MNPMnyPinBscMngUpdateWallSeq_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1200626295L;
	
	
	
	/**
	 * 오류메시지ID
	 */
	@ApiModelProperty(
		name = "errMsgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errMsgId")
	@BxmOmm_Field(length=10, decimal=0, description="오류메시지ID", align="left", fill="")
	private String errMsgId= "";
	
	
	/**
	 * 오류메시지내용
	 */
	@ApiModelProperty(
		name = "errMsgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errMsgTxt")
	@BxmOmm_Field(length=100, decimal=0, description="오류메시지내용", align="left", fill="")
	private String errMsgTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errMsgId= false;
	protected final boolean isSet_errMsgId(){
		return this.isSet_errMsgId;
	}
	private void setIsSet_errMsgId(boolean value){
		this.isSet_errMsgId= value;
	}
	/**
	 * 오류메시지ID
	 */
	@XmlTransient
	public String getErrMsgId(){
		return this.errMsgId;
	}
	
	/**
	 * 오류메시지ID
	 * 
	 * @param errMsgId 오류메시지ID
	 */
	public void setErrMsgId(String errMsgId){
		this.errMsgId= errMsgId;
		this.setIsSet_errMsgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errMsgTxt= false;
	protected final boolean isSet_errMsgTxt(){
		return this.isSet_errMsgTxt;
	}
	private void setIsSet_errMsgTxt(boolean value){
		this.isSet_errMsgTxt= value;
	}
	/**
	 * 오류메시지내용
	 */
	@XmlTransient
	public String getErrMsgTxt(){
		return this.errMsgTxt;
	}
	
	/**
	 * 오류메시지내용
	 * 
	 * @param errMsgTxt 오류메시지내용
	 */
	public void setErrMsgTxt(String errMsgTxt){
		this.errMsgTxt= errMsgTxt;
		this.setIsSet_errMsgTxt(true);
	}
				
	@Override
	public MNPMnyPinBscMngUpdateWallSeq_ODT clone(){
		try{
			MNPMnyPinBscMngUpdateWallSeq_ODT object= (MNPMnyPinBscMngUpdateWallSeq_ODT)super.clone();
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
		
		result= prime * result + ((this.errMsgId==null)?0:this.errMsgId.hashCode());
		result= prime * result + ((this.errMsgTxt==null)?0:this.errMsgTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngUpdateWallSeq_ODT other= (MNPMnyPinBscMngUpdateWallSeq_ODT)obj;
		{
			Object _errMsgId= getErrMsgId();
			Object __errMsgId= other.getErrMsgId();
			if ( _errMsgId== null ) { if ( __errMsgId!= null ) return false; }
			else if ( !_errMsgId.equals(__errMsgId) ) return false;
		}
		{
			Object _errMsgTxt= getErrMsgTxt();
			Object __errMsgTxt= other.getErrMsgTxt();
			if ( _errMsgTxt== null ) { if ( __errMsgTxt!= null ) return false; }
			else if ( !_errMsgTxt.equals(__errMsgTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinBscMngUpdateWallSeq_ODT.class.getName()).append(":\n");
		sb.append("\terrMsgId: ");
		sb.append(errMsgId==null?"null":getErrMsgId());
		sb.append("\n");
		sb.append("\terrMsgTxt: ");
		sb.append(errMsgTxt==null?"null":getErrMsgTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* errMsgId */
		messageLen+= 100; /* errMsgTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("errMsgId");
		list.add("errMsgTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("errMsgId", get("errMsgId"));
		map.put("errMsgTxt", get("errMsgTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1364750871:/* errMsgId */
			return getErrMsgId();
		case -642384652:/* errMsgTxt */
			return getErrMsgTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1364750871:/* errMsgId */
			setErrMsgId((String)value);
			break;
		case -642384652:/* errMsgTxt */
			setErrMsgTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
