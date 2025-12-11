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
 * 입출금알림설정DTO
 */
@XmlType(propOrder={
	"advpeEno", "actPwnoUsgYn", "actPwno", "tgtAcno", "ntcTgtTrnDscd", "balNtrsnYn", "tmsLimAm", "tmsStaTm", "tmsEndTm", "hpComCd", "hpTlenNo", "hpSerNo", "atsSndLimYn", "prcSrno", "chrSndXtYn"
	, "pushAgrYn"
}, name="INBRawNtfcEstRgs_DTO")
@XmlRootElement(name="INBRawNtfcEstRgs_DTO")
@BxmCategory(logicalName="입출금알림설정DTO", description="입출금알림설정DTO") 
public class INBRawNtfcEstRgs_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1590512694L;
	
	
	
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
	
	
	/**
	 * 계좌비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "actPwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="계좌비밀번호사용여부", align="left", fill="")
	private String actPwnoUsgYn= "";
	
	
	/**
	 * 계좌비밀번호
	 */
	@ApiModelProperty(
		name = "actPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwno")
	@BxmOmm_Field(length=32, decimal=0, description="계좌비밀번호", align="left", fill="")
	private String actPwno= "";
	
	
	/**
	 * 대상계좌번호
	 */
	@ApiModelProperty(
		name = "tgtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtAcno")
	@BxmOmm_Field(length=15, decimal=0, description="대상계좌번호", align="left", fill="")
	private String tgtAcno= "";
	
	
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
	 * 전송제한금액
	 */
	@ApiModelProperty(
		name = "tmsLimAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tmsLimAm")
	@BxmOmm_Field(length=15, decimal=0, description="전송제한금액", align="right", fill="")
	private BigDecimal tmsLimAm= new BigDecimal("0");
	
	
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
	 * 핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "hpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰회사코드", align="left", fill="")
	private String hpComCd= "";
	
	
	/**
	 * 핸드폰국번번호
	 */
	@ApiModelProperty(
		name = "hpTlenNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpTlenNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰국번번호", align="left", fill="")
	private String hpTlenNo= "";
	
	
	/**
	 * 핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "hpSerNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpSerNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰일련번호", align="left", fill="")
	private String hpSerNo= "";
	
	
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
	 * 처리일련번호
	 */
	@ApiModelProperty(
		name = "prcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("prcSrno")
	@BxmOmm_Field(length=5, decimal=0, description="처리일련번호", align="right", fill="")
	private Integer prcSrno= 0;
	
	
	/**
	 * 문자발송제외여부
	 */
	@ApiModelProperty(
		name = "chrSndXtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chrSndXtYn")
	@BxmOmm_Field(length=1, decimal=0, description="문자발송제외여부", align="left", fill="")
	private String chrSndXtYn= "";
	
	
	/**
	 * 알림동의여부
	 */
	@ApiModelProperty(
		name = "pushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림동의여부", align="left", fill="")
	private String pushAgrYn= "";
	
	
	
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwnoUsgYn= false;
	protected final boolean isSet_actPwnoUsgYn(){
		return this.isSet_actPwnoUsgYn;
	}
	private void setIsSet_actPwnoUsgYn(boolean value){
		this.isSet_actPwnoUsgYn= value;
	}
	/**
	 * 계좌비밀번호사용여부
	 */
	@XmlTransient
	public String getActPwnoUsgYn(){
		return this.actPwnoUsgYn;
	}
	
	/**
	 * 계좌비밀번호사용여부
	 * 
	 * @param actPwnoUsgYn 계좌비밀번호사용여부
	 */
	public void setActPwnoUsgYn(String actPwnoUsgYn){
		this.actPwnoUsgYn= actPwnoUsgYn;
		this.setIsSet_actPwnoUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwno= false;
	protected final boolean isSet_actPwno(){
		return this.isSet_actPwno;
	}
	private void setIsSet_actPwno(boolean value){
		this.isSet_actPwno= value;
	}
	/**
	 * 계좌비밀번호
	 */
	@XmlTransient
	public String getActPwno(){
		return this.actPwno;
	}
	
	/**
	 * 계좌비밀번호
	 * 
	 * @param actPwno 계좌비밀번호
	 */
	public void setActPwno(String actPwno){
		this.actPwno= actPwno;
		this.setIsSet_actPwno(true);
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
	private boolean isSet_tmsLimAm= false;
	protected final boolean isSet_tmsLimAm(){
		return this.isSet_tmsLimAm;
	}
	private void setIsSet_tmsLimAm(boolean value){
		this.isSet_tmsLimAm= value;
	}
	/**
	 * 전송제한금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tmsLimAm 전송제한금액
	 */
	public void setTmsLimAm(double tmsLimAm) {
		setTmsLimAm(BigDecimal.valueOf(tmsLimAm));
	}
	/**
	 * 전송제한금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tmsLimAm 전송제한금액
	 */
	public void setTmsLimAm(long tmsLimAm) {
		setTmsLimAm(BigDecimal.valueOf(tmsLimAm));
	}
	/**
	 * 전송제한금액
	 * BigDecimal - String value setter
	 *
	 * @Param tmsLimAm 전송제한금액
	 */
	public void setTmsLimAm(String tmsLimAm) {
		setTmsLimAm(new BigDecimal(tmsLimAm));
	}
	/**
	 * 전송제한금액
	 */
	@XmlTransient
	public BigDecimal getTmsLimAm(){
		return this.tmsLimAm;
	}
	
	/**
	 * 전송제한금액
	 * 
	 * @param tmsLimAm 전송제한금액
	 */
	@JsonSetter("tmsLimAm")
	public void setTmsLimAm(BigDecimal tmsLimAm){
		this.tmsLimAm= tmsLimAm;
		this.setIsSet_tmsLimAm(true);
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
	private boolean isSet_hpComCd= false;
	protected final boolean isSet_hpComCd(){
		return this.isSet_hpComCd;
	}
	private void setIsSet_hpComCd(boolean value){
		this.isSet_hpComCd= value;
	}
	/**
	 * 핸드폰회사코드
	 */
	@XmlTransient
	public String getHpComCd(){
		return this.hpComCd;
	}
	
	/**
	 * 핸드폰회사코드
	 * 
	 * @param hpComCd 핸드폰회사코드
	 */
	public void setHpComCd(String hpComCd){
		this.hpComCd= hpComCd;
		this.setIsSet_hpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpTlenNo= false;
	protected final boolean isSet_hpTlenNo(){
		return this.isSet_hpTlenNo;
	}
	private void setIsSet_hpTlenNo(boolean value){
		this.isSet_hpTlenNo= value;
	}
	/**
	 * 핸드폰국번번호
	 */
	@XmlTransient
	public String getHpTlenNo(){
		return this.hpTlenNo;
	}
	
	/**
	 * 핸드폰국번번호
	 * 
	 * @param hpTlenNo 핸드폰국번번호
	 */
	public void setHpTlenNo(String hpTlenNo){
		this.hpTlenNo= hpTlenNo;
		this.setIsSet_hpTlenNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpSerNo= false;
	protected final boolean isSet_hpSerNo(){
		return this.isSet_hpSerNo;
	}
	private void setIsSet_hpSerNo(boolean value){
		this.isSet_hpSerNo= value;
	}
	/**
	 * 핸드폰일련번호
	 */
	@XmlTransient
	public String getHpSerNo(){
		return this.hpSerNo;
	}
	
	/**
	 * 핸드폰일련번호
	 * 
	 * @param hpSerNo 핸드폰일련번호
	 */
	public void setHpSerNo(String hpSerNo){
		this.hpSerNo= hpSerNo;
		this.setIsSet_hpSerNo(true);
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
	private boolean isSet_chrSndXtYn= false;
	protected final boolean isSet_chrSndXtYn(){
		return this.isSet_chrSndXtYn;
	}
	private void setIsSet_chrSndXtYn(boolean value){
		this.isSet_chrSndXtYn= value;
	}
	/**
	 * 문자발송제외여부
	 */
	@XmlTransient
	public String getChrSndXtYn(){
		return this.chrSndXtYn;
	}
	
	/**
	 * 문자발송제외여부
	 * 
	 * @param chrSndXtYn 문자발송제외여부
	 */
	public void setChrSndXtYn(String chrSndXtYn){
		this.chrSndXtYn= chrSndXtYn;
		this.setIsSet_chrSndXtYn(true);
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
	 * 알림동의여부
	 */
	@XmlTransient
	public String getPushAgrYn(){
		return this.pushAgrYn;
	}
	
	/**
	 * 알림동의여부
	 * 
	 * @param pushAgrYn 알림동의여부
	 */
	public void setPushAgrYn(String pushAgrYn){
		this.pushAgrYn= pushAgrYn;
		this.setIsSet_pushAgrYn(true);
	}
				
	@Override
	public INBRawNtfcEstRgs_DTO clone(){
		try{
			INBRawNtfcEstRgs_DTO object= (INBRawNtfcEstRgs_DTO)super.clone();
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
		
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.actPwno==null)?0:this.actPwno.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		result= prime * result + ((this.ntcTgtTrnDscd==null)?0:this.ntcTgtTrnDscd.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.tmsLimAm==null)?0:this.tmsLimAm.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlenNo==null)?0:this.hpTlenNo.hashCode());
		result= prime * result + ((this.hpSerNo==null)?0:this.hpSerNo.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.prcSrno==null)?0:this.prcSrno.hashCode());
		result= prime * result + ((this.chrSndXtYn==null)?0:this.chrSndXtYn.hashCode());
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBRawNtfcEstRgs_DTO other= (INBRawNtfcEstRgs_DTO)obj;
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _actPwnoUsgYn= getActPwnoUsgYn();
			Object __actPwnoUsgYn= other.getActPwnoUsgYn();
			if ( _actPwnoUsgYn== null ) { if ( __actPwnoUsgYn!= null ) return false; }
			else if ( !_actPwnoUsgYn.equals(__actPwnoUsgYn) ) return false;
		}
		{
			Object _actPwno= getActPwno();
			Object __actPwno= other.getActPwno();
			if ( _actPwno== null ) { if ( __actPwno!= null ) return false; }
			else if ( !_actPwno.equals(__actPwno) ) return false;
		}
		{
			Object _tgtAcno= getTgtAcno();
			Object __tgtAcno= other.getTgtAcno();
			if ( _tgtAcno== null ) { if ( __tgtAcno!= null ) return false; }
			else if ( !_tgtAcno.equals(__tgtAcno) ) return false;
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
			Object _tmsLimAm= getTmsLimAm();
			Object __tmsLimAm= other.getTmsLimAm();
			if ( _tmsLimAm== null ) { if ( __tmsLimAm!= null ) return false; }
			else if ( !_tmsLimAm.equals(__tmsLimAm) ) return false;
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
			Object _hpComCd= getHpComCd();
			Object __hpComCd= other.getHpComCd();
			if ( _hpComCd== null ) { if ( __hpComCd!= null ) return false; }
			else if ( !_hpComCd.equals(__hpComCd) ) return false;
		}
		{
			Object _hpTlenNo= getHpTlenNo();
			Object __hpTlenNo= other.getHpTlenNo();
			if ( _hpTlenNo== null ) { if ( __hpTlenNo!= null ) return false; }
			else if ( !_hpTlenNo.equals(__hpTlenNo) ) return false;
		}
		{
			Object _hpSerNo= getHpSerNo();
			Object __hpSerNo= other.getHpSerNo();
			if ( _hpSerNo== null ) { if ( __hpSerNo!= null ) return false; }
			else if ( !_hpSerNo.equals(__hpSerNo) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _prcSrno= getPrcSrno();
			Object __prcSrno= other.getPrcSrno();
			if ( _prcSrno== null ) { if ( __prcSrno!= null ) return false; }
			else if ( !_prcSrno.equals(__prcSrno) ) return false;
		}
		{
			Object _chrSndXtYn= getChrSndXtYn();
			Object __chrSndXtYn= other.getChrSndXtYn();
			if ( _chrSndXtYn== null ) { if ( __chrSndXtYn!= null ) return false; }
			else if ( !_chrSndXtYn.equals(__chrSndXtYn) ) return false;
		}
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBRawNtfcEstRgs_DTO.class.getName()).append(":\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tactPwno: ");
		sb.append(actPwno==null?"null":getActPwno());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno());
		sb.append("\n");
		sb.append("\tntcTgtTrnDscd: ");
		sb.append(ntcTgtTrnDscd==null?"null":getNtcTgtTrnDscd());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\ttmsLimAm: ");
		sb.append(tmsLimAm==null?"null":getTmsLimAm());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\thpComCd: ");
		sb.append(hpComCd==null?"null":getHpComCd());
		sb.append("\n");
		sb.append("\thpTlenNo: ");
		sb.append(hpTlenNo==null?"null":getHpTlenNo());
		sb.append("\n");
		sb.append("\thpSerNo: ");
		sb.append(hpSerNo==null?"null":getHpSerNo());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\tprcSrno: ");
		sb.append(prcSrno==null?"null":getPrcSrno());
		sb.append("\n");
		sb.append("\tchrSndXtYn: ");
		sb.append(chrSndXtYn==null?"null":getChrSndXtYn());
		sb.append("\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* advpeEno */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 32; /* actPwno */
		messageLen+= 15; /* tgtAcno */
		messageLen+= 1; /* ntcTgtTrnDscd */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 15; /* tmsLimAm */
		messageLen+= 6; /* tmsStaTm */
		messageLen+= 6; /* tmsEndTm */
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlenNo */
		messageLen+= 4; /* hpSerNo */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 5; /* prcSrno */
		messageLen+= 1; /* chrSndXtYn */
		messageLen+= 1; /* pushAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("advpeEno");
		list.add("actPwnoUsgYn");
		list.add("actPwno");
		list.add("tgtAcno");
		list.add("ntcTgtTrnDscd");
		list.add("balNtrsnYn");
		list.add("tmsLimAm");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("hpComCd");
		list.add("hpTlenNo");
		list.add("hpSerNo");
		list.add("atsSndLimYn");
		list.add("prcSrno");
		list.add("chrSndXtYn");
		list.add("pushAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("advpeEno", get("advpeEno"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("actPwno", get("actPwno"));
		map.put("tgtAcno", get("tgtAcno"));
		map.put("ntcTgtTrnDscd", get("ntcTgtTrnDscd"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("tmsLimAm", get("tmsLimAm"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlenNo", get("hpTlenNo"));
		map.put("hpSerNo", get("hpSerNo"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("prcSrno", get("prcSrno"));
		map.put("chrSndXtYn", get("chrSndXtYn"));
		map.put("pushAgrYn", get("pushAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case -1162540614:/* actPwno */
			return getActPwno();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		case -1825988964:/* ntcTgtTrnDscd */
			return getNtcTgtTrnDscd();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case 1621964258:/* tmsLimAm */
			return getTmsLimAm();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -307448342:/* hpTlenNo */
			return getHpTlenNo();
		case 1097340441:/* hpSerNo */
			return getHpSerNo();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case -321065311:/* prcSrno */
			return getPrcSrno();
		case -562099507:/* chrSndXtYn */
			return getChrSndXtYn();
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case -1162540614:/* actPwno */
			setActPwno((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		case -1825988964:/* ntcTgtTrnDscd */
			setNtcTgtTrnDscd((String)value);
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
			break;
		case 1621964258:/* tmsLimAm */
			if ( value instanceof String ){
				setTmsLimAm((String)value);
			}
			else if ( value instanceof Double ){
				setTmsLimAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTmsLimAm((Long)value);
			}
			else{
				setTmsLimAm((BigDecimal)value);
			}
			break;
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case 1082856858:/* hpComCd */
			setHpComCd((String)value);
			break;
		case -307448342:/* hpTlenNo */
			setHpTlenNo((String)value);
			break;
		case 1097340441:/* hpSerNo */
			setHpSerNo((String)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case -321065311:/* prcSrno */
			setPrcSrno((Integer)value);
			break;
		case -562099507:/* chrSndXtYn */
			setChrSndXtYn((String)value);
			break;
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
