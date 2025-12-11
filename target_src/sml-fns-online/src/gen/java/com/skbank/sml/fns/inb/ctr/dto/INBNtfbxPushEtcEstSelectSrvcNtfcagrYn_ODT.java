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
	"mydtMbhJnngYn", "natScrrJnngYn", "metPbokJnngYn", "pbokSprnJnngYn", "wonPlayNtfcAgrYn", "wttJnngYn", "trnPrtsNtfcAgrYn", "tdPvmNtfcAgrYn", "scrtSmsSrvcJnngYn", "pushSrvcNtfcId", "natScrrNtfcAgrYn"
}, name="INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT")
@XmlRootElement(name="INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT")
@BxmCategory(logicalName="서비스알림.동의여부.컨트롤러.출력.IO", description="") 
public class INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1706803852L;
	
	
	
	/**
	 * 마이데이터회원가입여부
	 */
	@ApiModelProperty(
		name = "mydtMbhJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mydtMbhJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="마이데이터회원가입여부", align="left", fill="")
	private String mydtMbhJnngYn= "";
	
	
	/**
	 * 국민비서가입여부
	 */
	@ApiModelProperty(
		name = "natScrrJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("natScrrJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="국민비서가입여부", align="left", fill="")
	private String natScrrJnngYn= "";
	
	
	/**
	 * 모임통장가입여부
	 */
	@ApiModelProperty(
		name = "metPbokJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장가입여부", align="left", fill="")
	private String metPbokJnngYn= "";
	
	
	/**
	 * 통장쪼개기가입여부
	 */
	@ApiModelProperty(
		name = "pbokSprnJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSprnJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장쪼개기가입여부", align="left", fill="")
	private String pbokSprnJnngYn= "";
	
	
	/**
	 * 원플레이알림동의여부
	 */
	@ApiModelProperty(
		name = "wonPlayNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wonPlayNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="원플레이알림동의여부", align="left", fill="")
	private String wonPlayNtfcAgrYn= "";
	
	
	/**
	 * 우리틴틴가입여부
	 */
	@ApiModelProperty(
		name = "wttJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wttJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="우리틴틴가입여부", align="left", fill="")
	private String wttJnngYn= "";
	
	
	/**
	 * 거래내역알림동의여부
	 */
	@ApiModelProperty(
		name = "trnPrtsNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnPrtsNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="거래내역알림동의여부", align="left", fill="")
	private String trnPrtsNtfcAgrYn= "";
	
	
	/**
	 * 오늘의급식알림동의여부
	 */
	@ApiModelProperty(
		name = "tdPvmNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tdPvmNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="오늘의급식알림동의여부", align="left", fill="")
	private String tdPvmNtfcAgrYn= "";
	
	
	/**
	 * 보안SMS가입여부
	 */
	@ApiModelProperty(
		name = "scrtSmsSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scrtSmsSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="보안SMS가입여부", align="left", fill="")
	private String scrtSmsSrvcJnngYn= "";
	
	
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
	 * 국민비서알림동의여부
	 */
	@ApiModelProperty(
		name = "natScrrNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("natScrrNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="국민비서알림동의여부", align="left", fill="")
	private String natScrrNtfcAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mydtMbhJnngYn= false;
	protected final boolean isSet_mydtMbhJnngYn(){
		return this.isSet_mydtMbhJnngYn;
	}
	private void setIsSet_mydtMbhJnngYn(boolean value){
		this.isSet_mydtMbhJnngYn= value;
	}
	/**
	 * 마이데이터회원가입여부
	 */
	@XmlTransient
	public String getMydtMbhJnngYn(){
		return this.mydtMbhJnngYn;
	}
	
	/**
	 * 마이데이터회원가입여부
	 * 
	 * @param mydtMbhJnngYn 마이데이터회원가입여부
	 */
	public void setMydtMbhJnngYn(String mydtMbhJnngYn){
		this.mydtMbhJnngYn= mydtMbhJnngYn;
		this.setIsSet_mydtMbhJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_natScrrJnngYn= false;
	protected final boolean isSet_natScrrJnngYn(){
		return this.isSet_natScrrJnngYn;
	}
	private void setIsSet_natScrrJnngYn(boolean value){
		this.isSet_natScrrJnngYn= value;
	}
	/**
	 * 국민비서가입여부
	 */
	@XmlTransient
	public String getNatScrrJnngYn(){
		return this.natScrrJnngYn;
	}
	
	/**
	 * 국민비서가입여부
	 * 
	 * @param natScrrJnngYn 국민비서가입여부
	 */
	public void setNatScrrJnngYn(String natScrrJnngYn){
		this.natScrrJnngYn= natScrrJnngYn;
		this.setIsSet_natScrrJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokJnngYn= false;
	protected final boolean isSet_metPbokJnngYn(){
		return this.isSet_metPbokJnngYn;
	}
	private void setIsSet_metPbokJnngYn(boolean value){
		this.isSet_metPbokJnngYn= value;
	}
	/**
	 * 모임통장가입여부
	 */
	@XmlTransient
	public String getMetPbokJnngYn(){
		return this.metPbokJnngYn;
	}
	
	/**
	 * 모임통장가입여부
	 * 
	 * @param metPbokJnngYn 모임통장가입여부
	 */
	public void setMetPbokJnngYn(String metPbokJnngYn){
		this.metPbokJnngYn= metPbokJnngYn;
		this.setIsSet_metPbokJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSprnJnngYn= false;
	protected final boolean isSet_pbokSprnJnngYn(){
		return this.isSet_pbokSprnJnngYn;
	}
	private void setIsSet_pbokSprnJnngYn(boolean value){
		this.isSet_pbokSprnJnngYn= value;
	}
	/**
	 * 통장쪼개기가입여부
	 */
	@XmlTransient
	public String getPbokSprnJnngYn(){
		return this.pbokSprnJnngYn;
	}
	
	/**
	 * 통장쪼개기가입여부
	 * 
	 * @param pbokSprnJnngYn 통장쪼개기가입여부
	 */
	public void setPbokSprnJnngYn(String pbokSprnJnngYn){
		this.pbokSprnJnngYn= pbokSprnJnngYn;
		this.setIsSet_pbokSprnJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wonPlayNtfcAgrYn= false;
	protected final boolean isSet_wonPlayNtfcAgrYn(){
		return this.isSet_wonPlayNtfcAgrYn;
	}
	private void setIsSet_wonPlayNtfcAgrYn(boolean value){
		this.isSet_wonPlayNtfcAgrYn= value;
	}
	/**
	 * 원플레이알림동의여부
	 */
	@XmlTransient
	public String getWonPlayNtfcAgrYn(){
		return this.wonPlayNtfcAgrYn;
	}
	
	/**
	 * 원플레이알림동의여부
	 * 
	 * @param wonPlayNtfcAgrYn 원플레이알림동의여부
	 */
	public void setWonPlayNtfcAgrYn(String wonPlayNtfcAgrYn){
		this.wonPlayNtfcAgrYn= wonPlayNtfcAgrYn;
		this.setIsSet_wonPlayNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wttJnngYn= false;
	protected final boolean isSet_wttJnngYn(){
		return this.isSet_wttJnngYn;
	}
	private void setIsSet_wttJnngYn(boolean value){
		this.isSet_wttJnngYn= value;
	}
	/**
	 * 우리틴틴가입여부
	 */
	@XmlTransient
	public String getWttJnngYn(){
		return this.wttJnngYn;
	}
	
	/**
	 * 우리틴틴가입여부
	 * 
	 * @param wttJnngYn 우리틴틴가입여부
	 */
	public void setWttJnngYn(String wttJnngYn){
		this.wttJnngYn= wttJnngYn;
		this.setIsSet_wttJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnPrtsNtfcAgrYn= false;
	protected final boolean isSet_trnPrtsNtfcAgrYn(){
		return this.isSet_trnPrtsNtfcAgrYn;
	}
	private void setIsSet_trnPrtsNtfcAgrYn(boolean value){
		this.isSet_trnPrtsNtfcAgrYn= value;
	}
	/**
	 * 거래내역알림동의여부
	 */
	@XmlTransient
	public String getTrnPrtsNtfcAgrYn(){
		return this.trnPrtsNtfcAgrYn;
	}
	
	/**
	 * 거래내역알림동의여부
	 * 
	 * @param trnPrtsNtfcAgrYn 거래내역알림동의여부
	 */
	public void setTrnPrtsNtfcAgrYn(String trnPrtsNtfcAgrYn){
		this.trnPrtsNtfcAgrYn= trnPrtsNtfcAgrYn;
		this.setIsSet_trnPrtsNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tdPvmNtfcAgrYn= false;
	protected final boolean isSet_tdPvmNtfcAgrYn(){
		return this.isSet_tdPvmNtfcAgrYn;
	}
	private void setIsSet_tdPvmNtfcAgrYn(boolean value){
		this.isSet_tdPvmNtfcAgrYn= value;
	}
	/**
	 * 오늘의급식알림동의여부
	 */
	@XmlTransient
	public String getTdPvmNtfcAgrYn(){
		return this.tdPvmNtfcAgrYn;
	}
	
	/**
	 * 오늘의급식알림동의여부
	 * 
	 * @param tdPvmNtfcAgrYn 오늘의급식알림동의여부
	 */
	public void setTdPvmNtfcAgrYn(String tdPvmNtfcAgrYn){
		this.tdPvmNtfcAgrYn= tdPvmNtfcAgrYn;
		this.setIsSet_tdPvmNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scrtSmsSrvcJnngYn= false;
	protected final boolean isSet_scrtSmsSrvcJnngYn(){
		return this.isSet_scrtSmsSrvcJnngYn;
	}
	private void setIsSet_scrtSmsSrvcJnngYn(boolean value){
		this.isSet_scrtSmsSrvcJnngYn= value;
	}
	/**
	 * 보안SMS가입여부
	 */
	@XmlTransient
	public String getScrtSmsSrvcJnngYn(){
		return this.scrtSmsSrvcJnngYn;
	}
	
	/**
	 * 보안SMS가입여부
	 * 
	 * @param scrtSmsSrvcJnngYn 보안SMS가입여부
	 */
	public void setScrtSmsSrvcJnngYn(String scrtSmsSrvcJnngYn){
		this.scrtSmsSrvcJnngYn= scrtSmsSrvcJnngYn;
		this.setIsSet_scrtSmsSrvcJnngYn(true);
	}
	
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
	private boolean isSet_natScrrNtfcAgrYn= false;
	protected final boolean isSet_natScrrNtfcAgrYn(){
		return this.isSet_natScrrNtfcAgrYn;
	}
	private void setIsSet_natScrrNtfcAgrYn(boolean value){
		this.isSet_natScrrNtfcAgrYn= value;
	}
	/**
	 * 국민비서알림동의여부
	 */
	@XmlTransient
	public String getNatScrrNtfcAgrYn(){
		return this.natScrrNtfcAgrYn;
	}
	
	/**
	 * 국민비서알림동의여부
	 * 
	 * @param natScrrNtfcAgrYn 국민비서알림동의여부
	 */
	public void setNatScrrNtfcAgrYn(String natScrrNtfcAgrYn){
		this.natScrrNtfcAgrYn= natScrrNtfcAgrYn;
		this.setIsSet_natScrrNtfcAgrYn(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT clone(){
		try{
			INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT object= (INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.mydtMbhJnngYn==null)?0:this.mydtMbhJnngYn.hashCode());
		result= prime * result + ((this.natScrrJnngYn==null)?0:this.natScrrJnngYn.hashCode());
		result= prime * result + ((this.metPbokJnngYn==null)?0:this.metPbokJnngYn.hashCode());
		result= prime * result + ((this.pbokSprnJnngYn==null)?0:this.pbokSprnJnngYn.hashCode());
		result= prime * result + ((this.wonPlayNtfcAgrYn==null)?0:this.wonPlayNtfcAgrYn.hashCode());
		result= prime * result + ((this.wttJnngYn==null)?0:this.wttJnngYn.hashCode());
		result= prime * result + ((this.trnPrtsNtfcAgrYn==null)?0:this.trnPrtsNtfcAgrYn.hashCode());
		result= prime * result + ((this.tdPvmNtfcAgrYn==null)?0:this.tdPvmNtfcAgrYn.hashCode());
		result= prime * result + ((this.scrtSmsSrvcJnngYn==null)?0:this.scrtSmsSrvcJnngYn.hashCode());
		result= prime * result + ((this.pushSrvcNtfcId==null)?0:this.pushSrvcNtfcId.hashCode());
		result= prime * result + ((this.natScrrNtfcAgrYn==null)?0:this.natScrrNtfcAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT other= (INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT)obj;
		{
			Object _mydtMbhJnngYn= getMydtMbhJnngYn();
			Object __mydtMbhJnngYn= other.getMydtMbhJnngYn();
			if ( _mydtMbhJnngYn== null ) { if ( __mydtMbhJnngYn!= null ) return false; }
			else if ( !_mydtMbhJnngYn.equals(__mydtMbhJnngYn) ) return false;
		}
		{
			Object _natScrrJnngYn= getNatScrrJnngYn();
			Object __natScrrJnngYn= other.getNatScrrJnngYn();
			if ( _natScrrJnngYn== null ) { if ( __natScrrJnngYn!= null ) return false; }
			else if ( !_natScrrJnngYn.equals(__natScrrJnngYn) ) return false;
		}
		{
			Object _metPbokJnngYn= getMetPbokJnngYn();
			Object __metPbokJnngYn= other.getMetPbokJnngYn();
			if ( _metPbokJnngYn== null ) { if ( __metPbokJnngYn!= null ) return false; }
			else if ( !_metPbokJnngYn.equals(__metPbokJnngYn) ) return false;
		}
		{
			Object _pbokSprnJnngYn= getPbokSprnJnngYn();
			Object __pbokSprnJnngYn= other.getPbokSprnJnngYn();
			if ( _pbokSprnJnngYn== null ) { if ( __pbokSprnJnngYn!= null ) return false; }
			else if ( !_pbokSprnJnngYn.equals(__pbokSprnJnngYn) ) return false;
		}
		{
			Object _wonPlayNtfcAgrYn= getWonPlayNtfcAgrYn();
			Object __wonPlayNtfcAgrYn= other.getWonPlayNtfcAgrYn();
			if ( _wonPlayNtfcAgrYn== null ) { if ( __wonPlayNtfcAgrYn!= null ) return false; }
			else if ( !_wonPlayNtfcAgrYn.equals(__wonPlayNtfcAgrYn) ) return false;
		}
		{
			Object _wttJnngYn= getWttJnngYn();
			Object __wttJnngYn= other.getWttJnngYn();
			if ( _wttJnngYn== null ) { if ( __wttJnngYn!= null ) return false; }
			else if ( !_wttJnngYn.equals(__wttJnngYn) ) return false;
		}
		{
			Object _trnPrtsNtfcAgrYn= getTrnPrtsNtfcAgrYn();
			Object __trnPrtsNtfcAgrYn= other.getTrnPrtsNtfcAgrYn();
			if ( _trnPrtsNtfcAgrYn== null ) { if ( __trnPrtsNtfcAgrYn!= null ) return false; }
			else if ( !_trnPrtsNtfcAgrYn.equals(__trnPrtsNtfcAgrYn) ) return false;
		}
		{
			Object _tdPvmNtfcAgrYn= getTdPvmNtfcAgrYn();
			Object __tdPvmNtfcAgrYn= other.getTdPvmNtfcAgrYn();
			if ( _tdPvmNtfcAgrYn== null ) { if ( __tdPvmNtfcAgrYn!= null ) return false; }
			else if ( !_tdPvmNtfcAgrYn.equals(__tdPvmNtfcAgrYn) ) return false;
		}
		{
			Object _scrtSmsSrvcJnngYn= getScrtSmsSrvcJnngYn();
			Object __scrtSmsSrvcJnngYn= other.getScrtSmsSrvcJnngYn();
			if ( _scrtSmsSrvcJnngYn== null ) { if ( __scrtSmsSrvcJnngYn!= null ) return false; }
			else if ( !_scrtSmsSrvcJnngYn.equals(__scrtSmsSrvcJnngYn) ) return false;
		}
		{
			Object _pushSrvcNtfcId= getPushSrvcNtfcId();
			Object __pushSrvcNtfcId= other.getPushSrvcNtfcId();
			if ( _pushSrvcNtfcId== null ) { if ( __pushSrvcNtfcId!= null ) return false; }
			else if ( !_pushSrvcNtfcId.equals(__pushSrvcNtfcId) ) return false;
		}
		{
			Object _natScrrNtfcAgrYn= getNatScrrNtfcAgrYn();
			Object __natScrrNtfcAgrYn= other.getNatScrrNtfcAgrYn();
			if ( _natScrrNtfcAgrYn== null ) { if ( __natScrrNtfcAgrYn!= null ) return false; }
			else if ( !_natScrrNtfcAgrYn.equals(__natScrrNtfcAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT.class.getName()).append(":\n");
		sb.append("\tmydtMbhJnngYn: ");
		sb.append(mydtMbhJnngYn==null?"null":getMydtMbhJnngYn());
		sb.append("\n");
		sb.append("\tnatScrrJnngYn: ");
		sb.append(natScrrJnngYn==null?"null":getNatScrrJnngYn());
		sb.append("\n");
		sb.append("\tmetPbokJnngYn: ");
		sb.append(metPbokJnngYn==null?"null":getMetPbokJnngYn());
		sb.append("\n");
		sb.append("\tpbokSprnJnngYn: ");
		sb.append(pbokSprnJnngYn==null?"null":getPbokSprnJnngYn());
		sb.append("\n");
		sb.append("\twonPlayNtfcAgrYn: ");
		sb.append(wonPlayNtfcAgrYn==null?"null":getWonPlayNtfcAgrYn());
		sb.append("\n");
		sb.append("\twttJnngYn: ");
		sb.append(wttJnngYn==null?"null":getWttJnngYn());
		sb.append("\n");
		sb.append("\ttrnPrtsNtfcAgrYn: ");
		sb.append(trnPrtsNtfcAgrYn==null?"null":getTrnPrtsNtfcAgrYn());
		sb.append("\n");
		sb.append("\ttdPvmNtfcAgrYn: ");
		sb.append(tdPvmNtfcAgrYn==null?"null":getTdPvmNtfcAgrYn());
		sb.append("\n");
		sb.append("\tscrtSmsSrvcJnngYn: ");
		sb.append(scrtSmsSrvcJnngYn==null?"null":getScrtSmsSrvcJnngYn());
		sb.append("\n");
		sb.append("\tpushSrvcNtfcId: ");
		sb.append(pushSrvcNtfcId==null?"null":getPushSrvcNtfcId());
		sb.append("\n");
		sb.append("\tnatScrrNtfcAgrYn: ");
		sb.append(natScrrNtfcAgrYn==null?"null":getNatScrrNtfcAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* mydtMbhJnngYn */
		messageLen+= 1; /* natScrrJnngYn */
		messageLen+= 1; /* metPbokJnngYn */
		messageLen+= 1; /* pbokSprnJnngYn */
		messageLen+= 1; /* wonPlayNtfcAgrYn */
		messageLen+= 1; /* wttJnngYn */
		messageLen+= 1; /* trnPrtsNtfcAgrYn */
		messageLen+= 1; /* tdPvmNtfcAgrYn */
		messageLen+= 1; /* scrtSmsSrvcJnngYn */
		messageLen+= 10; /* pushSrvcNtfcId */
		messageLen+= 1; /* natScrrNtfcAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mydtMbhJnngYn");
		list.add("natScrrJnngYn");
		list.add("metPbokJnngYn");
		list.add("pbokSprnJnngYn");
		list.add("wonPlayNtfcAgrYn");
		list.add("wttJnngYn");
		list.add("trnPrtsNtfcAgrYn");
		list.add("tdPvmNtfcAgrYn");
		list.add("scrtSmsSrvcJnngYn");
		list.add("pushSrvcNtfcId");
		list.add("natScrrNtfcAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mydtMbhJnngYn", get("mydtMbhJnngYn"));
		map.put("natScrrJnngYn", get("natScrrJnngYn"));
		map.put("metPbokJnngYn", get("metPbokJnngYn"));
		map.put("pbokSprnJnngYn", get("pbokSprnJnngYn"));
		map.put("wonPlayNtfcAgrYn", get("wonPlayNtfcAgrYn"));
		map.put("wttJnngYn", get("wttJnngYn"));
		map.put("trnPrtsNtfcAgrYn", get("trnPrtsNtfcAgrYn"));
		map.put("tdPvmNtfcAgrYn", get("tdPvmNtfcAgrYn"));
		map.put("scrtSmsSrvcJnngYn", get("scrtSmsSrvcJnngYn"));
		map.put("pushSrvcNtfcId", get("pushSrvcNtfcId"));
		map.put("natScrrNtfcAgrYn", get("natScrrNtfcAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1781984617:/* mydtMbhJnngYn */
			return getMydtMbhJnngYn();
		case -1109871965:/* natScrrJnngYn */
			return getNatScrrJnngYn();
		case -754165284:/* metPbokJnngYn */
			return getMetPbokJnngYn();
		case 1145705113:/* pbokSprnJnngYn */
			return getPbokSprnJnngYn();
		case -2033065932:/* wonPlayNtfcAgrYn */
			return getWonPlayNtfcAgrYn();
		case 2058554889:/* wttJnngYn */
			return getWttJnngYn();
		case 1897464621:/* trnPrtsNtfcAgrYn */
			return getTrnPrtsNtfcAgrYn();
		case -1892471513:/* tdPvmNtfcAgrYn */
			return getTdPvmNtfcAgrYn();
		case 1735131429:/* scrtSmsSrvcJnngYn */
			return getScrtSmsSrvcJnngYn();
		case -513192796:/* pushSrvcNtfcId */
			return getPushSrvcNtfcId();
		case -1252259923:/* natScrrNtfcAgrYn */
			return getNatScrrNtfcAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1781984617:/* mydtMbhJnngYn */
			setMydtMbhJnngYn((String)value);
			break;
		case -1109871965:/* natScrrJnngYn */
			setNatScrrJnngYn((String)value);
			break;
		case -754165284:/* metPbokJnngYn */
			setMetPbokJnngYn((String)value);
			break;
		case 1145705113:/* pbokSprnJnngYn */
			setPbokSprnJnngYn((String)value);
			break;
		case -2033065932:/* wonPlayNtfcAgrYn */
			setWonPlayNtfcAgrYn((String)value);
			break;
		case 2058554889:/* wttJnngYn */
			setWttJnngYn((String)value);
			break;
		case 1897464621:/* trnPrtsNtfcAgrYn */
			setTrnPrtsNtfcAgrYn((String)value);
			break;
		case -1892471513:/* tdPvmNtfcAgrYn */
			setTdPvmNtfcAgrYn((String)value);
			break;
		case 1735131429:/* scrtSmsSrvcJnngYn */
			setScrtSmsSrvcJnngYn((String)value);
			break;
		case -513192796:/* pushSrvcNtfcId */
			setPushSrvcNtfcId((String)value);
			break;
		case -1252259923:/* natScrrNtfcAgrYn */
			setNatScrrNtfcAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
