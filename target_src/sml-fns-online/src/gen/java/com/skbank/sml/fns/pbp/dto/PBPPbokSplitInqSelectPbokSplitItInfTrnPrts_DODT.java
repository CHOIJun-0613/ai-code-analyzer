/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"dpsAcno", "trnDt", "trnTm", "trnSrno", "spceNo", "dpsRapDscd", "dpsRapDscdNm", "dpsTrnAm", "aftrBal", "pbokPrngOtlnTxt", "mdKdcdNm"
}, name="PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT")
@BxmCategory(logicalName="통장.쪼개기.통합.조회.거래내역.DBM.출력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -857006914L;
	
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpsAcno= "";
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="left", fill="")
	private String trnDt= "";
	
	
	/**
	 * 거래시각
	 */
	@ApiModelProperty(
		name = "trnTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnTm")
	@BxmOmm_Field(length=6, decimal=0, description="거래시각", align="left", fill="")
	private String trnTm= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="0")
	private Integer trnSrno= 0;
	
	
	/**
	 * 공간번호
	 */
	@ApiModelProperty(
		name = "spceNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNo")
	@BxmOmm_Field(length=6, decimal=0, description="공간번호", align="left", fill="")
	private String spceNo= "";
	
	
	/**
	 * 수신입지급구분코드
	 */
	@ApiModelProperty(
		name = "dpsRapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수신입지급구분코드", align="left", fill="")
	private String dpsRapDscd= "";
	
	
	/**
	 * 수신입지급구분코드명
	 */
	@ApiModelProperty(
		name = "dpsRapDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="수신입지급구분코드명", align="left", fill="")
	private String dpsRapDscdNm= "";
	
	
	/**
	 * 수신거래금액
	 */
	@ApiModelProperty(
		name = "dpsTrnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpsTrnAm")
	@BxmOmm_Field(length=19, decimal=3, description="수신거래금액", align="right", fill="0")
	private BigDecimal dpsTrnAm= new BigDecimal("0");
	
	
	/**
	 * 거래후잔액
	 */
	@ApiModelProperty(
		name = "aftrBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("aftrBal")
	@BxmOmm_Field(length=19, decimal=3, description="거래후잔액", align="right", fill="0")
	private BigDecimal aftrBal= new BigDecimal("0");
	
	
	/**
	 * 통장인자적요내용
	 */
	@ApiModelProperty(
		name = "pbokPrngOtlnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokPrngOtlnTxt")
	@BxmOmm_Field(length=100, decimal=0, description="통장인자적요내용", align="left", fill="")
	private String pbokPrngOtlnTxt= "";
	
	
	/**
	 * 매체종류코드명
	 */
	@ApiModelProperty(
		name = "mdKdcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdKdcdNm")
	@BxmOmm_Field(length=50, decimal=0, description="매체종류코드명", align="left", fill="")
	private String mdKdcdNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsAcno= false;
	protected final boolean isSet_dpsAcno(){
		return this.isSet_dpsAcno;
	}
	private void setIsSet_dpsAcno(boolean value){
		this.isSet_dpsAcno= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpsAcno(){
		return this.dpsAcno;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpsAcno 수신계좌번호
	 */
	public void setDpsAcno(String dpsAcno){
		this.dpsAcno= dpsAcno;
		this.setIsSet_dpsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public String getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(String trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnTm= false;
	protected final boolean isSet_trnTm(){
		return this.isSet_trnTm;
	}
	private void setIsSet_trnTm(boolean value){
		this.isSet_trnTm= value;
	}
	/**
	 * 거래시각
	 */
	@XmlTransient
	public String getTrnTm(){
		return this.trnTm;
	}
	
	/**
	 * 거래시각
	 * 
	 * @param trnTm 거래시각
	 */
	public void setTrnTm(String trnTm){
		this.trnTm= trnTm;
		this.setIsSet_trnTm(true);
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
	public Integer getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(Integer trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNo= false;
	protected final boolean isSet_spceNo(){
		return this.isSet_spceNo;
	}
	private void setIsSet_spceNo(boolean value){
		this.isSet_spceNo= value;
	}
	/**
	 * 공간번호
	 */
	@XmlTransient
	public String getSpceNo(){
		return this.spceNo;
	}
	
	/**
	 * 공간번호
	 * 
	 * @param spceNo 공간번호
	 */
	public void setSpceNo(String spceNo){
		this.spceNo= spceNo;
		this.setIsSet_spceNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscd= false;
	protected final boolean isSet_dpsRapDscd(){
		return this.isSet_dpsRapDscd;
	}
	private void setIsSet_dpsRapDscd(boolean value){
		this.isSet_dpsRapDscd= value;
	}
	/**
	 * 수신입지급구분코드
	 */
	@XmlTransient
	public String getDpsRapDscd(){
		return this.dpsRapDscd;
	}
	
	/**
	 * 수신입지급구분코드
	 * 
	 * @param dpsRapDscd 수신입지급구분코드
	 */
	public void setDpsRapDscd(String dpsRapDscd){
		this.dpsRapDscd= dpsRapDscd;
		this.setIsSet_dpsRapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscdNm= false;
	protected final boolean isSet_dpsRapDscdNm(){
		return this.isSet_dpsRapDscdNm;
	}
	private void setIsSet_dpsRapDscdNm(boolean value){
		this.isSet_dpsRapDscdNm= value;
	}
	/**
	 * 수신입지급구분코드명
	 */
	@XmlTransient
	public String getDpsRapDscdNm(){
		return this.dpsRapDscdNm;
	}
	
	/**
	 * 수신입지급구분코드명
	 * 
	 * @param dpsRapDscdNm 수신입지급구분코드명
	 */
	public void setDpsRapDscdNm(String dpsRapDscdNm){
		this.dpsRapDscdNm= dpsRapDscdNm;
		this.setIsSet_dpsRapDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsTrnAm= false;
	protected final boolean isSet_dpsTrnAm(){
		return this.isSet_dpsTrnAm;
	}
	private void setIsSet_dpsTrnAm(boolean value){
		this.isSet_dpsTrnAm= value;
	}
	/**
	 * 수신거래금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpsTrnAm 수신거래금액
	 */
	public void setDpsTrnAm(double dpsTrnAm) {
		setDpsTrnAm(BigDecimal.valueOf(dpsTrnAm));
	}
	/**
	 * 수신거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpsTrnAm 수신거래금액
	 */
	public void setDpsTrnAm(long dpsTrnAm) {
		setDpsTrnAm(BigDecimal.valueOf(dpsTrnAm));
	}
	/**
	 * 수신거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param dpsTrnAm 수신거래금액
	 */
	public void setDpsTrnAm(String dpsTrnAm) {
		setDpsTrnAm(new BigDecimal(dpsTrnAm));
	}
	/**
	 * 수신거래금액
	 */
	@XmlTransient
	public BigDecimal getDpsTrnAm(){
		return this.dpsTrnAm;
	}
	
	/**
	 * 수신거래금액
	 * 
	 * @param dpsTrnAm 수신거래금액
	 */
	@JsonSetter("dpsTrnAm")
	public void setDpsTrnAm(BigDecimal dpsTrnAm){
		this.dpsTrnAm= dpsTrnAm;
		this.setIsSet_dpsTrnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aftrBal= false;
	protected final boolean isSet_aftrBal(){
		return this.isSet_aftrBal;
	}
	private void setIsSet_aftrBal(boolean value){
		this.isSet_aftrBal= value;
	}
	/**
	 * 거래후잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(double aftrBal) {
		setAftrBal(BigDecimal.valueOf(aftrBal));
	}
	/**
	 * 거래후잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(long aftrBal) {
		setAftrBal(BigDecimal.valueOf(aftrBal));
	}
	/**
	 * 거래후잔액
	 * BigDecimal - String value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(String aftrBal) {
		setAftrBal(new BigDecimal(aftrBal));
	}
	/**
	 * 거래후잔액
	 */
	@XmlTransient
	public BigDecimal getAftrBal(){
		return this.aftrBal;
	}
	
	/**
	 * 거래후잔액
	 * 
	 * @param aftrBal 거래후잔액
	 */
	@JsonSetter("aftrBal")
	public void setAftrBal(BigDecimal aftrBal){
		this.aftrBal= aftrBal;
		this.setIsSet_aftrBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokPrngOtlnTxt= false;
	protected final boolean isSet_pbokPrngOtlnTxt(){
		return this.isSet_pbokPrngOtlnTxt;
	}
	private void setIsSet_pbokPrngOtlnTxt(boolean value){
		this.isSet_pbokPrngOtlnTxt= value;
	}
	/**
	 * 통장인자적요내용
	 */
	@XmlTransient
	public String getPbokPrngOtlnTxt(){
		return this.pbokPrngOtlnTxt;
	}
	
	/**
	 * 통장인자적요내용
	 * 
	 * @param pbokPrngOtlnTxt 통장인자적요내용
	 */
	public void setPbokPrngOtlnTxt(String pbokPrngOtlnTxt){
		this.pbokPrngOtlnTxt= pbokPrngOtlnTxt;
		this.setIsSet_pbokPrngOtlnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mdKdcdNm= false;
	protected final boolean isSet_mdKdcdNm(){
		return this.isSet_mdKdcdNm;
	}
	private void setIsSet_mdKdcdNm(boolean value){
		this.isSet_mdKdcdNm= value;
	}
	/**
	 * 매체종류코드명
	 */
	@XmlTransient
	public String getMdKdcdNm(){
		return this.mdKdcdNm;
	}
	
	/**
	 * 매체종류코드명
	 * 
	 * @param mdKdcdNm 매체종류코드명
	 */
	public void setMdKdcdNm(String mdKdcdNm){
		this.mdKdcdNm= mdKdcdNm;
		this.setIsSet_mdKdcdNm(true);
	}
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT object= (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT)super.clone();
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
		
		result= prime * result + ((this.dpsAcno==null)?0:this.dpsAcno.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.dpsRapDscdNm==null)?0:this.dpsRapDscdNm.hashCode());
		result= prime * result + ((this.dpsTrnAm==null)?0:this.dpsTrnAm.hashCode());
		result= prime * result + ((this.aftrBal==null)?0:this.aftrBal.hashCode());
		result= prime * result + ((this.pbokPrngOtlnTxt==null)?0:this.pbokPrngOtlnTxt.hashCode());
		result= prime * result + ((this.mdKdcdNm==null)?0:this.mdKdcdNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT other= (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT)obj;
		{
			Object _dpsAcno= getDpsAcno();
			Object __dpsAcno= other.getDpsAcno();
			if ( _dpsAcno== null ) { if ( __dpsAcno!= null ) return false; }
			else if ( !_dpsAcno.equals(__dpsAcno) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnTm= getTrnTm();
			Object __trnTm= other.getTrnTm();
			if ( _trnTm== null ) { if ( __trnTm!= null ) return false; }
			else if ( !_trnTm.equals(__trnTm) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _dpsRapDscdNm= getDpsRapDscdNm();
			Object __dpsRapDscdNm= other.getDpsRapDscdNm();
			if ( _dpsRapDscdNm== null ) { if ( __dpsRapDscdNm!= null ) return false; }
			else if ( !_dpsRapDscdNm.equals(__dpsRapDscdNm) ) return false;
		}
		{
			Object _dpsTrnAm= getDpsTrnAm();
			Object __dpsTrnAm= other.getDpsTrnAm();
			if ( _dpsTrnAm== null ) { if ( __dpsTrnAm!= null ) return false; }
			else if ( !_dpsTrnAm.equals(__dpsTrnAm) ) return false;
		}
		{
			Object _aftrBal= getAftrBal();
			Object __aftrBal= other.getAftrBal();
			if ( _aftrBal== null ) { if ( __aftrBal!= null ) return false; }
			else if ( !_aftrBal.equals(__aftrBal) ) return false;
		}
		{
			Object _pbokPrngOtlnTxt= getPbokPrngOtlnTxt();
			Object __pbokPrngOtlnTxt= other.getPbokPrngOtlnTxt();
			if ( _pbokPrngOtlnTxt== null ) { if ( __pbokPrngOtlnTxt!= null ) return false; }
			else if ( !_pbokPrngOtlnTxt.equals(__pbokPrngOtlnTxt) ) return false;
		}
		{
			Object _mdKdcdNm= getMdKdcdNm();
			Object __mdKdcdNm= other.getMdKdcdNm();
			if ( _mdKdcdNm== null ) { if ( __mdKdcdNm!= null ) return false; }
			else if ( !_mdKdcdNm.equals(__mdKdcdNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT.class.getName()).append(":\n");
		sb.append("\tdpsAcno: ");
		sb.append(dpsAcno==null?"null":getDpsAcno());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\tdpsRapDscdNm: ");
		sb.append(dpsRapDscdNm==null?"null":getDpsRapDscdNm());
		sb.append("\n");
		sb.append("\tdpsTrnAm: ");
		sb.append(dpsTrnAm==null?"null":getDpsTrnAm());
		sb.append("\n");
		sb.append("\taftrBal: ");
		sb.append(aftrBal==null?"null":getAftrBal());
		sb.append("\n");
		sb.append("\tpbokPrngOtlnTxt: ");
		sb.append(pbokPrngOtlnTxt==null?"null":getPbokPrngOtlnTxt());
		sb.append("\n");
		sb.append("\tmdKdcdNm: ");
		sb.append(mdKdcdNm==null?"null":getMdKdcdNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* dpsAcno */
		messageLen+= 8; /* trnDt */
		messageLen+= 6; /* trnTm */
		messageLen+= 8; /* trnSrno */
		messageLen+= 6; /* spceNo */
		messageLen+= 1; /* dpsRapDscd */
		messageLen+= 50; /* dpsRapDscdNm */
		messageLen+= 19; /* dpsTrnAm */
		messageLen+= 19; /* aftrBal */
		messageLen+= 100; /* pbokPrngOtlnTxt */
		messageLen+= 50; /* mdKdcdNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsAcno");
		list.add("trnDt");
		list.add("trnTm");
		list.add("trnSrno");
		list.add("spceNo");
		list.add("dpsRapDscd");
		list.add("dpsRapDscdNm");
		list.add("dpsTrnAm");
		list.add("aftrBal");
		list.add("pbokPrngOtlnTxt");
		list.add("mdKdcdNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsAcno", get("dpsAcno"));
		map.put("trnDt", get("trnDt"));
		map.put("trnTm", get("trnTm"));
		map.put("trnSrno", get("trnSrno"));
		map.put("spceNo", get("spceNo"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("dpsRapDscdNm", get("dpsRapDscdNm"));
		map.put("dpsTrnAm", get("dpsTrnAm"));
		map.put("aftrBal", get("aftrBal"));
		map.put("pbokPrngOtlnTxt", get("pbokPrngOtlnTxt"));
		map.put("mdKdcdNm", get("mdKdcdNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			return getDpsAcno();
		case 110632544:/* trnDt */
			return getTrnDt();
		case 110633033:/* trnTm */
			return getTrnTm();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -896131680:/* spceNo */
			return getSpceNo();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case 1542763753:/* dpsRapDscdNm */
			return getDpsRapDscdNm();
		case -2117996331:/* dpsTrnAm */
			return getDpsTrnAm();
		case -1075691606:/* aftrBal */
			return getAftrBal();
		case 1497775840:/* pbokPrngOtlnTxt */
			return getPbokPrngOtlnTxt();
		case 1786406736:/* mdKdcdNm */
			return getMdKdcdNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			setDpsAcno((String)value);
			break;
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case 1542763753:/* dpsRapDscdNm */
			setDpsRapDscdNm((String)value);
			break;
		case -2117996331:/* dpsTrnAm */
			if ( value instanceof String ){
				setDpsTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setDpsTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDpsTrnAm((Long)value);
			}
			else{
				setDpsTrnAm((BigDecimal)value);
			}
			break;
		case -1075691606:/* aftrBal */
			if ( value instanceof String ){
				setAftrBal((String)value);
			}
			else if ( value instanceof Double ){
				setAftrBal((Double)value);
			}
			else if ( value instanceof Long ){
				setAftrBal((Long)value);
			}
			else{
				setAftrBal((BigDecimal)value);
			}
			break;
		case 1497775840:/* pbokPrngOtlnTxt */
			setPbokPrngOtlnTxt((String)value);
			break;
		case 1786406736:/* mdKdcdNm */
			setMdKdcdNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
