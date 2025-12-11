/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * 알림 수신설정 결과 리턴 GRID
 * 
 */
@XmlType(propOrder={
	"wonNtfcRgsYn", "smsTmsLimAm", "dpacNo", "newAcno", "ebnkSrvcStcd", "hpNo", "ntcTgtTrnDscd", "balNtrsnYn", "tmsStaTm", "tmsEndTm", "prcSrno", "atsSndLimYn", "advpeEno"
}, name="INBNtfcDpsEstGrid_DTO")
@XmlRootElement(name="INBNtfcDpsEstGrid_DTO")
@BxmCategory(logicalName="알림.수신설정.GRID.공통.IO", description="알림 수신설정 결과 리턴 GRID\r\n") 
public class INBNtfcDpsEstGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -90400459L;
	
	
	
	/**
	 * WON알림등록여부
	 */
	@ApiModelProperty(
		name = "wonNtfcRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wonNtfcRgsYn")
	@BxmOmm_Field(length=10, decimal=0, description="WON알림등록여부", align="left", fill="")
	private String wonNtfcRgsYn= "";
	
	
	/**
	 * SMS전송제한금액
	 */
	@ApiModelProperty(
		name = "smsTmsLimAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsTmsLimAm")
	@BxmOmm_Field(length=10, decimal=0, description="SMS전송제한금액", align="left", fill="")
	private String smsTmsLimAm= "";
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpacNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacNo")
	@BxmOmm_Field(length=10, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpacNo= "";
	
	
	/**
	 * 신계좌번호
	 */
	@ApiModelProperty(
		name = "newAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newAcno")
	@BxmOmm_Field(length=1, decimal=0, description="신계좌번호", align="left", fill="")
	private String newAcno= "";
	
	
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@ApiModelProperty(
		name = "ebnkSrvcStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkSrvcStcd")
	@BxmOmm_Field(length=10, decimal=0, description="전자뱅킹서비스상태코드", align="left", fill="")
	private String ebnkSrvcStcd= "";
	
	
	/**
	 * 핸드폰번호
	 */
	@ApiModelProperty(
		name = "hpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo")
	@BxmOmm_Field(length=14, decimal=0, description="핸드폰번호", align="left", fill="")
	private String hpNo= "";
	
	
	/**
	 * 통지대상거래구분코드
	 */
	@ApiModelProperty(
		name = "ntcTgtTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntcTgtTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="통지대상거래구분코드", align="left", fill="")
	private String ntcTgtTrnDscd= "";
	
	
	/**
	 * 잔액미전송여부
	 */
	@ApiModelProperty(
		name = "balNtrsnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("balNtrsnYn")
	@BxmOmm_Field(length=1, decimal=0, description="잔액미전송여부", align="left", fill="")
	private String balNtrsnYn= "";
	
	
	/**
	 * 전송시작시각
	 */
	@ApiModelProperty(
		name = "tmsStaTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsStaTm")
	@BxmOmm_Field(length=6, decimal=0, description="전송시작시각", align="left", fill="")
	private String tmsStaTm= "";
	
	
	/**
	 * 전송종료시각
	 */
	@ApiModelProperty(
		name = "tmsEndTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsEndTm")
	@BxmOmm_Field(length=6, decimal=0, description="전송종료시각", align="left", fill="")
	private String tmsEndTm= "";
	
	
	/**
	 * 처리일련번호
	 */
	@ApiModelProperty(
		name = "prcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("prcSrno")
	@BxmOmm_Field(length=9, decimal=0, description="처리일련번호", align="right", fill="")
	private Integer prcSrno= 0;
	
	
	/**
	 * 자동이체발송제한여부
	 */
	@ApiModelProperty(
		name = "atsSndLimYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsSndLimYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체발송제한여부", align="left", fill="")
	private String atsSndLimYn= "";
	
	
	/**
	 * 권유자직원번호
	 */
	@ApiModelProperty(
		name = "advpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("advpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="권유자직원번호", align="left", fill="")
	private String advpeEno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wonNtfcRgsYn= false;
	protected final boolean isSet_wonNtfcRgsYn(){
		return this.isSet_wonNtfcRgsYn;
	}
	private void setIsSet_wonNtfcRgsYn(boolean value){
		this.isSet_wonNtfcRgsYn= value;
	}
	/**
	 * WON알림등록여부
	 */
	@XmlTransient
	public String getWonNtfcRgsYn(){
		return this.wonNtfcRgsYn;
	}
	
	/**
	 * WON알림등록여부
	 * 
	 * @param wonNtfcRgsYn WON알림등록여부
	 */
	public void setWonNtfcRgsYn(String wonNtfcRgsYn){
		this.wonNtfcRgsYn= wonNtfcRgsYn;
		this.setIsSet_wonNtfcRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsTmsLimAm= false;
	protected final boolean isSet_smsTmsLimAm(){
		return this.isSet_smsTmsLimAm;
	}
	private void setIsSet_smsTmsLimAm(boolean value){
		this.isSet_smsTmsLimAm= value;
	}
	/**
	 * SMS전송제한금액
	 */
	@XmlTransient
	public String getSmsTmsLimAm(){
		return this.smsTmsLimAm;
	}
	
	/**
	 * SMS전송제한금액
	 * 
	 * @param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(String smsTmsLimAm){
		this.smsTmsLimAm= smsTmsLimAm;
		this.setIsSet_smsTmsLimAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacNo= false;
	protected final boolean isSet_dpacNo(){
		return this.isSet_dpacNo;
	}
	private void setIsSet_dpacNo(boolean value){
		this.isSet_dpacNo= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpacNo(){
		return this.dpacNo;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpacNo 수신계좌번호
	 */
	public void setDpacNo(String dpacNo){
		this.dpacNo= dpacNo;
		this.setIsSet_dpacNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newAcno= false;
	protected final boolean isSet_newAcno(){
		return this.isSet_newAcno;
	}
	private void setIsSet_newAcno(boolean value){
		this.isSet_newAcno= value;
	}
	/**
	 * 신계좌번호
	 */
	@XmlTransient
	public String getNewAcno(){
		return this.newAcno;
	}
	
	/**
	 * 신계좌번호
	 * 
	 * @param newAcno 신계좌번호
	 */
	public void setNewAcno(String newAcno){
		this.newAcno= newAcno;
		this.setIsSet_newAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkSrvcStcd= false;
	protected final boolean isSet_ebnkSrvcStcd(){
		return this.isSet_ebnkSrvcStcd;
	}
	private void setIsSet_ebnkSrvcStcd(boolean value){
		this.isSet_ebnkSrvcStcd= value;
	}
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@XmlTransient
	public String getEbnkSrvcStcd(){
		return this.ebnkSrvcStcd;
	}
	
	/**
	 * 전자뱅킹서비스상태코드
	 * 
	 * @param ebnkSrvcStcd 전자뱅킹서비스상태코드
	 */
	public void setEbnkSrvcStcd(String ebnkSrvcStcd){
		this.ebnkSrvcStcd= ebnkSrvcStcd;
		this.setIsSet_ebnkSrvcStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpNo= false;
	protected final boolean isSet_hpNo(){
		return this.isSet_hpNo;
	}
	private void setIsSet_hpNo(boolean value){
		this.isSet_hpNo= value;
	}
	/**
	 * 핸드폰번호
	 */
	@XmlTransient
	public String getHpNo(){
		return this.hpNo;
	}
	
	/**
	 * 핸드폰번호
	 * 
	 * @param hpNo 핸드폰번호
	 */
	public void setHpNo(String hpNo){
		this.hpNo= hpNo;
		this.setIsSet_hpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntcTgtTrnDscd= false;
	protected final boolean isSet_ntcTgtTrnDscd(){
		return this.isSet_ntcTgtTrnDscd;
	}
	private void setIsSet_ntcTgtTrnDscd(boolean value){
		this.isSet_ntcTgtTrnDscd= value;
	}
	/**
	 * 통지대상거래구분코드
	 */
	@XmlTransient
	public String getNtcTgtTrnDscd(){
		return this.ntcTgtTrnDscd;
	}
	
	/**
	 * 통지대상거래구분코드
	 * 
	 * @param ntcTgtTrnDscd 통지대상거래구분코드
	 */
	public void setNtcTgtTrnDscd(String ntcTgtTrnDscd){
		this.ntcTgtTrnDscd= ntcTgtTrnDscd;
		this.setIsSet_ntcTgtTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_balNtrsnYn= false;
	protected final boolean isSet_balNtrsnYn(){
		return this.isSet_balNtrsnYn;
	}
	private void setIsSet_balNtrsnYn(boolean value){
		this.isSet_balNtrsnYn= value;
	}
	/**
	 * 잔액미전송여부
	 */
	@XmlTransient
	public String getBalNtrsnYn(){
		return this.balNtrsnYn;
	}
	
	/**
	 * 잔액미전송여부
	 * 
	 * @param balNtrsnYn 잔액미전송여부
	 */
	public void setBalNtrsnYn(String balNtrsnYn){
		this.balNtrsnYn= balNtrsnYn;
		this.setIsSet_balNtrsnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsStaTm= false;
	protected final boolean isSet_tmsStaTm(){
		return this.isSet_tmsStaTm;
	}
	private void setIsSet_tmsStaTm(boolean value){
		this.isSet_tmsStaTm= value;
	}
	/**
	 * 전송시작시각
	 */
	@XmlTransient
	public String getTmsStaTm(){
		return this.tmsStaTm;
	}
	
	/**
	 * 전송시작시각
	 * 
	 * @param tmsStaTm 전송시작시각
	 */
	public void setTmsStaTm(String tmsStaTm){
		this.tmsStaTm= tmsStaTm;
		this.setIsSet_tmsStaTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsEndTm= false;
	protected final boolean isSet_tmsEndTm(){
		return this.isSet_tmsEndTm;
	}
	private void setIsSet_tmsEndTm(boolean value){
		this.isSet_tmsEndTm= value;
	}
	/**
	 * 전송종료시각
	 */
	@XmlTransient
	public String getTmsEndTm(){
		return this.tmsEndTm;
	}
	
	/**
	 * 전송종료시각
	 * 
	 * @param tmsEndTm 전송종료시각
	 */
	public void setTmsEndTm(String tmsEndTm){
		this.tmsEndTm= tmsEndTm;
		this.setIsSet_tmsEndTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcSrno= false;
	protected final boolean isSet_prcSrno(){
		return this.isSet_prcSrno;
	}
	private void setIsSet_prcSrno(boolean value){
		this.isSet_prcSrno= value;
	}
	/**
	 * 처리일련번호
	 */
	@XmlTransient
	public Integer getPrcSrno(){
		return this.prcSrno;
	}
	
	/**
	 * 처리일련번호
	 * 
	 * @param prcSrno 처리일련번호
	 */
	public void setPrcSrno(Integer prcSrno){
		this.prcSrno= prcSrno;
		this.setIsSet_prcSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsSndLimYn= false;
	protected final boolean isSet_atsSndLimYn(){
		return this.isSet_atsSndLimYn;
	}
	private void setIsSet_atsSndLimYn(boolean value){
		this.isSet_atsSndLimYn= value;
	}
	/**
	 * 자동이체발송제한여부
	 */
	@XmlTransient
	public String getAtsSndLimYn(){
		return this.atsSndLimYn;
	}
	
	/**
	 * 자동이체발송제한여부
	 * 
	 * @param atsSndLimYn 자동이체발송제한여부
	 */
	public void setAtsSndLimYn(String atsSndLimYn){
		this.atsSndLimYn= atsSndLimYn;
		this.setIsSet_atsSndLimYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_advpeEno= false;
	protected final boolean isSet_advpeEno(){
		return this.isSet_advpeEno;
	}
	private void setIsSet_advpeEno(boolean value){
		this.isSet_advpeEno= value;
	}
	/**
	 * 권유자직원번호
	 */
	@XmlTransient
	public String getAdvpeEno(){
		return this.advpeEno;
	}
	
	/**
	 * 권유자직원번호
	 * 
	 * @param advpeEno 권유자직원번호
	 */
	public void setAdvpeEno(String advpeEno){
		this.advpeEno= advpeEno;
		this.setIsSet_advpeEno(true);
	}
				
	@Override
	public INBNtfcDpsEstGrid_DTO clone(){
		try{
			INBNtfcDpsEstGrid_DTO object= (INBNtfcDpsEstGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.wonNtfcRgsYn==null)?0:this.wonNtfcRgsYn.hashCode());
		result= prime * result + ((this.smsTmsLimAm==null)?0:this.smsTmsLimAm.hashCode());
		result= prime * result + ((this.dpacNo==null)?0:this.dpacNo.hashCode());
		result= prime * result + ((this.newAcno==null)?0:this.newAcno.hashCode());
		result= prime * result + ((this.ebnkSrvcStcd==null)?0:this.ebnkSrvcStcd.hashCode());
		result= prime * result + ((this.hpNo==null)?0:this.hpNo.hashCode());
		result= prime * result + ((this.ntcTgtTrnDscd==null)?0:this.ntcTgtTrnDscd.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.prcSrno==null)?0:this.prcSrno.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfcDpsEstGrid_DTO other= (INBNtfcDpsEstGrid_DTO)obj;
		{
			Object _wonNtfcRgsYn= getWonNtfcRgsYn();
			Object __wonNtfcRgsYn= other.getWonNtfcRgsYn();
			if ( _wonNtfcRgsYn== null ) { if ( __wonNtfcRgsYn!= null ) return false; }
			else if ( !_wonNtfcRgsYn.equals(__wonNtfcRgsYn) ) return false;
		}
		{
			Object _smsTmsLimAm= getSmsTmsLimAm();
			Object __smsTmsLimAm= other.getSmsTmsLimAm();
			if ( _smsTmsLimAm== null ) { if ( __smsTmsLimAm!= null ) return false; }
			else if ( !_smsTmsLimAm.equals(__smsTmsLimAm) ) return false;
		}
		{
			Object _dpacNo= getDpacNo();
			Object __dpacNo= other.getDpacNo();
			if ( _dpacNo== null ) { if ( __dpacNo!= null ) return false; }
			else if ( !_dpacNo.equals(__dpacNo) ) return false;
		}
		{
			Object _newAcno= getNewAcno();
			Object __newAcno= other.getNewAcno();
			if ( _newAcno== null ) { if ( __newAcno!= null ) return false; }
			else if ( !_newAcno.equals(__newAcno) ) return false;
		}
		{
			Object _ebnkSrvcStcd= getEbnkSrvcStcd();
			Object __ebnkSrvcStcd= other.getEbnkSrvcStcd();
			if ( _ebnkSrvcStcd== null ) { if ( __ebnkSrvcStcd!= null ) return false; }
			else if ( !_ebnkSrvcStcd.equals(__ebnkSrvcStcd) ) return false;
		}
		{
			Object _hpNo= getHpNo();
			Object __hpNo= other.getHpNo();
			if ( _hpNo== null ) { if ( __hpNo!= null ) return false; }
			else if ( !_hpNo.equals(__hpNo) ) return false;
		}
		{
			Object _ntcTgtTrnDscd= getNtcTgtTrnDscd();
			Object __ntcTgtTrnDscd= other.getNtcTgtTrnDscd();
			if ( _ntcTgtTrnDscd== null ) { if ( __ntcTgtTrnDscd!= null ) return false; }
			else if ( !_ntcTgtTrnDscd.equals(__ntcTgtTrnDscd) ) return false;
		}
		{
			Object _balNtrsnYn= getBalNtrsnYn();
			Object __balNtrsnYn= other.getBalNtrsnYn();
			if ( _balNtrsnYn== null ) { if ( __balNtrsnYn!= null ) return false; }
			else if ( !_balNtrsnYn.equals(__balNtrsnYn) ) return false;
		}
		{
			Object _tmsStaTm= getTmsStaTm();
			Object __tmsStaTm= other.getTmsStaTm();
			if ( _tmsStaTm== null ) { if ( __tmsStaTm!= null ) return false; }
			else if ( !_tmsStaTm.equals(__tmsStaTm) ) return false;
		}
		{
			Object _tmsEndTm= getTmsEndTm();
			Object __tmsEndTm= other.getTmsEndTm();
			if ( _tmsEndTm== null ) { if ( __tmsEndTm!= null ) return false; }
			else if ( !_tmsEndTm.equals(__tmsEndTm) ) return false;
		}
		{
			Object _prcSrno= getPrcSrno();
			Object __prcSrno= other.getPrcSrno();
			if ( _prcSrno== null ) { if ( __prcSrno!= null ) return false; }
			else if ( !_prcSrno.equals(__prcSrno) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfcDpsEstGrid_DTO.class.getName()).append(":\n");
		sb.append("\twonNtfcRgsYn: ");
		sb.append(wonNtfcRgsYn==null?"null":getWonNtfcRgsYn());
		sb.append("\n");
		sb.append("\tsmsTmsLimAm: ");
		sb.append(smsTmsLimAm==null?"null":getSmsTmsLimAm());
		sb.append("\n");
		sb.append("\tdpacNo: ");
		sb.append(dpacNo==null?"null":getDpacNo());
		sb.append("\n");
		sb.append("\tnewAcno: ");
		sb.append(newAcno==null?"null":getNewAcno());
		sb.append("\n");
		sb.append("\tebnkSrvcStcd: ");
		sb.append(ebnkSrvcStcd==null?"null":getEbnkSrvcStcd());
		sb.append("\n");
		sb.append("\thpNo: ");
		sb.append(hpNo==null?"null":getHpNo());
		sb.append("\n");
		sb.append("\tntcTgtTrnDscd: ");
		sb.append(ntcTgtTrnDscd==null?"null":getNtcTgtTrnDscd());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\tprcSrno: ");
		sb.append(prcSrno==null?"null":getPrcSrno());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* wonNtfcRgsYn */
		messageLen+= 10; /* smsTmsLimAm */
		messageLen+= 10; /* dpacNo */
		messageLen+= 1; /* newAcno */
		messageLen+= 10; /* ebnkSrvcStcd */
		messageLen+= 14; /* hpNo */
		messageLen+= 1; /* ntcTgtTrnDscd */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 6; /* tmsStaTm */
		messageLen+= 6; /* tmsEndTm */
		messageLen+= 9; /* prcSrno */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 8; /* advpeEno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wonNtfcRgsYn");
		list.add("smsTmsLimAm");
		list.add("dpacNo");
		list.add("newAcno");
		list.add("ebnkSrvcStcd");
		list.add("hpNo");
		list.add("ntcTgtTrnDscd");
		list.add("balNtrsnYn");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("prcSrno");
		list.add("atsSndLimYn");
		list.add("advpeEno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wonNtfcRgsYn", get("wonNtfcRgsYn"));
		map.put("smsTmsLimAm", get("smsTmsLimAm"));
		map.put("dpacNo", get("dpacNo"));
		map.put("newAcno", get("newAcno"));
		map.put("ebnkSrvcStcd", get("ebnkSrvcStcd"));
		map.put("hpNo", get("hpNo"));
		map.put("ntcTgtTrnDscd", get("ntcTgtTrnDscd"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("prcSrno", get("prcSrno"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("advpeEno", get("advpeEno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 445487450:/* wonNtfcRgsYn */
			return getWonNtfcRgsYn();
		case -448336293:/* smsTmsLimAm */
			return getSmsTmsLimAm();
		case -1325630449:/* dpacNo */
			return getDpacNo();
		case 1844635427:/* newAcno */
			return getNewAcno();
		case 71960360:/* ebnkSrvcStcd */
			return getEbnkSrvcStcd();
		case 3208425:/* hpNo */
			return getHpNo();
		case -1825988964:/* ntcTgtTrnDscd */
			return getNtcTgtTrnDscd();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case -321065311:/* prcSrno */
			return getPrcSrno();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 445487450:/* wonNtfcRgsYn */
			setWonNtfcRgsYn((String)value);
			break;
		case -448336293:/* smsTmsLimAm */
			setSmsTmsLimAm((String)value);
			break;
		case -1325630449:/* dpacNo */
			setDpacNo((String)value);
			break;
		case 1844635427:/* newAcno */
			setNewAcno((String)value);
			break;
		case 71960360:/* ebnkSrvcStcd */
			setEbnkSrvcStcd((String)value);
			break;
		case 3208425:/* hpNo */
			setHpNo((String)value);
			break;
		case -1825988964:/* ntcTgtTrnDscd */
			setNtcTgtTrnDscd((String)value);
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
			break;
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case -321065311:/* prcSrno */
			setPrcSrno((Integer)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		default:
			break;
		}
	}
	
}
