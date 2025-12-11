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
	"metMngNo", "tsReqMbhSrno", "tsReqDelYn", "metMbhDscd", "nxtTsReqDt", "nxtTsReqTm", "nxtTsReqMbhSrno", "nxtTsReqSrno", "inqCnt"
}, name="MetPbokTsReqInf001SelectAllTsReqCnt_DIDT")
@XmlRootElement(name="MetPbokTsReqInf001SelectAllTsReqCnt_DIDT")
@BxmCategory(logicalName="전체이체요청내역건수조회 입력", description="") 
public class MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1319178504L;
	
	
	
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
	 * 이체요청회원일련번호
	 */
	@ApiModelProperty(
		name = "tsReqMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="이체요청회원일련번호", align="right", fill="")
	private Integer tsReqMbhSrno= 0;
	
	
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
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 다음이체요청일자
	 */
	@ApiModelProperty(
		name = "nxtTsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtTsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="다음이체요청일자", align="left", fill="")
	private String nxtTsReqDt= "";
	
	
	/**
	 * 다음이체요청시간
	 */
	@ApiModelProperty(
		name = "nxtTsReqTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtTsReqTm")
	@BxmOmm_Field(length=6, decimal=0, description="다음이체요청시간", align="left", fill="")
	private String nxtTsReqTm= "";
	
	
	/**
	 * 다음이체요청회원일련번호
	 */
	@ApiModelProperty(
		name = "nxtTsReqMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("nxtTsReqMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="다음이체요청회원일련번호", align="right", fill="")
	private Integer nxtTsReqMbhSrno= 0;
	
	
	/**
	 * 다음이체요청일련번호
	 */
	@ApiModelProperty(
		name = "nxtTsReqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("nxtTsReqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="다음이체요청일련번호", align="right", fill="")
	private Integer nxtTsReqSrno= 0;
	
	
	/**
	 * 조회건수
	 */
	@ApiModelProperty(
		name = "inqCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqCnt")
	@BxmOmm_Field(length=2, decimal=0, description="조회건수", align="right", fill="")
	private Integer inqCnt= 0;
	
	
	
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
	private boolean isSet_tsReqMbhSrno= false;
	protected final boolean isSet_tsReqMbhSrno(){
		return this.isSet_tsReqMbhSrno;
	}
	private void setIsSet_tsReqMbhSrno(boolean value){
		this.isSet_tsReqMbhSrno= value;
	}
	/**
	 * 이체요청회원일련번호
	 */
	@XmlTransient
	public Integer getTsReqMbhSrno(){
		return this.tsReqMbhSrno;
	}
	
	/**
	 * 이체요청회원일련번호
	 * 
	 * @param tsReqMbhSrno 이체요청회원일련번호
	 */
	public void setTsReqMbhSrno(Integer tsReqMbhSrno){
		this.tsReqMbhSrno= tsReqMbhSrno;
		this.setIsSet_tsReqMbhSrno(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqDt= false;
	protected final boolean isSet_nxtTsReqDt(){
		return this.isSet_nxtTsReqDt;
	}
	private void setIsSet_nxtTsReqDt(boolean value){
		this.isSet_nxtTsReqDt= value;
	}
	/**
	 * 다음이체요청일자
	 */
	@XmlTransient
	public String getNxtTsReqDt(){
		return this.nxtTsReqDt;
	}
	
	/**
	 * 다음이체요청일자
	 * 
	 * @param nxtTsReqDt 다음이체요청일자
	 */
	public void setNxtTsReqDt(String nxtTsReqDt){
		this.nxtTsReqDt= nxtTsReqDt;
		this.setIsSet_nxtTsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqTm= false;
	protected final boolean isSet_nxtTsReqTm(){
		return this.isSet_nxtTsReqTm;
	}
	private void setIsSet_nxtTsReqTm(boolean value){
		this.isSet_nxtTsReqTm= value;
	}
	/**
	 * 다음이체요청시간
	 */
	@XmlTransient
	public String getNxtTsReqTm(){
		return this.nxtTsReqTm;
	}
	
	/**
	 * 다음이체요청시간
	 * 
	 * @param nxtTsReqTm 다음이체요청시간
	 */
	public void setNxtTsReqTm(String nxtTsReqTm){
		this.nxtTsReqTm= nxtTsReqTm;
		this.setIsSet_nxtTsReqTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqMbhSrno= false;
	protected final boolean isSet_nxtTsReqMbhSrno(){
		return this.isSet_nxtTsReqMbhSrno;
	}
	private void setIsSet_nxtTsReqMbhSrno(boolean value){
		this.isSet_nxtTsReqMbhSrno= value;
	}
	/**
	 * 다음이체요청회원일련번호
	 */
	@XmlTransient
	public Integer getNxtTsReqMbhSrno(){
		return this.nxtTsReqMbhSrno;
	}
	
	/**
	 * 다음이체요청회원일련번호
	 * 
	 * @param nxtTsReqMbhSrno 다음이체요청회원일련번호
	 */
	public void setNxtTsReqMbhSrno(Integer nxtTsReqMbhSrno){
		this.nxtTsReqMbhSrno= nxtTsReqMbhSrno;
		this.setIsSet_nxtTsReqMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqSrno= false;
	protected final boolean isSet_nxtTsReqSrno(){
		return this.isSet_nxtTsReqSrno;
	}
	private void setIsSet_nxtTsReqSrno(boolean value){
		this.isSet_nxtTsReqSrno= value;
	}
	/**
	 * 다음이체요청일련번호
	 */
	@XmlTransient
	public Integer getNxtTsReqSrno(){
		return this.nxtTsReqSrno;
	}
	
	/**
	 * 다음이체요청일련번호
	 * 
	 * @param nxtTsReqSrno 다음이체요청일련번호
	 */
	public void setNxtTsReqSrno(Integer nxtTsReqSrno){
		this.nxtTsReqSrno= nxtTsReqSrno;
		this.setIsSet_nxtTsReqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqCnt= false;
	protected final boolean isSet_inqCnt(){
		return this.isSet_inqCnt;
	}
	private void setIsSet_inqCnt(boolean value){
		this.isSet_inqCnt= value;
	}
	/**
	 * 조회건수
	 */
	@XmlTransient
	public Integer getInqCnt(){
		return this.inqCnt;
	}
	
	/**
	 * 조회건수
	 * 
	 * @param inqCnt 조회건수
	 */
	public void setInqCnt(Integer inqCnt){
		this.inqCnt= inqCnt;
		this.setIsSet_inqCnt(true);
	}
				
	@Override
	public MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT clone(){
		try{
			MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT object= (MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT)super.clone();
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
		result= prime * result + ((this.tsReqMbhSrno==null)?0:this.tsReqMbhSrno.hashCode());
		result= prime * result + ((this.tsReqDelYn==null)?0:this.tsReqDelYn.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.nxtTsReqDt==null)?0:this.nxtTsReqDt.hashCode());
		result= prime * result + ((this.nxtTsReqTm==null)?0:this.nxtTsReqTm.hashCode());
		result= prime * result + ((this.nxtTsReqMbhSrno==null)?0:this.nxtTsReqMbhSrno.hashCode());
		result= prime * result + ((this.nxtTsReqSrno==null)?0:this.nxtTsReqSrno.hashCode());
		result= prime * result + ((this.inqCnt==null)?0:this.inqCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT other= (MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _tsReqMbhSrno= getTsReqMbhSrno();
			Object __tsReqMbhSrno= other.getTsReqMbhSrno();
			if ( _tsReqMbhSrno== null ) { if ( __tsReqMbhSrno!= null ) return false; }
			else if ( !_tsReqMbhSrno.equals(__tsReqMbhSrno) ) return false;
		}
		{
			Object _tsReqDelYn= getTsReqDelYn();
			Object __tsReqDelYn= other.getTsReqDelYn();
			if ( _tsReqDelYn== null ) { if ( __tsReqDelYn!= null ) return false; }
			else if ( !_tsReqDelYn.equals(__tsReqDelYn) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _nxtTsReqDt= getNxtTsReqDt();
			Object __nxtTsReqDt= other.getNxtTsReqDt();
			if ( _nxtTsReqDt== null ) { if ( __nxtTsReqDt!= null ) return false; }
			else if ( !_nxtTsReqDt.equals(__nxtTsReqDt) ) return false;
		}
		{
			Object _nxtTsReqTm= getNxtTsReqTm();
			Object __nxtTsReqTm= other.getNxtTsReqTm();
			if ( _nxtTsReqTm== null ) { if ( __nxtTsReqTm!= null ) return false; }
			else if ( !_nxtTsReqTm.equals(__nxtTsReqTm) ) return false;
		}
		{
			Object _nxtTsReqMbhSrno= getNxtTsReqMbhSrno();
			Object __nxtTsReqMbhSrno= other.getNxtTsReqMbhSrno();
			if ( _nxtTsReqMbhSrno== null ) { if ( __nxtTsReqMbhSrno!= null ) return false; }
			else if ( !_nxtTsReqMbhSrno.equals(__nxtTsReqMbhSrno) ) return false;
		}
		{
			Object _nxtTsReqSrno= getNxtTsReqSrno();
			Object __nxtTsReqSrno= other.getNxtTsReqSrno();
			if ( _nxtTsReqSrno== null ) { if ( __nxtTsReqSrno!= null ) return false; }
			else if ( !_nxtTsReqSrno.equals(__nxtTsReqSrno) ) return false;
		}
		{
			Object _inqCnt= getInqCnt();
			Object __inqCnt= other.getInqCnt();
			if ( _inqCnt== null ) { if ( __inqCnt!= null ) return false; }
			else if ( !_inqCnt.equals(__inqCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttsReqMbhSrno: ");
		sb.append(tsReqMbhSrno==null?"null":getTsReqMbhSrno());
		sb.append("\n");
		sb.append("\ttsReqDelYn: ");
		sb.append(tsReqDelYn==null?"null":getTsReqDelYn());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tnxtTsReqDt: ");
		sb.append(nxtTsReqDt==null?"null":getNxtTsReqDt());
		sb.append("\n");
		sb.append("\tnxtTsReqTm: ");
		sb.append(nxtTsReqTm==null?"null":getNxtTsReqTm());
		sb.append("\n");
		sb.append("\tnxtTsReqMbhSrno: ");
		sb.append(nxtTsReqMbhSrno==null?"null":getNxtTsReqMbhSrno());
		sb.append("\n");
		sb.append("\tnxtTsReqSrno: ");
		sb.append(nxtTsReqSrno==null?"null":getNxtTsReqSrno());
		sb.append("\n");
		sb.append("\tinqCnt: ");
		sb.append(inqCnt==null?"null":getInqCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 7; /* tsReqMbhSrno */
		messageLen+= 1; /* tsReqDelYn */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 8; /* nxtTsReqDt */
		messageLen+= 6; /* nxtTsReqTm */
		messageLen+= 7; /* nxtTsReqMbhSrno */
		messageLen+= 5; /* nxtTsReqSrno */
		messageLen+= 2; /* inqCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("tsReqMbhSrno");
		list.add("tsReqDelYn");
		list.add("metMbhDscd");
		list.add("nxtTsReqDt");
		list.add("nxtTsReqTm");
		list.add("nxtTsReqMbhSrno");
		list.add("nxtTsReqSrno");
		list.add("inqCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("tsReqMbhSrno", get("tsReqMbhSrno"));
		map.put("tsReqDelYn", get("tsReqDelYn"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("nxtTsReqDt", get("nxtTsReqDt"));
		map.put("nxtTsReqTm", get("nxtTsReqTm"));
		map.put("nxtTsReqMbhSrno", get("nxtTsReqMbhSrno"));
		map.put("nxtTsReqSrno", get("nxtTsReqSrno"));
		map.put("inqCnt", get("inqCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1904094764:/* tsReqMbhSrno */
			return getTsReqMbhSrno();
		case 901531169:/* tsReqDelYn */
			return getTsReqDelYn();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case -1373185211:/* nxtTsReqDt */
			return getNxtTsReqDt();
		case -1373184722:/* nxtTsReqTm */
			return getNxtTsReqTm();
		case 669663966:/* nxtTsReqMbhSrno */
			return getNxtTsReqMbhSrno();
		case -1075579435:/* nxtTsReqSrno */
			return getNxtTsReqSrno();
		case -1183884835:/* inqCnt */
			return getInqCnt();
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
		case -1904094764:/* tsReqMbhSrno */
			setTsReqMbhSrno((Integer)value);
			break;
		case 901531169:/* tsReqDelYn */
			setTsReqDelYn((String)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case -1373185211:/* nxtTsReqDt */
			setNxtTsReqDt((String)value);
			break;
		case -1373184722:/* nxtTsReqTm */
			setNxtTsReqTm((String)value);
			break;
		case 669663966:/* nxtTsReqMbhSrno */
			setNxtTsReqMbhSrno((Integer)value);
			break;
		case -1075579435:/* nxtTsReqSrno */
			setNxtTsReqSrno((Integer)value);
			break;
		case -1183884835:/* inqCnt */
			setInqCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
