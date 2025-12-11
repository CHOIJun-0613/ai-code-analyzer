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
 * 
 */
@XmlType(propOrder={
	"metMngNo", "trnDt", "metTrnSrno", "metMoAcno", "trnSrno", "dpsRapDscd", "dpsRapDisNm", "trnStcd", "trnAm", "mbhNm"
}, name="HswfMetTmmTrnPrtsList_DODT")
@XmlRootElement(name="HswfMetTmmTrnPrtsList_DODT")
@BxmCategory(logicalName="부부.모임.당월.거래내역.목록.DBM.출력.IO", description="") 
public class HswfMetTmmTrnPrtsList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1159579925L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
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
	 * 모임거래일련번호
	 */
	@ApiModelProperty(
		name = "metTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="모임거래일련번호", align="right", fill="")
	private Integer metTrnSrno= 0;
	
	
	/**
	 * 모임모계좌번호
	 */
	@ApiModelProperty(
		name = "metMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMoAcno")
	@BxmOmm_Field(length=13, decimal=0, description="모임모계좌번호", align="left", fill="")
	private String metMoAcno= "";
	
	
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
	 * 수신입지급구분명
	 */
	@ApiModelProperty(
		name = "dpsRapDisNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDisNm")
	@BxmOmm_Field(length=50, decimal=0, description="수신입지급구분명", align="left", fill="")
	private String dpsRapDisNm= "";
	
	
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
	 * 회원명
	 */
	@ApiModelProperty(
		name = "mbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbhNm")
	@BxmOmm_Field(length=30, decimal=0, description="회원명", align="left", fill="")
	private String mbhNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
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
	private boolean isSet_metTrnSrno= false;
	protected final boolean isSet_metTrnSrno(){
		return this.isSet_metTrnSrno;
	}
	private void setIsSet_metTrnSrno(boolean value){
		this.isSet_metTrnSrno= value;
	}
	/**
	 * 모임거래일련번호
	 */
	@XmlTransient
	public Integer getMetTrnSrno(){
		return this.metTrnSrno;
	}
	
	/**
	 * 모임거래일련번호
	 * 
	 * @param metTrnSrno 모임거래일련번호
	 */
	public void setMetTrnSrno(Integer metTrnSrno){
		this.metTrnSrno= metTrnSrno;
		this.setIsSet_metTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMoAcno= false;
	protected final boolean isSet_metMoAcno(){
		return this.isSet_metMoAcno;
	}
	private void setIsSet_metMoAcno(boolean value){
		this.isSet_metMoAcno= value;
	}
	/**
	 * 모임모계좌번호
	 */
	@XmlTransient
	public String getMetMoAcno(){
		return this.metMoAcno;
	}
	
	/**
	 * 모임모계좌번호
	 * 
	 * @param metMoAcno 모임모계좌번호
	 */
	public void setMetMoAcno(String metMoAcno){
		this.metMoAcno= metMoAcno;
		this.setIsSet_metMoAcno(true);
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
	private boolean isSet_dpsRapDisNm= false;
	protected final boolean isSet_dpsRapDisNm(){
		return this.isSet_dpsRapDisNm;
	}
	private void setIsSet_dpsRapDisNm(boolean value){
		this.isSet_dpsRapDisNm= value;
	}
	/**
	 * 수신입지급구분명
	 */
	@XmlTransient
	public String getDpsRapDisNm(){
		return this.dpsRapDisNm;
	}
	
	/**
	 * 수신입지급구분명
	 * 
	 * @param dpsRapDisNm 수신입지급구분명
	 */
	public void setDpsRapDisNm(String dpsRapDisNm){
		this.dpsRapDisNm= dpsRapDisNm;
		this.setIsSet_dpsRapDisNm(true);
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
	private boolean isSet_mbhNm= false;
	protected final boolean isSet_mbhNm(){
		return this.isSet_mbhNm;
	}
	private void setIsSet_mbhNm(boolean value){
		this.isSet_mbhNm= value;
	}
	/**
	 * 회원명
	 */
	@XmlTransient
	public String getMbhNm(){
		return this.mbhNm;
	}
	
	/**
	 * 회원명
	 * 
	 * @param mbhNm 회원명
	 */
	public void setMbhNm(String mbhNm){
		this.mbhNm= mbhNm;
		this.setIsSet_mbhNm(true);
	}
				
	@Override
	public HswfMetTmmTrnPrtsList_DODT clone(){
		try{
			HswfMetTmmTrnPrtsList_DODT object= (HswfMetTmmTrnPrtsList_DODT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.metTrnSrno==null)?0:this.metTrnSrno.hashCode());
		result= prime * result + ((this.metMoAcno==null)?0:this.metMoAcno.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.dpsRapDisNm==null)?0:this.dpsRapDisNm.hashCode());
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.mbhNm==null)?0:this.mbhNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final HswfMetTmmTrnPrtsList_DODT other= (HswfMetTmmTrnPrtsList_DODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _metTrnSrno= getMetTrnSrno();
			Object __metTrnSrno= other.getMetTrnSrno();
			if ( _metTrnSrno== null ) { if ( __metTrnSrno!= null ) return false; }
			else if ( !_metTrnSrno.equals(__metTrnSrno) ) return false;
		}
		{
			Object _metMoAcno= getMetMoAcno();
			Object __metMoAcno= other.getMetMoAcno();
			if ( _metMoAcno== null ) { if ( __metMoAcno!= null ) return false; }
			else if ( !_metMoAcno.equals(__metMoAcno) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _dpsRapDisNm= getDpsRapDisNm();
			Object __dpsRapDisNm= other.getDpsRapDisNm();
			if ( _dpsRapDisNm== null ) { if ( __dpsRapDisNm!= null ) return false; }
			else if ( !_dpsRapDisNm.equals(__dpsRapDisNm) ) return false;
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
			Object _mbhNm= getMbhNm();
			Object __mbhNm= other.getMbhNm();
			if ( _mbhNm== null ) { if ( __mbhNm!= null ) return false; }
			else if ( !_mbhNm.equals(__mbhNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(HswfMetTmmTrnPrtsList_DODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\tmetTrnSrno: ");
		sb.append(metTrnSrno==null?"null":getMetTrnSrno());
		sb.append("\n");
		sb.append("\tmetMoAcno: ");
		sb.append(metMoAcno==null?"null":getMetMoAcno());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\tdpsRapDisNm: ");
		sb.append(dpsRapDisNm==null?"null":getDpsRapDisNm());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\tmbhNm: ");
		sb.append(mbhNm==null?"null":getMbhNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* metTrnSrno */
		messageLen+= 13; /* metMoAcno */
		messageLen+= 4; /* trnSrno */
		messageLen+= 1; /* dpsRapDscd */
		messageLen+= 50; /* dpsRapDisNm */
		messageLen+= 2; /* trnStcd */
		messageLen+= 20; /* trnAm */
		messageLen+= 30; /* mbhNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("trnDt");
		list.add("metTrnSrno");
		list.add("metMoAcno");
		list.add("trnSrno");
		list.add("dpsRapDscd");
		list.add("dpsRapDisNm");
		list.add("trnStcd");
		list.add("trnAm");
		list.add("mbhNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("trnDt", get("trnDt"));
		map.put("metTrnSrno", get("metTrnSrno"));
		map.put("metMoAcno", get("metMoAcno"));
		map.put("trnSrno", get("trnSrno"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("dpsRapDisNm", get("dpsRapDisNm"));
		map.put("trnStcd", get("trnStcd"));
		map.put("trnAm", get("trnAm"));
		map.put("mbhNm", get("mbhNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1198079820:/* metTrnSrno */
			return getMetTrnSrno();
		case -1628621023:/* metMoAcno */
			return getMetMoAcno();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case -1197442605:/* dpsRapDisNm */
			return getDpsRapDisNm();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 103685778:/* mbhNm */
			return getMbhNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case -1198079820:/* metTrnSrno */
			setMetTrnSrno((Integer)value);
			break;
		case -1628621023:/* metMoAcno */
			setMetMoAcno((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case -1197442605:/* dpsRapDisNm */
			setDpsRapDisNm((String)value);
			break;
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 110632444:/* trnAm */
			setTrnAm((String)value);
			break;
		case 103685778:/* mbhNm */
			setMbhNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
