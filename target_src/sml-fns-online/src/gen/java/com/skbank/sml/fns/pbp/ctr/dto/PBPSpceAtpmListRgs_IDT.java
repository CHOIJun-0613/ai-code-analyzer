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
 * 통장쪼개기.자동납부.목록.등록 input
 */
@XmlType(propOrder={
	"atpmEltNo", "atpmAcno", "atpmRgsDt", "atpmGiroNo", "atpmCctnSpceSrno"
}, name="PBPSpceAtpmListRgs_IDT")
@XmlRootElement(name="PBPSpceAtpmListRgs_IDT")
@BxmCategory(logicalName="통장쪼개기.자동납부.목록.등록.컨트롤러.입력.IO", description="통장쪼개기.자동납부.목록.등록 input") 
public class PBPSpceAtpmListRgs_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 668021097L;
	
	
	
	/**
	 * 자동납부전자번호
	 */
	@ApiModelProperty(
		name = "atpmEltNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmEltNo")
	@BxmOmm_Field(length=9, decimal=0, description="자동납부전자번호", align="left", fill="")
	private String atpmEltNo= "";
	
	
	/**
	 * 자동납부계좌번호
	 */
	@ApiModelProperty(
		name = "atpmAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동납부계좌번호", align="left", fill="")
	private String atpmAcno= "";
	
	
	/**
	 * 자동납부등록일자
	 */
	@ApiModelProperty(
		name = "atpmRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동납부등록일자", align="left", fill="")
	private String atpmRgsDt= "";
	
	
	/**
	 * 자동납부지로번호
	 */
	@ApiModelProperty(
		name = "atpmGiroNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmGiroNo")
	@BxmOmm_Field(length=10, decimal=0, description="자동납부지로번호", align="left", fill="")
	private String atpmGiroNo= "";
	
	
	/**
	 * 자동납부연결공간일련번호
	 */
	@ApiModelProperty(
		name = "atpmCctnSpceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmCctnSpceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="자동납부연결공간일련번호", align="left", fill="")
	private String atpmCctnSpceSrno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmEltNo= false;
	protected final boolean isSet_atpmEltNo(){
		return this.isSet_atpmEltNo;
	}
	private void setIsSet_atpmEltNo(boolean value){
		this.isSet_atpmEltNo= value;
	}
	/**
	 * 자동납부전자번호
	 */
	@XmlTransient
	public String getAtpmEltNo(){
		return this.atpmEltNo;
	}
	
	/**
	 * 자동납부전자번호
	 * 
	 * @param atpmEltNo 자동납부전자번호
	 */
	public void setAtpmEltNo(String atpmEltNo){
		this.atpmEltNo= atpmEltNo;
		this.setIsSet_atpmEltNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmAcno= false;
	protected final boolean isSet_atpmAcno(){
		return this.isSet_atpmAcno;
	}
	private void setIsSet_atpmAcno(boolean value){
		this.isSet_atpmAcno= value;
	}
	/**
	 * 자동납부계좌번호
	 */
	@XmlTransient
	public String getAtpmAcno(){
		return this.atpmAcno;
	}
	
	/**
	 * 자동납부계좌번호
	 * 
	 * @param atpmAcno 자동납부계좌번호
	 */
	public void setAtpmAcno(String atpmAcno){
		this.atpmAcno= atpmAcno;
		this.setIsSet_atpmAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmRgsDt= false;
	protected final boolean isSet_atpmRgsDt(){
		return this.isSet_atpmRgsDt;
	}
	private void setIsSet_atpmRgsDt(boolean value){
		this.isSet_atpmRgsDt= value;
	}
	/**
	 * 자동납부등록일자
	 */
	@XmlTransient
	public String getAtpmRgsDt(){
		return this.atpmRgsDt;
	}
	
	/**
	 * 자동납부등록일자
	 * 
	 * @param atpmRgsDt 자동납부등록일자
	 */
	public void setAtpmRgsDt(String atpmRgsDt){
		this.atpmRgsDt= atpmRgsDt;
		this.setIsSet_atpmRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmGiroNo= false;
	protected final boolean isSet_atpmGiroNo(){
		return this.isSet_atpmGiroNo;
	}
	private void setIsSet_atpmGiroNo(boolean value){
		this.isSet_atpmGiroNo= value;
	}
	/**
	 * 자동납부지로번호
	 */
	@XmlTransient
	public String getAtpmGiroNo(){
		return this.atpmGiroNo;
	}
	
	/**
	 * 자동납부지로번호
	 * 
	 * @param atpmGiroNo 자동납부지로번호
	 */
	public void setAtpmGiroNo(String atpmGiroNo){
		this.atpmGiroNo= atpmGiroNo;
		this.setIsSet_atpmGiroNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmCctnSpceSrno= false;
	protected final boolean isSet_atpmCctnSpceSrno(){
		return this.isSet_atpmCctnSpceSrno;
	}
	private void setIsSet_atpmCctnSpceSrno(boolean value){
		this.isSet_atpmCctnSpceSrno= value;
	}
	/**
	 * 자동납부연결공간일련번호
	 */
	@XmlTransient
	public String getAtpmCctnSpceSrno(){
		return this.atpmCctnSpceSrno;
	}
	
	/**
	 * 자동납부연결공간일련번호
	 * 
	 * @param atpmCctnSpceSrno 자동납부연결공간일련번호
	 */
	public void setAtpmCctnSpceSrno(String atpmCctnSpceSrno){
		this.atpmCctnSpceSrno= atpmCctnSpceSrno;
		this.setIsSet_atpmCctnSpceSrno(true);
	}
				
	@Override
	public PBPSpceAtpmListRgs_IDT clone(){
		try{
			PBPSpceAtpmListRgs_IDT object= (PBPSpceAtpmListRgs_IDT)super.clone();
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
		
		result= prime * result + ((this.atpmEltNo==null)?0:this.atpmEltNo.hashCode());
		result= prime * result + ((this.atpmAcno==null)?0:this.atpmAcno.hashCode());
		result= prime * result + ((this.atpmRgsDt==null)?0:this.atpmRgsDt.hashCode());
		result= prime * result + ((this.atpmGiroNo==null)?0:this.atpmGiroNo.hashCode());
		result= prime * result + ((this.atpmCctnSpceSrno==null)?0:this.atpmCctnSpceSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPSpceAtpmListRgs_IDT other= (PBPSpceAtpmListRgs_IDT)obj;
		{
			Object _atpmEltNo= getAtpmEltNo();
			Object __atpmEltNo= other.getAtpmEltNo();
			if ( _atpmEltNo== null ) { if ( __atpmEltNo!= null ) return false; }
			else if ( !_atpmEltNo.equals(__atpmEltNo) ) return false;
		}
		{
			Object _atpmAcno= getAtpmAcno();
			Object __atpmAcno= other.getAtpmAcno();
			if ( _atpmAcno== null ) { if ( __atpmAcno!= null ) return false; }
			else if ( !_atpmAcno.equals(__atpmAcno) ) return false;
		}
		{
			Object _atpmRgsDt= getAtpmRgsDt();
			Object __atpmRgsDt= other.getAtpmRgsDt();
			if ( _atpmRgsDt== null ) { if ( __atpmRgsDt!= null ) return false; }
			else if ( !_atpmRgsDt.equals(__atpmRgsDt) ) return false;
		}
		{
			Object _atpmGiroNo= getAtpmGiroNo();
			Object __atpmGiroNo= other.getAtpmGiroNo();
			if ( _atpmGiroNo== null ) { if ( __atpmGiroNo!= null ) return false; }
			else if ( !_atpmGiroNo.equals(__atpmGiroNo) ) return false;
		}
		{
			Object _atpmCctnSpceSrno= getAtpmCctnSpceSrno();
			Object __atpmCctnSpceSrno= other.getAtpmCctnSpceSrno();
			if ( _atpmCctnSpceSrno== null ) { if ( __atpmCctnSpceSrno!= null ) return false; }
			else if ( !_atpmCctnSpceSrno.equals(__atpmCctnSpceSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPSpceAtpmListRgs_IDT.class.getName()).append(":\n");
		sb.append("\tatpmEltNo: ");
		sb.append(atpmEltNo==null?"null":getAtpmEltNo());
		sb.append("\n");
		sb.append("\tatpmAcno: ");
		sb.append(atpmAcno==null?"null":getAtpmAcno());
		sb.append("\n");
		sb.append("\tatpmRgsDt: ");
		sb.append(atpmRgsDt==null?"null":getAtpmRgsDt());
		sb.append("\n");
		sb.append("\tatpmGiroNo: ");
		sb.append(atpmGiroNo==null?"null":getAtpmGiroNo());
		sb.append("\n");
		sb.append("\tatpmCctnSpceSrno: ");
		sb.append(atpmCctnSpceSrno==null?"null":getAtpmCctnSpceSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* atpmEltNo */
		messageLen+= 20; /* atpmAcno */
		messageLen+= 8; /* atpmRgsDt */
		messageLen+= 10; /* atpmGiroNo */
		messageLen+= 10; /* atpmCctnSpceSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atpmEltNo");
		list.add("atpmAcno");
		list.add("atpmRgsDt");
		list.add("atpmGiroNo");
		list.add("atpmCctnSpceSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atpmEltNo", get("atpmEltNo"));
		map.put("atpmAcno", get("atpmAcno"));
		map.put("atpmRgsDt", get("atpmRgsDt"));
		map.put("atpmGiroNo", get("atpmGiroNo"));
		map.put("atpmCctnSpceSrno", get("atpmCctnSpceSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 581941182:/* atpmEltNo */
			return getAtpmEltNo();
		case 434286323:/* atpmAcno */
			return getAtpmAcno();
		case 593796734:/* atpmRgsDt */
			return getAtpmRgsDt();
		case 914766416:/* atpmGiroNo */
			return getAtpmGiroNo();
		case 243500809:/* atpmCctnSpceSrno */
			return getAtpmCctnSpceSrno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 581941182:/* atpmEltNo */
			setAtpmEltNo((String)value);
			break;
		case 434286323:/* atpmAcno */
			setAtpmAcno((String)value);
			break;
		case 593796734:/* atpmRgsDt */
			setAtpmRgsDt((String)value);
			break;
		case 914766416:/* atpmGiroNo */
			setAtpmGiroNo((String)value);
			break;
		case 243500809:/* atpmCctnSpceSrno */
			setAtpmCctnSpceSrno((String)value);
			break;
		default:
			break;
		}
	}
	
}
