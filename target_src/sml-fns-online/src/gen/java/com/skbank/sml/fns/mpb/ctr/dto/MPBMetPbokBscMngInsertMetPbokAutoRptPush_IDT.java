/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"metMngNo", "metMsgCadId", "metMsgCadNm", "metMsgCadTxt", "appMarkImgPathTxt", "autoRptTxt1", "autoRptTxt2", "autoRptTxt3", "autoRptTxt4", "autoRptTxt5", "autoRptTxt6"
}, name="MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT")
@XmlRootElement(name="MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT")
@BxmCategory(logicalName="모임통장.관리.자동.리포트.푸쉬.생성.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -887116700L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임메시지카드ID
	 */
	@ApiModelProperty(
		name = "metMsgCadId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadId")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드ID", align="left", fill="")
	private String metMsgCadId= "";
	
	
	/**
	 * 모임메시지카드명
	 */
	@ApiModelProperty(
		name = "metMsgCadNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임메시지카드명", align="left", fill="")
	private String metMsgCadNm= "";
	
	
	/**
	 * 모임메시지카드내용
	 */
	@ApiModelProperty(
		name = "metMsgCadTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadTxt")
	@BxmOmm_Field(length=500, decimal=0, description="모임메시지카드내용", align="left", fill="")
	private String metMsgCadTxt= "";
	
	
	/**
	 * 앱표시이미지경로내용
	 */
	@ApiModelProperty(
		name = "appMarkImgPathTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appMarkImgPathTxt")
	@BxmOmm_Field(length=500, decimal=0, description="앱표시이미지경로내용", align="left", fill="")
	private String appMarkImgPathTxt= "";
	
	
	/**
	 * 자동리포팅내용1
	 */
	@ApiModelProperty(
		name = "autoRptTxt1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt1")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용1", align="left", fill="")
	private String autoRptTxt1= "";
	
	
	/**
	 * 자동리포팅내용2
	 */
	@ApiModelProperty(
		name = "autoRptTxt2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt2")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용2", align="left", fill="")
	private String autoRptTxt2= "";
	
	
	/**
	 * 자동리포팅내용3
	 */
	@ApiModelProperty(
		name = "autoRptTxt3"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt3")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용3", align="left", fill="")
	private String autoRptTxt3= "";
	
	
	/**
	 * 자동리포팅내용4
	 */
	@ApiModelProperty(
		name = "autoRptTxt4"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt4")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용4", align="left", fill="")
	private String autoRptTxt4= "";
	
	
	/**
	 * 자동리포팅내용5
	 */
	@ApiModelProperty(
		name = "autoRptTxt5"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt5")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용5", align="left", fill="")
	private String autoRptTxt5= "";
	
	
	/**
	 * 자동리포팅내용6
	 */
	@ApiModelProperty(
		name = "autoRptTxt6"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRptTxt6")
	@BxmOmm_Field(length=100, decimal=0, description="자동리포팅내용6", align="left", fill="")
	private String autoRptTxt6= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadId= false;
	protected final boolean isSet_metMsgCadId(){
		return this.isSet_metMsgCadId;
	}
	private void setIsSet_metMsgCadId(boolean value){
		this.isSet_metMsgCadId= value;
	}
	/**
	 * 모임메시지카드ID
	 */
	@XmlTransient
	public String getMetMsgCadId(){
		return this.metMsgCadId;
	}
	
	/**
	 * 모임메시지카드ID
	 * 
	 * @param metMsgCadId 모임메시지카드ID
	 */
	public void setMetMsgCadId(String metMsgCadId){
		this.metMsgCadId= metMsgCadId;
		this.setIsSet_metMsgCadId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadNm= false;
	protected final boolean isSet_metMsgCadNm(){
		return this.isSet_metMsgCadNm;
	}
	private void setIsSet_metMsgCadNm(boolean value){
		this.isSet_metMsgCadNm= value;
	}
	/**
	 * 모임메시지카드명
	 */
	@XmlTransient
	public String getMetMsgCadNm(){
		return this.metMsgCadNm;
	}
	
	/**
	 * 모임메시지카드명
	 * 
	 * @param metMsgCadNm 모임메시지카드명
	 */
	public void setMetMsgCadNm(String metMsgCadNm){
		this.metMsgCadNm= metMsgCadNm;
		this.setIsSet_metMsgCadNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadTxt= false;
	protected final boolean isSet_metMsgCadTxt(){
		return this.isSet_metMsgCadTxt;
	}
	private void setIsSet_metMsgCadTxt(boolean value){
		this.isSet_metMsgCadTxt= value;
	}
	/**
	 * 모임메시지카드내용
	 */
	@XmlTransient
	public String getMetMsgCadTxt(){
		return this.metMsgCadTxt;
	}
	
	/**
	 * 모임메시지카드내용
	 * 
	 * @param metMsgCadTxt 모임메시지카드내용
	 */
	public void setMetMsgCadTxt(String metMsgCadTxt){
		this.metMsgCadTxt= metMsgCadTxt;
		this.setIsSet_metMsgCadTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appMarkImgPathTxt= false;
	protected final boolean isSet_appMarkImgPathTxt(){
		return this.isSet_appMarkImgPathTxt;
	}
	private void setIsSet_appMarkImgPathTxt(boolean value){
		this.isSet_appMarkImgPathTxt= value;
	}
	/**
	 * 앱표시이미지경로내용
	 */
	@XmlTransient
	public String getAppMarkImgPathTxt(){
		return this.appMarkImgPathTxt;
	}
	
	/**
	 * 앱표시이미지경로내용
	 * 
	 * @param appMarkImgPathTxt 앱표시이미지경로내용
	 */
	public void setAppMarkImgPathTxt(String appMarkImgPathTxt){
		this.appMarkImgPathTxt= appMarkImgPathTxt;
		this.setIsSet_appMarkImgPathTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt1= false;
	protected final boolean isSet_autoRptTxt1(){
		return this.isSet_autoRptTxt1;
	}
	private void setIsSet_autoRptTxt1(boolean value){
		this.isSet_autoRptTxt1= value;
	}
	/**
	 * 자동리포팅내용1
	 */
	@XmlTransient
	public String getAutoRptTxt1(){
		return this.autoRptTxt1;
	}
	
	/**
	 * 자동리포팅내용1
	 * 
	 * @param autoRptTxt1 자동리포팅내용1
	 */
	public void setAutoRptTxt1(String autoRptTxt1){
		this.autoRptTxt1= autoRptTxt1;
		this.setIsSet_autoRptTxt1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt2= false;
	protected final boolean isSet_autoRptTxt2(){
		return this.isSet_autoRptTxt2;
	}
	private void setIsSet_autoRptTxt2(boolean value){
		this.isSet_autoRptTxt2= value;
	}
	/**
	 * 자동리포팅내용2
	 */
	@XmlTransient
	public String getAutoRptTxt2(){
		return this.autoRptTxt2;
	}
	
	/**
	 * 자동리포팅내용2
	 * 
	 * @param autoRptTxt2 자동리포팅내용2
	 */
	public void setAutoRptTxt2(String autoRptTxt2){
		this.autoRptTxt2= autoRptTxt2;
		this.setIsSet_autoRptTxt2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt3= false;
	protected final boolean isSet_autoRptTxt3(){
		return this.isSet_autoRptTxt3;
	}
	private void setIsSet_autoRptTxt3(boolean value){
		this.isSet_autoRptTxt3= value;
	}
	/**
	 * 자동리포팅내용3
	 */
	@XmlTransient
	public String getAutoRptTxt3(){
		return this.autoRptTxt3;
	}
	
	/**
	 * 자동리포팅내용3
	 * 
	 * @param autoRptTxt3 자동리포팅내용3
	 */
	public void setAutoRptTxt3(String autoRptTxt3){
		this.autoRptTxt3= autoRptTxt3;
		this.setIsSet_autoRptTxt3(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt4= false;
	protected final boolean isSet_autoRptTxt4(){
		return this.isSet_autoRptTxt4;
	}
	private void setIsSet_autoRptTxt4(boolean value){
		this.isSet_autoRptTxt4= value;
	}
	/**
	 * 자동리포팅내용4
	 */
	@XmlTransient
	public String getAutoRptTxt4(){
		return this.autoRptTxt4;
	}
	
	/**
	 * 자동리포팅내용4
	 * 
	 * @param autoRptTxt4 자동리포팅내용4
	 */
	public void setAutoRptTxt4(String autoRptTxt4){
		this.autoRptTxt4= autoRptTxt4;
		this.setIsSet_autoRptTxt4(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt5= false;
	protected final boolean isSet_autoRptTxt5(){
		return this.isSet_autoRptTxt5;
	}
	private void setIsSet_autoRptTxt5(boolean value){
		this.isSet_autoRptTxt5= value;
	}
	/**
	 * 자동리포팅내용5
	 */
	@XmlTransient
	public String getAutoRptTxt5(){
		return this.autoRptTxt5;
	}
	
	/**
	 * 자동리포팅내용5
	 * 
	 * @param autoRptTxt5 자동리포팅내용5
	 */
	public void setAutoRptTxt5(String autoRptTxt5){
		this.autoRptTxt5= autoRptTxt5;
		this.setIsSet_autoRptTxt5(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRptTxt6= false;
	protected final boolean isSet_autoRptTxt6(){
		return this.isSet_autoRptTxt6;
	}
	private void setIsSet_autoRptTxt6(boolean value){
		this.isSet_autoRptTxt6= value;
	}
	/**
	 * 자동리포팅내용6
	 */
	@XmlTransient
	public String getAutoRptTxt6(){
		return this.autoRptTxt6;
	}
	
	/**
	 * 자동리포팅내용6
	 * 
	 * @param autoRptTxt6 자동리포팅내용6
	 */
	public void setAutoRptTxt6(String autoRptTxt6){
		this.autoRptTxt6= autoRptTxt6;
		this.setIsSet_autoRptTxt6(true);
	}
				
	@Override
	public MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT clone(){
		try{
			MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT object= (MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metMsgCadId==null)?0:this.metMsgCadId.hashCode());
		result= prime * result + ((this.metMsgCadNm==null)?0:this.metMsgCadNm.hashCode());
		result= prime * result + ((this.metMsgCadTxt==null)?0:this.metMsgCadTxt.hashCode());
		result= prime * result + ((this.appMarkImgPathTxt==null)?0:this.appMarkImgPathTxt.hashCode());
		result= prime * result + ((this.autoRptTxt1==null)?0:this.autoRptTxt1.hashCode());
		result= prime * result + ((this.autoRptTxt2==null)?0:this.autoRptTxt2.hashCode());
		result= prime * result + ((this.autoRptTxt3==null)?0:this.autoRptTxt3.hashCode());
		result= prime * result + ((this.autoRptTxt4==null)?0:this.autoRptTxt4.hashCode());
		result= prime * result + ((this.autoRptTxt5==null)?0:this.autoRptTxt5.hashCode());
		result= prime * result + ((this.autoRptTxt6==null)?0:this.autoRptTxt6.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT other= (MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metMsgCadId= getMetMsgCadId();
			Object __metMsgCadId= other.getMetMsgCadId();
			if ( _metMsgCadId== null ) { if ( __metMsgCadId!= null ) return false; }
			else if ( !_metMsgCadId.equals(__metMsgCadId) ) return false;
		}
		{
			Object _metMsgCadNm= getMetMsgCadNm();
			Object __metMsgCadNm= other.getMetMsgCadNm();
			if ( _metMsgCadNm== null ) { if ( __metMsgCadNm!= null ) return false; }
			else if ( !_metMsgCadNm.equals(__metMsgCadNm) ) return false;
		}
		{
			Object _metMsgCadTxt= getMetMsgCadTxt();
			Object __metMsgCadTxt= other.getMetMsgCadTxt();
			if ( _metMsgCadTxt== null ) { if ( __metMsgCadTxt!= null ) return false; }
			else if ( !_metMsgCadTxt.equals(__metMsgCadTxt) ) return false;
		}
		{
			Object _appMarkImgPathTxt= getAppMarkImgPathTxt();
			Object __appMarkImgPathTxt= other.getAppMarkImgPathTxt();
			if ( _appMarkImgPathTxt== null ) { if ( __appMarkImgPathTxt!= null ) return false; }
			else if ( !_appMarkImgPathTxt.equals(__appMarkImgPathTxt) ) return false;
		}
		{
			Object _autoRptTxt1= getAutoRptTxt1();
			Object __autoRptTxt1= other.getAutoRptTxt1();
			if ( _autoRptTxt1== null ) { if ( __autoRptTxt1!= null ) return false; }
			else if ( !_autoRptTxt1.equals(__autoRptTxt1) ) return false;
		}
		{
			Object _autoRptTxt2= getAutoRptTxt2();
			Object __autoRptTxt2= other.getAutoRptTxt2();
			if ( _autoRptTxt2== null ) { if ( __autoRptTxt2!= null ) return false; }
			else if ( !_autoRptTxt2.equals(__autoRptTxt2) ) return false;
		}
		{
			Object _autoRptTxt3= getAutoRptTxt3();
			Object __autoRptTxt3= other.getAutoRptTxt3();
			if ( _autoRptTxt3== null ) { if ( __autoRptTxt3!= null ) return false; }
			else if ( !_autoRptTxt3.equals(__autoRptTxt3) ) return false;
		}
		{
			Object _autoRptTxt4= getAutoRptTxt4();
			Object __autoRptTxt4= other.getAutoRptTxt4();
			if ( _autoRptTxt4== null ) { if ( __autoRptTxt4!= null ) return false; }
			else if ( !_autoRptTxt4.equals(__autoRptTxt4) ) return false;
		}
		{
			Object _autoRptTxt5= getAutoRptTxt5();
			Object __autoRptTxt5= other.getAutoRptTxt5();
			if ( _autoRptTxt5== null ) { if ( __autoRptTxt5!= null ) return false; }
			else if ( !_autoRptTxt5.equals(__autoRptTxt5) ) return false;
		}
		{
			Object _autoRptTxt6= getAutoRptTxt6();
			Object __autoRptTxt6= other.getAutoRptTxt6();
			if ( _autoRptTxt6== null ) { if ( __autoRptTxt6!= null ) return false; }
			else if ( !_autoRptTxt6.equals(__autoRptTxt6) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMsgCadId: ");
		sb.append(metMsgCadId==null?"null":getMetMsgCadId());
		sb.append("\n");
		sb.append("\tmetMsgCadNm: ");
		sb.append(metMsgCadNm==null?"null":getMetMsgCadNm());
		sb.append("\n");
		sb.append("\tmetMsgCadTxt: ");
		sb.append(metMsgCadTxt==null?"null":getMetMsgCadTxt());
		sb.append("\n");
		sb.append("\tappMarkImgPathTxt: ");
		sb.append(appMarkImgPathTxt==null?"null":getAppMarkImgPathTxt());
		sb.append("\n");
		sb.append("\tautoRptTxt1: ");
		sb.append(autoRptTxt1==null?"null":getAutoRptTxt1());
		sb.append("\n");
		sb.append("\tautoRptTxt2: ");
		sb.append(autoRptTxt2==null?"null":getAutoRptTxt2());
		sb.append("\n");
		sb.append("\tautoRptTxt3: ");
		sb.append(autoRptTxt3==null?"null":getAutoRptTxt3());
		sb.append("\n");
		sb.append("\tautoRptTxt4: ");
		sb.append(autoRptTxt4==null?"null":getAutoRptTxt4());
		sb.append("\n");
		sb.append("\tautoRptTxt5: ");
		sb.append(autoRptTxt5==null?"null":getAutoRptTxt5());
		sb.append("\n");
		sb.append("\tautoRptTxt6: ");
		sb.append(autoRptTxt6==null?"null":getAutoRptTxt6());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 20; /* metMsgCadId */
		messageLen+= 50; /* metMsgCadNm */
		messageLen+= 500; /* metMsgCadTxt */
		messageLen+= 500; /* appMarkImgPathTxt */
		messageLen+= 100; /* autoRptTxt1 */
		messageLen+= 100; /* autoRptTxt2 */
		messageLen+= 100; /* autoRptTxt3 */
		messageLen+= 100; /* autoRptTxt4 */
		messageLen+= 100; /* autoRptTxt5 */
		messageLen+= 100; /* autoRptTxt6 */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMsgCadId");
		list.add("metMsgCadNm");
		list.add("metMsgCadTxt");
		list.add("appMarkImgPathTxt");
		list.add("autoRptTxt1");
		list.add("autoRptTxt2");
		list.add("autoRptTxt3");
		list.add("autoRptTxt4");
		list.add("autoRptTxt5");
		list.add("autoRptTxt6");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMsgCadId", get("metMsgCadId"));
		map.put("metMsgCadNm", get("metMsgCadNm"));
		map.put("metMsgCadTxt", get("metMsgCadTxt"));
		map.put("appMarkImgPathTxt", get("appMarkImgPathTxt"));
		map.put("autoRptTxt1", get("autoRptTxt1"));
		map.put("autoRptTxt2", get("autoRptTxt2"));
		map.put("autoRptTxt3", get("autoRptTxt3"));
		map.put("autoRptTxt4", get("autoRptTxt4"));
		map.put("autoRptTxt5", get("autoRptTxt5"));
		map.put("autoRptTxt6", get("autoRptTxt6"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1423700356:/* metMsgCadId */
			return getMetMsgCadId();
		case -1423700192:/* metMsgCadNm */
			return getMetMsgCadNm();
		case -1185026769:/* metMsgCadTxt */
			return getMetMsgCadTxt();
		case 1374914038:/* appMarkImgPathTxt */
			return getAppMarkImgPathTxt();
		case 21337640:/* autoRptTxt1 */
			return getAutoRptTxt1();
		case 21337641:/* autoRptTxt2 */
			return getAutoRptTxt2();
		case 21337642:/* autoRptTxt3 */
			return getAutoRptTxt3();
		case 21337643:/* autoRptTxt4 */
			return getAutoRptTxt4();
		case 21337644:/* autoRptTxt5 */
			return getAutoRptTxt5();
		case 21337645:/* autoRptTxt6 */
			return getAutoRptTxt6();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -1423700356:/* metMsgCadId */
			setMetMsgCadId((String)value);
			break;
		case -1423700192:/* metMsgCadNm */
			setMetMsgCadNm((String)value);
			break;
		case -1185026769:/* metMsgCadTxt */
			setMetMsgCadTxt((String)value);
			break;
		case 1374914038:/* appMarkImgPathTxt */
			setAppMarkImgPathTxt((String)value);
			break;
		case 21337640:/* autoRptTxt1 */
			setAutoRptTxt1((String)value);
			break;
		case 21337641:/* autoRptTxt2 */
			setAutoRptTxt2((String)value);
			break;
		case 21337642:/* autoRptTxt3 */
			setAutoRptTxt3((String)value);
			break;
		case 21337643:/* autoRptTxt4 */
			setAutoRptTxt4((String)value);
			break;
		case 21337644:/* autoRptTxt5 */
			setAutoRptTxt5((String)value);
			break;
		case 21337645:/* autoRptTxt6 */
			setAutoRptTxt6((String)value);
			break;
		default:
			break;
		}
	}
	
}
