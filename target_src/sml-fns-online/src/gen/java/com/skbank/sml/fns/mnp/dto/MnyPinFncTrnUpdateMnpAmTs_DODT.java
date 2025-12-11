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
	"owacFnm", "bftrAfBal", "rnpeFnm", "trnSrno", "feeAm", "rduFeeAm", "wmbRduAm", "frduRncd", "npbokTrnCnt", "trhsSrno"
}, name="MnyPinFncTrnUpdateMnpAmTs_DODT")
@XmlRootElement(name="MnyPinFncTrnUpdateMnpAmTs_DODT")
@BxmCategory(logicalName="머니클립금액이체.컴포넌트.출력.IO", description="") 
public class MnyPinFncTrnUpdateMnpAmTs_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2087342023L;
	
	
	
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
	 * 무통장거래건수
	 */
	@ApiModelProperty(
		name = "npbokTrnCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("npbokTrnCnt")
	@BxmOmm_Field(length=5, decimal=0, description="무통장거래건수", align="left", fill="")
	private String npbokTrnCnt= "";
	
	
	/**
	 * 거래명세일련번호
	 */
	@ApiModelProperty(
		name = "trhsSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trhsSrno")
	@BxmOmm_Field(length=7, decimal=0, description="거래명세일련번호", align="left", fill="")
	private String trhsSrno= "";
	
	
	
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
	private boolean isSet_npbokTrnCnt= false;
	protected final boolean isSet_npbokTrnCnt(){
		return this.isSet_npbokTrnCnt;
	}
	private void setIsSet_npbokTrnCnt(boolean value){
		this.isSet_npbokTrnCnt= value;
	}
	/**
	 * 무통장거래건수
	 */
	@XmlTransient
	public String getNpbokTrnCnt(){
		return this.npbokTrnCnt;
	}
	
	/**
	 * 무통장거래건수
	 * 
	 * @param npbokTrnCnt 무통장거래건수
	 */
	public void setNpbokTrnCnt(String npbokTrnCnt){
		this.npbokTrnCnt= npbokTrnCnt;
		this.setIsSet_npbokTrnCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trhsSrno= false;
	protected final boolean isSet_trhsSrno(){
		return this.isSet_trhsSrno;
	}
	private void setIsSet_trhsSrno(boolean value){
		this.isSet_trhsSrno= value;
	}
	/**
	 * 거래명세일련번호
	 */
	@XmlTransient
	public String getTrhsSrno(){
		return this.trhsSrno;
	}
	
	/**
	 * 거래명세일련번호
	 * 
	 * @param trhsSrno 거래명세일련번호
	 */
	public void setTrhsSrno(String trhsSrno){
		this.trhsSrno= trhsSrno;
		this.setIsSet_trhsSrno(true);
	}
				
	@Override
	public MnyPinFncTrnUpdateMnpAmTs_DODT clone(){
		try{
			MnyPinFncTrnUpdateMnpAmTs_DODT object= (MnyPinFncTrnUpdateMnpAmTs_DODT)super.clone();
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
		result= prime * result + ((this.npbokTrnCnt==null)?0:this.npbokTrnCnt.hashCode());
		result= prime * result + ((this.trhsSrno==null)?0:this.trhsSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnUpdateMnpAmTs_DODT other= (MnyPinFncTrnUpdateMnpAmTs_DODT)obj;
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
			Object _npbokTrnCnt= getNpbokTrnCnt();
			Object __npbokTrnCnt= other.getNpbokTrnCnt();
			if ( _npbokTrnCnt== null ) { if ( __npbokTrnCnt!= null ) return false; }
			else if ( !_npbokTrnCnt.equals(__npbokTrnCnt) ) return false;
		}
		{
			Object _trhsSrno= getTrhsSrno();
			Object __trhsSrno= other.getTrhsSrno();
			if ( _trhsSrno== null ) { if ( __trhsSrno!= null ) return false; }
			else if ( !_trhsSrno.equals(__trhsSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinFncTrnUpdateMnpAmTs_DODT.class.getName()).append(":\n");
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
		sb.append("\tnpbokTrnCnt: ");
		sb.append(npbokTrnCnt==null?"null":getNpbokTrnCnt());
		sb.append("\n");
		sb.append("\ttrhsSrno: ");
		sb.append(trhsSrno==null?"null":getTrhsSrno());
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
		messageLen+= 5; /* npbokTrnCnt */
		messageLen+= 7; /* trhsSrno */
	
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
		list.add("npbokTrnCnt");
		list.add("trhsSrno");
	
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
		map.put("npbokTrnCnt", get("npbokTrnCnt"));
		map.put("trhsSrno", get("trhsSrno"));
	
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
		case 1497799029:/* npbokTrnCnt */
			return getNpbokTrnCnt();
		case 1484962825:/* trhsSrno */
			return getTrhsSrno();
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
		case 1497799029:/* npbokTrnCnt */
			setNpbokTrnCnt((String)value);
			break;
		case 1484962825:/* trhsSrno */
			setTrhsSrno((String)value);
			break;
		default:
			break;
		}
	}
	
}
