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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"acno", "spceSrvcJnngDt", "goalNtfcYn"
}, name="PBPPbokSpceBscMngSelectSrvcbscinf_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectSrvcbscinf_ODT")
@BxmCategory(logicalName="메인.공간.정보.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectSrvcbscinf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1476966906L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 공간서비스가입일자
	 */
	@ApiModelProperty(
		name = "spceSrvcJnngDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrvcJnngDt")
	@BxmOmm_Field(length=8, decimal=0, description="공간서비스가입일자", align="left", fill="")
	private String spceSrvcJnngDt= "";
	
	
	/**
	 * 목표알림여부
	 */
	@ApiModelProperty(
		name = "goalNtfcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalNtfcYn")
	@BxmOmm_Field(length=1, decimal=0, description="목표알림여부", align="left", fill="")
	private String goalNtfcYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrvcJnngDt= false;
	protected final boolean isSet_spceSrvcJnngDt(){
		return this.isSet_spceSrvcJnngDt;
	}
	private void setIsSet_spceSrvcJnngDt(boolean value){
		this.isSet_spceSrvcJnngDt= value;
	}
	/**
	 * 공간서비스가입일자
	 */
	@XmlTransient
	public String getSpceSrvcJnngDt(){
		return this.spceSrvcJnngDt;
	}
	
	/**
	 * 공간서비스가입일자
	 * 
	 * @param spceSrvcJnngDt 공간서비스가입일자
	 */
	public void setSpceSrvcJnngDt(String spceSrvcJnngDt){
		this.spceSrvcJnngDt= spceSrvcJnngDt;
		this.setIsSet_spceSrvcJnngDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalNtfcYn= false;
	protected final boolean isSet_goalNtfcYn(){
		return this.isSet_goalNtfcYn;
	}
	private void setIsSet_goalNtfcYn(boolean value){
		this.isSet_goalNtfcYn= value;
	}
	/**
	 * 목표알림여부
	 */
	@XmlTransient
	public String getGoalNtfcYn(){
		return this.goalNtfcYn;
	}
	
	/**
	 * 목표알림여부
	 * 
	 * @param goalNtfcYn 목표알림여부
	 */
	public void setGoalNtfcYn(String goalNtfcYn){
		this.goalNtfcYn= goalNtfcYn;
		this.setIsSet_goalNtfcYn(true);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectSrvcbscinf_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectSrvcbscinf_ODT object= (PBPPbokSpceBscMngSelectSrvcbscinf_ODT)super.clone();
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.spceSrvcJnngDt==null)?0:this.spceSrvcJnngDt.hashCode());
		result= prime * result + ((this.goalNtfcYn==null)?0:this.goalNtfcYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectSrvcbscinf_ODT other= (PBPPbokSpceBscMngSelectSrvcbscinf_ODT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _spceSrvcJnngDt= getSpceSrvcJnngDt();
			Object __spceSrvcJnngDt= other.getSpceSrvcJnngDt();
			if ( _spceSrvcJnngDt== null ) { if ( __spceSrvcJnngDt!= null ) return false; }
			else if ( !_spceSrvcJnngDt.equals(__spceSrvcJnngDt) ) return false;
		}
		{
			Object _goalNtfcYn= getGoalNtfcYn();
			Object __goalNtfcYn= other.getGoalNtfcYn();
			if ( _goalNtfcYn== null ) { if ( __goalNtfcYn!= null ) return false; }
			else if ( !_goalNtfcYn.equals(__goalNtfcYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectSrvcbscinf_ODT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tspceSrvcJnngDt: ");
		sb.append(spceSrvcJnngDt==null?"null":getSpceSrvcJnngDt());
		sb.append("\n");
		sb.append("\tgoalNtfcYn: ");
		sb.append(goalNtfcYn==null?"null":getGoalNtfcYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 8; /* spceSrvcJnngDt */
		messageLen+= 1; /* goalNtfcYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("spceSrvcJnngDt");
		list.add("goalNtfcYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("spceSrvcJnngDt", get("spceSrvcJnngDt"));
		map.put("goalNtfcYn", get("goalNtfcYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -1652106056:/* spceSrvcJnngDt */
			return getSpceSrvcJnngDt();
		case -866637717:/* goalNtfcYn */
			return getGoalNtfcYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1652106056:/* spceSrvcJnngDt */
			setSpceSrvcJnngDt((String)value);
			break;
		case -866637717:/* goalNtfcYn */
			setGoalNtfcYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
