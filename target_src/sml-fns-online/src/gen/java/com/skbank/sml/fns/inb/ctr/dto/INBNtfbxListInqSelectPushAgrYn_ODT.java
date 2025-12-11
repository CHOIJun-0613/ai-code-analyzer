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
 * Push기본정보 조회 ODT
 */
@XmlType(propOrder={
	"userId", "ngItgCsno", "smtphOsTpNm", "cusNo", "pushAgrYn", "delYn", "amdDh", "amdpeId", "aplDscd", "deviceId"
}, name="INBPushBscInf_ODT")
@XmlRootElement(name="INBPushBscInf_ODT")
@BxmCategory(logicalName="Push기본정보 조회 ODT", description="Push기본정보 조회 ODT") 
public class INBNtfbxListInqSelectPushAgrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2001872087L;
	
	
	
	/**
	 * 사용자ID
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=10, decimal=0, description="사용자ID", align="left", fill="")
	private String userId= "";
	
	
	/**
	 * 차세대통합고객번호
	 */
	@ApiModelProperty(
		name = "ngItgCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ngItgCsno")
	@BxmOmm_Field(length=13, decimal=0, description="차세대통합고객번호", align="left", fill="")
	private String ngItgCsno= "";
	
	
	/**
	 * 스마트폰OS타입명
	 */
	@ApiModelProperty(
		name = "smtphOsTpNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smtphOsTpNm")
	@BxmOmm_Field(length=2, decimal=0, description="스마트폰OS타입명", align="left", fill="")
	private String smtphOsTpNm= "";
	
	
	/**
	 * 고객번호
	 */
	@ApiModelProperty(
		name = "cusNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusNo")
	@BxmOmm_Field(length=20, decimal=0, description="고객번호", align="left", fill="")
	private String cusNo= "";
	
	
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
	 * 삭제여부
	 */
	@ApiModelProperty(
		name = "delYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("delYn")
	@BxmOmm_Field(length=1, decimal=0, description="삭제여부", align="left", fill="")
	private String delYn= "";
	
	
	/**
	 * 수정일시
	 */
	@ApiModelProperty(
		name = "amdDh"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amdDh")
	@BxmOmm_Field(length=14, decimal=0, description="수정일시", align="left", fill="")
	private String amdDh= "";
	
	
	/**
	 * 수정자ID
	 */
	@ApiModelProperty(
		name = "amdpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amdpeId")
	@BxmOmm_Field(length=32, decimal=0, description="수정자ID", align="left", fill="")
	private String amdpeId= "";
	
	
	/**
	 * 업무구분코드
	 */
	@ApiModelProperty(
		name = "aplDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aplDscd")
	@BxmOmm_Field(length=2, decimal=0, description="업무구분코드", align="left", fill="")
	private String aplDscd= "";
	
	
	/**
	 * 디바이스ID
	 */
	@ApiModelProperty(
		name = "deviceId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("deviceId")
	@BxmOmm_Field(length=300, decimal=0, description="디바이스ID", align="left", fill="")
	private String deviceId= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userId= false;
	protected final boolean isSet_userId(){
		return this.isSet_userId;
	}
	private void setIsSet_userId(boolean value){
		this.isSet_userId= value;
	}
	/**
	 * 사용자ID
	 */
	@XmlTransient
	public String getUserId(){
		return this.userId;
	}
	
	/**
	 * 사용자ID
	 * 
	 * @param userId 사용자ID
	 */
	public void setUserId(String userId){
		this.userId= userId;
		this.setIsSet_userId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ngItgCsno= false;
	protected final boolean isSet_ngItgCsno(){
		return this.isSet_ngItgCsno;
	}
	private void setIsSet_ngItgCsno(boolean value){
		this.isSet_ngItgCsno= value;
	}
	/**
	 * 차세대통합고객번호
	 */
	@XmlTransient
	public String getNgItgCsno(){
		return this.ngItgCsno;
	}
	
	/**
	 * 차세대통합고객번호
	 * 
	 * @param ngItgCsno 차세대통합고객번호
	 */
	public void setNgItgCsno(String ngItgCsno){
		this.ngItgCsno= ngItgCsno;
		this.setIsSet_ngItgCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smtphOsTpNm= false;
	protected final boolean isSet_smtphOsTpNm(){
		return this.isSet_smtphOsTpNm;
	}
	private void setIsSet_smtphOsTpNm(boolean value){
		this.isSet_smtphOsTpNm= value;
	}
	/**
	 * 스마트폰OS타입명
	 */
	@XmlTransient
	public String getSmtphOsTpNm(){
		return this.smtphOsTpNm;
	}
	
	/**
	 * 스마트폰OS타입명
	 * 
	 * @param smtphOsTpNm 스마트폰OS타입명
	 */
	public void setSmtphOsTpNm(String smtphOsTpNm){
		this.smtphOsTpNm= smtphOsTpNm;
		this.setIsSet_smtphOsTpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusNo= false;
	protected final boolean isSet_cusNo(){
		return this.isSet_cusNo;
	}
	private void setIsSet_cusNo(boolean value){
		this.isSet_cusNo= value;
	}
	/**
	 * 고객번호
	 */
	@XmlTransient
	public String getCusNo(){
		return this.cusNo;
	}
	
	/**
	 * 고객번호
	 * 
	 * @param cusNo 고객번호
	 */
	public void setCusNo(String cusNo){
		this.cusNo= cusNo;
		this.setIsSet_cusNo(true);
	}
	
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
	private boolean isSet_delYn= false;
	protected final boolean isSet_delYn(){
		return this.isSet_delYn;
	}
	private void setIsSet_delYn(boolean value){
		this.isSet_delYn= value;
	}
	/**
	 * 삭제여부
	 */
	@XmlTransient
	public String getDelYn(){
		return this.delYn;
	}
	
	/**
	 * 삭제여부
	 * 
	 * @param delYn 삭제여부
	 */
	public void setDelYn(String delYn){
		this.delYn= delYn;
		this.setIsSet_delYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amdDh= false;
	protected final boolean isSet_amdDh(){
		return this.isSet_amdDh;
	}
	private void setIsSet_amdDh(boolean value){
		this.isSet_amdDh= value;
	}
	/**
	 * 수정일시
	 */
	@XmlTransient
	public String getAmdDh(){
		return this.amdDh;
	}
	
	/**
	 * 수정일시
	 * 
	 * @param amdDh 수정일시
	 */
	public void setAmdDh(String amdDh){
		this.amdDh= amdDh;
		this.setIsSet_amdDh(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amdpeId= false;
	protected final boolean isSet_amdpeId(){
		return this.isSet_amdpeId;
	}
	private void setIsSet_amdpeId(boolean value){
		this.isSet_amdpeId= value;
	}
	/**
	 * 수정자ID
	 */
	@XmlTransient
	public String getAmdpeId(){
		return this.amdpeId;
	}
	
	/**
	 * 수정자ID
	 * 
	 * @param amdpeId 수정자ID
	 */
	public void setAmdpeId(String amdpeId){
		this.amdpeId= amdpeId;
		this.setIsSet_amdpeId(true);
	}
	
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
	private boolean isSet_deviceId= false;
	protected final boolean isSet_deviceId(){
		return this.isSet_deviceId;
	}
	private void setIsSet_deviceId(boolean value){
		this.isSet_deviceId= value;
	}
	/**
	 * 디바이스ID
	 */
	@XmlTransient
	public String getDeviceId(){
		return this.deviceId;
	}
	
	/**
	 * 디바이스ID
	 * 
	 * @param deviceId 디바이스ID
	 */
	public void setDeviceId(String deviceId){
		this.deviceId= deviceId;
		this.setIsSet_deviceId(true);
	}
				
	@Override
	public INBNtfbxListInqSelectPushAgrYn_ODT clone(){
		try{
			INBNtfbxListInqSelectPushAgrYn_ODT object= (INBNtfbxListInqSelectPushAgrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.ngItgCsno==null)?0:this.ngItgCsno.hashCode());
		result= prime * result + ((this.smtphOsTpNm==null)?0:this.smtphOsTpNm.hashCode());
		result= prime * result + ((this.cusNo==null)?0:this.cusNo.hashCode());
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		result= prime * result + ((this.delYn==null)?0:this.delYn.hashCode());
		result= prime * result + ((this.amdDh==null)?0:this.amdDh.hashCode());
		result= prime * result + ((this.amdpeId==null)?0:this.amdpeId.hashCode());
		result= prime * result + ((this.aplDscd==null)?0:this.aplDscd.hashCode());
		result= prime * result + ((this.deviceId==null)?0:this.deviceId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectPushAgrYn_ODT other= (INBNtfbxListInqSelectPushAgrYn_ODT)obj;
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _ngItgCsno= getNgItgCsno();
			Object __ngItgCsno= other.getNgItgCsno();
			if ( _ngItgCsno== null ) { if ( __ngItgCsno!= null ) return false; }
			else if ( !_ngItgCsno.equals(__ngItgCsno) ) return false;
		}
		{
			Object _smtphOsTpNm= getSmtphOsTpNm();
			Object __smtphOsTpNm= other.getSmtphOsTpNm();
			if ( _smtphOsTpNm== null ) { if ( __smtphOsTpNm!= null ) return false; }
			else if ( !_smtphOsTpNm.equals(__smtphOsTpNm) ) return false;
		}
		{
			Object _cusNo= getCusNo();
			Object __cusNo= other.getCusNo();
			if ( _cusNo== null ) { if ( __cusNo!= null ) return false; }
			else if ( !_cusNo.equals(__cusNo) ) return false;
		}
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
		}
		{
			Object _delYn= getDelYn();
			Object __delYn= other.getDelYn();
			if ( _delYn== null ) { if ( __delYn!= null ) return false; }
			else if ( !_delYn.equals(__delYn) ) return false;
		}
		{
			Object _amdDh= getAmdDh();
			Object __amdDh= other.getAmdDh();
			if ( _amdDh== null ) { if ( __amdDh!= null ) return false; }
			else if ( !_amdDh.equals(__amdDh) ) return false;
		}
		{
			Object _amdpeId= getAmdpeId();
			Object __amdpeId= other.getAmdpeId();
			if ( _amdpeId== null ) { if ( __amdpeId!= null ) return false; }
			else if ( !_amdpeId.equals(__amdpeId) ) return false;
		}
		{
			Object _aplDscd= getAplDscd();
			Object __aplDscd= other.getAplDscd();
			if ( _aplDscd== null ) { if ( __aplDscd!= null ) return false; }
			else if ( !_aplDscd.equals(__aplDscd) ) return false;
		}
		{
			Object _deviceId= getDeviceId();
			Object __deviceId= other.getDeviceId();
			if ( _deviceId== null ) { if ( __deviceId!= null ) return false; }
			else if ( !_deviceId.equals(__deviceId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectPushAgrYn_ODT.class.getName()).append(":\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\tngItgCsno: ");
		sb.append(ngItgCsno==null?"null":getNgItgCsno());
		sb.append("\n");
		sb.append("\tsmtphOsTpNm: ");
		sb.append(smtphOsTpNm==null?"null":getSmtphOsTpNm());
		sb.append("\n");
		sb.append("\tcusNo: ");
		sb.append(cusNo==null?"null":getCusNo());
		sb.append("\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
		sb.append("\n");
		sb.append("\tdelYn: ");
		sb.append(delYn==null?"null":getDelYn());
		sb.append("\n");
		sb.append("\tamdDh: ");
		sb.append(amdDh==null?"null":getAmdDh());
		sb.append("\n");
		sb.append("\tamdpeId: ");
		sb.append(amdpeId==null?"null":getAmdpeId());
		sb.append("\n");
		sb.append("\taplDscd: ");
		sb.append(aplDscd==null?"null":getAplDscd());
		sb.append("\n");
		sb.append("\tdeviceId: ");
		sb.append(deviceId==null?"null":getDeviceId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* userId */
		messageLen+= 13; /* ngItgCsno */
		messageLen+= 2; /* smtphOsTpNm */
		messageLen+= 20; /* cusNo */
		messageLen+= 1; /* pushAgrYn */
		messageLen+= 1; /* delYn */
		messageLen+= 14; /* amdDh */
		messageLen+= 32; /* amdpeId */
		messageLen+= 2; /* aplDscd */
		messageLen+= 300; /* deviceId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("userId");
		list.add("ngItgCsno");
		list.add("smtphOsTpNm");
		list.add("cusNo");
		list.add("pushAgrYn");
		list.add("delYn");
		list.add("amdDh");
		list.add("amdpeId");
		list.add("aplDscd");
		list.add("deviceId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("userId", get("userId"));
		map.put("ngItgCsno", get("ngItgCsno"));
		map.put("smtphOsTpNm", get("smtphOsTpNm"));
		map.put("cusNo", get("cusNo"));
		map.put("pushAgrYn", get("pushAgrYn"));
		map.put("delYn", get("delYn"));
		map.put("amdDh", get("amdDh"));
		map.put("amdpeId", get("amdpeId"));
		map.put("aplDscd", get("aplDscd"));
		map.put("deviceId", get("deviceId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -836030906:/* userId */
			return getUserId();
		case 1650816244:/* ngItgCsno */
			return getNgItgCsno();
		case -1839547183:/* smtphOsTpNm */
			return getSmtphOsTpNm();
		case 95027170:/* cusNo */
			return getCusNo();
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		case 95467648:/* delYn */
			return getDelYn();
		case 92927068:/* amdDh */
			return getAmdDh();
		case -890090584:/* amdpeId */
			return getAmdpeId();
		case -798111507:/* aplDscd */
			return getAplDscd();
		case 1109191185:/* deviceId */
			return getDeviceId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case 1650816244:/* ngItgCsno */
			setNgItgCsno((String)value);
			break;
		case -1839547183:/* smtphOsTpNm */
			setSmtphOsTpNm((String)value);
			break;
		case 95027170:/* cusNo */
			setCusNo((String)value);
			break;
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
			break;
		case 95467648:/* delYn */
			setDelYn((String)value);
			break;
		case 92927068:/* amdDh */
			setAmdDh((String)value);
			break;
		case -890090584:/* amdpeId */
			setAmdpeId((String)value);
			break;
		case -798111507:/* aplDscd */
			setAplDscd((String)value);
			break;
		case 1109191185:/* deviceId */
			setDeviceId((String)value);
			break;
		default:
			break;
		}
	}
	
}
