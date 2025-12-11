/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"inqDis", "metMngNo", "nxtMetMbhAlsNm", "inqBasYm", "metMbhSrno", "inqStaDt", "inqStaTrnSrno", "inqEndDt", "inqEndTrnSrno", "etcRcvInqYn"
}, name="MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT")
@BxmCategory(logicalName="회비.입금현황.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -260258183L;
	
	
	
	/**
	 * 조회구분
	 */
	@ApiModelProperty(
		name = "inqDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDis")
	@BxmOmm_Field(length=2, decimal=0, description="조회구분", align="left", fill="")
	private String inqDis= "";
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 다음모임회원별칭명
	 */
	@ApiModelProperty(
		name = "nxtMetMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtMetMbhAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="다음모임회원별칭명", align="left", fill="")
	private String nxtMetMbhAlsNm= "";
	
	
	/**
	 * 조회기준년월
	 */
	@ApiModelProperty(
		name = "inqBasYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqBasYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회기준년월", align="left", fill="")
	private String inqBasYm= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="right", fill="0")
	private Integer metMbhSrno= 0;
	
	
	/**
	 * 조회시작일자
	 */
	@ApiModelProperty(
		name = "inqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작일자", align="left", fill="")
	private String inqStaDt= "";
	
	
	/**
	 * 조회시작거래일련번호
	 */
	@ApiModelProperty(
		name = "inqStaTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqStaTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작거래일련번호", align="right", fill="0")
	private Integer inqStaTrnSrno= 0;
	
	
	/**
	 * 조회종료일자
	 */
	@ApiModelProperty(
		name = "inqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료일자", align="left", fill="")
	private String inqEndDt= "";
	
	
	/**
	 * 조회종료거래일련번호
	 */
	@ApiModelProperty(
		name = "inqEndTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqEndTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료거래일련번호", align="right", fill="0")
	private Integer inqEndTrnSrno= 0;
	
	
	/**
	 * 기타입금조회여부
	 */
	@ApiModelProperty(
		name = "etcRcvInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcRcvInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="기타입금조회여부", align="left", fill="")
	private String etcRcvInqYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDis= false;
	protected final boolean isSet_inqDis(){
		return this.isSet_inqDis;
	}
	private void setIsSet_inqDis(boolean value){
		this.isSet_inqDis= value;
	}
	/**
	 * 조회구분
	 */
	@XmlTransient
	public String getInqDis(){
		return this.inqDis;
	}
	
	/**
	 * 조회구분
	 * 
	 * @param inqDis 조회구분
	 */
	public void setInqDis(String inqDis){
		this.inqDis= inqDis;
		this.setIsSet_inqDis(true);
	}
	
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
	private boolean isSet_nxtMetMbhAlsNm= false;
	protected final boolean isSet_nxtMetMbhAlsNm(){
		return this.isSet_nxtMetMbhAlsNm;
	}
	private void setIsSet_nxtMetMbhAlsNm(boolean value){
		this.isSet_nxtMetMbhAlsNm= value;
	}
	/**
	 * 다음모임회원별칭명
	 */
	@XmlTransient
	public String getNxtMetMbhAlsNm(){
		return this.nxtMetMbhAlsNm;
	}
	
	/**
	 * 다음모임회원별칭명
	 * 
	 * @param nxtMetMbhAlsNm 다음모임회원별칭명
	 */
	public void setNxtMetMbhAlsNm(String nxtMetMbhAlsNm){
		this.nxtMetMbhAlsNm= nxtMetMbhAlsNm;
		this.setIsSet_nxtMetMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqBasYm= false;
	protected final boolean isSet_inqBasYm(){
		return this.isSet_inqBasYm;
	}
	private void setIsSet_inqBasYm(boolean value){
		this.isSet_inqBasYm= value;
	}
	/**
	 * 조회기준년월
	 */
	@XmlTransient
	public String getInqBasYm(){
		return this.inqBasYm;
	}
	
	/**
	 * 조회기준년월
	 * 
	 * @param inqBasYm 조회기준년월
	 */
	public void setInqBasYm(String inqBasYm){
		this.inqBasYm= inqBasYm;
		this.setIsSet_inqBasYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public Integer getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(Integer metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaDt= false;
	protected final boolean isSet_inqStaDt(){
		return this.isSet_inqStaDt;
	}
	private void setIsSet_inqStaDt(boolean value){
		this.isSet_inqStaDt= value;
	}
	/**
	 * 조회시작일자
	 */
	@XmlTransient
	public String getInqStaDt(){
		return this.inqStaDt;
	}
	
	/**
	 * 조회시작일자
	 * 
	 * @param inqStaDt 조회시작일자
	 */
	public void setInqStaDt(String inqStaDt){
		this.inqStaDt= inqStaDt;
		this.setIsSet_inqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaTrnSrno= false;
	protected final boolean isSet_inqStaTrnSrno(){
		return this.isSet_inqStaTrnSrno;
	}
	private void setIsSet_inqStaTrnSrno(boolean value){
		this.isSet_inqStaTrnSrno= value;
	}
	/**
	 * 조회시작거래일련번호
	 */
	@XmlTransient
	public Integer getInqStaTrnSrno(){
		return this.inqStaTrnSrno;
	}
	
	/**
	 * 조회시작거래일련번호
	 * 
	 * @param inqStaTrnSrno 조회시작거래일련번호
	 */
	public void setInqStaTrnSrno(Integer inqStaTrnSrno){
		this.inqStaTrnSrno= inqStaTrnSrno;
		this.setIsSet_inqStaTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndDt= false;
	protected final boolean isSet_inqEndDt(){
		return this.isSet_inqEndDt;
	}
	private void setIsSet_inqEndDt(boolean value){
		this.isSet_inqEndDt= value;
	}
	/**
	 * 조회종료일자
	 */
	@XmlTransient
	public String getInqEndDt(){
		return this.inqEndDt;
	}
	
	/**
	 * 조회종료일자
	 * 
	 * @param inqEndDt 조회종료일자
	 */
	public void setInqEndDt(String inqEndDt){
		this.inqEndDt= inqEndDt;
		this.setIsSet_inqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndTrnSrno= false;
	protected final boolean isSet_inqEndTrnSrno(){
		return this.isSet_inqEndTrnSrno;
	}
	private void setIsSet_inqEndTrnSrno(boolean value){
		this.isSet_inqEndTrnSrno= value;
	}
	/**
	 * 조회종료거래일련번호
	 */
	@XmlTransient
	public Integer getInqEndTrnSrno(){
		return this.inqEndTrnSrno;
	}
	
	/**
	 * 조회종료거래일련번호
	 * 
	 * @param inqEndTrnSrno 조회종료거래일련번호
	 */
	public void setInqEndTrnSrno(Integer inqEndTrnSrno){
		this.inqEndTrnSrno= inqEndTrnSrno;
		this.setIsSet_inqEndTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcRcvInqYn= false;
	protected final boolean isSet_etcRcvInqYn(){
		return this.isSet_etcRcvInqYn;
	}
	private void setIsSet_etcRcvInqYn(boolean value){
		this.isSet_etcRcvInqYn= value;
	}
	/**
	 * 기타입금조회여부
	 */
	@XmlTransient
	public String getEtcRcvInqYn(){
		return this.etcRcvInqYn;
	}
	
	/**
	 * 기타입금조회여부
	 * 
	 * @param etcRcvInqYn 기타입금조회여부
	 */
	public void setEtcRcvInqYn(String etcRcvInqYn){
		this.etcRcvInqYn= etcRcvInqYn;
		this.setIsSet_etcRcvInqYn(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT clone(){
		try{
			MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT object= (MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT)super.clone();
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
		
		result= prime * result + ((this.inqDis==null)?0:this.inqDis.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.nxtMetMbhAlsNm==null)?0:this.nxtMetMbhAlsNm.hashCode());
		result= prime * result + ((this.inqBasYm==null)?0:this.inqBasYm.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqStaTrnSrno==null)?0:this.inqStaTrnSrno.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.inqEndTrnSrno==null)?0:this.inqEndTrnSrno.hashCode());
		result= prime * result + ((this.etcRcvInqYn==null)?0:this.etcRcvInqYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT other= (MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT)obj;
		{
			Object _inqDis= getInqDis();
			Object __inqDis= other.getInqDis();
			if ( _inqDis== null ) { if ( __inqDis!= null ) return false; }
			else if ( !_inqDis.equals(__inqDis) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _nxtMetMbhAlsNm= getNxtMetMbhAlsNm();
			Object __nxtMetMbhAlsNm= other.getNxtMetMbhAlsNm();
			if ( _nxtMetMbhAlsNm== null ) { if ( __nxtMetMbhAlsNm!= null ) return false; }
			else if ( !_nxtMetMbhAlsNm.equals(__nxtMetMbhAlsNm) ) return false;
		}
		{
			Object _inqBasYm= getInqBasYm();
			Object __inqBasYm= other.getInqBasYm();
			if ( _inqBasYm== null ) { if ( __inqBasYm!= null ) return false; }
			else if ( !_inqBasYm.equals(__inqBasYm) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _inqStaDt= getInqStaDt();
			Object __inqStaDt= other.getInqStaDt();
			if ( _inqStaDt== null ) { if ( __inqStaDt!= null ) return false; }
			else if ( !_inqStaDt.equals(__inqStaDt) ) return false;
		}
		{
			Object _inqStaTrnSrno= getInqStaTrnSrno();
			Object __inqStaTrnSrno= other.getInqStaTrnSrno();
			if ( _inqStaTrnSrno== null ) { if ( __inqStaTrnSrno!= null ) return false; }
			else if ( !_inqStaTrnSrno.equals(__inqStaTrnSrno) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		{
			Object _inqEndTrnSrno= getInqEndTrnSrno();
			Object __inqEndTrnSrno= other.getInqEndTrnSrno();
			if ( _inqEndTrnSrno== null ) { if ( __inqEndTrnSrno!= null ) return false; }
			else if ( !_inqEndTrnSrno.equals(__inqEndTrnSrno) ) return false;
		}
		{
			Object _etcRcvInqYn= getEtcRcvInqYn();
			Object __etcRcvInqYn= other.getEtcRcvInqYn();
			if ( _etcRcvInqYn== null ) { if ( __etcRcvInqYn!= null ) return false; }
			else if ( !_etcRcvInqYn.equals(__etcRcvInqYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT.class.getName()).append(":\n");
		sb.append("\tinqDis: ");
		sb.append(inqDis==null?"null":getInqDis());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tnxtMetMbhAlsNm: ");
		sb.append(nxtMetMbhAlsNm==null?"null":getNxtMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tinqBasYm: ");
		sb.append(inqBasYm==null?"null":getInqBasYm());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqStaTrnSrno: ");
		sb.append(inqStaTrnSrno==null?"null":getInqStaTrnSrno());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\tinqEndTrnSrno: ");
		sb.append(inqEndTrnSrno==null?"null":getInqEndTrnSrno());
		sb.append("\n");
		sb.append("\tetcRcvInqYn: ");
		sb.append(etcRcvInqYn==null?"null":getEtcRcvInqYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* inqDis */
		messageLen+= 9; /* metMngNo */
		messageLen+= 60; /* nxtMetMbhAlsNm */
		messageLen+= 6; /* inqBasYm */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqStaTrnSrno */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 8; /* inqEndTrnSrno */
		messageLen+= 1; /* etcRcvInqYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqDis");
		list.add("metMngNo");
		list.add("nxtMetMbhAlsNm");
		list.add("inqBasYm");
		list.add("metMbhSrno");
		list.add("inqStaDt");
		list.add("inqStaTrnSrno");
		list.add("inqEndDt");
		list.add("inqEndTrnSrno");
		list.add("etcRcvInqYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqDis", get("inqDis"));
		map.put("metMngNo", get("metMngNo"));
		map.put("nxtMetMbhAlsNm", get("nxtMetMbhAlsNm"));
		map.put("inqBasYm", get("inqBasYm"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqStaTrnSrno", get("inqStaTrnSrno"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("inqEndTrnSrno", get("inqEndTrnSrno"));
		map.put("etcRcvInqYn", get("etcRcvInqYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			return getInqDis();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -468170874:/* nxtMetMbhAlsNm */
			return getNxtMetMbhAlsNm();
		case 451698108:/* inqBasYm */
			return getInqBasYm();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case -1099755268:/* inqStaTrnSrno */
			return getInqStaTrnSrno();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case 544722401:/* inqEndTrnSrno */
			return getInqEndTrnSrno();
		case 1320566896:/* etcRcvInqYn */
			return getEtcRcvInqYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			setInqDis((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -468170874:/* nxtMetMbhAlsNm */
			setNxtMetMbhAlsNm((String)value);
			break;
		case 451698108:/* inqBasYm */
			setInqBasYm((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case -1099755268:/* inqStaTrnSrno */
			setInqStaTrnSrno((Integer)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case 544722401:/* inqEndTrnSrno */
			setInqEndTrnSrno((Integer)value);
			break;
		case 1320566896:/* etcRcvInqYn */
			setEtcRcvInqYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
