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
 * SMS입출금통지.내용삭제IDT
 */
@XmlType(propOrder={
	"fstlAct", "pwnoUsgYn", "encyPwno", "tgtAcno"
}, name="INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT")
@BxmCategory(logicalName="SMS입출금통지.내용.컨트롤러.입력.IO", description="SMS입출금통지.내용삭제IDT") 
public class INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -76219391L;
	
	
	
	/**
	 * 수수료결제계좌
	 */
	@ApiModelProperty(
		name = "fstlAct"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstlAct")
	@BxmOmm_Field(length=15, decimal=0, description="수수료결제계좌", align="left", fill="")
	private String fstlAct= "";
	
	
	/**
	 * 비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "pwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="비밀번호사용여부", align="left", fill="")
	private String pwnoUsgYn= "";
	
	
	/**
	 * 암호화비밀번호
	 */
	@ApiModelProperty(
		name = "encyPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화비밀번호", align="left", fill="")
	private String encyPwno= "";
	
	
	/**
	 * 대상계좌번호
	 */
	@ApiModelProperty(
		name = "tgtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtAcno")
	@BxmOmm_Field(length=20, decimal=0, description="대상계좌번호", align="left", fill="")
	private String tgtAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstlAct= false;
	protected final boolean isSet_fstlAct(){
		return this.isSet_fstlAct;
	}
	private void setIsSet_fstlAct(boolean value){
		this.isSet_fstlAct= value;
	}
	/**
	 * 수수료결제계좌
	 */
	@XmlTransient
	public String getFstlAct(){
		return this.fstlAct;
	}
	
	/**
	 * 수수료결제계좌
	 * 
	 * @param fstlAct 수수료결제계좌
	 */
	public void setFstlAct(String fstlAct){
		this.fstlAct= fstlAct;
		this.setIsSet_fstlAct(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pwnoUsgYn= false;
	protected final boolean isSet_pwnoUsgYn(){
		return this.isSet_pwnoUsgYn;
	}
	private void setIsSet_pwnoUsgYn(boolean value){
		this.isSet_pwnoUsgYn= value;
	}
	/**
	 * 비밀번호사용여부
	 */
	@XmlTransient
	public String getPwnoUsgYn(){
		return this.pwnoUsgYn;
	}
	
	/**
	 * 비밀번호사용여부
	 * 
	 * @param pwnoUsgYn 비밀번호사용여부
	 */
	public void setPwnoUsgYn(String pwnoUsgYn){
		this.pwnoUsgYn= pwnoUsgYn;
		this.setIsSet_pwnoUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyPwno= false;
	protected final boolean isSet_encyPwno(){
		return this.isSet_encyPwno;
	}
	private void setIsSet_encyPwno(boolean value){
		this.isSet_encyPwno= value;
	}
	/**
	 * 암호화비밀번호
	 */
	@XmlTransient
	public String getEncyPwno(){
		return this.encyPwno;
	}
	
	/**
	 * 암호화비밀번호
	 * 
	 * @param encyPwno 암호화비밀번호
	 */
	public void setEncyPwno(String encyPwno){
		this.encyPwno= encyPwno;
		this.setIsSet_encyPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tgtAcno= false;
	protected final boolean isSet_tgtAcno(){
		return this.isSet_tgtAcno;
	}
	private void setIsSet_tgtAcno(boolean value){
		this.isSet_tgtAcno= value;
	}
	/**
	 * 대상계좌번호
	 */
	@XmlTransient
	public String getTgtAcno(){
		return this.tgtAcno;
	}
	
	/**
	 * 대상계좌번호
	 * 
	 * @param tgtAcno 대상계좌번호
	 */
	public void setTgtAcno(String tgtAcno){
		this.tgtAcno= tgtAcno;
		this.setIsSet_tgtAcno(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT clone(){
		try{
			INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT object= (INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT)super.clone();
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
		
		result= prime * result + ((this.fstlAct==null)?0:this.fstlAct.hashCode());
		result= prime * result + ((this.pwnoUsgYn==null)?0:this.pwnoUsgYn.hashCode());
		result= prime * result + ((this.encyPwno==null)?0:this.encyPwno.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT other= (INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT)obj;
		{
			Object _fstlAct= getFstlAct();
			Object __fstlAct= other.getFstlAct();
			if ( _fstlAct== null ) { if ( __fstlAct!= null ) return false; }
			else if ( !_fstlAct.equals(__fstlAct) ) return false;
		}
		{
			Object _pwnoUsgYn= getPwnoUsgYn();
			Object __pwnoUsgYn= other.getPwnoUsgYn();
			if ( _pwnoUsgYn== null ) { if ( __pwnoUsgYn!= null ) return false; }
			else if ( !_pwnoUsgYn.equals(__pwnoUsgYn) ) return false;
		}
		{
			Object _encyPwno= getEncyPwno();
			Object __encyPwno= other.getEncyPwno();
			if ( _encyPwno== null ) { if ( __encyPwno!= null ) return false; }
			else if ( !_encyPwno.equals(__encyPwno) ) return false;
		}
		{
			Object _tgtAcno= getTgtAcno();
			Object __tgtAcno= other.getTgtAcno();
			if ( _tgtAcno== null ) { if ( __tgtAcno!= null ) return false; }
			else if ( !_tgtAcno.equals(__tgtAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT.class.getName()).append(":\n");
		sb.append("\tfstlAct: ");
		sb.append(fstlAct==null?"null":getFstlAct());
		sb.append("\n");
		sb.append("\tpwnoUsgYn: ");
		sb.append(pwnoUsgYn==null?"null":getPwnoUsgYn());
		sb.append("\n");
		sb.append("\tencyPwno: ");
		sb.append(encyPwno==null?"null":getEncyPwno());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* fstlAct */
		messageLen+= 1; /* pwnoUsgYn */
		messageLen+= 32; /* encyPwno */
		messageLen+= 20; /* tgtAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("fstlAct");
		list.add("pwnoUsgYn");
		list.add("encyPwno");
		list.add("tgtAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("fstlAct", get("fstlAct"));
		map.put("pwnoUsgYn", get("pwnoUsgYn"));
		map.put("encyPwno", get("encyPwno"));
		map.put("tgtAcno", get("tgtAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -561141171:/* fstlAct */
			return getFstlAct();
		case -1529384618:/* pwnoUsgYn */
			return getPwnoUsgYn();
		case 1719874951:/* encyPwno */
			return getEncyPwno();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -561141171:/* fstlAct */
			setFstlAct((String)value);
			break;
		case -1529384618:/* pwnoUsgYn */
			setPwnoUsgYn((String)value);
			break;
		case 1719874951:/* encyPwno */
			setEncyPwno((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
