/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"tsCyc", "tsExeDd", "tsAm", "goalAm", "goalNm"
}, name="MNPMnyPinFncTrnSelectMnpChgItm_DTO")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpChgItm_DTO")
@BxmCategory(logicalName="머니클립모으기변경정보.공통.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpChgItm_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2041840688L;
	
	
	
	/**
	 * 이체주기
	 */
	@ApiModelProperty(
		name = "tsCyc"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsCyc")
	@BxmOmm_Field(length=6, decimal=0, description="이체주기", align="left", fill="")
	private String tsCyc= "";
	
	
	/**
	 * 이체실행일
	 */
	@ApiModelProperty(
		name = "tsExeDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsExeDd")
	@BxmOmm_Field(length=10, decimal=0, description="이체실행일", align="left", fill="")
	private String tsExeDd= "";
	
	
	/**
	 * 이체금액
	 */
	@ApiModelProperty(
		name = "tsAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsAm")
	@BxmOmm_Field(length=18, decimal=0, description="이체금액", align="left", fill="")
	private String tsAm= "";
	
	
	/**
	 * 목표금액
	 */
	@ApiModelProperty(
		name = "goalAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalAm")
	@BxmOmm_Field(length=18, decimal=0, description="목표금액", align="left", fill="")
	private String goalAm= "";
	
	
	/**
	 * 목표명
	 */
	@ApiModelProperty(
		name = "goalNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalNm")
	@BxmOmm_Field(length=80, decimal=0, description="목표명", align="left", fill="")
	private String goalNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsCyc= false;
	protected final boolean isSet_tsCyc(){
		return this.isSet_tsCyc;
	}
	private void setIsSet_tsCyc(boolean value){
		this.isSet_tsCyc= value;
	}
	/**
	 * 이체주기
	 */
	@XmlTransient
	public String getTsCyc(){
		return this.tsCyc;
	}
	
	/**
	 * 이체주기
	 * 
	 * @param tsCyc 이체주기
	 */
	public void setTsCyc(String tsCyc){
		this.tsCyc= tsCyc;
		this.setIsSet_tsCyc(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsExeDd= false;
	protected final boolean isSet_tsExeDd(){
		return this.isSet_tsExeDd;
	}
	private void setIsSet_tsExeDd(boolean value){
		this.isSet_tsExeDd= value;
	}
	/**
	 * 이체실행일
	 */
	@XmlTransient
	public String getTsExeDd(){
		return this.tsExeDd;
	}
	
	/**
	 * 이체실행일
	 * 
	 * @param tsExeDd 이체실행일
	 */
	public void setTsExeDd(String tsExeDd){
		this.tsExeDd= tsExeDd;
		this.setIsSet_tsExeDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsAm= false;
	protected final boolean isSet_tsAm(){
		return this.isSet_tsAm;
	}
	private void setIsSet_tsAm(boolean value){
		this.isSet_tsAm= value;
	}
	/**
	 * 이체금액
	 */
	@XmlTransient
	public String getTsAm(){
		return this.tsAm;
	}
	
	/**
	 * 이체금액
	 * 
	 * @param tsAm 이체금액
	 */
	public void setTsAm(String tsAm){
		this.tsAm= tsAm;
		this.setIsSet_tsAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalAm= false;
	protected final boolean isSet_goalAm(){
		return this.isSet_goalAm;
	}
	private void setIsSet_goalAm(boolean value){
		this.isSet_goalAm= value;
	}
	/**
	 * 목표금액
	 */
	@XmlTransient
	public String getGoalAm(){
		return this.goalAm;
	}
	
	/**
	 * 목표금액
	 * 
	 * @param goalAm 목표금액
	 */
	public void setGoalAm(String goalAm){
		this.goalAm= goalAm;
		this.setIsSet_goalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalNm= false;
	protected final boolean isSet_goalNm(){
		return this.isSet_goalNm;
	}
	private void setIsSet_goalNm(boolean value){
		this.isSet_goalNm= value;
	}
	/**
	 * 목표명
	 */
	@XmlTransient
	public String getGoalNm(){
		return this.goalNm;
	}
	
	/**
	 * 목표명
	 * 
	 * @param goalNm 목표명
	 */
	public void setGoalNm(String goalNm){
		this.goalNm= goalNm;
		this.setIsSet_goalNm(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpChgItm_DTO clone(){
		try{
			MNPMnyPinFncTrnSelectMnpChgItm_DTO object= (MNPMnyPinFncTrnSelectMnpChgItm_DTO)super.clone();
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
		
		result= prime * result + ((this.tsCyc==null)?0:this.tsCyc.hashCode());
		result= prime * result + ((this.tsExeDd==null)?0:this.tsExeDd.hashCode());
		result= prime * result + ((this.tsAm==null)?0:this.tsAm.hashCode());
		result= prime * result + ((this.goalAm==null)?0:this.goalAm.hashCode());
		result= prime * result + ((this.goalNm==null)?0:this.goalNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpChgItm_DTO other= (MNPMnyPinFncTrnSelectMnpChgItm_DTO)obj;
		{
			Object _tsCyc= getTsCyc();
			Object __tsCyc= other.getTsCyc();
			if ( _tsCyc== null ) { if ( __tsCyc!= null ) return false; }
			else if ( !_tsCyc.equals(__tsCyc) ) return false;
		}
		{
			Object _tsExeDd= getTsExeDd();
			Object __tsExeDd= other.getTsExeDd();
			if ( _tsExeDd== null ) { if ( __tsExeDd!= null ) return false; }
			else if ( !_tsExeDd.equals(__tsExeDd) ) return false;
		}
		{
			Object _tsAm= getTsAm();
			Object __tsAm= other.getTsAm();
			if ( _tsAm== null ) { if ( __tsAm!= null ) return false; }
			else if ( !_tsAm.equals(__tsAm) ) return false;
		}
		{
			Object _goalAm= getGoalAm();
			Object __goalAm= other.getGoalAm();
			if ( _goalAm== null ) { if ( __goalAm!= null ) return false; }
			else if ( !_goalAm.equals(__goalAm) ) return false;
		}
		{
			Object _goalNm= getGoalNm();
			Object __goalNm= other.getGoalNm();
			if ( _goalNm== null ) { if ( __goalNm!= null ) return false; }
			else if ( !_goalNm.equals(__goalNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpChgItm_DTO.class.getName()).append(":\n");
		sb.append("\ttsCyc: ");
		sb.append(tsCyc==null?"null":getTsCyc());
		sb.append("\n");
		sb.append("\ttsExeDd: ");
		sb.append(tsExeDd==null?"null":getTsExeDd());
		sb.append("\n");
		sb.append("\ttsAm: ");
		sb.append(tsAm==null?"null":getTsAm());
		sb.append("\n");
		sb.append("\tgoalAm: ");
		sb.append(goalAm==null?"null":getGoalAm());
		sb.append("\n");
		sb.append("\tgoalNm: ");
		sb.append(goalNm==null?"null":getGoalNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* tsCyc */
		messageLen+= 10; /* tsExeDd */
		messageLen+= 18; /* tsAm */
		messageLen+= 18; /* goalAm */
		messageLen+= 80; /* goalNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("tsCyc");
		list.add("tsExeDd");
		list.add("tsAm");
		list.add("goalAm");
		list.add("goalNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("tsCyc", get("tsCyc"));
		map.put("tsExeDd", get("tsExeDd"));
		map.put("tsAm", get("tsAm"));
		map.put("goalAm", get("goalAm"));
		map.put("goalNm", get("goalNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110622638:/* tsCyc */
			return getTsCyc();
		case -1064005901:/* tsExeDd */
			return getTsExeDd();
		case 3568395:/* tsAm */
			return getTsAm();
		case -1240658273:/* goalAm */
			return getGoalAm();
		case -1240657870:/* goalNm */
			return getGoalNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110622638:/* tsCyc */
			setTsCyc((String)value);
			break;
		case -1064005901:/* tsExeDd */
			setTsExeDd((String)value);
			break;
		case 3568395:/* tsAm */
			setTsAm((String)value);
			break;
		case -1240658273:/* goalAm */
			setGoalAm((String)value);
			break;
		case -1240657870:/* goalNm */
			setGoalNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
