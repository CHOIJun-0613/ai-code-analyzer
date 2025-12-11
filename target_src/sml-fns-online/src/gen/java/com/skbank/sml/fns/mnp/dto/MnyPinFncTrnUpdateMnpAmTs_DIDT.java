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
	"wdrAcno", "actPwnoUsgYn", "actPwno", "trnAm", "rsvDt", "rcvBkcd", "rcvAcno", "ptnPbokPrngTxt", "clnmNoAddSbj", "rnpeFnm", "wdrPbokPrngTxt", "sprFild", "wibeeMnyDduYn", "hbitclngYn", "cusPrtfRgsNo"
}, name="MnyPinFncTrnUpdateMnpAmTs_DIDT")
@XmlRootElement(name="MnyPinFncTrnUpdateMnpAmTs_DIDT")
@BxmCategory(logicalName="머니클립금액이체.컴포넌트.입력.IO", description="") 
public class MnyPinFncTrnUpdateMnpAmTs_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2087347789L;
	
	
	
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
	 * 출금통장인자내용
	 */
	@ApiModelProperty(
		name = "wdrPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="출금통장인자내용", align="left", fill="")
	private String wdrPbokPrngTxt= "";
	
	
	/**
	 * 예비필드
	 */
	@ApiModelProperty(
		name = "sprFild"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sprFild")
	@BxmOmm_Field(length=18, decimal=0, description="예비필드", align="left", fill="")
	private String sprFild= "";
	
	
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
	 * 습관챌린지여부
	 */
	@ApiModelProperty(
		name = "hbitclngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hbitclngYn")
	@BxmOmm_Field(length=1, decimal=0, description="습관챌린지여부", align="left", fill="")
	private String hbitclngYn= "";
	
	
	/**
	 * 고객포트폴리오등록번호
	 */
	@ApiModelProperty(
		name = "cusPrtfRgsNo"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusPrtfRgsNo")
	@BxmOmm_Field(length=16, decimal=0, description="고객포트폴리오등록번호", align="right", fill="0")
	private BigDecimal cusPrtfRgsNo= new BigDecimal("0");
	
	
	
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
	private boolean isSet_wdrPbokPrngTxt= false;
	protected final boolean isSet_wdrPbokPrngTxt(){
		return this.isSet_wdrPbokPrngTxt;
	}
	private void setIsSet_wdrPbokPrngTxt(boolean value){
		this.isSet_wdrPbokPrngTxt= value;
	}
	/**
	 * 출금통장인자내용
	 */
	@XmlTransient
	public String getWdrPbokPrngTxt(){
		return this.wdrPbokPrngTxt;
	}
	
	/**
	 * 출금통장인자내용
	 * 
	 * @param wdrPbokPrngTxt 출금통장인자내용
	 */
	public void setWdrPbokPrngTxt(String wdrPbokPrngTxt){
		this.wdrPbokPrngTxt= wdrPbokPrngTxt;
		this.setIsSet_wdrPbokPrngTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sprFild= false;
	protected final boolean isSet_sprFild(){
		return this.isSet_sprFild;
	}
	private void setIsSet_sprFild(boolean value){
		this.isSet_sprFild= value;
	}
	/**
	 * 예비필드
	 */
	@XmlTransient
	public String getSprFild(){
		return this.sprFild;
	}
	
	/**
	 * 예비필드
	 * 
	 * @param sprFild 예비필드
	 */
	public void setSprFild(String sprFild){
		this.sprFild= sprFild;
		this.setIsSet_sprFild(true);
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
	private boolean isSet_hbitclngYn= false;
	protected final boolean isSet_hbitclngYn(){
		return this.isSet_hbitclngYn;
	}
	private void setIsSet_hbitclngYn(boolean value){
		this.isSet_hbitclngYn= value;
	}
	/**
	 * 습관챌린지여부
	 */
	@XmlTransient
	public String getHbitclngYn(){
		return this.hbitclngYn;
	}
	
	/**
	 * 습관챌린지여부
	 * 
	 * @param hbitclngYn 습관챌린지여부
	 */
	public void setHbitclngYn(String hbitclngYn){
		this.hbitclngYn= hbitclngYn;
		this.setIsSet_hbitclngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusPrtfRgsNo= false;
	protected final boolean isSet_cusPrtfRgsNo(){
		return this.isSet_cusPrtfRgsNo;
	}
	private void setIsSet_cusPrtfRgsNo(boolean value){
		this.isSet_cusPrtfRgsNo= value;
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - Double value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(double cusPrtfRgsNo) {
		setCusPrtfRgsNo(BigDecimal.valueOf(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - Long value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(long cusPrtfRgsNo) {
		setCusPrtfRgsNo(BigDecimal.valueOf(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - String value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(String cusPrtfRgsNo) {
		setCusPrtfRgsNo(new BigDecimal(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 */
	@XmlTransient
	public BigDecimal getCusPrtfRgsNo(){
		return this.cusPrtfRgsNo;
	}
	
	/**
	 * 고객포트폴리오등록번호
	 * 
	 * @param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	@JsonSetter("cusPrtfRgsNo")
	public void setCusPrtfRgsNo(BigDecimal cusPrtfRgsNo){
		this.cusPrtfRgsNo= cusPrtfRgsNo;
		this.setIsSet_cusPrtfRgsNo(true);
	}
				
	@Override
	public MnyPinFncTrnUpdateMnpAmTs_DIDT clone(){
		try{
			MnyPinFncTrnUpdateMnpAmTs_DIDT object= (MnyPinFncTrnUpdateMnpAmTs_DIDT)super.clone();
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
		result= prime * result + ((this.wdrPbokPrngTxt==null)?0:this.wdrPbokPrngTxt.hashCode());
		result= prime * result + ((this.sprFild==null)?0:this.sprFild.hashCode());
		result= prime * result + ((this.wibeeMnyDduYn==null)?0:this.wibeeMnyDduYn.hashCode());
		result= prime * result + ((this.hbitclngYn==null)?0:this.hbitclngYn.hashCode());
		result= prime * result + ((this.cusPrtfRgsNo==null)?0:this.cusPrtfRgsNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnUpdateMnpAmTs_DIDT other= (MnyPinFncTrnUpdateMnpAmTs_DIDT)obj;
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
			Object _wdrPbokPrngTxt= getWdrPbokPrngTxt();
			Object __wdrPbokPrngTxt= other.getWdrPbokPrngTxt();
			if ( _wdrPbokPrngTxt== null ) { if ( __wdrPbokPrngTxt!= null ) return false; }
			else if ( !_wdrPbokPrngTxt.equals(__wdrPbokPrngTxt) ) return false;
		}
		{
			Object _sprFild= getSprFild();
			Object __sprFild= other.getSprFild();
			if ( _sprFild== null ) { if ( __sprFild!= null ) return false; }
			else if ( !_sprFild.equals(__sprFild) ) return false;
		}
		{
			Object _wibeeMnyDduYn= getWibeeMnyDduYn();
			Object __wibeeMnyDduYn= other.getWibeeMnyDduYn();
			if ( _wibeeMnyDduYn== null ) { if ( __wibeeMnyDduYn!= null ) return false; }
			else if ( !_wibeeMnyDduYn.equals(__wibeeMnyDduYn) ) return false;
		}
		{
			Object _hbitclngYn= getHbitclngYn();
			Object __hbitclngYn= other.getHbitclngYn();
			if ( _hbitclngYn== null ) { if ( __hbitclngYn!= null ) return false; }
			else if ( !_hbitclngYn.equals(__hbitclngYn) ) return false;
		}
		{
			Object _cusPrtfRgsNo= getCusPrtfRgsNo();
			Object __cusPrtfRgsNo= other.getCusPrtfRgsNo();
			if ( _cusPrtfRgsNo== null ) { if ( __cusPrtfRgsNo!= null ) return false; }
			else if ( !_cusPrtfRgsNo.equals(__cusPrtfRgsNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinFncTrnUpdateMnpAmTs_DIDT.class.getName()).append(":\n");
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
		sb.append("\twdrPbokPrngTxt: ");
		sb.append(wdrPbokPrngTxt==null?"null":getWdrPbokPrngTxt());
		sb.append("\n");
		sb.append("\tsprFild: ");
		sb.append(sprFild==null?"null":getSprFild());
		sb.append("\n");
		sb.append("\twibeeMnyDduYn: ");
		sb.append(wibeeMnyDduYn==null?"null":getWibeeMnyDduYn());
		sb.append("\n");
		sb.append("\thbitclngYn: ");
		sb.append(hbitclngYn==null?"null":getHbitclngYn());
		sb.append("\n");
		sb.append("\tcusPrtfRgsNo: ");
		sb.append(cusPrtfRgsNo==null?"null":getCusPrtfRgsNo());
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
		messageLen+= 22; /* wdrPbokPrngTxt */
		messageLen+= 18; /* sprFild */
		messageLen+= 1; /* wibeeMnyDduYn */
		messageLen+= 1; /* hbitclngYn */
		messageLen+= 16; /* cusPrtfRgsNo */
	
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
		list.add("wdrPbokPrngTxt");
		list.add("sprFild");
		list.add("wibeeMnyDduYn");
		list.add("hbitclngYn");
		list.add("cusPrtfRgsNo");
	
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
		map.put("wdrPbokPrngTxt", get("wdrPbokPrngTxt"));
		map.put("sprFild", get("sprFild"));
		map.put("wibeeMnyDduYn", get("wibeeMnyDduYn"));
		map.put("hbitclngYn", get("hbitclngYn"));
		map.put("cusPrtfRgsNo", get("cusPrtfRgsNo"));
	
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
		case -1485101694:/* wdrPbokPrngTxt */
			return getWdrPbokPrngTxt();
		case -1997323056:/* sprFild */
			return getSprFild();
		case -1302691230:/* wibeeMnyDduYn */
			return getWibeeMnyDduYn();
		case 1120662140:/* hbitclngYn */
			return getHbitclngYn();
		case 99901034:/* cusPrtfRgsNo */
			return getCusPrtfRgsNo();
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
		case -1485101694:/* wdrPbokPrngTxt */
			setWdrPbokPrngTxt((String)value);
			break;
		case -1997323056:/* sprFild */
			setSprFild((String)value);
			break;
		case -1302691230:/* wibeeMnyDduYn */
			setWibeeMnyDduYn((String)value);
			break;
		case 1120662140:/* hbitclngYn */
			setHbitclngYn((String)value);
			break;
		case 99901034:/* cusPrtfRgsNo */
			if ( value instanceof String ){
				setCusPrtfRgsNo((String)value);
			}
			else if ( value instanceof Double ){
				setCusPrtfRgsNo((Double)value);
			}
			else if ( value instanceof Long ){
				setCusPrtfRgsNo((Long)value);
			}
			else{
				setCusPrtfRgsNo((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
