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
	"mchrUnqInfId", "pushAgrYn", "mblMchrSftrVerTxt", "mblMchrAppVerTxt", "mblMchrMdlNm", "userId", "appDscd", "ngItgCsno", "smtphOsTpNm"
}, name="INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT")
@BxmCategory(logicalName="PUSH.동의여부.컨트롤러.입력.IO", description="") 
public class INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1664587885L;
	
	
	
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
	 * 앱구분코드
	 */
	@ApiModelProperty(
		name = "appDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appDscd")
	@BxmOmm_Field(length=2, decimal=0, description="앱구분코드", align="left", fill="")
	private String appDscd= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "ngItgCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ngItgCsno")
	@BxmOmm_Field(length=13, decimal=0, description="통합고객번호", align="left", fill="")
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
	private boolean isSet_appDscd= false;
	protected final boolean isSet_appDscd(){
		return this.isSet_appDscd;
	}
	private void setIsSet_appDscd(boolean value){
		this.isSet_appDscd= value;
	}
	/**
	 * 앱구분코드
	 */
	@XmlTransient
	public String getAppDscd(){
		return this.appDscd;
	}
	
	/**
	 * 앱구분코드
	 * 
	 * @param appDscd 앱구분코드
	 */
	public void setAppDscd(String appDscd){
		this.appDscd= appDscd;
		this.setIsSet_appDscd(true);
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
	 * 통합고객번호
	 */
	@XmlTransient
	public String getNgItgCsno(){
		return this.ngItgCsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param ngItgCsno 통합고객번호
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
				
	@Override
	public INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT clone(){
		try{
			INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT object= (INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT)super.clone();
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
		
		result= prime * result + ((this.mchrUnqInfId==null)?0:this.mchrUnqInfId.hashCode());
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		result= prime * result + ((this.mblMchrSftrVerTxt==null)?0:this.mblMchrSftrVerTxt.hashCode());
		result= prime * result + ((this.mblMchrAppVerTxt==null)?0:this.mblMchrAppVerTxt.hashCode());
		result= prime * result + ((this.mblMchrMdlNm==null)?0:this.mblMchrMdlNm.hashCode());
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.appDscd==null)?0:this.appDscd.hashCode());
		result= prime * result + ((this.ngItgCsno==null)?0:this.ngItgCsno.hashCode());
		result= prime * result + ((this.smtphOsTpNm==null)?0:this.smtphOsTpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT other= (INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT)obj;
		{
			Object _mchrUnqInfId= getMchrUnqInfId();
			Object __mchrUnqInfId= other.getMchrUnqInfId();
			if ( _mchrUnqInfId== null ) { if ( __mchrUnqInfId!= null ) return false; }
			else if ( !_mchrUnqInfId.equals(__mchrUnqInfId) ) return false;
		}
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
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
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _appDscd= getAppDscd();
			Object __appDscd= other.getAppDscd();
			if ( _appDscd== null ) { if ( __appDscd!= null ) return false; }
			else if ( !_appDscd.equals(__appDscd) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\tmchrUnqInfId: ");
		sb.append(mchrUnqInfId==null?"null":getMchrUnqInfId());
		sb.append("\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
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
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\tappDscd: ");
		sb.append(appDscd==null?"null":getAppDscd());
		sb.append("\n");
		sb.append("\tngItgCsno: ");
		sb.append(ngItgCsno==null?"null":getNgItgCsno());
		sb.append("\n");
		sb.append("\tsmtphOsTpNm: ");
		sb.append(smtphOsTpNm==null?"null":getSmtphOsTpNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 300; /* mchrUnqInfId */
		messageLen+= 1; /* pushAgrYn */
		messageLen+= 20; /* mblMchrSftrVerTxt */
		messageLen+= 20; /* mblMchrAppVerTxt */
		messageLen+= 50; /* mblMchrMdlNm */
		messageLen+= 10; /* userId */
		messageLen+= 2; /* appDscd */
		messageLen+= 13; /* ngItgCsno */
		messageLen+= 2; /* smtphOsTpNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mchrUnqInfId");
		list.add("pushAgrYn");
		list.add("mblMchrSftrVerTxt");
		list.add("mblMchrAppVerTxt");
		list.add("mblMchrMdlNm");
		list.add("userId");
		list.add("appDscd");
		list.add("ngItgCsno");
		list.add("smtphOsTpNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mchrUnqInfId", get("mchrUnqInfId"));
		map.put("pushAgrYn", get("pushAgrYn"));
		map.put("mblMchrSftrVerTxt", get("mblMchrSftrVerTxt"));
		map.put("mblMchrAppVerTxt", get("mblMchrAppVerTxt"));
		map.put("mblMchrMdlNm", get("mblMchrMdlNm"));
		map.put("userId", get("userId"));
		map.put("appDscd", get("appDscd"));
		map.put("ngItgCsno", get("ngItgCsno"));
		map.put("smtphOsTpNm", get("smtphOsTpNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 488711172:/* mchrUnqInfId */
			return getMchrUnqInfId();
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		case -1253637675:/* mblMchrSftrVerTxt */
			return getMblMchrSftrVerTxt();
		case -1937309737:/* mblMchrAppVerTxt */
			return getMblMchrAppVerTxt();
		case 1582431581:/* mblMchrMdlNm */
			return getMblMchrMdlNm();
		case -836030906:/* userId */
			return getUserId();
		case -794417423:/* appDscd */
			return getAppDscd();
		case 1650816244:/* ngItgCsno */
			return getNgItgCsno();
		case -1839547183:/* smtphOsTpNm */
			return getSmtphOsTpNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 488711172:/* mchrUnqInfId */
			setMchrUnqInfId((String)value);
			break;
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
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
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case -794417423:/* appDscd */
			setAppDscd((String)value);
			break;
		case 1650816244:/* ngItgCsno */
			setNgItgCsno((String)value);
			break;
		case -1839547183:/* smtphOsTpNm */
			setSmtphOsTpNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
