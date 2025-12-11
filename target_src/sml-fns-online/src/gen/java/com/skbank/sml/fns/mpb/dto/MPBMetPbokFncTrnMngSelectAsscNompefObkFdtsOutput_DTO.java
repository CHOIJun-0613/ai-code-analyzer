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
	"owacFnm", "bftrAfBal", "rnpeFnm", "trhsSrno", "wdrAcno", "rcvAcno", "trnAm", "ptnPbokPrngTxt", "rscd", "rspTxt", "chnlErrCd"
}, name="MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO")
@BxmCategory(logicalName="공동명의인.타행.자금이체.조회.Output.DTO", description="") 
public class MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1387423653L;
	
	
	
	/**
	 * 예금주성명
	 */
	@ApiModelProperty(
		name = "owacFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("owacFnm")
	@BxmOmm_Field(length=22, decimal=0, description="예금주성명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
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
	@BxmOmm_Field(length=13, decimal=0, description="거래전후잔액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
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
	@BxmOmm_Field(length=22, decimal=0, description="수취인성명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rnpeFnm= "";
	
	
	/**
	 * 거래명세일련번호
	 */
	@ApiModelProperty(
		name = "trhsSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trhsSrno")
	@BxmOmm_Field(length=7, decimal=0, description="거래명세일련번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String trhsSrno= "";
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String wdrAcno= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=13, decimal=0, description="거래금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal trnAm= new BigDecimal("0");
	
	
	/**
	 * 상대통장인자내용
	 */
	@ApiModelProperty(
		name = "ptnPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="상대통장인자내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String ptnPbokPrngTxt= "";
	
	
	/**
	 * 응답코드
	 */
	@ApiModelProperty(
		name = "rscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rscd")
	@BxmOmm_Field(length=200, decimal=0, description="응답코드", align="left", fill="")
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
	
	
	/**
	 * 채널오류코드
	 */
	@ApiModelProperty(
		name = "chnlErrCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chnlErrCd")
	@BxmOmm_Field(length=200, decimal=0, description="채널오류코드", align="left", fill="")
	private String chnlErrCd= "";
	
	
	
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chnlErrCd= false;
	protected final boolean isSet_chnlErrCd(){
		return this.isSet_chnlErrCd;
	}
	private void setIsSet_chnlErrCd(boolean value){
		this.isSet_chnlErrCd= value;
	}
	/**
	 * 채널오류코드
	 */
	@XmlTransient
	public String getChnlErrCd(){
		return this.chnlErrCd;
	}
	
	/**
	 * 채널오류코드
	 * 
	 * @param chnlErrCd 채널오류코드
	 */
	public void setChnlErrCd(String chnlErrCd){
		this.chnlErrCd= chnlErrCd;
		this.setIsSet_chnlErrCd(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO clone(){
		try{
			MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO object= (MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO)super.clone();
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
		result= prime * result + ((this.trhsSrno==null)?0:this.trhsSrno.hashCode());
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.ptnPbokPrngTxt==null)?0:this.ptnPbokPrngTxt.hashCode());
		result= prime * result + ((this.rscd==null)?0:this.rscd.hashCode());
		result= prime * result + ((this.rspTxt==null)?0:this.rspTxt.hashCode());
		result= prime * result + ((this.chnlErrCd==null)?0:this.chnlErrCd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO other= (MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO)obj;
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
			Object _trhsSrno= getTrhsSrno();
			Object __trhsSrno= other.getTrhsSrno();
			if ( _trhsSrno== null ) { if ( __trhsSrno!= null ) return false; }
			else if ( !_trhsSrno.equals(__trhsSrno) ) return false;
		}
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _ptnPbokPrngTxt= getPtnPbokPrngTxt();
			Object __ptnPbokPrngTxt= other.getPtnPbokPrngTxt();
			if ( _ptnPbokPrngTxt== null ) { if ( __ptnPbokPrngTxt!= null ) return false; }
			else if ( !_ptnPbokPrngTxt.equals(__ptnPbokPrngTxt) ) return false;
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
		{
			Object _chnlErrCd= getChnlErrCd();
			Object __chnlErrCd= other.getChnlErrCd();
			if ( _chnlErrCd== null ) { if ( __chnlErrCd!= null ) return false; }
			else if ( !_chnlErrCd.equals(__chnlErrCd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO.class.getName()).append(":\n");
		sb.append("\towacFnm: ");
		sb.append(owacFnm==null?"null":getOwacFnm());
		sb.append("\n");
		sb.append("\tbftrAfBal: ");
		sb.append(bftrAfBal==null?"null":getBftrAfBal());
		sb.append("\n");
		sb.append("\trnpeFnm: ");
		sb.append(rnpeFnm==null?"null":getRnpeFnm());
		sb.append("\n");
		sb.append("\ttrhsSrno: ");
		sb.append(trhsSrno==null?"null":getTrhsSrno());
		sb.append("\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\tptnPbokPrngTxt: ");
		sb.append(ptnPbokPrngTxt==null?"null":getPtnPbokPrngTxt());
		sb.append("\n");
		sb.append("\trscd: ");
		sb.append(rscd==null?"null":getRscd());
		sb.append("\n");
		sb.append("\trspTxt: ");
		sb.append(rspTxt==null?"null":getRspTxt());
		sb.append("\n");
		sb.append("\tchnlErrCd: ");
		sb.append(chnlErrCd==null?"null":getChnlErrCd());
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
		messageLen+= 7; /* trhsSrno */
		messageLen+= 15; /* wdrAcno */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 13; /* trnAm */
		messageLen+= 22; /* ptnPbokPrngTxt */
		messageLen+= 200; /* rscd */
		messageLen+= 200; /* rspTxt */
		messageLen+= 200; /* chnlErrCd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("owacFnm");
		list.add("bftrAfBal");
		list.add("rnpeFnm");
		list.add("trhsSrno");
		list.add("wdrAcno");
		list.add("rcvAcno");
		list.add("trnAm");
		list.add("ptnPbokPrngTxt");
		list.add("rscd");
		list.add("rspTxt");
		list.add("chnlErrCd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("owacFnm", get("owacFnm"));
		map.put("bftrAfBal", get("bftrAfBal"));
		map.put("rnpeFnm", get("rnpeFnm"));
		map.put("trhsSrno", get("trhsSrno"));
		map.put("wdrAcno", get("wdrAcno"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("trnAm", get("trnAm"));
		map.put("ptnPbokPrngTxt", get("ptnPbokPrngTxt"));
		map.put("rscd", get("rscd"));
		map.put("rspTxt", get("rspTxt"));
		map.put("chnlErrCd", get("chnlErrCd"));
	
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
		case 1484962825:/* trhsSrno */
			return getTrhsSrno();
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 1137996989:/* ptnPbokPrngTxt */
			return getPtnPbokPrngTxt();
		case 3509858:/* rscd */
			return getRscd();
		case -921618015:/* rspTxt */
			return getRspTxt();
		case 19651971:/* chnlErrCd */
			return getChnlErrCd();
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
		case 1484962825:/* trhsSrno */
			setTrhsSrno((String)value);
			break;
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
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
		case 1137996989:/* ptnPbokPrngTxt */
			setPtnPbokPrngTxt((String)value);
			break;
		case 3509858:/* rscd */
			setRscd((String)value);
			break;
		case -921618015:/* rspTxt */
			setRspTxt((String)value);
			break;
		case 19651971:/* chnlErrCd */
			setChnlErrCd((String)value);
			break;
		default:
			break;
		}
	}
	
}
