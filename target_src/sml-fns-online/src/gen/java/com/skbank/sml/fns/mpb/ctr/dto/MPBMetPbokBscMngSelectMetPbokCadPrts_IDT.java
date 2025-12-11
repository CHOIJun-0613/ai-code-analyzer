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
	"metMngNo", "metMbhSrno", "trnStaDt", "trnEndDt", "inqSortBscd"
}, name="MPBMetPbokBscMngSelectMetPbokCadPrts_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokCadPrts_IDT")
@BxmCategory(logicalName="모임통장.카드내역.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokCadPrts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -292566835L;
	
	
	
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
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
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
	 * 조회정렬기준코드
	 */
	@ApiModelProperty(
		name = "inqSortBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqSortBscd")
	@BxmOmm_Field(length=1, decimal=0, description="조회정렬기준코드", align="left", fill="")
	private String inqSortBscd= "";
	
	
	
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
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
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
	private boolean isSet_inqSortBscd= false;
	protected final boolean isSet_inqSortBscd(){
		return this.isSet_inqSortBscd;
	}
	private void setIsSet_inqSortBscd(boolean value){
		this.isSet_inqSortBscd= value;
	}
	/**
	 * 조회정렬기준코드
	 */
	@XmlTransient
	public String getInqSortBscd(){
		return this.inqSortBscd;
	}
	
	/**
	 * 조회정렬기준코드
	 * 
	 * @param inqSortBscd 조회정렬기준코드
	 */
	public void setInqSortBscd(String inqSortBscd){
		this.inqSortBscd= inqSortBscd;
		this.setIsSet_inqSortBscd(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokCadPrts_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokCadPrts_IDT object= (MPBMetPbokBscMngSelectMetPbokCadPrts_IDT)super.clone();
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
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.trnStaDt==null)?0:this.trnStaDt.hashCode());
		result= prime * result + ((this.trnEndDt==null)?0:this.trnEndDt.hashCode());
		result= prime * result + ((this.inqSortBscd==null)?0:this.inqSortBscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokCadPrts_IDT other= (MPBMetPbokBscMngSelectMetPbokCadPrts_IDT)obj;
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
			Object _inqSortBscd= getInqSortBscd();
			Object __inqSortBscd= other.getInqSortBscd();
			if ( _inqSortBscd== null ) { if ( __inqSortBscd!= null ) return false; }
			else if ( !_inqSortBscd.equals(__inqSortBscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokCadPrts_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\ttrnStaDt: ");
		sb.append(trnStaDt==null?"null":getTrnStaDt());
		sb.append("\n");
		sb.append("\ttrnEndDt: ");
		sb.append(trnEndDt==null?"null":getTrnEndDt());
		sb.append("\n");
		sb.append("\tinqSortBscd: ");
		sb.append(inqSortBscd==null?"null":getInqSortBscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 8; /* trnStaDt */
		messageLen+= 8; /* trnEndDt */
		messageLen+= 1; /* inqSortBscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("trnStaDt");
		list.add("trnEndDt");
		list.add("inqSortBscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("trnStaDt", get("trnStaDt"));
		map.put("trnEndDt", get("trnEndDt"));
		map.put("inqSortBscd", get("inqSortBscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 1628150528:/* trnStaDt */
			return getTrnStaDt();
		case 1615045371:/* trnEndDt */
			return getTrnEndDt();
		case -495910084:/* inqSortBscd */
			return getInqSortBscd();
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
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case 1628150528:/* trnStaDt */
			setTrnStaDt((String)value);
			break;
		case 1615045371:/* trnEndDt */
			setTrnEndDt((String)value);
			break;
		case -495910084:/* inqSortBscd */
			setInqSortBscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
