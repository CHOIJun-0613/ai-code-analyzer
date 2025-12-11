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
	"metMngNo", "trnDt", "trnSrno", "metTsReqDscd", "tsReqDelYn"
}, name="MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT")
@XmlRootElement(name="MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT")
@BxmCategory(logicalName="모임원 회비 돌려받기 정보 조회 입력 ", description="") 
public class MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2020043054L;
	
	
	
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
	 * 모임이체요청구분코드
	 */
	@ApiModelProperty(
		name = "metTsReqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTsReqDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임이체요청구분코드", align="left", fill="")
	private String metTsReqDscd= "";
	
	
	/**
	 * 이체요청삭제여부
	 */
	@ApiModelProperty(
		name = "tsReqDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="이체요청삭제여부", align="left", fill="")
	private String tsReqDelYn= "";
	
	
	
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
	private boolean isSet_metTsReqDscd= false;
	protected final boolean isSet_metTsReqDscd(){
		return this.isSet_metTsReqDscd;
	}
	private void setIsSet_metTsReqDscd(boolean value){
		this.isSet_metTsReqDscd= value;
	}
	/**
	 * 모임이체요청구분코드
	 */
	@XmlTransient
	public String getMetTsReqDscd(){
		return this.metTsReqDscd;
	}
	
	/**
	 * 모임이체요청구분코드
	 * 
	 * @param metTsReqDscd 모임이체요청구분코드
	 */
	public void setMetTsReqDscd(String metTsReqDscd){
		this.metTsReqDscd= metTsReqDscd;
		this.setIsSet_metTsReqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqDelYn= false;
	protected final boolean isSet_tsReqDelYn(){
		return this.isSet_tsReqDelYn;
	}
	private void setIsSet_tsReqDelYn(boolean value){
		this.isSet_tsReqDelYn= value;
	}
	/**
	 * 이체요청삭제여부
	 */
	@XmlTransient
	public String getTsReqDelYn(){
		return this.tsReqDelYn;
	}
	
	/**
	 * 이체요청삭제여부
	 * 
	 * @param tsReqDelYn 이체요청삭제여부
	 */
	public void setTsReqDelYn(String tsReqDelYn){
		this.tsReqDelYn= tsReqDelYn;
		this.setIsSet_tsReqDelYn(true);
	}
				
	@Override
	public MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT clone(){
		try{
			MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT object= (MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT)super.clone();
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
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.metTsReqDscd==null)?0:this.metTsReqDscd.hashCode());
		result= prime * result + ((this.tsReqDelYn==null)?0:this.tsReqDelYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT other= (MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT)obj;
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
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _metTsReqDscd= getMetTsReqDscd();
			Object __metTsReqDscd= other.getMetTsReqDscd();
			if ( _metTsReqDscd== null ) { if ( __metTsReqDscd!= null ) return false; }
			else if ( !_metTsReqDscd.equals(__metTsReqDscd) ) return false;
		}
		{
			Object _tsReqDelYn= getTsReqDelYn();
			Object __tsReqDelYn= other.getTsReqDelYn();
			if ( _tsReqDelYn== null ) { if ( __tsReqDelYn!= null ) return false; }
			else if ( !_tsReqDelYn.equals(__tsReqDelYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tmetTsReqDscd: ");
		sb.append(metTsReqDscd==null?"null":getMetTsReqDscd());
		sb.append("\n");
		sb.append("\ttsReqDelYn: ");
		sb.append(tsReqDelYn==null?"null":getTsReqDelYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnSrno */
		messageLen+= 2; /* metTsReqDscd */
		messageLen+= 1; /* tsReqDelYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("trnDt");
		list.add("trnSrno");
		list.add("metTsReqDscd");
		list.add("tsReqDelYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("metTsReqDscd", get("metTsReqDscd"));
		map.put("tsReqDelYn", get("tsReqDelYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -1422770957:/* metTsReqDscd */
			return getMetTsReqDscd();
		case 901531169:/* tsReqDelYn */
			return getTsReqDelYn();
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
			setTrnDt((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case -1422770957:/* metTsReqDscd */
			setMetTsReqDscd((String)value);
			break;
		case 901531169:/* tsReqDelYn */
			setTsReqDelYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
