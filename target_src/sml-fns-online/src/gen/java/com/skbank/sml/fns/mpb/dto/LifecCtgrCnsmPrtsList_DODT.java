/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
	"cmgnIconId", "cmgnIconNm", "goalNm", "ctgrId", "ctgrDisId", "goalAm", "usgAm", "bzBrcd", "bzbrNm", "bzbrStlCnt"
}, name="LifecCtgrCnsmPrtsList_DODT")
@XmlRootElement(name="LifecCtgrCnsmPrtsList_DODT")
@BxmCategory(logicalName="생활비.카테고리.소비.내역.목록.DBM.출력.IO", description="") 
public class LifecCtgrCnsmPrtsList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1263254815L;
	
	
	
	/**
	 * 캠페인아이콘ID
	 */
	@ApiModelProperty(
		name = "cmgnIconId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cmgnIconId")
	@BxmOmm_Field(length=3, decimal=0, description="캠페인아이콘ID", align="left", fill="")
	private String cmgnIconId= "";
	
	
	/**
	 * 캠페인아이콘명
	 */
	@ApiModelProperty(
		name = "cmgnIconNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cmgnIconNm")
	@BxmOmm_Field(length=100, decimal=0, description="캠페인아이콘명", align="left", fill="")
	private String cmgnIconNm= "";
	
	
	/**
	 * 목표명
	 */
	@ApiModelProperty(
		name = "goalNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalNm")
	@BxmOmm_Field(length=40, decimal=0, description="목표명", align="left", fill="")
	private String goalNm= "";
	
	
	/**
	 * 카테고리ID
	 */
	@ApiModelProperty(
		name = "ctgrId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctgrId")
	@BxmOmm_Field(length=36, decimal=0, description="카테고리ID", align="left", fill="")
	private String ctgrId= "";
	
	
	/**
	 * 카테고리구분ID
	 */
	@ApiModelProperty(
		name = "ctgrDisId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctgrDisId")
	@BxmOmm_Field(length=1, decimal=0, description="카테고리구분ID", align="left", fill="")
	private String ctgrDisId= "";
	
	
	/**
	 * 목표금액
	 */
	@ApiModelProperty(
		name = "goalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("goalAm")
	@BxmOmm_Field(length=18, decimal=0, description="목표금액", align="right", fill="")
	private BigDecimal goalAm= new BigDecimal("0");
	
	
	/**
	 * 사용금액
	 */
	@ApiModelProperty(
		name = "usgAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("usgAm")
	@BxmOmm_Field(length=13, decimal=0, description="사용금액", align="right", fill="")
	private BigDecimal usgAm= new BigDecimal("0");
	
	
	/**
	 * 영업점코드
	 */
	@ApiModelProperty(
		name = "bzBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="영업점코드", align="left", fill="")
	private String bzBrcd= "";
	
	
	/**
	 * 영업점명
	 */
	@ApiModelProperty(
		name = "bzbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="영업점명", align="left", fill="")
	private String bzbrNm= "";
	
	
	/**
	 * 영업점결제건수
	 */
	@ApiModelProperty(
		name = "bzbrStlCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("bzbrStlCnt")
	@BxmOmm_Field(length=10, decimal=0, description="영업점결제건수", align="right", fill="")
	private Integer bzbrStlCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cmgnIconId= false;
	protected final boolean isSet_cmgnIconId(){
		return this.isSet_cmgnIconId;
	}
	private void setIsSet_cmgnIconId(boolean value){
		this.isSet_cmgnIconId= value;
	}
	/**
	 * 캠페인아이콘ID
	 */
	@XmlTransient
	public String getCmgnIconId(){
		return this.cmgnIconId;
	}
	
	/**
	 * 캠페인아이콘ID
	 * 
	 * @param cmgnIconId 캠페인아이콘ID
	 */
	public void setCmgnIconId(String cmgnIconId){
		this.cmgnIconId= cmgnIconId;
		this.setIsSet_cmgnIconId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cmgnIconNm= false;
	protected final boolean isSet_cmgnIconNm(){
		return this.isSet_cmgnIconNm;
	}
	private void setIsSet_cmgnIconNm(boolean value){
		this.isSet_cmgnIconNm= value;
	}
	/**
	 * 캠페인아이콘명
	 */
	@XmlTransient
	public String getCmgnIconNm(){
		return this.cmgnIconNm;
	}
	
	/**
	 * 캠페인아이콘명
	 * 
	 * @param cmgnIconNm 캠페인아이콘명
	 */
	public void setCmgnIconNm(String cmgnIconNm){
		this.cmgnIconNm= cmgnIconNm;
		this.setIsSet_cmgnIconNm(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctgrId= false;
	protected final boolean isSet_ctgrId(){
		return this.isSet_ctgrId;
	}
	private void setIsSet_ctgrId(boolean value){
		this.isSet_ctgrId= value;
	}
	/**
	 * 카테고리ID
	 */
	@XmlTransient
	public String getCtgrId(){
		return this.ctgrId;
	}
	
	/**
	 * 카테고리ID
	 * 
	 * @param ctgrId 카테고리ID
	 */
	public void setCtgrId(String ctgrId){
		this.ctgrId= ctgrId;
		this.setIsSet_ctgrId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctgrDisId= false;
	protected final boolean isSet_ctgrDisId(){
		return this.isSet_ctgrDisId;
	}
	private void setIsSet_ctgrDisId(boolean value){
		this.isSet_ctgrDisId= value;
	}
	/**
	 * 카테고리구분ID
	 */
	@XmlTransient
	public String getCtgrDisId(){
		return this.ctgrDisId;
	}
	
	/**
	 * 카테고리구분ID
	 * 
	 * @param ctgrDisId 카테고리구분ID
	 */
	public void setCtgrDisId(String ctgrDisId){
		this.ctgrDisId= ctgrDisId;
		this.setIsSet_ctgrDisId(true);
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
	 * BigDecimal - Double value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(double goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(long goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(String goalAm) {
		setGoalAm(new BigDecimal(goalAm));
	}
	/**
	 * 목표금액
	 */
	@XmlTransient
	public BigDecimal getGoalAm(){
		return this.goalAm;
	}
	
	/**
	 * 목표금액
	 * 
	 * @param goalAm 목표금액
	 */
	@JsonSetter("goalAm")
	public void setGoalAm(BigDecimal goalAm){
		this.goalAm= goalAm;
		this.setIsSet_goalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_usgAm= false;
	protected final boolean isSet_usgAm(){
		return this.isSet_usgAm;
	}
	private void setIsSet_usgAm(boolean value){
		this.isSet_usgAm= value;
	}
	/**
	 * 사용금액
	 * BigDecimal - Double value setter
	 *
	 * @Param usgAm 사용금액
	 */
	public void setUsgAm(double usgAm) {
		setUsgAm(BigDecimal.valueOf(usgAm));
	}
	/**
	 * 사용금액
	 * BigDecimal - Long value setter
	 *
	 * @Param usgAm 사용금액
	 */
	public void setUsgAm(long usgAm) {
		setUsgAm(BigDecimal.valueOf(usgAm));
	}
	/**
	 * 사용금액
	 * BigDecimal - String value setter
	 *
	 * @Param usgAm 사용금액
	 */
	public void setUsgAm(String usgAm) {
		setUsgAm(new BigDecimal(usgAm));
	}
	/**
	 * 사용금액
	 */
	@XmlTransient
	public BigDecimal getUsgAm(){
		return this.usgAm;
	}
	
	/**
	 * 사용금액
	 * 
	 * @param usgAm 사용금액
	 */
	@JsonSetter("usgAm")
	public void setUsgAm(BigDecimal usgAm){
		this.usgAm= usgAm;
		this.setIsSet_usgAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzBrcd= false;
	protected final boolean isSet_bzBrcd(){
		return this.isSet_bzBrcd;
	}
	private void setIsSet_bzBrcd(boolean value){
		this.isSet_bzBrcd= value;
	}
	/**
	 * 영업점코드
	 */
	@XmlTransient
	public String getBzBrcd(){
		return this.bzBrcd;
	}
	
	/**
	 * 영업점코드
	 * 
	 * @param bzBrcd 영업점코드
	 */
	public void setBzBrcd(String bzBrcd){
		this.bzBrcd= bzBrcd;
		this.setIsSet_bzBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzbrNm= false;
	protected final boolean isSet_bzbrNm(){
		return this.isSet_bzbrNm;
	}
	private void setIsSet_bzbrNm(boolean value){
		this.isSet_bzbrNm= value;
	}
	/**
	 * 영업점명
	 */
	@XmlTransient
	public String getBzbrNm(){
		return this.bzbrNm;
	}
	
	/**
	 * 영업점명
	 * 
	 * @param bzbrNm 영업점명
	 */
	public void setBzbrNm(String bzbrNm){
		this.bzbrNm= bzbrNm;
		this.setIsSet_bzbrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzbrStlCnt= false;
	protected final boolean isSet_bzbrStlCnt(){
		return this.isSet_bzbrStlCnt;
	}
	private void setIsSet_bzbrStlCnt(boolean value){
		this.isSet_bzbrStlCnt= value;
	}
	/**
	 * 영업점결제건수
	 */
	@XmlTransient
	public Integer getBzbrStlCnt(){
		return this.bzbrStlCnt;
	}
	
	/**
	 * 영업점결제건수
	 * 
	 * @param bzbrStlCnt 영업점결제건수
	 */
	public void setBzbrStlCnt(Integer bzbrStlCnt){
		this.bzbrStlCnt= bzbrStlCnt;
		this.setIsSet_bzbrStlCnt(true);
	}
				
	@Override
	public LifecCtgrCnsmPrtsList_DODT clone(){
		try{
			LifecCtgrCnsmPrtsList_DODT object= (LifecCtgrCnsmPrtsList_DODT)super.clone();
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
		
		result= prime * result + ((this.cmgnIconId==null)?0:this.cmgnIconId.hashCode());
		result= prime * result + ((this.cmgnIconNm==null)?0:this.cmgnIconNm.hashCode());
		result= prime * result + ((this.goalNm==null)?0:this.goalNm.hashCode());
		result= prime * result + ((this.ctgrId==null)?0:this.ctgrId.hashCode());
		result= prime * result + ((this.ctgrDisId==null)?0:this.ctgrDisId.hashCode());
		result= prime * result + ((this.goalAm==null)?0:this.goalAm.hashCode());
		result= prime * result + ((this.usgAm==null)?0:this.usgAm.hashCode());
		result= prime * result + ((this.bzBrcd==null)?0:this.bzBrcd.hashCode());
		result= prime * result + ((this.bzbrNm==null)?0:this.bzbrNm.hashCode());
		result= prime * result + ((this.bzbrStlCnt==null)?0:this.bzbrStlCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final LifecCtgrCnsmPrtsList_DODT other= (LifecCtgrCnsmPrtsList_DODT)obj;
		{
			Object _cmgnIconId= getCmgnIconId();
			Object __cmgnIconId= other.getCmgnIconId();
			if ( _cmgnIconId== null ) { if ( __cmgnIconId!= null ) return false; }
			else if ( !_cmgnIconId.equals(__cmgnIconId) ) return false;
		}
		{
			Object _cmgnIconNm= getCmgnIconNm();
			Object __cmgnIconNm= other.getCmgnIconNm();
			if ( _cmgnIconNm== null ) { if ( __cmgnIconNm!= null ) return false; }
			else if ( !_cmgnIconNm.equals(__cmgnIconNm) ) return false;
		}
		{
			Object _goalNm= getGoalNm();
			Object __goalNm= other.getGoalNm();
			if ( _goalNm== null ) { if ( __goalNm!= null ) return false; }
			else if ( !_goalNm.equals(__goalNm) ) return false;
		}
		{
			Object _ctgrId= getCtgrId();
			Object __ctgrId= other.getCtgrId();
			if ( _ctgrId== null ) { if ( __ctgrId!= null ) return false; }
			else if ( !_ctgrId.equals(__ctgrId) ) return false;
		}
		{
			Object _ctgrDisId= getCtgrDisId();
			Object __ctgrDisId= other.getCtgrDisId();
			if ( _ctgrDisId== null ) { if ( __ctgrDisId!= null ) return false; }
			else if ( !_ctgrDisId.equals(__ctgrDisId) ) return false;
		}
		{
			Object _goalAm= getGoalAm();
			Object __goalAm= other.getGoalAm();
			if ( _goalAm== null ) { if ( __goalAm!= null ) return false; }
			else if ( !_goalAm.equals(__goalAm) ) return false;
		}
		{
			Object _usgAm= getUsgAm();
			Object __usgAm= other.getUsgAm();
			if ( _usgAm== null ) { if ( __usgAm!= null ) return false; }
			else if ( !_usgAm.equals(__usgAm) ) return false;
		}
		{
			Object _bzBrcd= getBzBrcd();
			Object __bzBrcd= other.getBzBrcd();
			if ( _bzBrcd== null ) { if ( __bzBrcd!= null ) return false; }
			else if ( !_bzBrcd.equals(__bzBrcd) ) return false;
		}
		{
			Object _bzbrNm= getBzbrNm();
			Object __bzbrNm= other.getBzbrNm();
			if ( _bzbrNm== null ) { if ( __bzbrNm!= null ) return false; }
			else if ( !_bzbrNm.equals(__bzbrNm) ) return false;
		}
		{
			Object _bzbrStlCnt= getBzbrStlCnt();
			Object __bzbrStlCnt= other.getBzbrStlCnt();
			if ( _bzbrStlCnt== null ) { if ( __bzbrStlCnt!= null ) return false; }
			else if ( !_bzbrStlCnt.equals(__bzbrStlCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(LifecCtgrCnsmPrtsList_DODT.class.getName()).append(":\n");
		sb.append("\tcmgnIconId: ");
		sb.append(cmgnIconId==null?"null":getCmgnIconId());
		sb.append("\n");
		sb.append("\tcmgnIconNm: ");
		sb.append(cmgnIconNm==null?"null":getCmgnIconNm());
		sb.append("\n");
		sb.append("\tgoalNm: ");
		sb.append(goalNm==null?"null":getGoalNm());
		sb.append("\n");
		sb.append("\tctgrId: ");
		sb.append(ctgrId==null?"null":getCtgrId());
		sb.append("\n");
		sb.append("\tctgrDisId: ");
		sb.append(ctgrDisId==null?"null":getCtgrDisId());
		sb.append("\n");
		sb.append("\tgoalAm: ");
		sb.append(goalAm==null?"null":getGoalAm());
		sb.append("\n");
		sb.append("\tusgAm: ");
		sb.append(usgAm==null?"null":getUsgAm());
		sb.append("\n");
		sb.append("\tbzBrcd: ");
		sb.append(bzBrcd==null?"null":getBzBrcd());
		sb.append("\n");
		sb.append("\tbzbrNm: ");
		sb.append(bzbrNm==null?"null":getBzbrNm());
		sb.append("\n");
		sb.append("\tbzbrStlCnt: ");
		sb.append(bzbrStlCnt==null?"null":getBzbrStlCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* cmgnIconId */
		messageLen+= 100; /* cmgnIconNm */
		messageLen+= 40; /* goalNm */
		messageLen+= 36; /* ctgrId */
		messageLen+= 1; /* ctgrDisId */
		messageLen+= 18; /* goalAm */
		messageLen+= 13; /* usgAm */
		messageLen+= 6; /* bzBrcd */
		messageLen+= 50; /* bzbrNm */
		messageLen+= 10; /* bzbrStlCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cmgnIconId");
		list.add("cmgnIconNm");
		list.add("goalNm");
		list.add("ctgrId");
		list.add("ctgrDisId");
		list.add("goalAm");
		list.add("usgAm");
		list.add("bzBrcd");
		list.add("bzbrNm");
		list.add("bzbrStlCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cmgnIconId", get("cmgnIconId"));
		map.put("cmgnIconNm", get("cmgnIconNm"));
		map.put("goalNm", get("goalNm"));
		map.put("ctgrId", get("ctgrId"));
		map.put("ctgrDisId", get("ctgrDisId"));
		map.put("goalAm", get("goalAm"));
		map.put("usgAm", get("usgAm"));
		map.put("bzBrcd", get("bzBrcd"));
		map.put("bzbrNm", get("bzbrNm"));
		map.put("bzbrStlCnt", get("bzbrStlCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1572242011:/* cmgnIconId */
			return getCmgnIconId();
		case -1572241847:/* cmgnIconNm */
			return getCmgnIconNm();
		case -1240657870:/* goalNm */
			return getGoalNm();
		case -1350372521:/* ctgrId */
			return getCtgrId();
		case 2006532749:/* ctgrDisId */
			return getCtgrDisId();
		case -1240658273:/* goalAm */
			return getGoalAm();
		case 111579029:/* usgAm */
			return getUsgAm();
		case -1374562007:/* bzBrcd */
			return getBzBrcd();
		case -1373609337:/* bzbrNm */
			return getBzbrNm();
		case 329959430:/* bzbrStlCnt */
			return getBzbrStlCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1572242011:/* cmgnIconId */
			setCmgnIconId((String)value);
			break;
		case -1572241847:/* cmgnIconNm */
			setCmgnIconNm((String)value);
			break;
		case -1240657870:/* goalNm */
			setGoalNm((String)value);
			break;
		case -1350372521:/* ctgrId */
			setCtgrId((String)value);
			break;
		case 2006532749:/* ctgrDisId */
			setCtgrDisId((String)value);
			break;
		case -1240658273:/* goalAm */
			if ( value instanceof String ){
				setGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setGoalAm((Long)value);
			}
			else{
				setGoalAm((BigDecimal)value);
			}
			break;
		case 111579029:/* usgAm */
			if ( value instanceof String ){
				setUsgAm((String)value);
			}
			else if ( value instanceof Double ){
				setUsgAm((Double)value);
			}
			else if ( value instanceof Long ){
				setUsgAm((Long)value);
			}
			else{
				setUsgAm((BigDecimal)value);
			}
			break;
		case -1374562007:/* bzBrcd */
			setBzBrcd((String)value);
			break;
		case -1373609337:/* bzbrNm */
			setBzbrNm((String)value);
			break;
		case 329959430:/* bzbrStlCnt */
			setBzbrStlCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
