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
	"metMngNo", "metNm", "ctRppeNm", "ctMetMbhSrno", "chgRppeNm", "chgMetMbhSrno", "chgScdDt"
}, name="MetPbokRprsChgInq_DODT")
@XmlRootElement(name="MetPbokRprsChgInq_DODT")
@BxmCategory(logicalName="모임통장.대표.변경.조회.DBM.출력.IO", description="") 
public class MetPbokRprsChgInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -694818219L;
	
	
	
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
	 * 모임명
	 */
	@ApiModelProperty(
		name = "metNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임명", align="left", fill="")
	private String metNm= "";
	
	
	/**
	 * 현재대표자명
	 */
	@ApiModelProperty(
		name = "ctRppeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctRppeNm")
	@BxmOmm_Field(length=30, decimal=0, description="현재대표자명", align="left", fill="")
	private String ctRppeNm= "";
	
	
	/**
	 * 현재모임회원일련번호
	 */
	@ApiModelProperty(
		name = "ctMetMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctMetMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="현재모임회원일련번호", align="left", fill="")
	private String ctMetMbhSrno= "";
	
	
	/**
	 * 변경대표자명
	 */
	@ApiModelProperty(
		name = "chgRppeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgRppeNm")
	@BxmOmm_Field(length=30, decimal=0, description="변경대표자명", align="left", fill="")
	private String chgRppeNm= "";
	
	
	/**
	 * 변경모임회원일련번호
	 */
	@ApiModelProperty(
		name = "chgMetMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgMetMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="변경모임회원일련번호", align="left", fill="")
	private String chgMetMbhSrno= "";
	
	
	/**
	 * 변경예정일자
	 */
	@ApiModelProperty(
		name = "chgScdDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgScdDt")
	@BxmOmm_Field(length=8, decimal=0, description="변경예정일자", align="left", fill="")
	private String chgScdDt= "";
	
	
	
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
	private boolean isSet_metNm= false;
	protected final boolean isSet_metNm(){
		return this.isSet_metNm;
	}
	private void setIsSet_metNm(boolean value){
		this.isSet_metNm= value;
	}
	/**
	 * 모임명
	 */
	@XmlTransient
	public String getMetNm(){
		return this.metNm;
	}
	
	/**
	 * 모임명
	 * 
	 * @param metNm 모임명
	 */
	public void setMetNm(String metNm){
		this.metNm= metNm;
		this.setIsSet_metNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctRppeNm= false;
	protected final boolean isSet_ctRppeNm(){
		return this.isSet_ctRppeNm;
	}
	private void setIsSet_ctRppeNm(boolean value){
		this.isSet_ctRppeNm= value;
	}
	/**
	 * 현재대표자명
	 */
	@XmlTransient
	public String getCtRppeNm(){
		return this.ctRppeNm;
	}
	
	/**
	 * 현재대표자명
	 * 
	 * @param ctRppeNm 현재대표자명
	 */
	public void setCtRppeNm(String ctRppeNm){
		this.ctRppeNm= ctRppeNm;
		this.setIsSet_ctRppeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctMetMbhSrno= false;
	protected final boolean isSet_ctMetMbhSrno(){
		return this.isSet_ctMetMbhSrno;
	}
	private void setIsSet_ctMetMbhSrno(boolean value){
		this.isSet_ctMetMbhSrno= value;
	}
	/**
	 * 현재모임회원일련번호
	 */
	@XmlTransient
	public String getCtMetMbhSrno(){
		return this.ctMetMbhSrno;
	}
	
	/**
	 * 현재모임회원일련번호
	 * 
	 * @param ctMetMbhSrno 현재모임회원일련번호
	 */
	public void setCtMetMbhSrno(String ctMetMbhSrno){
		this.ctMetMbhSrno= ctMetMbhSrno;
		this.setIsSet_ctMetMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgRppeNm= false;
	protected final boolean isSet_chgRppeNm(){
		return this.isSet_chgRppeNm;
	}
	private void setIsSet_chgRppeNm(boolean value){
		this.isSet_chgRppeNm= value;
	}
	/**
	 * 변경대표자명
	 */
	@XmlTransient
	public String getChgRppeNm(){
		return this.chgRppeNm;
	}
	
	/**
	 * 변경대표자명
	 * 
	 * @param chgRppeNm 변경대표자명
	 */
	public void setChgRppeNm(String chgRppeNm){
		this.chgRppeNm= chgRppeNm;
		this.setIsSet_chgRppeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgMetMbhSrno= false;
	protected final boolean isSet_chgMetMbhSrno(){
		return this.isSet_chgMetMbhSrno;
	}
	private void setIsSet_chgMetMbhSrno(boolean value){
		this.isSet_chgMetMbhSrno= value;
	}
	/**
	 * 변경모임회원일련번호
	 */
	@XmlTransient
	public String getChgMetMbhSrno(){
		return this.chgMetMbhSrno;
	}
	
	/**
	 * 변경모임회원일련번호
	 * 
	 * @param chgMetMbhSrno 변경모임회원일련번호
	 */
	public void setChgMetMbhSrno(String chgMetMbhSrno){
		this.chgMetMbhSrno= chgMetMbhSrno;
		this.setIsSet_chgMetMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgScdDt= false;
	protected final boolean isSet_chgScdDt(){
		return this.isSet_chgScdDt;
	}
	private void setIsSet_chgScdDt(boolean value){
		this.isSet_chgScdDt= value;
	}
	/**
	 * 변경예정일자
	 */
	@XmlTransient
	public String getChgScdDt(){
		return this.chgScdDt;
	}
	
	/**
	 * 변경예정일자
	 * 
	 * @param chgScdDt 변경예정일자
	 */
	public void setChgScdDt(String chgScdDt){
		this.chgScdDt= chgScdDt;
		this.setIsSet_chgScdDt(true);
	}
				
	@Override
	public MetPbokRprsChgInq_DODT clone(){
		try{
			MetPbokRprsChgInq_DODT object= (MetPbokRprsChgInq_DODT)super.clone();
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
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.ctRppeNm==null)?0:this.ctRppeNm.hashCode());
		result= prime * result + ((this.ctMetMbhSrno==null)?0:this.ctMetMbhSrno.hashCode());
		result= prime * result + ((this.chgRppeNm==null)?0:this.chgRppeNm.hashCode());
		result= prime * result + ((this.chgMetMbhSrno==null)?0:this.chgMetMbhSrno.hashCode());
		result= prime * result + ((this.chgScdDt==null)?0:this.chgScdDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgInq_DODT other= (MetPbokRprsChgInq_DODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _ctRppeNm= getCtRppeNm();
			Object __ctRppeNm= other.getCtRppeNm();
			if ( _ctRppeNm== null ) { if ( __ctRppeNm!= null ) return false; }
			else if ( !_ctRppeNm.equals(__ctRppeNm) ) return false;
		}
		{
			Object _ctMetMbhSrno= getCtMetMbhSrno();
			Object __ctMetMbhSrno= other.getCtMetMbhSrno();
			if ( _ctMetMbhSrno== null ) { if ( __ctMetMbhSrno!= null ) return false; }
			else if ( !_ctMetMbhSrno.equals(__ctMetMbhSrno) ) return false;
		}
		{
			Object _chgRppeNm= getChgRppeNm();
			Object __chgRppeNm= other.getChgRppeNm();
			if ( _chgRppeNm== null ) { if ( __chgRppeNm!= null ) return false; }
			else if ( !_chgRppeNm.equals(__chgRppeNm) ) return false;
		}
		{
			Object _chgMetMbhSrno= getChgMetMbhSrno();
			Object __chgMetMbhSrno= other.getChgMetMbhSrno();
			if ( _chgMetMbhSrno== null ) { if ( __chgMetMbhSrno!= null ) return false; }
			else if ( !_chgMetMbhSrno.equals(__chgMetMbhSrno) ) return false;
		}
		{
			Object _chgScdDt= getChgScdDt();
			Object __chgScdDt= other.getChgScdDt();
			if ( _chgScdDt== null ) { if ( __chgScdDt!= null ) return false; }
			else if ( !_chgScdDt.equals(__chgScdDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgInq_DODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\tctRppeNm: ");
		sb.append(ctRppeNm==null?"null":getCtRppeNm());
		sb.append("\n");
		sb.append("\tctMetMbhSrno: ");
		sb.append(ctMetMbhSrno==null?"null":getCtMetMbhSrno());
		sb.append("\n");
		sb.append("\tchgRppeNm: ");
		sb.append(chgRppeNm==null?"null":getChgRppeNm());
		sb.append("\n");
		sb.append("\tchgMetMbhSrno: ");
		sb.append(chgMetMbhSrno==null?"null":getChgMetMbhSrno());
		sb.append("\n");
		sb.append("\tchgScdDt: ");
		sb.append(chgScdDt==null?"null":getChgScdDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 100; /* metNm */
		messageLen+= 30; /* ctRppeNm */
		messageLen+= 30; /* ctMetMbhSrno */
		messageLen+= 30; /* chgRppeNm */
		messageLen+= 30; /* chgMetMbhSrno */
		messageLen+= 8; /* chgScdDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metNm");
		list.add("ctRppeNm");
		list.add("ctMetMbhSrno");
		list.add("chgRppeNm");
		list.add("chgMetMbhSrno");
		list.add("chgScdDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metNm", get("metNm"));
		map.put("ctRppeNm", get("ctRppeNm"));
		map.put("ctMetMbhSrno", get("ctMetMbhSrno"));
		map.put("chgRppeNm", get("chgRppeNm"));
		map.put("chgMetMbhSrno", get("chgMetMbhSrno"));
		map.put("chgScdDt", get("chgScdDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 103786683:/* metNm */
			return getMetNm();
		case -1229763165:/* ctRppeNm */
			return getCtRppeNm();
		case 315546184:/* ctMetMbhSrno */
			return getCtMetMbhSrno();
		case 1692342548:/* chgRppeNm */
			return getChgRppeNm();
		case -430602951:/* chgMetMbhSrno */
			return getChgMetMbhSrno();
		case 1579136066:/* chgScdDt */
			return getChgScdDt();
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
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case -1229763165:/* ctRppeNm */
			setCtRppeNm((String)value);
			break;
		case 315546184:/* ctMetMbhSrno */
			setCtMetMbhSrno((String)value);
			break;
		case 1692342548:/* chgRppeNm */
			setChgRppeNm((String)value);
			break;
		case -430602951:/* chgMetMbhSrno */
			setChgMetMbhSrno((String)value);
			break;
		case 1579136066:/* chgScdDt */
			setChgScdDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
