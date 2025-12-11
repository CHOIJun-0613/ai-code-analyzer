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
	"itcsno", "rprsAcno", "spceSrno", "trnStaDt", "trnEndDt", "sortDis", "nxtPageTxt", "dpsRapDscd", "minAm", "maxAm"
}, name="PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT")
@XmlRootElement(name="PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT")
@BxmCategory(logicalName="공간.상세.거래내역.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1926531613L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 대표계좌번호
	 */
	@ApiModelProperty(
		name = "rprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="대표계좌번호", align="left", fill="")
	private String rprsAcno= "";
	
	
	/**
	 * 공간일련번호
	 */
	@ApiModelProperty(
		name = "spceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="공간일련번호", align="left", fill="")
	private String spceSrno= "";
	
	
	/**
	 * 거래시작일자
	 */
	@ApiModelProperty(
		name = "trnStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래시작일자", align="left", fill="")
	private String trnStaDt= "";
	
	
	/**
	 * 거래종료일자
	 */
	@ApiModelProperty(
		name = "trnEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래종료일자", align="left", fill="")
	private String trnEndDt= "";
	
	
	/**
	 * 정렬구분
	 */
	@ApiModelProperty(
		name = "sortDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sortDis")
	@BxmOmm_Field(length=1, decimal=0, description="정렬구분", align="left", fill="")
	private String sortDis= "";
	
	
	/**
	 * 다음페이지내용
	 */
	@ApiModelProperty(
		name = "nxtPageTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtPageTxt")
	@BxmOmm_Field(length=100, decimal=0, description="다음페이지내용", align="left", fill="")
	private String nxtPageTxt= "";
	
	
	/**
	 * 입출금구분코드
	 */
	@ApiModelProperty(
		name = "dpsRapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscd")
	@BxmOmm_Field(length=2, decimal=0, description="입출금구분코드", align="left", fill="")
	private String dpsRapDscd= "";
	
	
	/**
	 * 최소금액
	 */
	@ApiModelProperty(
		name = "minAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("minAm")
	@BxmOmm_Field(length=18, decimal=3, description="최소금액", align="right", fill="")
	private BigDecimal minAm= new BigDecimal("0");
	
	
	/**
	 * 최대금액
	 */
	@ApiModelProperty(
		name = "maxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("maxAm")
	@BxmOmm_Field(length=18, decimal=3, description="최대금액", align="right", fill="")
	private BigDecimal maxAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprsAcno= false;
	protected final boolean isSet_rprsAcno(){
		return this.isSet_rprsAcno;
	}
	private void setIsSet_rprsAcno(boolean value){
		this.isSet_rprsAcno= value;
	}
	/**
	 * 대표계좌번호
	 */
	@XmlTransient
	public String getRprsAcno(){
		return this.rprsAcno;
	}
	
	/**
	 * 대표계좌번호
	 * 
	 * @param rprsAcno 대표계좌번호
	 */
	public void setRprsAcno(String rprsAcno){
		this.rprsAcno= rprsAcno;
		this.setIsSet_rprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrno= false;
	protected final boolean isSet_spceSrno(){
		return this.isSet_spceSrno;
	}
	private void setIsSet_spceSrno(boolean value){
		this.isSet_spceSrno= value;
	}
	/**
	 * 공간일련번호
	 */
	@XmlTransient
	public String getSpceSrno(){
		return this.spceSrno;
	}
	
	/**
	 * 공간일련번호
	 * 
	 * @param spceSrno 공간일련번호
	 */
	public void setSpceSrno(String spceSrno){
		this.spceSrno= spceSrno;
		this.setIsSet_spceSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnStaDt= false;
	protected final boolean isSet_trnStaDt(){
		return this.isSet_trnStaDt;
	}
	private void setIsSet_trnStaDt(boolean value){
		this.isSet_trnStaDt= value;
	}
	/**
	 * 거래시작일자
	 */
	@XmlTransient
	public String getTrnStaDt(){
		return this.trnStaDt;
	}
	
	/**
	 * 거래시작일자
	 * 
	 * @param trnStaDt 거래시작일자
	 */
	public void setTrnStaDt(String trnStaDt){
		this.trnStaDt= trnStaDt;
		this.setIsSet_trnStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnEndDt= false;
	protected final boolean isSet_trnEndDt(){
		return this.isSet_trnEndDt;
	}
	private void setIsSet_trnEndDt(boolean value){
		this.isSet_trnEndDt= value;
	}
	/**
	 * 거래종료일자
	 */
	@XmlTransient
	public String getTrnEndDt(){
		return this.trnEndDt;
	}
	
	/**
	 * 거래종료일자
	 * 
	 * @param trnEndDt 거래종료일자
	 */
	public void setTrnEndDt(String trnEndDt){
		this.trnEndDt= trnEndDt;
		this.setIsSet_trnEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sortDis= false;
	protected final boolean isSet_sortDis(){
		return this.isSet_sortDis;
	}
	private void setIsSet_sortDis(boolean value){
		this.isSet_sortDis= value;
	}
	/**
	 * 정렬구분
	 */
	@XmlTransient
	public String getSortDis(){
		return this.sortDis;
	}
	
	/**
	 * 정렬구분
	 * 
	 * @param sortDis 정렬구분
	 */
	public void setSortDis(String sortDis){
		this.sortDis= sortDis;
		this.setIsSet_sortDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtPageTxt= false;
	protected final boolean isSet_nxtPageTxt(){
		return this.isSet_nxtPageTxt;
	}
	private void setIsSet_nxtPageTxt(boolean value){
		this.isSet_nxtPageTxt= value;
	}
	/**
	 * 다음페이지내용
	 */
	@XmlTransient
	public String getNxtPageTxt(){
		return this.nxtPageTxt;
	}
	
	/**
	 * 다음페이지내용
	 * 
	 * @param nxtPageTxt 다음페이지내용
	 */
	public void setNxtPageTxt(String nxtPageTxt){
		this.nxtPageTxt= nxtPageTxt;
		this.setIsSet_nxtPageTxt(true);
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
	 * 입출금구분코드
	 */
	@XmlTransient
	public String getDpsRapDscd(){
		return this.dpsRapDscd;
	}
	
	/**
	 * 입출금구분코드
	 * 
	 * @param dpsRapDscd 입출금구분코드
	 */
	public void setDpsRapDscd(String dpsRapDscd){
		this.dpsRapDscd= dpsRapDscd;
		this.setIsSet_dpsRapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_minAm= false;
	protected final boolean isSet_minAm(){
		return this.isSet_minAm;
	}
	private void setIsSet_minAm(boolean value){
		this.isSet_minAm= value;
	}
	/**
	 * 최소금액
	 * BigDecimal - Double value setter
	 *
	 * @Param minAm 최소금액
	 */
	public void setMinAm(double minAm) {
		setMinAm(BigDecimal.valueOf(minAm));
	}
	/**
	 * 최소금액
	 * BigDecimal - Long value setter
	 *
	 * @Param minAm 최소금액
	 */
	public void setMinAm(long minAm) {
		setMinAm(BigDecimal.valueOf(minAm));
	}
	/**
	 * 최소금액
	 * BigDecimal - String value setter
	 *
	 * @Param minAm 최소금액
	 */
	public void setMinAm(String minAm) {
		setMinAm(new BigDecimal(minAm));
	}
	/**
	 * 최소금액
	 */
	@XmlTransient
	public BigDecimal getMinAm(){
		return this.minAm;
	}
	
	/**
	 * 최소금액
	 * 
	 * @param minAm 최소금액
	 */
	@JsonSetter("minAm")
	public void setMinAm(BigDecimal minAm){
		this.minAm= minAm;
		this.setIsSet_minAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_maxAm= false;
	protected final boolean isSet_maxAm(){
		return this.isSet_maxAm;
	}
	private void setIsSet_maxAm(boolean value){
		this.isSet_maxAm= value;
	}
	/**
	 * 최대금액
	 * BigDecimal - Double value setter
	 *
	 * @Param maxAm 최대금액
	 */
	public void setMaxAm(double maxAm) {
		setMaxAm(BigDecimal.valueOf(maxAm));
	}
	/**
	 * 최대금액
	 * BigDecimal - Long value setter
	 *
	 * @Param maxAm 최대금액
	 */
	public void setMaxAm(long maxAm) {
		setMaxAm(BigDecimal.valueOf(maxAm));
	}
	/**
	 * 최대금액
	 * BigDecimal - String value setter
	 *
	 * @Param maxAm 최대금액
	 */
	public void setMaxAm(String maxAm) {
		setMaxAm(new BigDecimal(maxAm));
	}
	/**
	 * 최대금액
	 */
	@XmlTransient
	public BigDecimal getMaxAm(){
		return this.maxAm;
	}
	
	/**
	 * 최대금액
	 * 
	 * @param maxAm 최대금액
	 */
	@JsonSetter("maxAm")
	public void setMaxAm(BigDecimal maxAm){
		this.maxAm= maxAm;
		this.setIsSet_maxAm(true);
	}
				
	@Override
	public PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT clone(){
		try{
			PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT object= (PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.trnStaDt==null)?0:this.trnStaDt.hashCode());
		result= prime * result + ((this.trnEndDt==null)?0:this.trnEndDt.hashCode());
		result= prime * result + ((this.sortDis==null)?0:this.sortDis.hashCode());
		result= prime * result + ((this.nxtPageTxt==null)?0:this.nxtPageTxt.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.minAm==null)?0:this.minAm.hashCode());
		result= prime * result + ((this.maxAm==null)?0:this.maxAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT other= (PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _trnStaDt= getTrnStaDt();
			Object __trnStaDt= other.getTrnStaDt();
			if ( _trnStaDt== null ) { if ( __trnStaDt!= null ) return false; }
			else if ( !_trnStaDt.equals(__trnStaDt) ) return false;
		}
		{
			Object _trnEndDt= getTrnEndDt();
			Object __trnEndDt= other.getTrnEndDt();
			if ( _trnEndDt== null ) { if ( __trnEndDt!= null ) return false; }
			else if ( !_trnEndDt.equals(__trnEndDt) ) return false;
		}
		{
			Object _sortDis= getSortDis();
			Object __sortDis= other.getSortDis();
			if ( _sortDis== null ) { if ( __sortDis!= null ) return false; }
			else if ( !_sortDis.equals(__sortDis) ) return false;
		}
		{
			Object _nxtPageTxt= getNxtPageTxt();
			Object __nxtPageTxt= other.getNxtPageTxt();
			if ( _nxtPageTxt== null ) { if ( __nxtPageTxt!= null ) return false; }
			else if ( !_nxtPageTxt.equals(__nxtPageTxt) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _minAm= getMinAm();
			Object __minAm= other.getMinAm();
			if ( _minAm== null ) { if ( __minAm!= null ) return false; }
			else if ( !_minAm.equals(__minAm) ) return false;
		}
		{
			Object _maxAm= getMaxAm();
			Object __maxAm= other.getMaxAm();
			if ( _maxAm== null ) { if ( __maxAm!= null ) return false; }
			else if ( !_maxAm.equals(__maxAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\ttrnStaDt: ");
		sb.append(trnStaDt==null?"null":getTrnStaDt());
		sb.append("\n");
		sb.append("\ttrnEndDt: ");
		sb.append(trnEndDt==null?"null":getTrnEndDt());
		sb.append("\n");
		sb.append("\tsortDis: ");
		sb.append(sortDis==null?"null":getSortDis());
		sb.append("\n");
		sb.append("\tnxtPageTxt: ");
		sb.append(nxtPageTxt==null?"null":getNxtPageTxt());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\tminAm: ");
		sb.append(minAm==null?"null":getMinAm());
		sb.append("\n");
		sb.append("\tmaxAm: ");
		sb.append(maxAm==null?"null":getMaxAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* rprsAcno */
		messageLen+= 10; /* spceSrno */
		messageLen+= 8; /* trnStaDt */
		messageLen+= 8; /* trnEndDt */
		messageLen+= 1; /* sortDis */
		messageLen+= 100; /* nxtPageTxt */
		messageLen+= 2; /* dpsRapDscd */
		messageLen+= 18; /* minAm */
		messageLen+= 18; /* maxAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("trnStaDt");
		list.add("trnEndDt");
		list.add("sortDis");
		list.add("nxtPageTxt");
		list.add("dpsRapDscd");
		list.add("minAm");
		list.add("maxAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("trnStaDt", get("trnStaDt"));
		map.put("trnEndDt", get("trnEndDt"));
		map.put("sortDis", get("sortDis"));
		map.put("nxtPageTxt", get("nxtPageTxt"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("minAm", get("minAm"));
		map.put("maxAm", get("maxAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 1628150528:/* trnStaDt */
			return getTrnStaDt();
		case 1615045371:/* trnEndDt */
			return getTrnEndDt();
		case -2024617456:/* sortDis */
			return getSortDis();
		case -1124189673:/* nxtPageTxt */
			return getNxtPageTxt();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case 103899678:/* minAm */
			return getMinAm();
		case 103670960:/* maxAm */
			return getMaxAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case 1628150528:/* trnStaDt */
			setTrnStaDt((String)value);
			break;
		case 1615045371:/* trnEndDt */
			setTrnEndDt((String)value);
			break;
		case -2024617456:/* sortDis */
			setSortDis((String)value);
			break;
		case -1124189673:/* nxtPageTxt */
			setNxtPageTxt((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case 103899678:/* minAm */
			if ( value instanceof String ){
				setMinAm((String)value);
			}
			else if ( value instanceof Double ){
				setMinAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMinAm((Long)value);
			}
			else{
				setMinAm((BigDecimal)value);
			}
			break;
		case 103670960:/* maxAm */
			if ( value instanceof String ){
				setMaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setMaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMaxAm((Long)value);
			}
			else{
				setMaxAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
