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
	"metMngNo", "tsReqDt", "tsReqMbhSrno", "tsReqSrno"
}, name="MPBTsReqInfDelGrid_IDT")
@XmlRootElement(name="MPBTsReqInfDelGrid_IDT")
@BxmCategory(logicalName="이체요청.정보.삭제.GRID.컨트롤러.입력.IO", description="") 
public class MPBTsReqInfDelGrid_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1102746907L;
	
	
	
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
				
	@Override
	public MPBTsReqInfDelGrid_IDT clone(){
		try{
			MPBTsReqInfDelGrid_IDT object= (MPBTsReqInfDelGrid_IDT)super.clone();
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
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBTsReqInfDelGrid_IDT other= (MPBTsReqInfDelGrid_IDT)obj;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBTsReqInfDelGrid_IDT.class.getName()).append(":\n");
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
		default:
			break;
		}
	}
	
}
