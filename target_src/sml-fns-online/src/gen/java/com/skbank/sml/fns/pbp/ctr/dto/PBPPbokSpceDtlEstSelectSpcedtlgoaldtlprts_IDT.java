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
	"rprsAcno", "spceSrno", "savGoalStaDt", "savGoalEndDt", "cnsmAmBsCd"
}, name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT")
@BxmCategory(logicalName="공간.상세.목표.상세.내역.조회.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 18889660L;
	
	
	
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
	 * 저축목표시작일자
	 */
	@ApiModelProperty(
		name = "savGoalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표시작일자", align="left", fill="")
	private String savGoalStaDt= "";
	
	
	/**
	 * 저축목표종료일자
	 */
	@ApiModelProperty(
		name = "savGoalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표종료일자", align="left", fill="")
	private String savGoalEndDt= "";
	
	
	/**
	 * 소비금액기준코드
	 */
	@ApiModelProperty(
		name = "cnsmAmBsCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBsCd")
	@BxmOmm_Field(length=1, decimal=0, description="소비금액기준코드", align="left", fill="")
	private String cnsmAmBsCd= "";
	
	
	
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
	private boolean isSet_savGoalStaDt= false;
	protected final boolean isSet_savGoalStaDt(){
		return this.isSet_savGoalStaDt;
	}
	private void setIsSet_savGoalStaDt(boolean value){
		this.isSet_savGoalStaDt= value;
	}
	/**
	 * 저축목표시작일자
	 */
	@XmlTransient
	public String getSavGoalStaDt(){
		return this.savGoalStaDt;
	}
	
	/**
	 * 저축목표시작일자
	 * 
	 * @param savGoalStaDt 저축목표시작일자
	 */
	public void setSavGoalStaDt(String savGoalStaDt){
		this.savGoalStaDt= savGoalStaDt;
		this.setIsSet_savGoalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEndDt= false;
	protected final boolean isSet_savGoalEndDt(){
		return this.isSet_savGoalEndDt;
	}
	private void setIsSet_savGoalEndDt(boolean value){
		this.isSet_savGoalEndDt= value;
	}
	/**
	 * 저축목표종료일자
	 */
	@XmlTransient
	public String getSavGoalEndDt(){
		return this.savGoalEndDt;
	}
	
	/**
	 * 저축목표종료일자
	 * 
	 * @param savGoalEndDt 저축목표종료일자
	 */
	public void setSavGoalEndDt(String savGoalEndDt){
		this.savGoalEndDt= savGoalEndDt;
		this.setIsSet_savGoalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBsCd= false;
	protected final boolean isSet_cnsmAmBsCd(){
		return this.isSet_cnsmAmBsCd;
	}
	private void setIsSet_cnsmAmBsCd(boolean value){
		this.isSet_cnsmAmBsCd= value;
	}
	/**
	 * 소비금액기준코드
	 */
	@XmlTransient
	public String getCnsmAmBsCd(){
		return this.cnsmAmBsCd;
	}
	
	/**
	 * 소비금액기준코드
	 * 
	 * @param cnsmAmBsCd 소비금액기준코드
	 */
	public void setCnsmAmBsCd(String cnsmAmBsCd){
		this.cnsmAmBsCd= cnsmAmBsCd;
		this.setIsSet_cnsmAmBsCd(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT clone(){
		try{
			PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT object= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT)super.clone();
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
		
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.savGoalStaDt==null)?0:this.savGoalStaDt.hashCode());
		result= prime * result + ((this.savGoalEndDt==null)?0:this.savGoalEndDt.hashCode());
		result= prime * result + ((this.cnsmAmBsCd==null)?0:this.cnsmAmBsCd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT other= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT)obj;
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
			Object _savGoalStaDt= getSavGoalStaDt();
			Object __savGoalStaDt= other.getSavGoalStaDt();
			if ( _savGoalStaDt== null ) { if ( __savGoalStaDt!= null ) return false; }
			else if ( !_savGoalStaDt.equals(__savGoalStaDt) ) return false;
		}
		{
			Object _savGoalEndDt= getSavGoalEndDt();
			Object __savGoalEndDt= other.getSavGoalEndDt();
			if ( _savGoalEndDt== null ) { if ( __savGoalEndDt!= null ) return false; }
			else if ( !_savGoalEndDt.equals(__savGoalEndDt) ) return false;
		}
		{
			Object _cnsmAmBsCd= getCnsmAmBsCd();
			Object __cnsmAmBsCd= other.getCnsmAmBsCd();
			if ( _cnsmAmBsCd== null ) { if ( __cnsmAmBsCd!= null ) return false; }
			else if ( !_cnsmAmBsCd.equals(__cnsmAmBsCd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT.class.getName()).append(":\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tsavGoalStaDt: ");
		sb.append(savGoalStaDt==null?"null":getSavGoalStaDt());
		sb.append("\n");
		sb.append("\tsavGoalEndDt: ");
		sb.append(savGoalEndDt==null?"null":getSavGoalEndDt());
		sb.append("\n");
		sb.append("\tcnsmAmBsCd: ");
		sb.append(cnsmAmBsCd==null?"null":getCnsmAmBsCd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* rprsAcno */
		messageLen+= 10; /* spceSrno */
		messageLen+= 8; /* savGoalStaDt */
		messageLen+= 8; /* savGoalEndDt */
		messageLen+= 1; /* cnsmAmBsCd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("savGoalStaDt");
		list.add("savGoalEndDt");
		list.add("cnsmAmBsCd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("savGoalStaDt", get("savGoalStaDt"));
		map.put("savGoalEndDt", get("savGoalEndDt"));
		map.put("cnsmAmBsCd", get("cnsmAmBsCd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 1799097461:/* savGoalStaDt */
			return getSavGoalStaDt();
		case 1785992304:/* savGoalEndDt */
			return getSavGoalEndDt();
		case -754479293:/* cnsmAmBsCd */
			return getCnsmAmBsCd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case 1799097461:/* savGoalStaDt */
			setSavGoalStaDt((String)value);
			break;
		case 1785992304:/* savGoalEndDt */
			setSavGoalEndDt((String)value);
			break;
		case -754479293:/* cnsmAmBsCd */
			setCnsmAmBsCd((String)value);
			break;
		default:
			break;
		}
	}
	
}
