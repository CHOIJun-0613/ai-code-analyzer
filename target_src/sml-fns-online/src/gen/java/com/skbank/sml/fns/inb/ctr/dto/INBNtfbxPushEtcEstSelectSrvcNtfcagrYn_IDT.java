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
 * 
 */
@XmlType(propOrder={
	"pushSrvcNtfcId", "mchrUnqInfId", "mblMchrSftrVerTxt", "mblMchrAppVerTxt", "mblMchrMdlNm"
}, name="INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT")
@BxmCategory(logicalName="서비스알림.동의여부.컨트롤러.출력.IO", description="") 
public class INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1706809618L;
	
	
	
	/**
	 * PUSH서비스알림ID
	 */
	@ApiModelProperty(
		name = "pushSrvcNtfcId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushSrvcNtfcId")
	@BxmOmm_Field(length=10, decimal=0, description="PUSH서비스알림ID", align="left", fill="")
	private String pushSrvcNtfcId= "";
	
	
	/**
	 * 기기고유정보ID
	 */
	@ApiModelProperty(
		name = "mchrUnqInfId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mchrUnqInfId")
	@BxmOmm_Field(length=300, decimal=0, description="기기고유정보ID", align="left", fill="")
	private String mchrUnqInfId= "";
	
	
	/**
	 * 모바일기기소프트웨어버전내용
	 */
	@ApiModelProperty(
		name = "mblMchrSftrVerTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrSftrVerTxt")
	@BxmOmm_Field(length=20, decimal=0, description="모바일기기소프트웨어버전내용", align="left", fill="")
	private String mblMchrSftrVerTxt= "";
	
	
	/**
	 * 모바일기기앱버전내용
	 */
	@ApiModelProperty(
		name = "mblMchrAppVerTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrAppVerTxt")
	@BxmOmm_Field(length=20, decimal=0, description="모바일기기앱버전내용", align="left", fill="")
	private String mblMchrAppVerTxt= "";
	
	
	/**
	 * 모바일기기모델명
	 */
	@ApiModelProperty(
		name = "mblMchrMdlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrMdlNm")
	@BxmOmm_Field(length=50, decimal=0, description="모바일기기모델명", align="left", fill="")
	private String mblMchrMdlNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushSrvcNtfcId= false;
	protected final boolean isSet_pushSrvcNtfcId(){
		return this.isSet_pushSrvcNtfcId;
	}
	private void setIsSet_pushSrvcNtfcId(boolean value){
		this.isSet_pushSrvcNtfcId= value;
	}
	/**
	 * PUSH서비스알림ID
	 */
	@XmlTransient
	public String getPushSrvcNtfcId(){
		return this.pushSrvcNtfcId;
	}
	
	/**
	 * PUSH서비스알림ID
	 * 
	 * @param pushSrvcNtfcId PUSH서비스알림ID
	 */
	public void setPushSrvcNtfcId(String pushSrvcNtfcId){
		this.pushSrvcNtfcId= pushSrvcNtfcId;
		this.setIsSet_pushSrvcNtfcId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mchrUnqInfId= false;
	protected final boolean isSet_mchrUnqInfId(){
		return this.isSet_mchrUnqInfId;
	}
	private void setIsSet_mchrUnqInfId(boolean value){
		this.isSet_mchrUnqInfId= value;
	}
	/**
	 * 기기고유정보ID
	 */
	@XmlTransient
	public String getMchrUnqInfId(){
		return this.mchrUnqInfId;
	}
	
	/**
	 * 기기고유정보ID
	 * 
	 * @param mchrUnqInfId 기기고유정보ID
	 */
	public void setMchrUnqInfId(String mchrUnqInfId){
		this.mchrUnqInfId= mchrUnqInfId;
		this.setIsSet_mchrUnqInfId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrSftrVerTxt= false;
	protected final boolean isSet_mblMchrSftrVerTxt(){
		return this.isSet_mblMchrSftrVerTxt;
	}
	private void setIsSet_mblMchrSftrVerTxt(boolean value){
		this.isSet_mblMchrSftrVerTxt= value;
	}
	/**
	 * 모바일기기소프트웨어버전내용
	 */
	@XmlTransient
	public String getMblMchrSftrVerTxt(){
		return this.mblMchrSftrVerTxt;
	}
	
	/**
	 * 모바일기기소프트웨어버전내용
	 * 
	 * @param mblMchrSftrVerTxt 모바일기기소프트웨어버전내용
	 */
	public void setMblMchrSftrVerTxt(String mblMchrSftrVerTxt){
		this.mblMchrSftrVerTxt= mblMchrSftrVerTxt;
		this.setIsSet_mblMchrSftrVerTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrAppVerTxt= false;
	protected final boolean isSet_mblMchrAppVerTxt(){
		return this.isSet_mblMchrAppVerTxt;
	}
	private void setIsSet_mblMchrAppVerTxt(boolean value){
		this.isSet_mblMchrAppVerTxt= value;
	}
	/**
	 * 모바일기기앱버전내용
	 */
	@XmlTransient
	public String getMblMchrAppVerTxt(){
		return this.mblMchrAppVerTxt;
	}
	
	/**
	 * 모바일기기앱버전내용
	 * 
	 * @param mblMchrAppVerTxt 모바일기기앱버전내용
	 */
	public void setMblMchrAppVerTxt(String mblMchrAppVerTxt){
		this.mblMchrAppVerTxt= mblMchrAppVerTxt;
		this.setIsSet_mblMchrAppVerTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrMdlNm= false;
	protected final boolean isSet_mblMchrMdlNm(){
		return this.isSet_mblMchrMdlNm;
	}
	private void setIsSet_mblMchrMdlNm(boolean value){
		this.isSet_mblMchrMdlNm= value;
	}
	/**
	 * 모바일기기모델명
	 */
	@XmlTransient
	public String getMblMchrMdlNm(){
		return this.mblMchrMdlNm;
	}
	
	/**
	 * 모바일기기모델명
	 * 
	 * @param mblMchrMdlNm 모바일기기모델명
	 */
	public void setMblMchrMdlNm(String mblMchrMdlNm){
		this.mblMchrMdlNm= mblMchrMdlNm;
		this.setIsSet_mblMchrMdlNm(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT clone(){
		try{
			INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT object= (INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT)super.clone();
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
		
		result= prime * result + ((this.pushSrvcNtfcId==null)?0:this.pushSrvcNtfcId.hashCode());
		result= prime * result + ((this.mchrUnqInfId==null)?0:this.mchrUnqInfId.hashCode());
		result= prime * result + ((this.mblMchrSftrVerTxt==null)?0:this.mblMchrSftrVerTxt.hashCode());
		result= prime * result + ((this.mblMchrAppVerTxt==null)?0:this.mblMchrAppVerTxt.hashCode());
		result= prime * result + ((this.mblMchrMdlNm==null)?0:this.mblMchrMdlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT other= (INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT)obj;
		{
			Object _pushSrvcNtfcId= getPushSrvcNtfcId();
			Object __pushSrvcNtfcId= other.getPushSrvcNtfcId();
			if ( _pushSrvcNtfcId== null ) { if ( __pushSrvcNtfcId!= null ) return false; }
			else if ( !_pushSrvcNtfcId.equals(__pushSrvcNtfcId) ) return false;
		}
		{
			Object _mchrUnqInfId= getMchrUnqInfId();
			Object __mchrUnqInfId= other.getMchrUnqInfId();
			if ( _mchrUnqInfId== null ) { if ( __mchrUnqInfId!= null ) return false; }
			else if ( !_mchrUnqInfId.equals(__mchrUnqInfId) ) return false;
		}
		{
			Object _mblMchrSftrVerTxt= getMblMchrSftrVerTxt();
			Object __mblMchrSftrVerTxt= other.getMblMchrSftrVerTxt();
			if ( _mblMchrSftrVerTxt== null ) { if ( __mblMchrSftrVerTxt!= null ) return false; }
			else if ( !_mblMchrSftrVerTxt.equals(__mblMchrSftrVerTxt) ) return false;
		}
		{
			Object _mblMchrAppVerTxt= getMblMchrAppVerTxt();
			Object __mblMchrAppVerTxt= other.getMblMchrAppVerTxt();
			if ( _mblMchrAppVerTxt== null ) { if ( __mblMchrAppVerTxt!= null ) return false; }
			else if ( !_mblMchrAppVerTxt.equals(__mblMchrAppVerTxt) ) return false;
		}
		{
			Object _mblMchrMdlNm= getMblMchrMdlNm();
			Object __mblMchrMdlNm= other.getMblMchrMdlNm();
			if ( _mblMchrMdlNm== null ) { if ( __mblMchrMdlNm!= null ) return false; }
			else if ( !_mblMchrMdlNm.equals(__mblMchrMdlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT.class.getName()).append(":\n");
		sb.append("\tpushSrvcNtfcId: ");
		sb.append(pushSrvcNtfcId==null?"null":getPushSrvcNtfcId());
		sb.append("\n");
		sb.append("\tmchrUnqInfId: ");
		sb.append(mchrUnqInfId==null?"null":getMchrUnqInfId());
		sb.append("\n");
		sb.append("\tmblMchrSftrVerTxt: ");
		sb.append(mblMchrSftrVerTxt==null?"null":getMblMchrSftrVerTxt());
		sb.append("\n");
		sb.append("\tmblMchrAppVerTxt: ");
		sb.append(mblMchrAppVerTxt==null?"null":getMblMchrAppVerTxt());
		sb.append("\n");
		sb.append("\tmblMchrMdlNm: ");
		sb.append(mblMchrMdlNm==null?"null":getMblMchrMdlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* pushSrvcNtfcId */
		messageLen+= 300; /* mchrUnqInfId */
		messageLen+= 20; /* mblMchrSftrVerTxt */
		messageLen+= 20; /* mblMchrAppVerTxt */
		messageLen+= 50; /* mblMchrMdlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pushSrvcNtfcId");
		list.add("mchrUnqInfId");
		list.add("mblMchrSftrVerTxt");
		list.add("mblMchrAppVerTxt");
		list.add("mblMchrMdlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pushSrvcNtfcId", get("pushSrvcNtfcId"));
		map.put("mchrUnqInfId", get("mchrUnqInfId"));
		map.put("mblMchrSftrVerTxt", get("mblMchrSftrVerTxt"));
		map.put("mblMchrAppVerTxt", get("mblMchrAppVerTxt"));
		map.put("mblMchrMdlNm", get("mblMchrMdlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -513192796:/* pushSrvcNtfcId */
			return getPushSrvcNtfcId();
		case 488711172:/* mchrUnqInfId */
			return getMchrUnqInfId();
		case -1253637675:/* mblMchrSftrVerTxt */
			return getMblMchrSftrVerTxt();
		case -1937309737:/* mblMchrAppVerTxt */
			return getMblMchrAppVerTxt();
		case 1582431581:/* mblMchrMdlNm */
			return getMblMchrMdlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -513192796:/* pushSrvcNtfcId */
			setPushSrvcNtfcId((String)value);
			break;
		case 488711172:/* mchrUnqInfId */
			setMchrUnqInfId((String)value);
			break;
		case -1253637675:/* mblMchrSftrVerTxt */
			setMblMchrSftrVerTxt((String)value);
			break;
		case -1937309737:/* mblMchrAppVerTxt */
			setMblMchrAppVerTxt((String)value);
			break;
		case 1582431581:/* mblMchrMdlNm */
			setMblMchrMdlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
