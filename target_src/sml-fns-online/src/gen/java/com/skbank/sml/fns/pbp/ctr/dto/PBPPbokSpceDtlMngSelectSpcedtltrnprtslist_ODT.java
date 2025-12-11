/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"trnDt", "trnTm", "rcvWdrDscd", "rcvWdrDscdNm", "spceNo", "trnSrno", "rawAm", "pbokRestAm", "pbokPrngTxt", "trnKdNm", "trnMemo"
}, name="PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT")
@XmlRootElement(name="PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT")
@BxmCategory(logicalName="공간.상세.거래내역.목록.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1304325753L;
	
	
	
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
	@BxmOmm_Field(length=8, decimal=0, description="거래시각", align="left", fill="")
	private String trnTm= "";
	
	
	/**
	 * 입금출금구분코드
	 */
	@ApiModelProperty(
		name = "rcvWdrDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvWdrDscd")
	@BxmOmm_Field(length=1, decimal=0, description="입금출금구분코드", align="left", fill="")
	private String rcvWdrDscd= "";
	
	
	/**
	 * 입금출금구분코드명
	 */
	@ApiModelProperty(
		name = "rcvWdrDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvWdrDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="입금출금구분코드명", align="left", fill="")
	private String rcvWdrDscdNm= "";
	
	
	/**
	 * 공간번호
	 */
	@ApiModelProperty(
		name = "spceNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNo")
	@BxmOmm_Field(length=2, decimal=0, description="공간번호", align="left", fill="")
	private String spceNo= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="")
	private Integer trnSrno= 0;
	
	
	/**
	 * 입출금금액
	 */
	@ApiModelProperty(
		name = "rawAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rawAm")
	@BxmOmm_Field(length=18, decimal=3, description="입출금금액", align="right", fill="")
	private BigDecimal rawAm= new BigDecimal("0");
	
	
	/**
	 * 통장잔여금액
	 */
	@ApiModelProperty(
		name = "pbokRestAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pbokRestAm")
	@BxmOmm_Field(length=18, decimal=3, description="통장잔여금액", align="right", fill="")
	private BigDecimal pbokRestAm= new BigDecimal("0");
	
	
	/**
	 * 통장인자내용
	 */
	@ApiModelProperty(
		name = "pbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokPrngTxt")
	@BxmOmm_Field(length=100, decimal=0, description="통장인자내용", align="left", fill="")
	private String pbokPrngTxt= "";
	
	
	/**
	 * 거래종류명
	 */
	@ApiModelProperty(
		name = "trnKdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnKdNm")
	@BxmOmm_Field(length=10, decimal=0, description="거래종류명", align="left", fill="")
	private String trnKdNm= "";
	
	
	/**
	 * 거래메모
	 */
	@ApiModelProperty(
		name = "trnMemo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnMemo")
	@BxmOmm_Field(length=10, decimal=0, description="거래메모", align="left", fill="")
	private String trnMemo= "";
	
	
	
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
	private boolean isSet_rcvWdrDscd= false;
	protected final boolean isSet_rcvWdrDscd(){
		return this.isSet_rcvWdrDscd;
	}
	private void setIsSet_rcvWdrDscd(boolean value){
		this.isSet_rcvWdrDscd= value;
	}
	/**
	 * 입금출금구분코드
	 */
	@XmlTransient
	public String getRcvWdrDscd(){
		return this.rcvWdrDscd;
	}
	
	/**
	 * 입금출금구분코드
	 * 
	 * @param rcvWdrDscd 입금출금구분코드
	 */
	public void setRcvWdrDscd(String rcvWdrDscd){
		this.rcvWdrDscd= rcvWdrDscd;
		this.setIsSet_rcvWdrDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvWdrDscdNm= false;
	protected final boolean isSet_rcvWdrDscdNm(){
		return this.isSet_rcvWdrDscdNm;
	}
	private void setIsSet_rcvWdrDscdNm(boolean value){
		this.isSet_rcvWdrDscdNm= value;
	}
	/**
	 * 입금출금구분코드명
	 */
	@XmlTransient
	public String getRcvWdrDscdNm(){
		return this.rcvWdrDscdNm;
	}
	
	/**
	 * 입금출금구분코드명
	 * 
	 * @param rcvWdrDscdNm 입금출금구분코드명
	 */
	public void setRcvWdrDscdNm(String rcvWdrDscdNm){
		this.rcvWdrDscdNm= rcvWdrDscdNm;
		this.setIsSet_rcvWdrDscdNm(true);
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
	private boolean isSet_rawAm= false;
	protected final boolean isSet_rawAm(){
		return this.isSet_rawAm;
	}
	private void setIsSet_rawAm(boolean value){
		this.isSet_rawAm= value;
	}
	/**
	 * 입출금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rawAm 입출금금액
	 */
	public void setRawAm(double rawAm) {
		setRawAm(BigDecimal.valueOf(rawAm));
	}
	/**
	 * 입출금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rawAm 입출금금액
	 */
	public void setRawAm(long rawAm) {
		setRawAm(BigDecimal.valueOf(rawAm));
	}
	/**
	 * 입출금금액
	 * BigDecimal - String value setter
	 *
	 * @Param rawAm 입출금금액
	 */
	public void setRawAm(String rawAm) {
		setRawAm(new BigDecimal(rawAm));
	}
	/**
	 * 입출금금액
	 */
	@XmlTransient
	public BigDecimal getRawAm(){
		return this.rawAm;
	}
	
	/**
	 * 입출금금액
	 * 
	 * @param rawAm 입출금금액
	 */
	@JsonSetter("rawAm")
	public void setRawAm(BigDecimal rawAm){
		this.rawAm= rawAm;
		this.setIsSet_rawAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokRestAm= false;
	protected final boolean isSet_pbokRestAm(){
		return this.isSet_pbokRestAm;
	}
	private void setIsSet_pbokRestAm(boolean value){
		this.isSet_pbokRestAm= value;
	}
	/**
	 * 통장잔여금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pbokRestAm 통장잔여금액
	 */
	public void setPbokRestAm(double pbokRestAm) {
		setPbokRestAm(BigDecimal.valueOf(pbokRestAm));
	}
	/**
	 * 통장잔여금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pbokRestAm 통장잔여금액
	 */
	public void setPbokRestAm(long pbokRestAm) {
		setPbokRestAm(BigDecimal.valueOf(pbokRestAm));
	}
	/**
	 * 통장잔여금액
	 * BigDecimal - String value setter
	 *
	 * @Param pbokRestAm 통장잔여금액
	 */
	public void setPbokRestAm(String pbokRestAm) {
		setPbokRestAm(new BigDecimal(pbokRestAm));
	}
	/**
	 * 통장잔여금액
	 */
	@XmlTransient
	public BigDecimal getPbokRestAm(){
		return this.pbokRestAm;
	}
	
	/**
	 * 통장잔여금액
	 * 
	 * @param pbokRestAm 통장잔여금액
	 */
	@JsonSetter("pbokRestAm")
	public void setPbokRestAm(BigDecimal pbokRestAm){
		this.pbokRestAm= pbokRestAm;
		this.setIsSet_pbokRestAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokPrngTxt= false;
	protected final boolean isSet_pbokPrngTxt(){
		return this.isSet_pbokPrngTxt;
	}
	private void setIsSet_pbokPrngTxt(boolean value){
		this.isSet_pbokPrngTxt= value;
	}
	/**
	 * 통장인자내용
	 */
	@XmlTransient
	public String getPbokPrngTxt(){
		return this.pbokPrngTxt;
	}
	
	/**
	 * 통장인자내용
	 * 
	 * @param pbokPrngTxt 통장인자내용
	 */
	public void setPbokPrngTxt(String pbokPrngTxt){
		this.pbokPrngTxt= pbokPrngTxt;
		this.setIsSet_pbokPrngTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnKdNm= false;
	protected final boolean isSet_trnKdNm(){
		return this.isSet_trnKdNm;
	}
	private void setIsSet_trnKdNm(boolean value){
		this.isSet_trnKdNm= value;
	}
	/**
	 * 거래종류명
	 */
	@XmlTransient
	public String getTrnKdNm(){
		return this.trnKdNm;
	}
	
	/**
	 * 거래종류명
	 * 
	 * @param trnKdNm 거래종류명
	 */
	public void setTrnKdNm(String trnKdNm){
		this.trnKdNm= trnKdNm;
		this.setIsSet_trnKdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnMemo= false;
	protected final boolean isSet_trnMemo(){
		return this.isSet_trnMemo;
	}
	private void setIsSet_trnMemo(boolean value){
		this.isSet_trnMemo= value;
	}
	/**
	 * 거래메모
	 */
	@XmlTransient
	public String getTrnMemo(){
		return this.trnMemo;
	}
	
	/**
	 * 거래메모
	 * 
	 * @param trnMemo 거래메모
	 */
	public void setTrnMemo(String trnMemo){
		this.trnMemo= trnMemo;
		this.setIsSet_trnMemo(true);
	}
				
	@Override
	public PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT clone(){
		try{
			PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT object= (PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT)super.clone();
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
		
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.rcvWdrDscd==null)?0:this.rcvWdrDscd.hashCode());
		result= prime * result + ((this.rcvWdrDscdNm==null)?0:this.rcvWdrDscdNm.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.rawAm==null)?0:this.rawAm.hashCode());
		result= prime * result + ((this.pbokRestAm==null)?0:this.pbokRestAm.hashCode());
		result= prime * result + ((this.pbokPrngTxt==null)?0:this.pbokPrngTxt.hashCode());
		result= prime * result + ((this.trnKdNm==null)?0:this.trnKdNm.hashCode());
		result= prime * result + ((this.trnMemo==null)?0:this.trnMemo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT other= (PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT)obj;
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
			Object _rcvWdrDscd= getRcvWdrDscd();
			Object __rcvWdrDscd= other.getRcvWdrDscd();
			if ( _rcvWdrDscd== null ) { if ( __rcvWdrDscd!= null ) return false; }
			else if ( !_rcvWdrDscd.equals(__rcvWdrDscd) ) return false;
		}
		{
			Object _rcvWdrDscdNm= getRcvWdrDscdNm();
			Object __rcvWdrDscdNm= other.getRcvWdrDscdNm();
			if ( _rcvWdrDscdNm== null ) { if ( __rcvWdrDscdNm!= null ) return false; }
			else if ( !_rcvWdrDscdNm.equals(__rcvWdrDscdNm) ) return false;
		}
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _rawAm= getRawAm();
			Object __rawAm= other.getRawAm();
			if ( _rawAm== null ) { if ( __rawAm!= null ) return false; }
			else if ( !_rawAm.equals(__rawAm) ) return false;
		}
		{
			Object _pbokRestAm= getPbokRestAm();
			Object __pbokRestAm= other.getPbokRestAm();
			if ( _pbokRestAm== null ) { if ( __pbokRestAm!= null ) return false; }
			else if ( !_pbokRestAm.equals(__pbokRestAm) ) return false;
		}
		{
			Object _pbokPrngTxt= getPbokPrngTxt();
			Object __pbokPrngTxt= other.getPbokPrngTxt();
			if ( _pbokPrngTxt== null ) { if ( __pbokPrngTxt!= null ) return false; }
			else if ( !_pbokPrngTxt.equals(__pbokPrngTxt) ) return false;
		}
		{
			Object _trnKdNm= getTrnKdNm();
			Object __trnKdNm= other.getTrnKdNm();
			if ( _trnKdNm== null ) { if ( __trnKdNm!= null ) return false; }
			else if ( !_trnKdNm.equals(__trnKdNm) ) return false;
		}
		{
			Object _trnMemo= getTrnMemo();
			Object __trnMemo= other.getTrnMemo();
			if ( _trnMemo== null ) { if ( __trnMemo!= null ) return false; }
			else if ( !_trnMemo.equals(__trnMemo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT.class.getName()).append(":\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\trcvWdrDscd: ");
		sb.append(rcvWdrDscd==null?"null":getRcvWdrDscd());
		sb.append("\n");
		sb.append("\trcvWdrDscdNm: ");
		sb.append(rcvWdrDscdNm==null?"null":getRcvWdrDscdNm());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\trawAm: ");
		sb.append(rawAm==null?"null":getRawAm());
		sb.append("\n");
		sb.append("\tpbokRestAm: ");
		sb.append(pbokRestAm==null?"null":getPbokRestAm());
		sb.append("\n");
		sb.append("\tpbokPrngTxt: ");
		sb.append(pbokPrngTxt==null?"null":getPbokPrngTxt());
		sb.append("\n");
		sb.append("\ttrnKdNm: ");
		sb.append(trnKdNm==null?"null":getTrnKdNm());
		sb.append("\n");
		sb.append("\ttrnMemo: ");
		sb.append(trnMemo==null?"null":getTrnMemo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnTm */
		messageLen+= 1; /* rcvWdrDscd */
		messageLen+= 50; /* rcvWdrDscdNm */
		messageLen+= 2; /* spceNo */
		messageLen+= 8; /* trnSrno */
		messageLen+= 18; /* rawAm */
		messageLen+= 18; /* pbokRestAm */
		messageLen+= 100; /* pbokPrngTxt */
		messageLen+= 10; /* trnKdNm */
		messageLen+= 10; /* trnMemo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDt");
		list.add("trnTm");
		list.add("rcvWdrDscd");
		list.add("rcvWdrDscdNm");
		list.add("spceNo");
		list.add("trnSrno");
		list.add("rawAm");
		list.add("pbokRestAm");
		list.add("pbokPrngTxt");
		list.add("trnKdNm");
		list.add("trnMemo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDt", get("trnDt"));
		map.put("trnTm", get("trnTm"));
		map.put("rcvWdrDscd", get("rcvWdrDscd"));
		map.put("rcvWdrDscdNm", get("rcvWdrDscdNm"));
		map.put("spceNo", get("spceNo"));
		map.put("trnSrno", get("trnSrno"));
		map.put("rawAm", get("rawAm"));
		map.put("pbokRestAm", get("pbokRestAm"));
		map.put("pbokPrngTxt", get("pbokPrngTxt"));
		map.put("trnKdNm", get("trnKdNm"));
		map.put("trnMemo", get("trnMemo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			return getTrnDt();
		case 110633033:/* trnTm */
			return getTrnTm();
		case -1405101584:/* rcvWdrDscd */
			return getRcvWdrDscd();
		case -1682888753:/* rcvWdrDscdNm */
			return getRcvWdrDscdNm();
		case -896131680:/* spceNo */
			return getSpceNo();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 108287604:/* rawAm */
			return getRawAm();
		case 1524883470:/* pbokRestAm */
			return getPbokRestAm();
		case -1381067257:/* pbokPrngTxt */
			return getPbokPrngTxt();
		case -1056111928:/* trnKdNm */
			return getTrnKdNm();
		case -1056050422:/* trnMemo */
			return getTrnMemo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case -1405101584:/* rcvWdrDscd */
			setRcvWdrDscd((String)value);
			break;
		case -1682888753:/* rcvWdrDscdNm */
			setRcvWdrDscdNm((String)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case 108287604:/* rawAm */
			if ( value instanceof String ){
				setRawAm((String)value);
			}
			else if ( value instanceof Double ){
				setRawAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRawAm((Long)value);
			}
			else{
				setRawAm((BigDecimal)value);
			}
			break;
		case 1524883470:/* pbokRestAm */
			if ( value instanceof String ){
				setPbokRestAm((String)value);
			}
			else if ( value instanceof Double ){
				setPbokRestAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPbokRestAm((Long)value);
			}
			else{
				setPbokRestAm((BigDecimal)value);
			}
			break;
		case -1381067257:/* pbokPrngTxt */
			setPbokPrngTxt((String)value);
			break;
		case -1056111928:/* trnKdNm */
			setTrnKdNm((String)value);
			break;
		case -1056050422:/* trnMemo */
			setTrnMemo((String)value);
			break;
		default:
			break;
		}
	}
	
}
