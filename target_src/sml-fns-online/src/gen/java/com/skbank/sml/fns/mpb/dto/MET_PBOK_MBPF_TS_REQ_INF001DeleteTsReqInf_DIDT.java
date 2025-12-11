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
	"metMngNo", "tsReqDt", "tsReqMbhSrno", "tsReqSrno", "lstDbChgId", "lstDbChgDtm"
}, name="MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT")
@XmlRootElement(name="MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT")
@BxmCategory(logicalName="이체요청내역정보삭제 입력 ", description="") 
public class MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2114920310L;
	
	
	
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
	 * 이체요청일자
	 */
	@ApiModelProperty(
		name = "tsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="이체요청일자", align="left", fill="")
	private String tsReqDt= "";
	
	
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
	 * 이체요청일련번호
	 */
	@ApiModelProperty(
		name = "tsReqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="이체요청일련번호", align="right", fill="")
	private Integer tsReqSrno= 0;
	
	
	/**
	 * 최종DB변경ID
	 */
	@ApiModelProperty(
		name = "lstDbChgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgId")
	@BxmOmm_Field(length=8, decimal=0, description="최종DB변경ID", align="left", fill="")
	private String lstDbChgId= "";
	
	
	/**
	 * 최종DB변경일시
	 */
	@ApiModelProperty(
		name = "lstDbChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="최종DB변경일시", align="left", fill="")
	private String lstDbChgDtm= "";
	
	
	
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
	private boolean isSet_tsReqDt= false;
	protected final boolean isSet_tsReqDt(){
		return this.isSet_tsReqDt;
	}
	private void setIsSet_tsReqDt(boolean value){
		this.isSet_tsReqDt= value;
	}
	/**
	 * 이체요청일자
	 */
	@XmlTransient
	public String getTsReqDt(){
		return this.tsReqDt;
	}
	
	/**
	 * 이체요청일자
	 * 
	 * @param tsReqDt 이체요청일자
	 */
	public void setTsReqDt(String tsReqDt){
		this.tsReqDt= tsReqDt;
		this.setIsSet_tsReqDt(true);
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
	private boolean isSet_tsReqSrno= false;
	protected final boolean isSet_tsReqSrno(){
		return this.isSet_tsReqSrno;
	}
	private void setIsSet_tsReqSrno(boolean value){
		this.isSet_tsReqSrno= value;
	}
	/**
	 * 이체요청일련번호
	 */
	@XmlTransient
	public Integer getTsReqSrno(){
		return this.tsReqSrno;
	}
	
	/**
	 * 이체요청일련번호
	 * 
	 * @param tsReqSrno 이체요청일련번호
	 */
	public void setTsReqSrno(Integer tsReqSrno){
		this.tsReqSrno= tsReqSrno;
		this.setIsSet_tsReqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgId= false;
	protected final boolean isSet_lstDbChgId(){
		return this.isSet_lstDbChgId;
	}
	private void setIsSet_lstDbChgId(boolean value){
		this.isSet_lstDbChgId= value;
	}
	/**
	 * 최종DB변경ID
	 */
	@XmlTransient
	public String getLstDbChgId(){
		return this.lstDbChgId;
	}
	
	/**
	 * 최종DB변경ID
	 * 
	 * @param lstDbChgId 최종DB변경ID
	 */
	public void setLstDbChgId(String lstDbChgId){
		this.lstDbChgId= lstDbChgId;
		this.setIsSet_lstDbChgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgDtm= false;
	protected final boolean isSet_lstDbChgDtm(){
		return this.isSet_lstDbChgDtm;
	}
	private void setIsSet_lstDbChgDtm(boolean value){
		this.isSet_lstDbChgDtm= value;
	}
	/**
	 * 최종DB변경일시
	 */
	@XmlTransient
	public String getLstDbChgDtm(){
		return this.lstDbChgDtm;
	}
	
	/**
	 * 최종DB변경일시
	 * 
	 * @param lstDbChgDtm 최종DB변경일시
	 */
	public void setLstDbChgDtm(String lstDbChgDtm){
		this.lstDbChgDtm= lstDbChgDtm;
		this.setIsSet_lstDbChgDtm(true);
	}
				
	@Override
	public MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT clone(){
		try{
			MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT object= (MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT)super.clone();
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
		result= prime * result + ((this.tsReqDt==null)?0:this.tsReqDt.hashCode());
		result= prime * result + ((this.tsReqMbhSrno==null)?0:this.tsReqMbhSrno.hashCode());
		result= prime * result + ((this.tsReqSrno==null)?0:this.tsReqSrno.hashCode());
		result= prime * result + ((this.lstDbChgId==null)?0:this.lstDbChgId.hashCode());
		result= prime * result + ((this.lstDbChgDtm==null)?0:this.lstDbChgDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT other= (MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _tsReqDt= getTsReqDt();
			Object __tsReqDt= other.getTsReqDt();
			if ( _tsReqDt== null ) { if ( __tsReqDt!= null ) return false; }
			else if ( !_tsReqDt.equals(__tsReqDt) ) return false;
		}
		{
			Object _tsReqMbhSrno= getTsReqMbhSrno();
			Object __tsReqMbhSrno= other.getTsReqMbhSrno();
			if ( _tsReqMbhSrno== null ) { if ( __tsReqMbhSrno!= null ) return false; }
			else if ( !_tsReqMbhSrno.equals(__tsReqMbhSrno) ) return false;
		}
		{
			Object _tsReqSrno= getTsReqSrno();
			Object __tsReqSrno= other.getTsReqSrno();
			if ( _tsReqSrno== null ) { if ( __tsReqSrno!= null ) return false; }
			else if ( !_tsReqSrno.equals(__tsReqSrno) ) return false;
		}
		{
			Object _lstDbChgId= getLstDbChgId();
			Object __lstDbChgId= other.getLstDbChgId();
			if ( _lstDbChgId== null ) { if ( __lstDbChgId!= null ) return false; }
			else if ( !_lstDbChgId.equals(__lstDbChgId) ) return false;
		}
		{
			Object _lstDbChgDtm= getLstDbChgDtm();
			Object __lstDbChgDtm= other.getLstDbChgDtm();
			if ( _lstDbChgDtm== null ) { if ( __lstDbChgDtm!= null ) return false; }
			else if ( !_lstDbChgDtm.equals(__lstDbChgDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttsReqDt: ");
		sb.append(tsReqDt==null?"null":getTsReqDt());
		sb.append("\n");
		sb.append("\ttsReqMbhSrno: ");
		sb.append(tsReqMbhSrno==null?"null":getTsReqMbhSrno());
		sb.append("\n");
		sb.append("\ttsReqSrno: ");
		sb.append(tsReqSrno==null?"null":getTsReqSrno());
		sb.append("\n");
		sb.append("\tlstDbChgId: ");
		sb.append(lstDbChgId==null?"null":getLstDbChgId());
		sb.append("\n");
		sb.append("\tlstDbChgDtm: ");
		sb.append(lstDbChgDtm==null?"null":getLstDbChgDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* tsReqDt */
		messageLen+= 7; /* tsReqMbhSrno */
		messageLen+= 5; /* tsReqSrno */
		messageLen+= 8; /* lstDbChgId */
		messageLen+= 20; /* lstDbChgDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("tsReqDt");
		list.add("tsReqMbhSrno");
		list.add("tsReqSrno");
		list.add("lstDbChgId");
		list.add("lstDbChgDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("tsReqDt", get("tsReqDt"));
		map.put("tsReqMbhSrno", get("tsReqMbhSrno"));
		map.put("tsReqSrno", get("tsReqSrno"));
		map.put("lstDbChgId", get("lstDbChgId"));
		map.put("lstDbChgDtm", get("lstDbChgDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1052554609:/* tsReqDt */
			return getTsReqDt();
		case -1904094764:/* tsReqMbhSrno */
			return getTsReqMbhSrno();
		case 2107751071:/* tsReqSrno */
			return getTsReqSrno();
		case 1946521330:/* lstDbChgId */
			return getLstDbChgId();
		case 212614886:/* lstDbChgDtm */
			return getLstDbChgDtm();
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
		case -1052554609:/* tsReqDt */
			setTsReqDt((String)value);
			break;
		case -1904094764:/* tsReqMbhSrno */
			setTsReqMbhSrno((Integer)value);
			break;
		case 2107751071:/* tsReqSrno */
			setTsReqSrno((Integer)value);
			break;
		case 1946521330:/* lstDbChgId */
			setLstDbChgId((String)value);
			break;
		case 212614886:/* lstDbChgDtm */
			setLstDbChgDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
