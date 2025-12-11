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
	"owacFnm", "bftrAfBal", "rnpeFnm", "trnSrno", "feeAm", "rduFeeAm", "wmbRduAm", "frduRncd", "oldAtrbDpstDlTgtYn", "nrsrYn1", "nrsrYn2", "rscd", "rspTxt"
}, name="TbkTsReqRnpeInf_DODT")
@XmlRootElement(name="TbkTsReqRnpeInf_DODT")
@BxmCategory(logicalName="당행이체요청수취인정보.컴포넌트.출력.IO", description="") 
public class TbkTsReqRnpeInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 564360378L;
	
	
	
	/**
	 * 예금주성명
	 */
	@ApiModelProperty(
		name = "owacFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("owacFnm")
	@BxmOmm_Field(length=22, decimal=0, description="예금주성명", align="left", fill="")
	private String owacFnm= "";
	
	
	/**
	 * 거래전후잔액
	 */
	@ApiModelProperty(
		name = "bftrAfBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bftrAfBal")
	@BxmOmm_Field(length=13, decimal=0, description="거래전후잔액", align="right", fill="0")
	private BigDecimal bftrAfBal= new BigDecimal("0");
	
	
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
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=12, decimal=0, description="거래일련번호", align="left", fill="")
	private String trnSrno= "";
	
	
	/**
	 * 수수료금액
	 */
	@ApiModelProperty(
		name = "feeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("feeAm")
	@BxmOmm_Field(length=11, decimal=0, description="수수료금액", align="right", fill="0")
	private BigDecimal feeAm= new BigDecimal("0");
	
	
	/**
	 * 감면수수료금액
	 */
	@ApiModelProperty(
		name = "rduFeeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rduFeeAm")
	@BxmOmm_Field(length=11, decimal=0, description="감면수수료금액", align="right", fill="0")
	private BigDecimal rduFeeAm= new BigDecimal("0");
	
	
	/**
	 * 우리멤버스감면금액
	 */
	@ApiModelProperty(
		name = "wmbRduAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("wmbRduAm")
	@BxmOmm_Field(length=11, decimal=0, description="우리멤버스감면금액", align="right", fill="0")
	private BigDecimal wmbRduAm= new BigDecimal("0");
	
	
	/**
	 * 수수료감면사유코드
	 */
	@ApiModelProperty(
		name = "frduRncd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frduRncd")
	@BxmOmm_Field(length=4, decimal=0, description="수수료감면사유코드", align="left", fill="")
	private String frduRncd= "";
	
	
	/**
	 * 구속성예금취급대상여부 
	 */
	@ApiModelProperty(
		name = "oldAtrbDpstDlTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbDpstDlTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="구속성예금취급대상여부 ", align="left", fill="")
	private String oldAtrbDpstDlTgtYn= "";
	
	
	/**
	 * 비거주자여부_1
	 */
	@ApiModelProperty(
		name = "nrsrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자여부_1", align="left", fill="")
	private String nrsrYn1= "";
	
	
	/**
	 * 비거주자여부_2
	 */
	@ApiModelProperty(
		name = "nrsrYn2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrYn2")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자여부_2", align="left", fill="")
	private String nrsrYn2= "";
	
	
	/**
	 * 응답코드
	 */
	@ApiModelProperty(
		name = "rscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rscd")
	@BxmOmm_Field(length=2, decimal=0, description="응답코드", align="left", fill="")
	private String rscd= "";
	
	
	/**
	 * 응답내용
	 */
	@ApiModelProperty(
		name = "rspTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rspTxt")
	@BxmOmm_Field(length=200, decimal=0, description="응답내용", align="left", fill="")
	private String rspTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_owacFnm= false;
	protected final boolean isSet_owacFnm(){
		return this.isSet_owacFnm;
	}
	private void setIsSet_owacFnm(boolean value){
		this.isSet_owacFnm= value;
	}
	/**
	 * 예금주성명
	 */
	@XmlTransient
	public String getOwacFnm(){
		return this.owacFnm;
	}
	
	/**
	 * 예금주성명
	 * 
	 * @param owacFnm 예금주성명
	 */
	public void setOwacFnm(String owacFnm){
		this.owacFnm= owacFnm;
		this.setIsSet_owacFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bftrAfBal= false;
	protected final boolean isSet_bftrAfBal(){
		return this.isSet_bftrAfBal;
	}
	private void setIsSet_bftrAfBal(boolean value){
		this.isSet_bftrAfBal= value;
	}
	/**
	 * 거래전후잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param bftrAfBal 거래전후잔액
	 */
	public void setBftrAfBal(double bftrAfBal) {
		setBftrAfBal(BigDecimal.valueOf(bftrAfBal));
	}
	/**
	 * 거래전후잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param bftrAfBal 거래전후잔액
	 */
	public void setBftrAfBal(long bftrAfBal) {
		setBftrAfBal(BigDecimal.valueOf(bftrAfBal));
	}
	/**
	 * 거래전후잔액
	 * BigDecimal - String value setter
	 *
	 * @Param bftrAfBal 거래전후잔액
	 */
	public void setBftrAfBal(String bftrAfBal) {
		setBftrAfBal(new BigDecimal(bftrAfBal));
	}
	/**
	 * 거래전후잔액
	 */
	@XmlTransient
	public BigDecimal getBftrAfBal(){
		return this.bftrAfBal;
	}
	
	/**
	 * 거래전후잔액
	 * 
	 * @param bftrAfBal 거래전후잔액
	 */
	@JsonSetter("bftrAfBal")
	public void setBftrAfBal(BigDecimal bftrAfBal){
		this.bftrAfBal= bftrAfBal;
		this.setIsSet_bftrAfBal(true);
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
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public String getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(String trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeAm= false;
	protected final boolean isSet_feeAm(){
		return this.isSet_feeAm;
	}
	private void setIsSet_feeAm(boolean value){
		this.isSet_feeAm= value;
	}
	/**
	 * 수수료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(double feeAm) {
		setFeeAm(BigDecimal.valueOf(feeAm));
	}
	/**
	 * 수수료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(long feeAm) {
		setFeeAm(BigDecimal.valueOf(feeAm));
	}
	/**
	 * 수수료금액
	 * BigDecimal - String value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(String feeAm) {
		setFeeAm(new BigDecimal(feeAm));
	}
	/**
	 * 수수료금액
	 */
	@XmlTransient
	public BigDecimal getFeeAm(){
		return this.feeAm;
	}
	
	/**
	 * 수수료금액
	 * 
	 * @param feeAm 수수료금액
	 */
	@JsonSetter("feeAm")
	public void setFeeAm(BigDecimal feeAm){
		this.feeAm= feeAm;
		this.setIsSet_feeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rduFeeAm= false;
	protected final boolean isSet_rduFeeAm(){
		return this.isSet_rduFeeAm;
	}
	private void setIsSet_rduFeeAm(boolean value){
		this.isSet_rduFeeAm= value;
	}
	/**
	 * 감면수수료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rduFeeAm 감면수수료금액
	 */
	public void setRduFeeAm(double rduFeeAm) {
		setRduFeeAm(BigDecimal.valueOf(rduFeeAm));
	}
	/**
	 * 감면수수료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rduFeeAm 감면수수료금액
	 */
	public void setRduFeeAm(long rduFeeAm) {
		setRduFeeAm(BigDecimal.valueOf(rduFeeAm));
	}
	/**
	 * 감면수수료금액
	 * BigDecimal - String value setter
	 *
	 * @Param rduFeeAm 감면수수료금액
	 */
	public void setRduFeeAm(String rduFeeAm) {
		setRduFeeAm(new BigDecimal(rduFeeAm));
	}
	/**
	 * 감면수수료금액
	 */
	@XmlTransient
	public BigDecimal getRduFeeAm(){
		return this.rduFeeAm;
	}
	
	/**
	 * 감면수수료금액
	 * 
	 * @param rduFeeAm 감면수수료금액
	 */
	@JsonSetter("rduFeeAm")
	public void setRduFeeAm(BigDecimal rduFeeAm){
		this.rduFeeAm= rduFeeAm;
		this.setIsSet_rduFeeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wmbRduAm= false;
	protected final boolean isSet_wmbRduAm(){
		return this.isSet_wmbRduAm;
	}
	private void setIsSet_wmbRduAm(boolean value){
		this.isSet_wmbRduAm= value;
	}
	/**
	 * 우리멤버스감면금액
	 * BigDecimal - Double value setter
	 *
	 * @Param wmbRduAm 우리멤버스감면금액
	 */
	public void setWmbRduAm(double wmbRduAm) {
		setWmbRduAm(BigDecimal.valueOf(wmbRduAm));
	}
	/**
	 * 우리멤버스감면금액
	 * BigDecimal - Long value setter
	 *
	 * @Param wmbRduAm 우리멤버스감면금액
	 */
	public void setWmbRduAm(long wmbRduAm) {
		setWmbRduAm(BigDecimal.valueOf(wmbRduAm));
	}
	/**
	 * 우리멤버스감면금액
	 * BigDecimal - String value setter
	 *
	 * @Param wmbRduAm 우리멤버스감면금액
	 */
	public void setWmbRduAm(String wmbRduAm) {
		setWmbRduAm(new BigDecimal(wmbRduAm));
	}
	/**
	 * 우리멤버스감면금액
	 */
	@XmlTransient
	public BigDecimal getWmbRduAm(){
		return this.wmbRduAm;
	}
	
	/**
	 * 우리멤버스감면금액
	 * 
	 * @param wmbRduAm 우리멤버스감면금액
	 */
	@JsonSetter("wmbRduAm")
	public void setWmbRduAm(BigDecimal wmbRduAm){
		this.wmbRduAm= wmbRduAm;
		this.setIsSet_wmbRduAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frduRncd= false;
	protected final boolean isSet_frduRncd(){
		return this.isSet_frduRncd;
	}
	private void setIsSet_frduRncd(boolean value){
		this.isSet_frduRncd= value;
	}
	/**
	 * 수수료감면사유코드
	 */
	@XmlTransient
	public String getFrduRncd(){
		return this.frduRncd;
	}
	
	/**
	 * 수수료감면사유코드
	 * 
	 * @param frduRncd 수수료감면사유코드
	 */
	public void setFrduRncd(String frduRncd){
		this.frduRncd= frduRncd;
		this.setIsSet_frduRncd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbDpstDlTgtYn= false;
	protected final boolean isSet_oldAtrbDpstDlTgtYn(){
		return this.isSet_oldAtrbDpstDlTgtYn;
	}
	private void setIsSet_oldAtrbDpstDlTgtYn(boolean value){
		this.isSet_oldAtrbDpstDlTgtYn= value;
	}
	/**
	 * 구속성예금취급대상여부 
	 */
	@XmlTransient
	public String getOldAtrbDpstDlTgtYn(){
		return this.oldAtrbDpstDlTgtYn;
	}
	
	/**
	 * 구속성예금취급대상여부 
	 * 
	 * @param oldAtrbDpstDlTgtYn 구속성예금취급대상여부 
	 */
	public void setOldAtrbDpstDlTgtYn(String oldAtrbDpstDlTgtYn){
		this.oldAtrbDpstDlTgtYn= oldAtrbDpstDlTgtYn;
		this.setIsSet_oldAtrbDpstDlTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrYn1= false;
	protected final boolean isSet_nrsrYn1(){
		return this.isSet_nrsrYn1;
	}
	private void setIsSet_nrsrYn1(boolean value){
		this.isSet_nrsrYn1= value;
	}
	/**
	 * 비거주자여부_1
	 */
	@XmlTransient
	public String getNrsrYn1(){
		return this.nrsrYn1;
	}
	
	/**
	 * 비거주자여부_1
	 * 
	 * @param nrsrYn1 비거주자여부_1
	 */
	public void setNrsrYn1(String nrsrYn1){
		this.nrsrYn1= nrsrYn1;
		this.setIsSet_nrsrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrYn2= false;
	protected final boolean isSet_nrsrYn2(){
		return this.isSet_nrsrYn2;
	}
	private void setIsSet_nrsrYn2(boolean value){
		this.isSet_nrsrYn2= value;
	}
	/**
	 * 비거주자여부_2
	 */
	@XmlTransient
	public String getNrsrYn2(){
		return this.nrsrYn2;
	}
	
	/**
	 * 비거주자여부_2
	 * 
	 * @param nrsrYn2 비거주자여부_2
	 */
	public void setNrsrYn2(String nrsrYn2){
		this.nrsrYn2= nrsrYn2;
		this.setIsSet_nrsrYn2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rscd= false;
	protected final boolean isSet_rscd(){
		return this.isSet_rscd;
	}
	private void setIsSet_rscd(boolean value){
		this.isSet_rscd= value;
	}
	/**
	 * 응답코드
	 */
	@XmlTransient
	public String getRscd(){
		return this.rscd;
	}
	
	/**
	 * 응답코드
	 * 
	 * @param rscd 응답코드
	 */
	public void setRscd(String rscd){
		this.rscd= rscd;
		this.setIsSet_rscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rspTxt= false;
	protected final boolean isSet_rspTxt(){
		return this.isSet_rspTxt;
	}
	private void setIsSet_rspTxt(boolean value){
		this.isSet_rspTxt= value;
	}
	/**
	 * 응답내용
	 */
	@XmlTransient
	public String getRspTxt(){
		return this.rspTxt;
	}
	
	/**
	 * 응답내용
	 * 
	 * @param rspTxt 응답내용
	 */
	public void setRspTxt(String rspTxt){
		this.rspTxt= rspTxt;
		this.setIsSet_rspTxt(true);
	}
				
	@Override
	public TbkTsReqRnpeInf_DODT clone(){
		try{
			TbkTsReqRnpeInf_DODT object= (TbkTsReqRnpeInf_DODT)super.clone();
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
		
		result= prime * result + ((this.owacFnm==null)?0:this.owacFnm.hashCode());
		result= prime * result + ((this.bftrAfBal==null)?0:this.bftrAfBal.hashCode());
		result= prime * result + ((this.rnpeFnm==null)?0:this.rnpeFnm.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.feeAm==null)?0:this.feeAm.hashCode());
		result= prime * result + ((this.rduFeeAm==null)?0:this.rduFeeAm.hashCode());
		result= prime * result + ((this.wmbRduAm==null)?0:this.wmbRduAm.hashCode());
		result= prime * result + ((this.frduRncd==null)?0:this.frduRncd.hashCode());
		result= prime * result + ((this.oldAtrbDpstDlTgtYn==null)?0:this.oldAtrbDpstDlTgtYn.hashCode());
		result= prime * result + ((this.nrsrYn1==null)?0:this.nrsrYn1.hashCode());
		result= prime * result + ((this.nrsrYn2==null)?0:this.nrsrYn2.hashCode());
		result= prime * result + ((this.rscd==null)?0:this.rscd.hashCode());
		result= prime * result + ((this.rspTxt==null)?0:this.rspTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final TbkTsReqRnpeInf_DODT other= (TbkTsReqRnpeInf_DODT)obj;
		{
			Object _owacFnm= getOwacFnm();
			Object __owacFnm= other.getOwacFnm();
			if ( _owacFnm== null ) { if ( __owacFnm!= null ) return false; }
			else if ( !_owacFnm.equals(__owacFnm) ) return false;
		}
		{
			Object _bftrAfBal= getBftrAfBal();
			Object __bftrAfBal= other.getBftrAfBal();
			if ( _bftrAfBal== null ) { if ( __bftrAfBal!= null ) return false; }
			else if ( !_bftrAfBal.equals(__bftrAfBal) ) return false;
		}
		{
			Object _rnpeFnm= getRnpeFnm();
			Object __rnpeFnm= other.getRnpeFnm();
			if ( _rnpeFnm== null ) { if ( __rnpeFnm!= null ) return false; }
			else if ( !_rnpeFnm.equals(__rnpeFnm) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _feeAm= getFeeAm();
			Object __feeAm= other.getFeeAm();
			if ( _feeAm== null ) { if ( __feeAm!= null ) return false; }
			else if ( !_feeAm.equals(__feeAm) ) return false;
		}
		{
			Object _rduFeeAm= getRduFeeAm();
			Object __rduFeeAm= other.getRduFeeAm();
			if ( _rduFeeAm== null ) { if ( __rduFeeAm!= null ) return false; }
			else if ( !_rduFeeAm.equals(__rduFeeAm) ) return false;
		}
		{
			Object _wmbRduAm= getWmbRduAm();
			Object __wmbRduAm= other.getWmbRduAm();
			if ( _wmbRduAm== null ) { if ( __wmbRduAm!= null ) return false; }
			else if ( !_wmbRduAm.equals(__wmbRduAm) ) return false;
		}
		{
			Object _frduRncd= getFrduRncd();
			Object __frduRncd= other.getFrduRncd();
			if ( _frduRncd== null ) { if ( __frduRncd!= null ) return false; }
			else if ( !_frduRncd.equals(__frduRncd) ) return false;
		}
		{
			Object _oldAtrbDpstDlTgtYn= getOldAtrbDpstDlTgtYn();
			Object __oldAtrbDpstDlTgtYn= other.getOldAtrbDpstDlTgtYn();
			if ( _oldAtrbDpstDlTgtYn== null ) { if ( __oldAtrbDpstDlTgtYn!= null ) return false; }
			else if ( !_oldAtrbDpstDlTgtYn.equals(__oldAtrbDpstDlTgtYn) ) return false;
		}
		{
			Object _nrsrYn1= getNrsrYn1();
			Object __nrsrYn1= other.getNrsrYn1();
			if ( _nrsrYn1== null ) { if ( __nrsrYn1!= null ) return false; }
			else if ( !_nrsrYn1.equals(__nrsrYn1) ) return false;
		}
		{
			Object _nrsrYn2= getNrsrYn2();
			Object __nrsrYn2= other.getNrsrYn2();
			if ( _nrsrYn2== null ) { if ( __nrsrYn2!= null ) return false; }
			else if ( !_nrsrYn2.equals(__nrsrYn2) ) return false;
		}
		{
			Object _rscd= getRscd();
			Object __rscd= other.getRscd();
			if ( _rscd== null ) { if ( __rscd!= null ) return false; }
			else if ( !_rscd.equals(__rscd) ) return false;
		}
		{
			Object _rspTxt= getRspTxt();
			Object __rspTxt= other.getRspTxt();
			if ( _rspTxt== null ) { if ( __rspTxt!= null ) return false; }
			else if ( !_rspTxt.equals(__rspTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(TbkTsReqRnpeInf_DODT.class.getName()).append(":\n");
		sb.append("\towacFnm: ");
		sb.append(owacFnm==null?"null":getOwacFnm());
		sb.append("\n");
		sb.append("\tbftrAfBal: ");
		sb.append(bftrAfBal==null?"null":getBftrAfBal());
		sb.append("\n");
		sb.append("\trnpeFnm: ");
		sb.append(rnpeFnm==null?"null":getRnpeFnm());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tfeeAm: ");
		sb.append(feeAm==null?"null":getFeeAm());
		sb.append("\n");
		sb.append("\trduFeeAm: ");
		sb.append(rduFeeAm==null?"null":getRduFeeAm());
		sb.append("\n");
		sb.append("\twmbRduAm: ");
		sb.append(wmbRduAm==null?"null":getWmbRduAm());
		sb.append("\n");
		sb.append("\tfrduRncd: ");
		sb.append(frduRncd==null?"null":getFrduRncd());
		sb.append("\n");
		sb.append("\toldAtrbDpstDlTgtYn: ");
		sb.append(oldAtrbDpstDlTgtYn==null?"null":getOldAtrbDpstDlTgtYn());
		sb.append("\n");
		sb.append("\tnrsrYn1: ");
		sb.append(nrsrYn1==null?"null":getNrsrYn1());
		sb.append("\n");
		sb.append("\tnrsrYn2: ");
		sb.append(nrsrYn2==null?"null":getNrsrYn2());
		sb.append("\n");
		sb.append("\trscd: ");
		sb.append(rscd==null?"null":getRscd());
		sb.append("\n");
		sb.append("\trspTxt: ");
		sb.append(rspTxt==null?"null":getRspTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 22; /* owacFnm */
		messageLen+= 13; /* bftrAfBal */
		messageLen+= 22; /* rnpeFnm */
		messageLen+= 12; /* trnSrno */
		messageLen+= 11; /* feeAm */
		messageLen+= 11; /* rduFeeAm */
		messageLen+= 11; /* wmbRduAm */
		messageLen+= 4; /* frduRncd */
		messageLen+= 1; /* oldAtrbDpstDlTgtYn */
		messageLen+= 1; /* nrsrYn1 */
		messageLen+= 1; /* nrsrYn2 */
		messageLen+= 2; /* rscd */
		messageLen+= 200; /* rspTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("owacFnm");
		list.add("bftrAfBal");
		list.add("rnpeFnm");
		list.add("trnSrno");
		list.add("feeAm");
		list.add("rduFeeAm");
		list.add("wmbRduAm");
		list.add("frduRncd");
		list.add("oldAtrbDpstDlTgtYn");
		list.add("nrsrYn1");
		list.add("nrsrYn2");
		list.add("rscd");
		list.add("rspTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("owacFnm", get("owacFnm"));
		map.put("bftrAfBal", get("bftrAfBal"));
		map.put("rnpeFnm", get("rnpeFnm"));
		map.put("trnSrno", get("trnSrno"));
		map.put("feeAm", get("feeAm"));
		map.put("rduFeeAm", get("rduFeeAm"));
		map.put("wmbRduAm", get("wmbRduAm"));
		map.put("frduRncd", get("frduRncd"));
		map.put("oldAtrbDpstDlTgtYn", get("oldAtrbDpstDlTgtYn"));
		map.put("nrsrYn1", get("nrsrYn1"));
		map.put("nrsrYn2", get("nrsrYn2"));
		map.put("rscd", get("rscd"));
		map.put("rspTxt", get("rspTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1066835909:/* owacFnm */
			return getOwacFnm();
		case -460781306:/* bftrAfBal */
			return getBftrAfBal();
		case 1351925172:/* rnpeFnm */
			return getRnpeFnm();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 97307218:/* feeAm */
			return getFeeAm();
		case -1209664625:/* rduFeeAm */
			return getRduFeeAm();
		case 2074132259:/* wmbRduAm */
			return getWmbRduAm();
		case -1552248934:/* frduRncd */
			return getFrduRncd();
		case -1788904393:/* oldAtrbDpstDlTgtYn */
			return getOldAtrbDpstDlTgtYn();
		case -2080396903:/* nrsrYn1 */
			return getNrsrYn1();
		case -2080396902:/* nrsrYn2 */
			return getNrsrYn2();
		case 3509858:/* rscd */
			return getRscd();
		case -921618015:/* rspTxt */
			return getRspTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1066835909:/* owacFnm */
			setOwacFnm((String)value);
			break;
		case -460781306:/* bftrAfBal */
			if ( value instanceof String ){
				setBftrAfBal((String)value);
			}
			else if ( value instanceof Double ){
				setBftrAfBal((Double)value);
			}
			else if ( value instanceof Long ){
				setBftrAfBal((Long)value);
			}
			else{
				setBftrAfBal((BigDecimal)value);
			}
			break;
		case 1351925172:/* rnpeFnm */
			setRnpeFnm((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case 97307218:/* feeAm */
			if ( value instanceof String ){
				setFeeAm((String)value);
			}
			else if ( value instanceof Double ){
				setFeeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFeeAm((Long)value);
			}
			else{
				setFeeAm((BigDecimal)value);
			}
			break;
		case -1209664625:/* rduFeeAm */
			if ( value instanceof String ){
				setRduFeeAm((String)value);
			}
			else if ( value instanceof Double ){
				setRduFeeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRduFeeAm((Long)value);
			}
			else{
				setRduFeeAm((BigDecimal)value);
			}
			break;
		case 2074132259:/* wmbRduAm */
			if ( value instanceof String ){
				setWmbRduAm((String)value);
			}
			else if ( value instanceof Double ){
				setWmbRduAm((Double)value);
			}
			else if ( value instanceof Long ){
				setWmbRduAm((Long)value);
			}
			else{
				setWmbRduAm((BigDecimal)value);
			}
			break;
		case -1552248934:/* frduRncd */
			setFrduRncd((String)value);
			break;
		case -1788904393:/* oldAtrbDpstDlTgtYn */
			setOldAtrbDpstDlTgtYn((String)value);
			break;
		case -2080396903:/* nrsrYn1 */
			setNrsrYn1((String)value);
			break;
		case -2080396902:/* nrsrYn2 */
			setNrsrYn2((String)value);
			break;
		case 3509858:/* rscd */
			setRscd((String)value);
			break;
		case -921618015:/* rspTxt */
			setRspTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
