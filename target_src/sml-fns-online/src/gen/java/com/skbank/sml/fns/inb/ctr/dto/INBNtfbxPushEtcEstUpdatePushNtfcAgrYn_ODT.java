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
	"pushAgrYn", "aplDscdYn", "rtcd", "rtcdTxt", "mchrUnqInfId"
}, name="INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT")
@BxmCategory(logicalName="PUSH.동의여부.컨트롤러.출력.IO", description="") 
public class INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1664582119L;
	
	
	
	/**
	 * PUSH동의여부
	 */
	@ApiModelProperty(
		name = "pushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="PUSH동의여부", align="left", fill="")
	private String pushAgrYn= "";
	
	
	/**
	 * 업무구분코드사용여부
	 */
	@ApiModelProperty(
		name = "aplDscdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aplDscdYn")
	@BxmOmm_Field(length=1, decimal=0, description="업무구분코드사용여부", align="left", fill="")
	private String aplDscdYn= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushAgrYn= false;
	protected final boolean isSet_pushAgrYn(){
		return this.isSet_pushAgrYn;
	}
	private void setIsSet_pushAgrYn(boolean value){
		this.isSet_pushAgrYn= value;
	}
	/**
	 * PUSH동의여부
	 */
	@XmlTransient
	public String getPushAgrYn(){
		return this.pushAgrYn;
	}
	
	/**
	 * PUSH동의여부
	 * 
	 * @param pushAgrYn PUSH동의여부
	 */
	public void setPushAgrYn(String pushAgrYn){
		this.pushAgrYn= pushAgrYn;
		this.setIsSet_pushAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aplDscdYn= false;
	protected final boolean isSet_aplDscdYn(){
		return this.isSet_aplDscdYn;
	}
	private void setIsSet_aplDscdYn(boolean value){
		this.isSet_aplDscdYn= value;
	}
	/**
	 * 업무구분코드사용여부
	 */
	@XmlTransient
	public String getAplDscdYn(){
		return this.aplDscdYn;
	}
	
	/**
	 * 업무구분코드사용여부
	 * 
	 * @param aplDscdYn 업무구분코드사용여부
	 */
	public void setAplDscdYn(String aplDscdYn){
		this.aplDscdYn= aplDscdYn;
		this.setIsSet_aplDscdYn(true);
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
				
	@Override
	public INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT clone(){
		try{
			INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT object= (INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		result= prime * result + ((this.aplDscdYn==null)?0:this.aplDscdYn.hashCode());
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		result= prime * result + ((this.mchrUnqInfId==null)?0:this.mchrUnqInfId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT other= (INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT)obj;
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
		}
		{
			Object _aplDscdYn= getAplDscdYn();
			Object __aplDscdYn= other.getAplDscdYn();
			if ( _aplDscdYn== null ) { if ( __aplDscdYn!= null ) return false; }
			else if ( !_aplDscdYn.equals(__aplDscdYn) ) return false;
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
		{
			Object _mchrUnqInfId= getMchrUnqInfId();
			Object __mchrUnqInfId= other.getMchrUnqInfId();
			if ( _mchrUnqInfId== null ) { if ( __mchrUnqInfId!= null ) return false; }
			else if ( !_mchrUnqInfId.equals(__mchrUnqInfId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT.class.getName()).append(":\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
		sb.append("\n");
		sb.append("\taplDscdYn: ");
		sb.append(aplDscdYn==null?"null":getAplDscdYn());
		sb.append("\n");
		sb.append("\trtcd: ");
		sb.append(rtcd==null?"null":getRtcd());
		sb.append("\n");
		sb.append("\trtcdTxt: ");
		sb.append(rtcdTxt==null?"null":getRtcdTxt());
		sb.append("\n");
		sb.append("\tmchrUnqInfId: ");
		sb.append(mchrUnqInfId==null?"null":getMchrUnqInfId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* pushAgrYn */
		messageLen+= 1; /* aplDscdYn */
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
		messageLen+= 300; /* mchrUnqInfId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pushAgrYn");
		list.add("aplDscdYn");
		list.add("rtcd");
		list.add("rtcdTxt");
		list.add("mchrUnqInfId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pushAgrYn", get("pushAgrYn"));
		map.put("aplDscdYn", get("aplDscdYn"));
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
		map.put("mchrUnqInfId", get("mchrUnqInfId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		case 1813990626:/* aplDscdYn */
			return getAplDscdYn();
		case 3510819:/* rtcd */
			return getRtcd();
		case 1511678285:/* rtcdTxt */
			return getRtcdTxt();
		case 488711172:/* mchrUnqInfId */
			return getMchrUnqInfId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
			break;
		case 1813990626:/* aplDscdYn */
			setAplDscdYn((String)value);
			break;
		case 3510819:/* rtcd */
			setRtcd((String)value);
			break;
		case 1511678285:/* rtcdTxt */
			setRtcdTxt((String)value);
			break;
		case 488711172:/* mchrUnqInfId */
			setMchrUnqInfId((String)value);
			break;
		default:
			break;
		}
	}
	
}
