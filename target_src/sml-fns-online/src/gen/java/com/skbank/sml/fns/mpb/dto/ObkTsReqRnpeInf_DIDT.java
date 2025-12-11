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
	"wdrAcno", "actPwnoUsgYn", "actPwno", "trnAm", "rsvDt", "rcvBkcd", "rcvAcno", "ptnPbokPrngTxt", "clnmNoAddSbj", "rnpeFnm", "wibeeMnyDduYn", "xtTgtRgsYn", "addInqYn", "bokTrnDscd", "mretFdYn"
}, name="ObkTsReqRnpeInf_DIDT")
@XmlRootElement(name="ObkTsReqRnpeInf_DIDT")
@BxmCategory(logicalName="타행.이체요청.수취인.정보.컴포넌트.입력.IO", description="") 
public class ObkTsReqRnpeInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1686491559L;
	
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="")
	private String wdrAcno= "";
	
	
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
	@BxmOmm_Field(length=50, decimal=0, description="계좌비밀번호", align="left", fill="")
	private String actPwno= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=13, decimal=0, description="거래금액", align="right", fill="0")
	private BigDecimal trnAm= new BigDecimal("0");
	
	
	/**
	 * 예약일자
	 */
	@ApiModelProperty(
		name = "rsvDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rsvDt")
	@BxmOmm_Field(length=8, decimal=0, description="예약일자", align="left", fill="")
	private String rsvDt= "";
	
	
	/**
	 * 입금은행코드
	 */
	@ApiModelProperty(
		name = "rcvBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="입금은행코드", align="left", fill="")
	private String rcvBkcd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rcvAcno= "";
	
	
	/**
	 * 상대통장인자내용
	 */
	@ApiModelProperty(
		name = "ptnPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="상대통장인자내용", align="left", fill="")
	private String ptnPbokPrngTxt= "";
	
	
	/**
	 * 집금번호추가사항
	 */
	@ApiModelProperty(
		name = "clnmNoAddSbj"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("clnmNoAddSbj")
	@BxmOmm_Field(length=50, decimal=0, description="집금번호추가사항", align="left", fill="")
	private String clnmNoAddSbj= "";
	
	
	/**
	 * 수취인성명
	 */
	@ApiModelProperty(
		name = "rnpeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rnpeFnm")
	@BxmOmm_Field(length=22, decimal=0, description="수취인성명", align="left", fill="")
	private String rnpeFnm= "";
	
	
	/**
	 * 위비머니차감여부
	 */
	@ApiModelProperty(
		name = "wibeeMnyDduYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wibeeMnyDduYn")
	@BxmOmm_Field(length=1, decimal=0, description="위비머니차감여부", align="left", fill="")
	private String wibeeMnyDduYn= "";
	
	
	/**
	 * 제외대상등록여부
	 */
	@ApiModelProperty(
		name = "xtTgtRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xtTgtRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="제외대상등록여부", align="left", fill="")
	private String xtTgtRgsYn= "";
	
	
	/**
	 * 추가조회여부
	 */
	@ApiModelProperty(
		name = "addInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("addInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="추가조회여부", align="left", fill="")
	private String addInqYn= "";
	
	
	/**
	 * 한국은행거래구분코드
	 */
	@ApiModelProperty(
		name = "bokTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bokTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="한국은행거래구분코드", align="left", fill="")
	private String bokTrnDscd= "";
	
	
	/**
	 * 월세자금여부
	 */
	@ApiModelProperty(
		name = "mretFdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mretFdYn")
	@BxmOmm_Field(length=1, decimal=0, description="월세자금여부", align="left", fill="")
	private String mretFdYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
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
	private boolean isSet_trnAm= false;
	protected final boolean isSet_trnAm(){
		return this.isSet_trnAm;
	}
	private void setIsSet_trnAm(boolean value){
		this.isSet_trnAm= value;
	}
	/**
	 * 거래금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(double trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(long trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm) {
		setTrnAm(new BigDecimal(trnAm));
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public BigDecimal getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	@JsonSetter("trnAm")
	public void setTrnAm(BigDecimal trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rsvDt= false;
	protected final boolean isSet_rsvDt(){
		return this.isSet_rsvDt;
	}
	private void setIsSet_rsvDt(boolean value){
		this.isSet_rsvDt= value;
	}
	/**
	 * 예약일자
	 */
	@XmlTransient
	public String getRsvDt(){
		return this.rsvDt;
	}
	
	/**
	 * 예약일자
	 * 
	 * @param rsvDt 예약일자
	 */
	public void setRsvDt(String rsvDt){
		this.rsvDt= rsvDt;
		this.setIsSet_rsvDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvBkcd= false;
	protected final boolean isSet_rcvBkcd(){
		return this.isSet_rcvBkcd;
	}
	private void setIsSet_rcvBkcd(boolean value){
		this.isSet_rcvBkcd= value;
	}
	/**
	 * 입금은행코드
	 */
	@XmlTransient
	public String getRcvBkcd(){
		return this.rcvBkcd;
	}
	
	/**
	 * 입금은행코드
	 * 
	 * @param rcvBkcd 입금은행코드
	 */
	public void setRcvBkcd(String rcvBkcd){
		this.rcvBkcd= rcvBkcd;
		this.setIsSet_rcvBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnPbokPrngTxt= false;
	protected final boolean isSet_ptnPbokPrngTxt(){
		return this.isSet_ptnPbokPrngTxt;
	}
	private void setIsSet_ptnPbokPrngTxt(boolean value){
		this.isSet_ptnPbokPrngTxt= value;
	}
	/**
	 * 상대통장인자내용
	 */
	@XmlTransient
	public String getPtnPbokPrngTxt(){
		return this.ptnPbokPrngTxt;
	}
	
	/**
	 * 상대통장인자내용
	 * 
	 * @param ptnPbokPrngTxt 상대통장인자내용
	 */
	public void setPtnPbokPrngTxt(String ptnPbokPrngTxt){
		this.ptnPbokPrngTxt= ptnPbokPrngTxt;
		this.setIsSet_ptnPbokPrngTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_clnmNoAddSbj= false;
	protected final boolean isSet_clnmNoAddSbj(){
		return this.isSet_clnmNoAddSbj;
	}
	private void setIsSet_clnmNoAddSbj(boolean value){
		this.isSet_clnmNoAddSbj= value;
	}
	/**
	 * 집금번호추가사항
	 */
	@XmlTransient
	public String getClnmNoAddSbj(){
		return this.clnmNoAddSbj;
	}
	
	/**
	 * 집금번호추가사항
	 * 
	 * @param clnmNoAddSbj 집금번호추가사항
	 */
	public void setClnmNoAddSbj(String clnmNoAddSbj){
		this.clnmNoAddSbj= clnmNoAddSbj;
		this.setIsSet_clnmNoAddSbj(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rnpeFnm= false;
	protected final boolean isSet_rnpeFnm(){
		return this.isSet_rnpeFnm;
	}
	private void setIsSet_rnpeFnm(boolean value){
		this.isSet_rnpeFnm= value;
	}
	/**
	 * 수취인성명
	 */
	@XmlTransient
	public String getRnpeFnm(){
		return this.rnpeFnm;
	}
	
	/**
	 * 수취인성명
	 * 
	 * @param rnpeFnm 수취인성명
	 */
	public void setRnpeFnm(String rnpeFnm){
		this.rnpeFnm= rnpeFnm;
		this.setIsSet_rnpeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wibeeMnyDduYn= false;
	protected final boolean isSet_wibeeMnyDduYn(){
		return this.isSet_wibeeMnyDduYn;
	}
	private void setIsSet_wibeeMnyDduYn(boolean value){
		this.isSet_wibeeMnyDduYn= value;
	}
	/**
	 * 위비머니차감여부
	 */
	@XmlTransient
	public String getWibeeMnyDduYn(){
		return this.wibeeMnyDduYn;
	}
	
	/**
	 * 위비머니차감여부
	 * 
	 * @param wibeeMnyDduYn 위비머니차감여부
	 */
	public void setWibeeMnyDduYn(String wibeeMnyDduYn){
		this.wibeeMnyDduYn= wibeeMnyDduYn;
		this.setIsSet_wibeeMnyDduYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xtTgtRgsYn= false;
	protected final boolean isSet_xtTgtRgsYn(){
		return this.isSet_xtTgtRgsYn;
	}
	private void setIsSet_xtTgtRgsYn(boolean value){
		this.isSet_xtTgtRgsYn= value;
	}
	/**
	 * 제외대상등록여부
	 */
	@XmlTransient
	public String getXtTgtRgsYn(){
		return this.xtTgtRgsYn;
	}
	
	/**
	 * 제외대상등록여부
	 * 
	 * @param xtTgtRgsYn 제외대상등록여부
	 */
	public void setXtTgtRgsYn(String xtTgtRgsYn){
		this.xtTgtRgsYn= xtTgtRgsYn;
		this.setIsSet_xtTgtRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_addInqYn= false;
	protected final boolean isSet_addInqYn(){
		return this.isSet_addInqYn;
	}
	private void setIsSet_addInqYn(boolean value){
		this.isSet_addInqYn= value;
	}
	/**
	 * 추가조회여부
	 */
	@XmlTransient
	public String getAddInqYn(){
		return this.addInqYn;
	}
	
	/**
	 * 추가조회여부
	 * 
	 * @param addInqYn 추가조회여부
	 */
	public void setAddInqYn(String addInqYn){
		this.addInqYn= addInqYn;
		this.setIsSet_addInqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bokTrnDscd= false;
	protected final boolean isSet_bokTrnDscd(){
		return this.isSet_bokTrnDscd;
	}
	private void setIsSet_bokTrnDscd(boolean value){
		this.isSet_bokTrnDscd= value;
	}
	/**
	 * 한국은행거래구분코드
	 */
	@XmlTransient
	public String getBokTrnDscd(){
		return this.bokTrnDscd;
	}
	
	/**
	 * 한국은행거래구분코드
	 * 
	 * @param bokTrnDscd 한국은행거래구분코드
	 */
	public void setBokTrnDscd(String bokTrnDscd){
		this.bokTrnDscd= bokTrnDscd;
		this.setIsSet_bokTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mretFdYn= false;
	protected final boolean isSet_mretFdYn(){
		return this.isSet_mretFdYn;
	}
	private void setIsSet_mretFdYn(boolean value){
		this.isSet_mretFdYn= value;
	}
	/**
	 * 월세자금여부
	 */
	@XmlTransient
	public String getMretFdYn(){
		return this.mretFdYn;
	}
	
	/**
	 * 월세자금여부
	 * 
	 * @param mretFdYn 월세자금여부
	 */
	public void setMretFdYn(String mretFdYn){
		this.mretFdYn= mretFdYn;
		this.setIsSet_mretFdYn(true);
	}
				
	@Override
	public ObkTsReqRnpeInf_DIDT clone(){
		try{
			ObkTsReqRnpeInf_DIDT object= (ObkTsReqRnpeInf_DIDT)super.clone();
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
		
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.actPwno==null)?0:this.actPwno.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.rsvDt==null)?0:this.rsvDt.hashCode());
		result= prime * result + ((this.rcvBkcd==null)?0:this.rcvBkcd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.ptnPbokPrngTxt==null)?0:this.ptnPbokPrngTxt.hashCode());
		result= prime * result + ((this.clnmNoAddSbj==null)?0:this.clnmNoAddSbj.hashCode());
		result= prime * result + ((this.rnpeFnm==null)?0:this.rnpeFnm.hashCode());
		result= prime * result + ((this.wibeeMnyDduYn==null)?0:this.wibeeMnyDduYn.hashCode());
		result= prime * result + ((this.xtTgtRgsYn==null)?0:this.xtTgtRgsYn.hashCode());
		result= prime * result + ((this.addInqYn==null)?0:this.addInqYn.hashCode());
		result= prime * result + ((this.bokTrnDscd==null)?0:this.bokTrnDscd.hashCode());
		result= prime * result + ((this.mretFdYn==null)?0:this.mretFdYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final ObkTsReqRnpeInf_DIDT other= (ObkTsReqRnpeInf_DIDT)obj;
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
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
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _rsvDt= getRsvDt();
			Object __rsvDt= other.getRsvDt();
			if ( _rsvDt== null ) { if ( __rsvDt!= null ) return false; }
			else if ( !_rsvDt.equals(__rsvDt) ) return false;
		}
		{
			Object _rcvBkcd= getRcvBkcd();
			Object __rcvBkcd= other.getRcvBkcd();
			if ( _rcvBkcd== null ) { if ( __rcvBkcd!= null ) return false; }
			else if ( !_rcvBkcd.equals(__rcvBkcd) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _ptnPbokPrngTxt= getPtnPbokPrngTxt();
			Object __ptnPbokPrngTxt= other.getPtnPbokPrngTxt();
			if ( _ptnPbokPrngTxt== null ) { if ( __ptnPbokPrngTxt!= null ) return false; }
			else if ( !_ptnPbokPrngTxt.equals(__ptnPbokPrngTxt) ) return false;
		}
		{
			Object _clnmNoAddSbj= getClnmNoAddSbj();
			Object __clnmNoAddSbj= other.getClnmNoAddSbj();
			if ( _clnmNoAddSbj== null ) { if ( __clnmNoAddSbj!= null ) return false; }
			else if ( !_clnmNoAddSbj.equals(__clnmNoAddSbj) ) return false;
		}
		{
			Object _rnpeFnm= getRnpeFnm();
			Object __rnpeFnm= other.getRnpeFnm();
			if ( _rnpeFnm== null ) { if ( __rnpeFnm!= null ) return false; }
			else if ( !_rnpeFnm.equals(__rnpeFnm) ) return false;
		}
		{
			Object _wibeeMnyDduYn= getWibeeMnyDduYn();
			Object __wibeeMnyDduYn= other.getWibeeMnyDduYn();
			if ( _wibeeMnyDduYn== null ) { if ( __wibeeMnyDduYn!= null ) return false; }
			else if ( !_wibeeMnyDduYn.equals(__wibeeMnyDduYn) ) return false;
		}
		{
			Object _xtTgtRgsYn= getXtTgtRgsYn();
			Object __xtTgtRgsYn= other.getXtTgtRgsYn();
			if ( _xtTgtRgsYn== null ) { if ( __xtTgtRgsYn!= null ) return false; }
			else if ( !_xtTgtRgsYn.equals(__xtTgtRgsYn) ) return false;
		}
		{
			Object _addInqYn= getAddInqYn();
			Object __addInqYn= other.getAddInqYn();
			if ( _addInqYn== null ) { if ( __addInqYn!= null ) return false; }
			else if ( !_addInqYn.equals(__addInqYn) ) return false;
		}
		{
			Object _bokTrnDscd= getBokTrnDscd();
			Object __bokTrnDscd= other.getBokTrnDscd();
			if ( _bokTrnDscd== null ) { if ( __bokTrnDscd!= null ) return false; }
			else if ( !_bokTrnDscd.equals(__bokTrnDscd) ) return false;
		}
		{
			Object _mretFdYn= getMretFdYn();
			Object __mretFdYn= other.getMretFdYn();
			if ( _mretFdYn== null ) { if ( __mretFdYn!= null ) return false; }
			else if ( !_mretFdYn.equals(__mretFdYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(ObkTsReqRnpeInf_DIDT.class.getName()).append(":\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tactPwno: ");
		sb.append(actPwno==null?"null":getActPwno());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\trsvDt: ");
		sb.append(rsvDt==null?"null":getRsvDt());
		sb.append("\n");
		sb.append("\trcvBkcd: ");
		sb.append(rcvBkcd==null?"null":getRcvBkcd());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tptnPbokPrngTxt: ");
		sb.append(ptnPbokPrngTxt==null?"null":getPtnPbokPrngTxt());
		sb.append("\n");
		sb.append("\tclnmNoAddSbj: ");
		sb.append(clnmNoAddSbj==null?"null":getClnmNoAddSbj());
		sb.append("\n");
		sb.append("\trnpeFnm: ");
		sb.append(rnpeFnm==null?"null":getRnpeFnm());
		sb.append("\n");
		sb.append("\twibeeMnyDduYn: ");
		sb.append(wibeeMnyDduYn==null?"null":getWibeeMnyDduYn());
		sb.append("\n");
		sb.append("\txtTgtRgsYn: ");
		sb.append(xtTgtRgsYn==null?"null":getXtTgtRgsYn());
		sb.append("\n");
		sb.append("\taddInqYn: ");
		sb.append(addInqYn==null?"null":getAddInqYn());
		sb.append("\n");
		sb.append("\tbokTrnDscd: ");
		sb.append(bokTrnDscd==null?"null":getBokTrnDscd());
		sb.append("\n");
		sb.append("\tmretFdYn: ");
		sb.append(mretFdYn==null?"null":getMretFdYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* wdrAcno */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 50; /* actPwno */
		messageLen+= 13; /* trnAm */
		messageLen+= 8; /* rsvDt */
		messageLen+= 3; /* rcvBkcd */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 22; /* ptnPbokPrngTxt */
		messageLen+= 50; /* clnmNoAddSbj */
		messageLen+= 22; /* rnpeFnm */
		messageLen+= 1; /* wibeeMnyDduYn */
		messageLen+= 1; /* xtTgtRgsYn */
		messageLen+= 1; /* addInqYn */
		messageLen+= 1; /* bokTrnDscd */
		messageLen+= 1; /* mretFdYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wdrAcno");
		list.add("actPwnoUsgYn");
		list.add("actPwno");
		list.add("trnAm");
		list.add("rsvDt");
		list.add("rcvBkcd");
		list.add("rcvAcno");
		list.add("ptnPbokPrngTxt");
		list.add("clnmNoAddSbj");
		list.add("rnpeFnm");
		list.add("wibeeMnyDduYn");
		list.add("xtTgtRgsYn");
		list.add("addInqYn");
		list.add("bokTrnDscd");
		list.add("mretFdYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wdrAcno", get("wdrAcno"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("actPwno", get("actPwno"));
		map.put("trnAm", get("trnAm"));
		map.put("rsvDt", get("rsvDt"));
		map.put("rcvBkcd", get("rcvBkcd"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("ptnPbokPrngTxt", get("ptnPbokPrngTxt"));
		map.put("clnmNoAddSbj", get("clnmNoAddSbj"));
		map.put("rnpeFnm", get("rnpeFnm"));
		map.put("wibeeMnyDduYn", get("wibeeMnyDduYn"));
		map.put("xtTgtRgsYn", get("xtTgtRgsYn"));
		map.put("addInqYn", get("addInqYn"));
		map.put("bokTrnDscd", get("bokTrnDscd"));
		map.put("mretFdYn", get("mretFdYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case -1162540614:/* actPwno */
			return getActPwno();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 108822981:/* rsvDt */
			return getRsvDt();
		case 1041538159:/* rcvBkcd */
			return getRcvBkcd();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 1137996989:/* ptnPbokPrngTxt */
			return getPtnPbokPrngTxt();
		case -303398717:/* clnmNoAddSbj */
			return getClnmNoAddSbj();
		case 1351925172:/* rnpeFnm */
			return getRnpeFnm();
		case -1302691230:/* wibeeMnyDduYn */
			return getWibeeMnyDduYn();
		case -627433522:/* xtTgtRgsYn */
			return getXtTgtRgsYn();
		case -1256313856:/* addInqYn */
			return getAddInqYn();
		case 1563023202:/* bokTrnDscd */
			return getBokTrnDscd();
		case 2084827047:/* mretFdYn */
			return getMretFdYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case -1162540614:/* actPwno */
			setActPwno((String)value);
			break;
		case 110632444:/* trnAm */
			if ( value instanceof String ){
				setTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnAm((Long)value);
			}
			else{
				setTrnAm((BigDecimal)value);
			}
			break;
		case 108822981:/* rsvDt */
			setRsvDt((String)value);
			break;
		case 1041538159:/* rcvBkcd */
			setRcvBkcd((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 1137996989:/* ptnPbokPrngTxt */
			setPtnPbokPrngTxt((String)value);
			break;
		case -303398717:/* clnmNoAddSbj */
			setClnmNoAddSbj((String)value);
			break;
		case 1351925172:/* rnpeFnm */
			setRnpeFnm((String)value);
			break;
		case -1302691230:/* wibeeMnyDduYn */
			setWibeeMnyDduYn((String)value);
			break;
		case -627433522:/* xtTgtRgsYn */
			setXtTgtRgsYn((String)value);
			break;
		case -1256313856:/* addInqYn */
			setAddInqYn((String)value);
			break;
		case 1563023202:/* bokTrnDscd */
			setBokTrnDscd((String)value);
			break;
		case 2084827047:/* mretFdYn */
			setMretFdYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
