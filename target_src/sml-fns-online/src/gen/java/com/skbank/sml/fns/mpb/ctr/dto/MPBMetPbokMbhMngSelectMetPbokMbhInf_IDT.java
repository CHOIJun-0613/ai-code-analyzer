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
	"inqDis", "metMngNo", "metMbhSrno", "nxtMetMbhAlsNm", "ctinInqYn"
}, name="MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT")
@XmlRootElement(name="MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT")
@BxmCategory(logicalName="모임통장.회원.정보.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1905965763L;
	
	
	
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
	 * 연속조회여부
	 */
	@ApiModelProperty(
		name = "ctinInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctinInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="연속조회여부", align="left", fill="")
	private String ctinInqYn= "";
	
	
	
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
	private boolean isSet_ctinInqYn= false;
	protected final boolean isSet_ctinInqYn(){
		return this.isSet_ctinInqYn;
	}
	private void setIsSet_ctinInqYn(boolean value){
		this.isSet_ctinInqYn= value;
	}
	/**
	 * 연속조회여부
	 */
	@XmlTransient
	public String getCtinInqYn(){
		return this.ctinInqYn;
	}
	
	/**
	 * 연속조회여부
	 * 
	 * @param ctinInqYn 연속조회여부
	 */
	public void setCtinInqYn(String ctinInqYn){
		this.ctinInqYn= ctinInqYn;
		this.setIsSet_ctinInqYn(true);
	}
				
	@Override
	public MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT clone(){
		try{
			MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT object= (MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT)super.clone();
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
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.nxtMetMbhAlsNm==null)?0:this.nxtMetMbhAlsNm.hashCode());
		result= prime * result + ((this.ctinInqYn==null)?0:this.ctinInqYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT other= (MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT)obj;
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
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _nxtMetMbhAlsNm= getNxtMetMbhAlsNm();
			Object __nxtMetMbhAlsNm= other.getNxtMetMbhAlsNm();
			if ( _nxtMetMbhAlsNm== null ) { if ( __nxtMetMbhAlsNm!= null ) return false; }
			else if ( !_nxtMetMbhAlsNm.equals(__nxtMetMbhAlsNm) ) return false;
		}
		{
			Object _ctinInqYn= getCtinInqYn();
			Object __ctinInqYn= other.getCtinInqYn();
			if ( _ctinInqYn== null ) { if ( __ctinInqYn!= null ) return false; }
			else if ( !_ctinInqYn.equals(__ctinInqYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT.class.getName()).append(":\n");
		sb.append("\tinqDis: ");
		sb.append(inqDis==null?"null":getInqDis());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tnxtMetMbhAlsNm: ");
		sb.append(nxtMetMbhAlsNm==null?"null":getNxtMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tctinInqYn: ");
		sb.append(ctinInqYn==null?"null":getCtinInqYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* inqDis */
		messageLen+= 9; /* metMngNo */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 60; /* nxtMetMbhAlsNm */
		messageLen+= 1; /* ctinInqYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqDis");
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("nxtMetMbhAlsNm");
		list.add("ctinInqYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqDis", get("inqDis"));
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("nxtMetMbhAlsNm", get("nxtMetMbhAlsNm"));
		map.put("ctinInqYn", get("ctinInqYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			return getInqDis();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -468170874:/* nxtMetMbhAlsNm */
			return getNxtMetMbhAlsNm();
		case -623178645:/* ctinInqYn */
			return getCtinInqYn();
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
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case -468170874:/* nxtMetMbhAlsNm */
			setNxtMetMbhAlsNm((String)value);
			break;
		case -623178645:/* ctinInqYn */
			setCtinInqYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
