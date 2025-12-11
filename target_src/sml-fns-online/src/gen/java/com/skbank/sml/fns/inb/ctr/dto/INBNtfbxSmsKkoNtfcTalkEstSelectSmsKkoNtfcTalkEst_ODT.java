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
 * SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO
 */
@XmlType(propOrder={
	"lnGdncNtfcSrvcJnngYn", "prtfGdncSrvdJnngYn", "rtpenPtrtNtfcSrvcJnngYn", "rtpenDcRcvNtfcSrvcJnngYn", "fgrmtArvNtcSrvcJnngYn", "tptaIsaLossRtChrDpsMnJnngYn", "fndAtsXprNprcNtcSrvcJnngYn", "fndGdncSrvcJnngYn", "smsSrvcNtfcId"
}, name="INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT")
@XmlRootElement(name="INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT")
@BxmCategory(logicalName="SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO", description="SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO") 
public class INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1038572774L;
	
	
	
	/**
	 * 대출안내알림서비스가입여부
	 */
	@ApiModelProperty(
		name = "lnGdncNtfcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnGdncNtfcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="대출안내알림서비스가입여부", align="left", fill="")
	private String lnGdncNtfcSrvcJnngYn= "";
	
	
	/**
	 * 포트폴리오안내서비스가입여부
	 */
	@ApiModelProperty(
		name = "prtfGdncSrvdJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prtfGdncSrvdJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="포트폴리오안내서비스가입여부", align="left", fill="")
	private String prtfGdncSrvdJnngYn= "";
	
	
	/**
	 * 퇴직연금수익률알림서비스가입여부
	 */
	@ApiModelProperty(
		name = "rtpenPtrtNtfcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenPtrtNtfcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="퇴직연금수익률알림서비스가입여부", align="left", fill="")
	private String rtpenPtrtNtfcSrvcJnngYn= "";
	
	
	/**
	 * 퇴직연금DC입금알림서비스가입여부
	 */
	@ApiModelProperty(
		name = "rtpenDcRcvNtfcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenDcRcvNtfcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="퇴직연금DC입금알림서비스가입여부", align="left", fill="")
	private String rtpenDcRcvNtfcSrvcJnngYn= "";
	
	
	/**
	 * 해외송금도착통지서비스가입여부
	 */
	@ApiModelProperty(
		name = "fgrmtArvNtcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fgrmtArvNtcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="해외송금도착통지서비스가입여부", align="left", fill="")
	private String fgrmtArvNtcSrvcJnngYn= "";
	
	
	/**
	 * 일임형ISA손실율문자수신관리가입여부
	 */
	@ApiModelProperty(
		name = "tptaIsaLossRtChrDpsMnJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tptaIsaLossRtChrDpsMnJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="일임형ISA손실율문자수신관리가입여부", align="left", fill="")
	private String tptaIsaLossRtChrDpsMnJnngYn= "";
	
	
	/**
	 * 펀드자동이체만기통보서비스가입여부
	 */
	@ApiModelProperty(
		name = "fndAtsXprNprcNtcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndAtsXprNprcNtcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드자동이체만기통보서비스가입여부", align="left", fill="")
	private String fndAtsXprNprcNtcSrvcJnngYn= "";
	
	
	/**
	 * 펀드안내서비스가입여부
	 */
	@ApiModelProperty(
		name = "fndGdncSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndGdncSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드안내서비스가입여부", align="left", fill="")
	private String fndGdncSrvcJnngYn= "";
	
	
	/**
	 * SMS서비스알림ID
	 */
	@ApiModelProperty(
		name = "smsSrvcNtfcId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsSrvcNtfcId")
	@BxmOmm_Field(length=10, decimal=0, description="SMS서비스알림ID", align="left", fill="")
	private String smsSrvcNtfcId= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnGdncNtfcSrvcJnngYn= false;
	protected final boolean isSet_lnGdncNtfcSrvcJnngYn(){
		return this.isSet_lnGdncNtfcSrvcJnngYn;
	}
	private void setIsSet_lnGdncNtfcSrvcJnngYn(boolean value){
		this.isSet_lnGdncNtfcSrvcJnngYn= value;
	}
	/**
	 * 대출안내알림서비스가입여부
	 */
	@XmlTransient
	public String getLnGdncNtfcSrvcJnngYn(){
		return this.lnGdncNtfcSrvcJnngYn;
	}
	
	/**
	 * 대출안내알림서비스가입여부
	 * 
	 * @param lnGdncNtfcSrvcJnngYn 대출안내알림서비스가입여부
	 */
	public void setLnGdncNtfcSrvcJnngYn(String lnGdncNtfcSrvcJnngYn){
		this.lnGdncNtfcSrvcJnngYn= lnGdncNtfcSrvcJnngYn;
		this.setIsSet_lnGdncNtfcSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prtfGdncSrvdJnngYn= false;
	protected final boolean isSet_prtfGdncSrvdJnngYn(){
		return this.isSet_prtfGdncSrvdJnngYn;
	}
	private void setIsSet_prtfGdncSrvdJnngYn(boolean value){
		this.isSet_prtfGdncSrvdJnngYn= value;
	}
	/**
	 * 포트폴리오안내서비스가입여부
	 */
	@XmlTransient
	public String getPrtfGdncSrvdJnngYn(){
		return this.prtfGdncSrvdJnngYn;
	}
	
	/**
	 * 포트폴리오안내서비스가입여부
	 * 
	 * @param prtfGdncSrvdJnngYn 포트폴리오안내서비스가입여부
	 */
	public void setPrtfGdncSrvdJnngYn(String prtfGdncSrvdJnngYn){
		this.prtfGdncSrvdJnngYn= prtfGdncSrvdJnngYn;
		this.setIsSet_prtfGdncSrvdJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenPtrtNtfcSrvcJnngYn= false;
	protected final boolean isSet_rtpenPtrtNtfcSrvcJnngYn(){
		return this.isSet_rtpenPtrtNtfcSrvcJnngYn;
	}
	private void setIsSet_rtpenPtrtNtfcSrvcJnngYn(boolean value){
		this.isSet_rtpenPtrtNtfcSrvcJnngYn= value;
	}
	/**
	 * 퇴직연금수익률알림서비스가입여부
	 */
	@XmlTransient
	public String getRtpenPtrtNtfcSrvcJnngYn(){
		return this.rtpenPtrtNtfcSrvcJnngYn;
	}
	
	/**
	 * 퇴직연금수익률알림서비스가입여부
	 * 
	 * @param rtpenPtrtNtfcSrvcJnngYn 퇴직연금수익률알림서비스가입여부
	 */
	public void setRtpenPtrtNtfcSrvcJnngYn(String rtpenPtrtNtfcSrvcJnngYn){
		this.rtpenPtrtNtfcSrvcJnngYn= rtpenPtrtNtfcSrvcJnngYn;
		this.setIsSet_rtpenPtrtNtfcSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenDcRcvNtfcSrvcJnngYn= false;
	protected final boolean isSet_rtpenDcRcvNtfcSrvcJnngYn(){
		return this.isSet_rtpenDcRcvNtfcSrvcJnngYn;
	}
	private void setIsSet_rtpenDcRcvNtfcSrvcJnngYn(boolean value){
		this.isSet_rtpenDcRcvNtfcSrvcJnngYn= value;
	}
	/**
	 * 퇴직연금DC입금알림서비스가입여부
	 */
	@XmlTransient
	public String getRtpenDcRcvNtfcSrvcJnngYn(){
		return this.rtpenDcRcvNtfcSrvcJnngYn;
	}
	
	/**
	 * 퇴직연금DC입금알림서비스가입여부
	 * 
	 * @param rtpenDcRcvNtfcSrvcJnngYn 퇴직연금DC입금알림서비스가입여부
	 */
	public void setRtpenDcRcvNtfcSrvcJnngYn(String rtpenDcRcvNtfcSrvcJnngYn){
		this.rtpenDcRcvNtfcSrvcJnngYn= rtpenDcRcvNtfcSrvcJnngYn;
		this.setIsSet_rtpenDcRcvNtfcSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fgrmtArvNtcSrvcJnngYn= false;
	protected final boolean isSet_fgrmtArvNtcSrvcJnngYn(){
		return this.isSet_fgrmtArvNtcSrvcJnngYn;
	}
	private void setIsSet_fgrmtArvNtcSrvcJnngYn(boolean value){
		this.isSet_fgrmtArvNtcSrvcJnngYn= value;
	}
	/**
	 * 해외송금도착통지서비스가입여부
	 */
	@XmlTransient
	public String getFgrmtArvNtcSrvcJnngYn(){
		return this.fgrmtArvNtcSrvcJnngYn;
	}
	
	/**
	 * 해외송금도착통지서비스가입여부
	 * 
	 * @param fgrmtArvNtcSrvcJnngYn 해외송금도착통지서비스가입여부
	 */
	public void setFgrmtArvNtcSrvcJnngYn(String fgrmtArvNtcSrvcJnngYn){
		this.fgrmtArvNtcSrvcJnngYn= fgrmtArvNtcSrvcJnngYn;
		this.setIsSet_fgrmtArvNtcSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tptaIsaLossRtChrDpsMnJnngYn= false;
	protected final boolean isSet_tptaIsaLossRtChrDpsMnJnngYn(){
		return this.isSet_tptaIsaLossRtChrDpsMnJnngYn;
	}
	private void setIsSet_tptaIsaLossRtChrDpsMnJnngYn(boolean value){
		this.isSet_tptaIsaLossRtChrDpsMnJnngYn= value;
	}
	/**
	 * 일임형ISA손실율문자수신관리가입여부
	 */
	@XmlTransient
	public String getTptaIsaLossRtChrDpsMnJnngYn(){
		return this.tptaIsaLossRtChrDpsMnJnngYn;
	}
	
	/**
	 * 일임형ISA손실율문자수신관리가입여부
	 * 
	 * @param tptaIsaLossRtChrDpsMnJnngYn 일임형ISA손실율문자수신관리가입여부
	 */
	public void setTptaIsaLossRtChrDpsMnJnngYn(String tptaIsaLossRtChrDpsMnJnngYn){
		this.tptaIsaLossRtChrDpsMnJnngYn= tptaIsaLossRtChrDpsMnJnngYn;
		this.setIsSet_tptaIsaLossRtChrDpsMnJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndAtsXprNprcNtcSrvcJnngYn= false;
	protected final boolean isSet_fndAtsXprNprcNtcSrvcJnngYn(){
		return this.isSet_fndAtsXprNprcNtcSrvcJnngYn;
	}
	private void setIsSet_fndAtsXprNprcNtcSrvcJnngYn(boolean value){
		this.isSet_fndAtsXprNprcNtcSrvcJnngYn= value;
	}
	/**
	 * 펀드자동이체만기통보서비스가입여부
	 */
	@XmlTransient
	public String getFndAtsXprNprcNtcSrvcJnngYn(){
		return this.fndAtsXprNprcNtcSrvcJnngYn;
	}
	
	/**
	 * 펀드자동이체만기통보서비스가입여부
	 * 
	 * @param fndAtsXprNprcNtcSrvcJnngYn 펀드자동이체만기통보서비스가입여부
	 */
	public void setFndAtsXprNprcNtcSrvcJnngYn(String fndAtsXprNprcNtcSrvcJnngYn){
		this.fndAtsXprNprcNtcSrvcJnngYn= fndAtsXprNprcNtcSrvcJnngYn;
		this.setIsSet_fndAtsXprNprcNtcSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndGdncSrvcJnngYn= false;
	protected final boolean isSet_fndGdncSrvcJnngYn(){
		return this.isSet_fndGdncSrvcJnngYn;
	}
	private void setIsSet_fndGdncSrvcJnngYn(boolean value){
		this.isSet_fndGdncSrvcJnngYn= value;
	}
	/**
	 * 펀드안내서비스가입여부
	 */
	@XmlTransient
	public String getFndGdncSrvcJnngYn(){
		return this.fndGdncSrvcJnngYn;
	}
	
	/**
	 * 펀드안내서비스가입여부
	 * 
	 * @param fndGdncSrvcJnngYn 펀드안내서비스가입여부
	 */
	public void setFndGdncSrvcJnngYn(String fndGdncSrvcJnngYn){
		this.fndGdncSrvcJnngYn= fndGdncSrvcJnngYn;
		this.setIsSet_fndGdncSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsSrvcNtfcId= false;
	protected final boolean isSet_smsSrvcNtfcId(){
		return this.isSet_smsSrvcNtfcId;
	}
	private void setIsSet_smsSrvcNtfcId(boolean value){
		this.isSet_smsSrvcNtfcId= value;
	}
	/**
	 * SMS서비스알림ID
	 */
	@XmlTransient
	public String getSmsSrvcNtfcId(){
		return this.smsSrvcNtfcId;
	}
	
	/**
	 * SMS서비스알림ID
	 * 
	 * @param smsSrvcNtfcId SMS서비스알림ID
	 */
	public void setSmsSrvcNtfcId(String smsSrvcNtfcId){
		this.smsSrvcNtfcId= smsSrvcNtfcId;
		this.setIsSet_smsSrvcNtfcId(true);
	}
				
	@Override
	public INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT clone(){
		try{
			INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT object= (INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT)super.clone();
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
		
		result= prime * result + ((this.lnGdncNtfcSrvcJnngYn==null)?0:this.lnGdncNtfcSrvcJnngYn.hashCode());
		result= prime * result + ((this.prtfGdncSrvdJnngYn==null)?0:this.prtfGdncSrvdJnngYn.hashCode());
		result= prime * result + ((this.rtpenPtrtNtfcSrvcJnngYn==null)?0:this.rtpenPtrtNtfcSrvcJnngYn.hashCode());
		result= prime * result + ((this.rtpenDcRcvNtfcSrvcJnngYn==null)?0:this.rtpenDcRcvNtfcSrvcJnngYn.hashCode());
		result= prime * result + ((this.fgrmtArvNtcSrvcJnngYn==null)?0:this.fgrmtArvNtcSrvcJnngYn.hashCode());
		result= prime * result + ((this.tptaIsaLossRtChrDpsMnJnngYn==null)?0:this.tptaIsaLossRtChrDpsMnJnngYn.hashCode());
		result= prime * result + ((this.fndAtsXprNprcNtcSrvcJnngYn==null)?0:this.fndAtsXprNprcNtcSrvcJnngYn.hashCode());
		result= prime * result + ((this.fndGdncSrvcJnngYn==null)?0:this.fndGdncSrvcJnngYn.hashCode());
		result= prime * result + ((this.smsSrvcNtfcId==null)?0:this.smsSrvcNtfcId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT other= (INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT)obj;
		{
			Object _lnGdncNtfcSrvcJnngYn= getLnGdncNtfcSrvcJnngYn();
			Object __lnGdncNtfcSrvcJnngYn= other.getLnGdncNtfcSrvcJnngYn();
			if ( _lnGdncNtfcSrvcJnngYn== null ) { if ( __lnGdncNtfcSrvcJnngYn!= null ) return false; }
			else if ( !_lnGdncNtfcSrvcJnngYn.equals(__lnGdncNtfcSrvcJnngYn) ) return false;
		}
		{
			Object _prtfGdncSrvdJnngYn= getPrtfGdncSrvdJnngYn();
			Object __prtfGdncSrvdJnngYn= other.getPrtfGdncSrvdJnngYn();
			if ( _prtfGdncSrvdJnngYn== null ) { if ( __prtfGdncSrvdJnngYn!= null ) return false; }
			else if ( !_prtfGdncSrvdJnngYn.equals(__prtfGdncSrvdJnngYn) ) return false;
		}
		{
			Object _rtpenPtrtNtfcSrvcJnngYn= getRtpenPtrtNtfcSrvcJnngYn();
			Object __rtpenPtrtNtfcSrvcJnngYn= other.getRtpenPtrtNtfcSrvcJnngYn();
			if ( _rtpenPtrtNtfcSrvcJnngYn== null ) { if ( __rtpenPtrtNtfcSrvcJnngYn!= null ) return false; }
			else if ( !_rtpenPtrtNtfcSrvcJnngYn.equals(__rtpenPtrtNtfcSrvcJnngYn) ) return false;
		}
		{
			Object _rtpenDcRcvNtfcSrvcJnngYn= getRtpenDcRcvNtfcSrvcJnngYn();
			Object __rtpenDcRcvNtfcSrvcJnngYn= other.getRtpenDcRcvNtfcSrvcJnngYn();
			if ( _rtpenDcRcvNtfcSrvcJnngYn== null ) { if ( __rtpenDcRcvNtfcSrvcJnngYn!= null ) return false; }
			else if ( !_rtpenDcRcvNtfcSrvcJnngYn.equals(__rtpenDcRcvNtfcSrvcJnngYn) ) return false;
		}
		{
			Object _fgrmtArvNtcSrvcJnngYn= getFgrmtArvNtcSrvcJnngYn();
			Object __fgrmtArvNtcSrvcJnngYn= other.getFgrmtArvNtcSrvcJnngYn();
			if ( _fgrmtArvNtcSrvcJnngYn== null ) { if ( __fgrmtArvNtcSrvcJnngYn!= null ) return false; }
			else if ( !_fgrmtArvNtcSrvcJnngYn.equals(__fgrmtArvNtcSrvcJnngYn) ) return false;
		}
		{
			Object _tptaIsaLossRtChrDpsMnJnngYn= getTptaIsaLossRtChrDpsMnJnngYn();
			Object __tptaIsaLossRtChrDpsMnJnngYn= other.getTptaIsaLossRtChrDpsMnJnngYn();
			if ( _tptaIsaLossRtChrDpsMnJnngYn== null ) { if ( __tptaIsaLossRtChrDpsMnJnngYn!= null ) return false; }
			else if ( !_tptaIsaLossRtChrDpsMnJnngYn.equals(__tptaIsaLossRtChrDpsMnJnngYn) ) return false;
		}
		{
			Object _fndAtsXprNprcNtcSrvcJnngYn= getFndAtsXprNprcNtcSrvcJnngYn();
			Object __fndAtsXprNprcNtcSrvcJnngYn= other.getFndAtsXprNprcNtcSrvcJnngYn();
			if ( _fndAtsXprNprcNtcSrvcJnngYn== null ) { if ( __fndAtsXprNprcNtcSrvcJnngYn!= null ) return false; }
			else if ( !_fndAtsXprNprcNtcSrvcJnngYn.equals(__fndAtsXprNprcNtcSrvcJnngYn) ) return false;
		}
		{
			Object _fndGdncSrvcJnngYn= getFndGdncSrvcJnngYn();
			Object __fndGdncSrvcJnngYn= other.getFndGdncSrvcJnngYn();
			if ( _fndGdncSrvcJnngYn== null ) { if ( __fndGdncSrvcJnngYn!= null ) return false; }
			else if ( !_fndGdncSrvcJnngYn.equals(__fndGdncSrvcJnngYn) ) return false;
		}
		{
			Object _smsSrvcNtfcId= getSmsSrvcNtfcId();
			Object __smsSrvcNtfcId= other.getSmsSrvcNtfcId();
			if ( _smsSrvcNtfcId== null ) { if ( __smsSrvcNtfcId!= null ) return false; }
			else if ( !_smsSrvcNtfcId.equals(__smsSrvcNtfcId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT.class.getName()).append(":\n");
		sb.append("\tlnGdncNtfcSrvcJnngYn: ");
		sb.append(lnGdncNtfcSrvcJnngYn==null?"null":getLnGdncNtfcSrvcJnngYn());
		sb.append("\n");
		sb.append("\tprtfGdncSrvdJnngYn: ");
		sb.append(prtfGdncSrvdJnngYn==null?"null":getPrtfGdncSrvdJnngYn());
		sb.append("\n");
		sb.append("\trtpenPtrtNtfcSrvcJnngYn: ");
		sb.append(rtpenPtrtNtfcSrvcJnngYn==null?"null":getRtpenPtrtNtfcSrvcJnngYn());
		sb.append("\n");
		sb.append("\trtpenDcRcvNtfcSrvcJnngYn: ");
		sb.append(rtpenDcRcvNtfcSrvcJnngYn==null?"null":getRtpenDcRcvNtfcSrvcJnngYn());
		sb.append("\n");
		sb.append("\tfgrmtArvNtcSrvcJnngYn: ");
		sb.append(fgrmtArvNtcSrvcJnngYn==null?"null":getFgrmtArvNtcSrvcJnngYn());
		sb.append("\n");
		sb.append("\ttptaIsaLossRtChrDpsMnJnngYn: ");
		sb.append(tptaIsaLossRtChrDpsMnJnngYn==null?"null":getTptaIsaLossRtChrDpsMnJnngYn());
		sb.append("\n");
		sb.append("\tfndAtsXprNprcNtcSrvcJnngYn: ");
		sb.append(fndAtsXprNprcNtcSrvcJnngYn==null?"null":getFndAtsXprNprcNtcSrvcJnngYn());
		sb.append("\n");
		sb.append("\tfndGdncSrvcJnngYn: ");
		sb.append(fndGdncSrvcJnngYn==null?"null":getFndGdncSrvcJnngYn());
		sb.append("\n");
		sb.append("\tsmsSrvcNtfcId: ");
		sb.append(smsSrvcNtfcId==null?"null":getSmsSrvcNtfcId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* lnGdncNtfcSrvcJnngYn */
		messageLen+= 1; /* prtfGdncSrvdJnngYn */
		messageLen+= 1; /* rtpenPtrtNtfcSrvcJnngYn */
		messageLen+= 1; /* rtpenDcRcvNtfcSrvcJnngYn */
		messageLen+= 1; /* fgrmtArvNtcSrvcJnngYn */
		messageLen+= 1; /* tptaIsaLossRtChrDpsMnJnngYn */
		messageLen+= 1; /* fndAtsXprNprcNtcSrvcJnngYn */
		messageLen+= 1; /* fndGdncSrvcJnngYn */
		messageLen+= 10; /* smsSrvcNtfcId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("lnGdncNtfcSrvcJnngYn");
		list.add("prtfGdncSrvdJnngYn");
		list.add("rtpenPtrtNtfcSrvcJnngYn");
		list.add("rtpenDcRcvNtfcSrvcJnngYn");
		list.add("fgrmtArvNtcSrvcJnngYn");
		list.add("tptaIsaLossRtChrDpsMnJnngYn");
		list.add("fndAtsXprNprcNtcSrvcJnngYn");
		list.add("fndGdncSrvcJnngYn");
		list.add("smsSrvcNtfcId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("lnGdncNtfcSrvcJnngYn", get("lnGdncNtfcSrvcJnngYn"));
		map.put("prtfGdncSrvdJnngYn", get("prtfGdncSrvdJnngYn"));
		map.put("rtpenPtrtNtfcSrvcJnngYn", get("rtpenPtrtNtfcSrvcJnngYn"));
		map.put("rtpenDcRcvNtfcSrvcJnngYn", get("rtpenDcRcvNtfcSrvcJnngYn"));
		map.put("fgrmtArvNtcSrvcJnngYn", get("fgrmtArvNtcSrvcJnngYn"));
		map.put("tptaIsaLossRtChrDpsMnJnngYn", get("tptaIsaLossRtChrDpsMnJnngYn"));
		map.put("fndAtsXprNprcNtcSrvcJnngYn", get("fndAtsXprNprcNtcSrvcJnngYn"));
		map.put("fndGdncSrvcJnngYn", get("fndGdncSrvcJnngYn"));
		map.put("smsSrvcNtfcId", get("smsSrvcNtfcId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1789177045:/* lnGdncNtfcSrvcJnngYn */
			return getLnGdncNtfcSrvcJnngYn();
		case -335576155:/* prtfGdncSrvdJnngYn */
			return getPrtfGdncSrvdJnngYn();
		case 141189278:/* rtpenPtrtNtfcSrvcJnngYn */
			return getRtpenPtrtNtfcSrvcJnngYn();
		case -201237584:/* rtpenDcRcvNtfcSrvcJnngYn */
			return getRtpenDcRcvNtfcSrvcJnngYn();
		case 1149179022:/* fgrmtArvNtcSrvcJnngYn */
			return getFgrmtArvNtcSrvcJnngYn();
		case -292538976:/* tptaIsaLossRtChrDpsMnJnngYn */
			return getTptaIsaLossRtChrDpsMnJnngYn();
		case 59503122:/* fndAtsXprNprcNtcSrvcJnngYn */
			return getFndAtsXprNprcNtcSrvcJnngYn();
		case -231871732:/* fndGdncSrvcJnngYn */
			return getFndGdncSrvcJnngYn();
		case 1795479587:/* smsSrvcNtfcId */
			return getSmsSrvcNtfcId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1789177045:/* lnGdncNtfcSrvcJnngYn */
			setLnGdncNtfcSrvcJnngYn((String)value);
			break;
		case -335576155:/* prtfGdncSrvdJnngYn */
			setPrtfGdncSrvdJnngYn((String)value);
			break;
		case 141189278:/* rtpenPtrtNtfcSrvcJnngYn */
			setRtpenPtrtNtfcSrvcJnngYn((String)value);
			break;
		case -201237584:/* rtpenDcRcvNtfcSrvcJnngYn */
			setRtpenDcRcvNtfcSrvcJnngYn((String)value);
			break;
		case 1149179022:/* fgrmtArvNtcSrvcJnngYn */
			setFgrmtArvNtcSrvcJnngYn((String)value);
			break;
		case -292538976:/* tptaIsaLossRtChrDpsMnJnngYn */
			setTptaIsaLossRtChrDpsMnJnngYn((String)value);
			break;
		case 59503122:/* fndAtsXprNprcNtcSrvcJnngYn */
			setFndAtsXprNprcNtcSrvcJnngYn((String)value);
			break;
		case -231871732:/* fndGdncSrvcJnngYn */
			setFndGdncSrvcJnngYn((String)value);
			break;
		case 1795479587:/* smsSrvcNtfcId */
			setSmsSrvcNtfcId((String)value);
			break;
		default:
			break;
		}
	}
	
}
