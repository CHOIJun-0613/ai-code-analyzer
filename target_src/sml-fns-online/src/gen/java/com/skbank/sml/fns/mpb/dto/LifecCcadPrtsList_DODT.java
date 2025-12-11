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
	"mmCnsmAm", "trnDt", "trnTm", "bzBrcd", "bzbrNm", "trnSrno", "cadNo", "cadcDscd", "cadPrdBkcd", "trnStcd", "trnAm", "cadSalKdcd"
}, name="LifecCcadPrtsList_DODT")
@XmlRootElement(name="LifecCcadPrtsList_DODT")
@BxmCategory(logicalName="생활비.신용카드.내역.목록.DBM.출력.IO", description="") 
public class LifecCcadPrtsList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -281277345L;
	
	
	
	/**
	 * 월소비금액
	 */
	@ApiModelProperty(
		name = "mmCnsmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mmCnsmAm")
	@BxmOmm_Field(length=18, decimal=3, description="월소비금액", align="right", fill="")
	private BigDecimal mmCnsmAm= new BigDecimal("0");
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="right", fill="")
	private Integer trnDt= 0;
	
	
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
	 * 영업점코드
	 */
	@ApiModelProperty(
		name = "bzBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="영업점코드", align="left", fill="")
	private String bzBrcd= "";
	
	
	/**
	 * 영업점명
	 */
	@ApiModelProperty(
		name = "bzbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="영업점명", align="left", fill="")
	private String bzbrNm= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=4, decimal=0, description="거래일련번호", align="left", fill="")
	private String trnSrno= "";
	
	
	/**
	 * 카드번호
	 */
	@ApiModelProperty(
		name = "cadNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cadNo")
	@BxmOmm_Field(length=20, decimal=0, description="카드번호", align="left", fill="")
	private String cadNo= "";
	
	
	/**
	 * 카드사구분코드
	 */
	@ApiModelProperty(
		name = "cadcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cadcDscd")
	@BxmOmm_Field(length=2, decimal=0, description="카드사구분코드", align="left", fill="")
	private String cadcDscd= "";
	
	
	/**
	 * 카드상품은행코드
	 */
	@ApiModelProperty(
		name = "cadPrdBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cadPrdBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="카드상품은행코드", align="left", fill="")
	private String cadPrdBkcd= "";
	
	
	/**
	 * 거래상태코드
	 */
	@ApiModelProperty(
		name = "trnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStcd")
	@BxmOmm_Field(length=2, decimal=0, description="거래상태코드", align="left", fill="")
	private String trnStcd= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=20, decimal=0, description="거래금액", align="left", fill="")
	private String trnAm= "";
	
	
	/**
	 * 카드매출종류코드
	 */
	@ApiModelProperty(
		name = "cadSalKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cadSalKdcd")
	@BxmOmm_Field(length=2, decimal=0, description="카드매출종류코드", align="left", fill="")
	private String cadSalKdcd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mmCnsmAm= false;
	protected final boolean isSet_mmCnsmAm(){
		return this.isSet_mmCnsmAm;
	}
	private void setIsSet_mmCnsmAm(boolean value){
		this.isSet_mmCnsmAm= value;
	}
	/**
	 * 월소비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mmCnsmAm 월소비금액
	 */
	public void setMmCnsmAm(double mmCnsmAm) {
		setMmCnsmAm(BigDecimal.valueOf(mmCnsmAm));
	}
	/**
	 * 월소비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mmCnsmAm 월소비금액
	 */
	public void setMmCnsmAm(long mmCnsmAm) {
		setMmCnsmAm(BigDecimal.valueOf(mmCnsmAm));
	}
	/**
	 * 월소비금액
	 * BigDecimal - String value setter
	 *
	 * @Param mmCnsmAm 월소비금액
	 */
	public void setMmCnsmAm(String mmCnsmAm) {
		setMmCnsmAm(new BigDecimal(mmCnsmAm));
	}
	/**
	 * 월소비금액
	 */
	@XmlTransient
	public BigDecimal getMmCnsmAm(){
		return this.mmCnsmAm;
	}
	
	/**
	 * 월소비금액
	 * 
	 * @param mmCnsmAm 월소비금액
	 */
	@JsonSetter("mmCnsmAm")
	public void setMmCnsmAm(BigDecimal mmCnsmAm){
		this.mmCnsmAm= mmCnsmAm;
		this.setIsSet_mmCnsmAm(true);
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
	public Integer getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(Integer trnDt){
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
	private boolean isSet_bzBrcd= false;
	protected final boolean isSet_bzBrcd(){
		return this.isSet_bzBrcd;
	}
	private void setIsSet_bzBrcd(boolean value){
		this.isSet_bzBrcd= value;
	}
	/**
	 * 영업점코드
	 */
	@XmlTransient
	public String getBzBrcd(){
		return this.bzBrcd;
	}
	
	/**
	 * 영업점코드
	 * 
	 * @param bzBrcd 영업점코드
	 */
	public void setBzBrcd(String bzBrcd){
		this.bzBrcd= bzBrcd;
		this.setIsSet_bzBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzbrNm= false;
	protected final boolean isSet_bzbrNm(){
		return this.isSet_bzbrNm;
	}
	private void setIsSet_bzbrNm(boolean value){
		this.isSet_bzbrNm= value;
	}
	/**
	 * 영업점명
	 */
	@XmlTransient
	public String getBzbrNm(){
		return this.bzbrNm;
	}
	
	/**
	 * 영업점명
	 * 
	 * @param bzbrNm 영업점명
	 */
	public void setBzbrNm(String bzbrNm){
		this.bzbrNm= bzbrNm;
		this.setIsSet_bzbrNm(true);
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
	private boolean isSet_cadNo= false;
	protected final boolean isSet_cadNo(){
		return this.isSet_cadNo;
	}
	private void setIsSet_cadNo(boolean value){
		this.isSet_cadNo= value;
	}
	/**
	 * 카드번호
	 */
	@XmlTransient
	public String getCadNo(){
		return this.cadNo;
	}
	
	/**
	 * 카드번호
	 * 
	 * @param cadNo 카드번호
	 */
	public void setCadNo(String cadNo){
		this.cadNo= cadNo;
		this.setIsSet_cadNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cadcDscd= false;
	protected final boolean isSet_cadcDscd(){
		return this.isSet_cadcDscd;
	}
	private void setIsSet_cadcDscd(boolean value){
		this.isSet_cadcDscd= value;
	}
	/**
	 * 카드사구분코드
	 */
	@XmlTransient
	public String getCadcDscd(){
		return this.cadcDscd;
	}
	
	/**
	 * 카드사구분코드
	 * 
	 * @param cadcDscd 카드사구분코드
	 */
	public void setCadcDscd(String cadcDscd){
		this.cadcDscd= cadcDscd;
		this.setIsSet_cadcDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cadPrdBkcd= false;
	protected final boolean isSet_cadPrdBkcd(){
		return this.isSet_cadPrdBkcd;
	}
	private void setIsSet_cadPrdBkcd(boolean value){
		this.isSet_cadPrdBkcd= value;
	}
	/**
	 * 카드상품은행코드
	 */
	@XmlTransient
	public String getCadPrdBkcd(){
		return this.cadPrdBkcd;
	}
	
	/**
	 * 카드상품은행코드
	 * 
	 * @param cadPrdBkcd 카드상품은행코드
	 */
	public void setCadPrdBkcd(String cadPrdBkcd){
		this.cadPrdBkcd= cadPrdBkcd;
		this.setIsSet_cadPrdBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnStcd= false;
	protected final boolean isSet_trnStcd(){
		return this.isSet_trnStcd;
	}
	private void setIsSet_trnStcd(boolean value){
		this.isSet_trnStcd= value;
	}
	/**
	 * 거래상태코드
	 */
	@XmlTransient
	public String getTrnStcd(){
		return this.trnStcd;
	}
	
	/**
	 * 거래상태코드
	 * 
	 * @param trnStcd 거래상태코드
	 */
	public void setTrnStcd(String trnStcd){
		this.trnStcd= trnStcd;
		this.setIsSet_trnStcd(true);
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
	 */
	@XmlTransient
	public String getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cadSalKdcd= false;
	protected final boolean isSet_cadSalKdcd(){
		return this.isSet_cadSalKdcd;
	}
	private void setIsSet_cadSalKdcd(boolean value){
		this.isSet_cadSalKdcd= value;
	}
	/**
	 * 카드매출종류코드
	 */
	@XmlTransient
	public String getCadSalKdcd(){
		return this.cadSalKdcd;
	}
	
	/**
	 * 카드매출종류코드
	 * 
	 * @param cadSalKdcd 카드매출종류코드
	 */
	public void setCadSalKdcd(String cadSalKdcd){
		this.cadSalKdcd= cadSalKdcd;
		this.setIsSet_cadSalKdcd(true);
	}
				
	@Override
	public LifecCcadPrtsList_DODT clone(){
		try{
			LifecCcadPrtsList_DODT object= (LifecCcadPrtsList_DODT)super.clone();
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
		
		result= prime * result + ((this.mmCnsmAm==null)?0:this.mmCnsmAm.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.bzBrcd==null)?0:this.bzBrcd.hashCode());
		result= prime * result + ((this.bzbrNm==null)?0:this.bzbrNm.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.cadNo==null)?0:this.cadNo.hashCode());
		result= prime * result + ((this.cadcDscd==null)?0:this.cadcDscd.hashCode());
		result= prime * result + ((this.cadPrdBkcd==null)?0:this.cadPrdBkcd.hashCode());
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.cadSalKdcd==null)?0:this.cadSalKdcd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final LifecCcadPrtsList_DODT other= (LifecCcadPrtsList_DODT)obj;
		{
			Object _mmCnsmAm= getMmCnsmAm();
			Object __mmCnsmAm= other.getMmCnsmAm();
			if ( _mmCnsmAm== null ) { if ( __mmCnsmAm!= null ) return false; }
			else if ( !_mmCnsmAm.equals(__mmCnsmAm) ) return false;
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
			Object _bzBrcd= getBzBrcd();
			Object __bzBrcd= other.getBzBrcd();
			if ( _bzBrcd== null ) { if ( __bzBrcd!= null ) return false; }
			else if ( !_bzBrcd.equals(__bzBrcd) ) return false;
		}
		{
			Object _bzbrNm= getBzbrNm();
			Object __bzbrNm= other.getBzbrNm();
			if ( _bzbrNm== null ) { if ( __bzbrNm!= null ) return false; }
			else if ( !_bzbrNm.equals(__bzbrNm) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _cadNo= getCadNo();
			Object __cadNo= other.getCadNo();
			if ( _cadNo== null ) { if ( __cadNo!= null ) return false; }
			else if ( !_cadNo.equals(__cadNo) ) return false;
		}
		{
			Object _cadcDscd= getCadcDscd();
			Object __cadcDscd= other.getCadcDscd();
			if ( _cadcDscd== null ) { if ( __cadcDscd!= null ) return false; }
			else if ( !_cadcDscd.equals(__cadcDscd) ) return false;
		}
		{
			Object _cadPrdBkcd= getCadPrdBkcd();
			Object __cadPrdBkcd= other.getCadPrdBkcd();
			if ( _cadPrdBkcd== null ) { if ( __cadPrdBkcd!= null ) return false; }
			else if ( !_cadPrdBkcd.equals(__cadPrdBkcd) ) return false;
		}
		{
			Object _trnStcd= getTrnStcd();
			Object __trnStcd= other.getTrnStcd();
			if ( _trnStcd== null ) { if ( __trnStcd!= null ) return false; }
			else if ( !_trnStcd.equals(__trnStcd) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _cadSalKdcd= getCadSalKdcd();
			Object __cadSalKdcd= other.getCadSalKdcd();
			if ( _cadSalKdcd== null ) { if ( __cadSalKdcd!= null ) return false; }
			else if ( !_cadSalKdcd.equals(__cadSalKdcd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(LifecCcadPrtsList_DODT.class.getName()).append(":\n");
		sb.append("\tmmCnsmAm: ");
		sb.append(mmCnsmAm==null?"null":getMmCnsmAm());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\tbzBrcd: ");
		sb.append(bzBrcd==null?"null":getBzBrcd());
		sb.append("\n");
		sb.append("\tbzbrNm: ");
		sb.append(bzbrNm==null?"null":getBzbrNm());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tcadNo: ");
		sb.append(cadNo==null?"null":getCadNo());
		sb.append("\n");
		sb.append("\tcadcDscd: ");
		sb.append(cadcDscd==null?"null":getCadcDscd());
		sb.append("\n");
		sb.append("\tcadPrdBkcd: ");
		sb.append(cadPrdBkcd==null?"null":getCadPrdBkcd());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\tcadSalKdcd: ");
		sb.append(cadSalKdcd==null?"null":getCadSalKdcd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 18; /* mmCnsmAm */
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnTm */
		messageLen+= 6; /* bzBrcd */
		messageLen+= 50; /* bzbrNm */
		messageLen+= 4; /* trnSrno */
		messageLen+= 20; /* cadNo */
		messageLen+= 2; /* cadcDscd */
		messageLen+= 3; /* cadPrdBkcd */
		messageLen+= 2; /* trnStcd */
		messageLen+= 20; /* trnAm */
		messageLen+= 2; /* cadSalKdcd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mmCnsmAm");
		list.add("trnDt");
		list.add("trnTm");
		list.add("bzBrcd");
		list.add("bzbrNm");
		list.add("trnSrno");
		list.add("cadNo");
		list.add("cadcDscd");
		list.add("cadPrdBkcd");
		list.add("trnStcd");
		list.add("trnAm");
		list.add("cadSalKdcd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mmCnsmAm", get("mmCnsmAm"));
		map.put("trnDt", get("trnDt"));
		map.put("trnTm", get("trnTm"));
		map.put("bzBrcd", get("bzBrcd"));
		map.put("bzbrNm", get("bzbrNm"));
		map.put("trnSrno", get("trnSrno"));
		map.put("cadNo", get("cadNo"));
		map.put("cadcDscd", get("cadcDscd"));
		map.put("cadPrdBkcd", get("cadPrdBkcd"));
		map.put("trnStcd", get("trnStcd"));
		map.put("trnAm", get("trnAm"));
		map.put("cadSalKdcd", get("cadSalKdcd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 964692177:/* mmCnsmAm */
			return getMmCnsmAm();
		case 110632544:/* trnDt */
			return getTrnDt();
		case 110633033:/* trnTm */
			return getTrnTm();
		case -1374562007:/* bzBrcd */
			return getBzBrcd();
		case -1373609337:/* bzbrNm */
			return getBzbrNm();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 94416935:/* cadNo */
			return getCadNo();
		case -410441683:/* cadcDscd */
			return getCadcDscd();
		case -1973019258:/* cadPrdBkcd */
			return getCadPrdBkcd();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 210445778:/* cadSalKdcd */
			return getCadSalKdcd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 964692177:/* mmCnsmAm */
			if ( value instanceof String ){
				setMmCnsmAm((String)value);
			}
			else if ( value instanceof Double ){
				setMmCnsmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMmCnsmAm((Long)value);
			}
			else{
				setMmCnsmAm((BigDecimal)value);
			}
			break;
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case -1374562007:/* bzBrcd */
			setBzBrcd((String)value);
			break;
		case -1373609337:/* bzbrNm */
			setBzbrNm((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case 94416935:/* cadNo */
			setCadNo((String)value);
			break;
		case -410441683:/* cadcDscd */
			setCadcDscd((String)value);
			break;
		case -1973019258:/* cadPrdBkcd */
			setCadPrdBkcd((String)value);
			break;
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 110632444:/* trnAm */
			setTrnAm((String)value);
			break;
		case 210445778:/* cadSalKdcd */
			setCadSalKdcd((String)value);
			break;
		default:
			break;
		}
	}
	
}
