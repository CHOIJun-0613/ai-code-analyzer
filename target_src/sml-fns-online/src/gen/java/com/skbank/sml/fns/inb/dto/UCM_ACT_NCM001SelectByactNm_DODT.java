/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.adapter.DateToStringAdapter;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 개인.계좌별명.DBM.출력.IO
 * 
 */
@XmlType(propOrder={
	"coCusMstId", "actNo", "actNcm", "rgsDt", "rgsTm", "chgDt", "chgTm", "fcSpdpKdcd", "procSysDtime", "brsSyncDis", "sendNmUseYn", "sendNm", "rvactMemoTxt"
}, name="UCM_ACT_NCM001SelectByactNm_DODT")
@XmlRootElement(name="UCM_ACT_NCM001SelectByactNm_DODT")
@BxmCategory(logicalName="개인.계좌별명.DBM.출력.IO", description="개인.계좌별명.DBM.출력.IO\r\n") 
public class UCM_ACT_NCM001SelectByactNm_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -39380814L;
	
	private static class DateToStringAdapter_procSysDtime 
	extends DateToStringAdapter{
		private DateToStringAdapter_procSysDtime(){
			super("yyyyMMdd hh:mm:ss");
		}
	}
	@JsonIgnore
	transient private DateToStringAdapter_procSysDtime procSysDtimeAdapter= new DateToStringAdapter_procSysDtime();
	
	
	
	/**
	 * 기업고객마스터ID
	 */
	@ApiModelProperty(
		name = "coCusMstId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("coCusMstId")
	@BxmOmm_Field(length=10, decimal=0, description="기업고객마스터ID", align="left", fill="")
	private String coCusMstId= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "actNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNo")
	@BxmOmm_Field(length=34, decimal=0, description="계좌번호", align="left", fill="")
	private String actNo= "";
	
	
	/**
	 * 계좌별칭명
	 */
	@ApiModelProperty(
		name = "actNcm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNcm")
	@BxmOmm_Field(length=30, decimal=0, description="계좌별칭명", align="left", fill="")
	private String actNcm= "";
	
	
	/**
	 * 등록일자
	 */
	@ApiModelProperty(
		name = "rgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="등록일자", align="left", fill="")
	private String rgsDt= "";
	
	
	/**
	 * 등록시각
	 */
	@ApiModelProperty(
		name = "rgsTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTm")
	@BxmOmm_Field(length=8, decimal=0, description="등록시각", align="left", fill="")
	private String rgsTm= "";
	
	
	/**
	 * 변경일자
	 */
	@ApiModelProperty(
		name = "chgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgDt")
	@BxmOmm_Field(length=14, decimal=0, description="변경일자", align="left", fill="")
	private String chgDt= "";
	
	
	/**
	 * 변경시각
	 */
	@ApiModelProperty(
		name = "chgTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgTm")
	@BxmOmm_Field(length=6, decimal=0, description="변경시각", align="left", fill="")
	private String chgTm= "";
	
	
	/**
	 * 외화별단예금종류코드
	 */
	@ApiModelProperty(
		name = "fcSpdpKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcSpdpKdcd")
	@BxmOmm_Field(length=3, decimal=0, description="외화별단예금종류코드", align="left", fill="")
	private String fcSpdpKdcd= "";
	
	
	/**
	 * 등록일
	 */
	@ApiModelProperty(
		name = "procSysDtime"
		, dataType = "java.util.Date"
		)
	@XmlJavaTypeAdapter(value=DateToStringAdapter_procSysDtime.class)
	@JsonProperty("procSysDtime")
	@BxmOmm_Field(length=12, decimal=6, description="등록일", align="left", fill="", formatType="date", format="yyyyMMdd hh:mm:ss")
	private Date procSysDtime= null;
	
	
	/**
	 * BRS동기화구분코드
	 */
	@ApiModelProperty(
		name = "brsSyncDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("brsSyncDis")
	@BxmOmm_Field(length=1, decimal=0, description="BRS동기화구분코드", align="left", fill="")
	private String brsSyncDis= "";
	
	
	/**
	 * 송신자명사용여부
	 */
	@ApiModelProperty(
		name = "sendNmUseYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sendNmUseYn")
	@BxmOmm_Field(length=1, decimal=0, description="송신자명사용여부", align="left", fill="")
	private String sendNmUseYn= "";
	
	
	/**
	 * 송신자명
	 */
	@ApiModelProperty(
		name = "sendNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sendNm")
	@BxmOmm_Field(length=20, decimal=0, description="송신자명", align="left", fill="")
	private String sendNm= "";
	
	
	/**
	 * 입금계좌메모내용
	 */
	@ApiModelProperty(
		name = "rvactMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvactMemoTxt")
	@BxmOmm_Field(length=100, decimal=0, description="입금계좌메모내용", align="left", fill="")
	private String rvactMemoTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_coCusMstId= false;
	protected final boolean isSet_coCusMstId(){
		return this.isSet_coCusMstId;
	}
	private void setIsSet_coCusMstId(boolean value){
		this.isSet_coCusMstId= value;
	}
	/**
	 * 기업고객마스터ID
	 */
	@XmlTransient
	public String getCoCusMstId(){
		return this.coCusMstId;
	}
	
	/**
	 * 기업고객마스터ID
	 * 
	 * @param coCusMstId 기업고객마스터ID
	 */
	public void setCoCusMstId(String coCusMstId){
		this.coCusMstId= coCusMstId;
		this.setIsSet_coCusMstId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNo= false;
	protected final boolean isSet_actNo(){
		return this.isSet_actNo;
	}
	private void setIsSet_actNo(boolean value){
		this.isSet_actNo= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getActNo(){
		return this.actNo;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param actNo 계좌번호
	 */
	public void setActNo(String actNo){
		this.actNo= actNo;
		this.setIsSet_actNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNcm= false;
	protected final boolean isSet_actNcm(){
		return this.isSet_actNcm;
	}
	private void setIsSet_actNcm(boolean value){
		this.isSet_actNcm= value;
	}
	/**
	 * 계좌별칭명
	 */
	@XmlTransient
	public String getActNcm(){
		return this.actNcm;
	}
	
	/**
	 * 계좌별칭명
	 * 
	 * @param actNcm 계좌별칭명
	 */
	public void setActNcm(String actNcm){
		this.actNcm= actNcm;
		this.setIsSet_actNcm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsDt= false;
	protected final boolean isSet_rgsDt(){
		return this.isSet_rgsDt;
	}
	private void setIsSet_rgsDt(boolean value){
		this.isSet_rgsDt= value;
	}
	/**
	 * 등록일자
	 */
	@XmlTransient
	public String getRgsDt(){
		return this.rgsDt;
	}
	
	/**
	 * 등록일자
	 * 
	 * @param rgsDt 등록일자
	 */
	public void setRgsDt(String rgsDt){
		this.rgsDt= rgsDt;
		this.setIsSet_rgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsTm= false;
	protected final boolean isSet_rgsTm(){
		return this.isSet_rgsTm;
	}
	private void setIsSet_rgsTm(boolean value){
		this.isSet_rgsTm= value;
	}
	/**
	 * 등록시각
	 */
	@XmlTransient
	public String getRgsTm(){
		return this.rgsTm;
	}
	
	/**
	 * 등록시각
	 * 
	 * @param rgsTm 등록시각
	 */
	public void setRgsTm(String rgsTm){
		this.rgsTm= rgsTm;
		this.setIsSet_rgsTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgDt= false;
	protected final boolean isSet_chgDt(){
		return this.isSet_chgDt;
	}
	private void setIsSet_chgDt(boolean value){
		this.isSet_chgDt= value;
	}
	/**
	 * 변경일자
	 */
	@XmlTransient
	public String getChgDt(){
		return this.chgDt;
	}
	
	/**
	 * 변경일자
	 * 
	 * @param chgDt 변경일자
	 */
	public void setChgDt(String chgDt){
		this.chgDt= chgDt;
		this.setIsSet_chgDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgTm= false;
	protected final boolean isSet_chgTm(){
		return this.isSet_chgTm;
	}
	private void setIsSet_chgTm(boolean value){
		this.isSet_chgTm= value;
	}
	/**
	 * 변경시각
	 */
	@XmlTransient
	public String getChgTm(){
		return this.chgTm;
	}
	
	/**
	 * 변경시각
	 * 
	 * @param chgTm 변경시각
	 */
	public void setChgTm(String chgTm){
		this.chgTm= chgTm;
		this.setIsSet_chgTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcSpdpKdcd= false;
	protected final boolean isSet_fcSpdpKdcd(){
		return this.isSet_fcSpdpKdcd;
	}
	private void setIsSet_fcSpdpKdcd(boolean value){
		this.isSet_fcSpdpKdcd= value;
	}
	/**
	 * 외화별단예금종류코드
	 */
	@XmlTransient
	public String getFcSpdpKdcd(){
		return this.fcSpdpKdcd;
	}
	
	/**
	 * 외화별단예금종류코드
	 * 
	 * @param fcSpdpKdcd 외화별단예금종류코드
	 */
	public void setFcSpdpKdcd(String fcSpdpKdcd){
		this.fcSpdpKdcd= fcSpdpKdcd;
		this.setIsSet_fcSpdpKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_procSysDtime= false;
	protected final boolean isSet_procSysDtime(){
		return this.isSet_procSysDtime;
	}
	private void setIsSet_procSysDtime(boolean value){
		this.isSet_procSysDtime= value;
	}
	@JsonSetter("procSysDtime")
	private void setProcSysDtimeForJson(String value){
		try{
			this.procSysDtime= procSysDtimeAdapter.unmarshal(value);
			this.setIsSet_procSysDtime(true);
		}
		catch(Exception e){
			throw new IllegalArgumentException("Invalid value : "+ value, e);
		}
	}
	
	@JsonGetter("procSysDtime")
	private String getProcSysDtimeForJson(){
		return this.procSysDtimeAdapter.marshal(procSysDtime);
	}
	/**
	 * 등록일
	 */
	@XmlTransient
	public Date getProcSysDtime(){
		return this.procSysDtime;
	}
	
	/**
	 * 등록일
	 * 
	 * @param procSysDtime 등록일
	 */
	public void setProcSysDtime(Date procSysDtime){
		this.procSysDtime= procSysDtime;
		this.setIsSet_procSysDtime(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_brsSyncDis= false;
	protected final boolean isSet_brsSyncDis(){
		return this.isSet_brsSyncDis;
	}
	private void setIsSet_brsSyncDis(boolean value){
		this.isSet_brsSyncDis= value;
	}
	/**
	 * BRS동기화구분코드
	 */
	@XmlTransient
	public String getBrsSyncDis(){
		return this.brsSyncDis;
	}
	
	/**
	 * BRS동기화구분코드
	 * 
	 * @param brsSyncDis BRS동기화구분코드
	 */
	public void setBrsSyncDis(String brsSyncDis){
		this.brsSyncDis= brsSyncDis;
		this.setIsSet_brsSyncDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sendNmUseYn= false;
	protected final boolean isSet_sendNmUseYn(){
		return this.isSet_sendNmUseYn;
	}
	private void setIsSet_sendNmUseYn(boolean value){
		this.isSet_sendNmUseYn= value;
	}
	/**
	 * 송신자명사용여부
	 */
	@XmlTransient
	public String getSendNmUseYn(){
		return this.sendNmUseYn;
	}
	
	/**
	 * 송신자명사용여부
	 * 
	 * @param sendNmUseYn 송신자명사용여부
	 */
	public void setSendNmUseYn(String sendNmUseYn){
		this.sendNmUseYn= sendNmUseYn;
		this.setIsSet_sendNmUseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sendNm= false;
	protected final boolean isSet_sendNm(){
		return this.isSet_sendNm;
	}
	private void setIsSet_sendNm(boolean value){
		this.isSet_sendNm= value;
	}
	/**
	 * 송신자명
	 */
	@XmlTransient
	public String getSendNm(){
		return this.sendNm;
	}
	
	/**
	 * 송신자명
	 * 
	 * @param sendNm 송신자명
	 */
	public void setSendNm(String sendNm){
		this.sendNm= sendNm;
		this.setIsSet_sendNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvactMemoTxt= false;
	protected final boolean isSet_rvactMemoTxt(){
		return this.isSet_rvactMemoTxt;
	}
	private void setIsSet_rvactMemoTxt(boolean value){
		this.isSet_rvactMemoTxt= value;
	}
	/**
	 * 입금계좌메모내용
	 */
	@XmlTransient
	public String getRvactMemoTxt(){
		return this.rvactMemoTxt;
	}
	
	/**
	 * 입금계좌메모내용
	 * 
	 * @param rvactMemoTxt 입금계좌메모내용
	 */
	public void setRvactMemoTxt(String rvactMemoTxt){
		this.rvactMemoTxt= rvactMemoTxt;
		this.setIsSet_rvactMemoTxt(true);
	}
				
	@Override
	public UCM_ACT_NCM001SelectByactNm_DODT clone(){
		try{
			UCM_ACT_NCM001SelectByactNm_DODT object= (UCM_ACT_NCM001SelectByactNm_DODT)super.clone();
			if ( this.procSysDtime== null ) object.procSysDtime= null;
			else object.procSysDtime= (Date)this.procSysDtime.clone();
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
		
		result= prime * result + ((this.coCusMstId==null)?0:this.coCusMstId.hashCode());
		result= prime * result + ((this.actNo==null)?0:this.actNo.hashCode());
		result= prime * result + ((this.actNcm==null)?0:this.actNcm.hashCode());
		result= prime * result + ((this.rgsDt==null)?0:this.rgsDt.hashCode());
		result= prime * result + ((this.rgsTm==null)?0:this.rgsTm.hashCode());
		result= prime * result + ((this.chgDt==null)?0:this.chgDt.hashCode());
		result= prime * result + ((this.chgTm==null)?0:this.chgTm.hashCode());
		result= prime * result + ((this.fcSpdpKdcd==null)?0:this.fcSpdpKdcd.hashCode());
		result= prime * result + ((this.procSysDtime==null)?0:this.procSysDtime.hashCode());
		result= prime * result + ((this.brsSyncDis==null)?0:this.brsSyncDis.hashCode());
		result= prime * result + ((this.sendNmUseYn==null)?0:this.sendNmUseYn.hashCode());
		result= prime * result + ((this.sendNm==null)?0:this.sendNm.hashCode());
		result= prime * result + ((this.rvactMemoTxt==null)?0:this.rvactMemoTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_ACT_NCM001SelectByactNm_DODT other= (UCM_ACT_NCM001SelectByactNm_DODT)obj;
		{
			Object _coCusMstId= getCoCusMstId();
			Object __coCusMstId= other.getCoCusMstId();
			if ( _coCusMstId== null ) { if ( __coCusMstId!= null ) return false; }
			else if ( !_coCusMstId.equals(__coCusMstId) ) return false;
		}
		{
			Object _actNo= getActNo();
			Object __actNo= other.getActNo();
			if ( _actNo== null ) { if ( __actNo!= null ) return false; }
			else if ( !_actNo.equals(__actNo) ) return false;
		}
		{
			Object _actNcm= getActNcm();
			Object __actNcm= other.getActNcm();
			if ( _actNcm== null ) { if ( __actNcm!= null ) return false; }
			else if ( !_actNcm.equals(__actNcm) ) return false;
		}
		{
			Object _rgsDt= getRgsDt();
			Object __rgsDt= other.getRgsDt();
			if ( _rgsDt== null ) { if ( __rgsDt!= null ) return false; }
			else if ( !_rgsDt.equals(__rgsDt) ) return false;
		}
		{
			Object _rgsTm= getRgsTm();
			Object __rgsTm= other.getRgsTm();
			if ( _rgsTm== null ) { if ( __rgsTm!= null ) return false; }
			else if ( !_rgsTm.equals(__rgsTm) ) return false;
		}
		{
			Object _chgDt= getChgDt();
			Object __chgDt= other.getChgDt();
			if ( _chgDt== null ) { if ( __chgDt!= null ) return false; }
			else if ( !_chgDt.equals(__chgDt) ) return false;
		}
		{
			Object _chgTm= getChgTm();
			Object __chgTm= other.getChgTm();
			if ( _chgTm== null ) { if ( __chgTm!= null ) return false; }
			else if ( !_chgTm.equals(__chgTm) ) return false;
		}
		{
			Object _fcSpdpKdcd= getFcSpdpKdcd();
			Object __fcSpdpKdcd= other.getFcSpdpKdcd();
			if ( _fcSpdpKdcd== null ) { if ( __fcSpdpKdcd!= null ) return false; }
			else if ( !_fcSpdpKdcd.equals(__fcSpdpKdcd) ) return false;
		}
		{
			Object _procSysDtime= getProcSysDtime();
			Object __procSysDtime= other.getProcSysDtime();
			if ( _procSysDtime== null ) { if ( __procSysDtime!= null ) return false; }
			else if ( !_procSysDtime.equals(__procSysDtime) ) return false;
		}
		{
			Object _brsSyncDis= getBrsSyncDis();
			Object __brsSyncDis= other.getBrsSyncDis();
			if ( _brsSyncDis== null ) { if ( __brsSyncDis!= null ) return false; }
			else if ( !_brsSyncDis.equals(__brsSyncDis) ) return false;
		}
		{
			Object _sendNmUseYn= getSendNmUseYn();
			Object __sendNmUseYn= other.getSendNmUseYn();
			if ( _sendNmUseYn== null ) { if ( __sendNmUseYn!= null ) return false; }
			else if ( !_sendNmUseYn.equals(__sendNmUseYn) ) return false;
		}
		{
			Object _sendNm= getSendNm();
			Object __sendNm= other.getSendNm();
			if ( _sendNm== null ) { if ( __sendNm!= null ) return false; }
			else if ( !_sendNm.equals(__sendNm) ) return false;
		}
		{
			Object _rvactMemoTxt= getRvactMemoTxt();
			Object __rvactMemoTxt= other.getRvactMemoTxt();
			if ( _rvactMemoTxt== null ) { if ( __rvactMemoTxt!= null ) return false; }
			else if ( !_rvactMemoTxt.equals(__rvactMemoTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_ACT_NCM001SelectByactNm_DODT.class.getName()).append(":\n");
		sb.append("\tcoCusMstId: ");
		sb.append(coCusMstId==null?"null":getCoCusMstId());
		sb.append("\n");
		sb.append("\tactNo: ");
		sb.append(actNo==null?"null":getActNo());
		sb.append("\n");
		sb.append("\tactNcm: ");
		sb.append(actNcm==null?"null":getActNcm());
		sb.append("\n");
		sb.append("\trgsDt: ");
		sb.append(rgsDt==null?"null":getRgsDt());
		sb.append("\n");
		sb.append("\trgsTm: ");
		sb.append(rgsTm==null?"null":getRgsTm());
		sb.append("\n");
		sb.append("\tchgDt: ");
		sb.append(chgDt==null?"null":getChgDt());
		sb.append("\n");
		sb.append("\tchgTm: ");
		sb.append(chgTm==null?"null":getChgTm());
		sb.append("\n");
		sb.append("\tfcSpdpKdcd: ");
		sb.append(fcSpdpKdcd==null?"null":getFcSpdpKdcd());
		sb.append("\n");
		sb.append("\tprocSysDtime: ");
		sb.append(procSysDtime==null?"null":getProcSysDtime());
		sb.append("\n");
		sb.append("\tbrsSyncDis: ");
		sb.append(brsSyncDis==null?"null":getBrsSyncDis());
		sb.append("\n");
		sb.append("\tsendNmUseYn: ");
		sb.append(sendNmUseYn==null?"null":getSendNmUseYn());
		sb.append("\n");
		sb.append("\tsendNm: ");
		sb.append(sendNm==null?"null":getSendNm());
		sb.append("\n");
		sb.append("\trvactMemoTxt: ");
		sb.append(rvactMemoTxt==null?"null":getRvactMemoTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* coCusMstId */
		messageLen+= 34; /* actNo */
		messageLen+= 30; /* actNcm */
		messageLen+= 8; /* rgsDt */
		messageLen+= 8; /* rgsTm */
		messageLen+= 14; /* chgDt */
		messageLen+= 6; /* chgTm */
		messageLen+= 3; /* fcSpdpKdcd */
		messageLen+= 12; /* procSysDtime */
		messageLen+= 1; /* brsSyncDis */
		messageLen+= 1; /* sendNmUseYn */
		messageLen+= 20; /* sendNm */
		messageLen+= 100; /* rvactMemoTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("coCusMstId");
		list.add("actNo");
		list.add("actNcm");
		list.add("rgsDt");
		list.add("rgsTm");
		list.add("chgDt");
		list.add("chgTm");
		list.add("fcSpdpKdcd");
		list.add("procSysDtime");
		list.add("brsSyncDis");
		list.add("sendNmUseYn");
		list.add("sendNm");
		list.add("rvactMemoTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("coCusMstId", get("coCusMstId"));
		map.put("actNo", get("actNo"));
		map.put("actNcm", get("actNcm"));
		map.put("rgsDt", get("rgsDt"));
		map.put("rgsTm", get("rgsTm"));
		map.put("chgDt", get("chgDt"));
		map.put("chgTm", get("chgTm"));
		map.put("fcSpdpKdcd", get("fcSpdpKdcd"));
		map.put("procSysDtime", get("procSysDtime"));
		map.put("brsSyncDis", get("brsSyncDis"));
		map.put("sendNmUseYn", get("sendNmUseYn"));
		map.put("sendNm", get("sendNm"));
		map.put("rvactMemoTxt", get("rvactMemoTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -404023276:/* coCusMstId */
			return getCoCusMstId();
		case 92644851:/* actNo */
			return getActNo();
		case -1422977178:/* actNcm */
			return getActNcm();
		case 108462606:/* rgsDt */
			return getRgsDt();
		case 108463095:/* rgsTm */
			return getRgsTm();
		case 94628050:/* chgDt */
			return getChgDt();
		case 94628539:/* chgTm */
			return getChgTm();
		case 795343520:/* fcSpdpKdcd */
			return getFcSpdpKdcd();
		case 1692687322:/* procSysDtime */
			return getProcSysDtime();
		case 806986832:/* brsSyncDis */
			return getBrsSyncDis();
		case 1780288469:/* sendNmUseYn */
			return getSendNmUseYn();
		case -905963673:/* sendNm */
			return getSendNm();
		case -1566166232:/* rvactMemoTxt */
			return getRvactMemoTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -404023276:/* coCusMstId */
			setCoCusMstId((String)value);
			break;
		case 92644851:/* actNo */
			setActNo((String)value);
			break;
		case -1422977178:/* actNcm */
			setActNcm((String)value);
			break;
		case 108462606:/* rgsDt */
			setRgsDt((String)value);
			break;
		case 108463095:/* rgsTm */
			setRgsTm((String)value);
			break;
		case 94628050:/* chgDt */
			setChgDt((String)value);
			break;
		case 94628539:/* chgTm */
			setChgTm((String)value);
			break;
		case 795343520:/* fcSpdpKdcd */
			setFcSpdpKdcd((String)value);
			break;
		case 1692687322:/* procSysDtime */
			setProcSysDtime((Date)value);
			break;
		case 806986832:/* brsSyncDis */
			setBrsSyncDis((String)value);
			break;
		case 1780288469:/* sendNmUseYn */
			setSendNmUseYn((String)value);
			break;
		case -905963673:/* sendNm */
			setSendNm((String)value);
			break;
		case -1566166232:/* rvactMemoTxt */
			setRvactMemoTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
