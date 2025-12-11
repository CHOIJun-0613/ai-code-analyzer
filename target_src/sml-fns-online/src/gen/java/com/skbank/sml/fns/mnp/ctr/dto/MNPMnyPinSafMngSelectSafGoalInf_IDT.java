/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"moAcno", "chactNo"
}, name="MNPMnyPinSafMngSelectSafGoalInf_IDT")
@XmlRootElement(name="MNPMnyPinSafMngSelectSafGoalInf_IDT")
@BxmCategory(logicalName="머니클립.금고.목표.정보.조회.컨트롤러.입력.IO", description="") 
public class MNPMnyPinSafMngSelectSafGoalInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2100687003L;
	
	
	
	/**
	 * 모계좌번호
	 */
	@ApiModelProperty(
		name = "moAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("moAcno")
	@BxmOmm_Field(length=20, decimal=0, description="모계좌번호", align="left", fill="")
	private String moAcno= "";
	
	
	/**
	 * 자계좌번호
	 */
	@ApiModelProperty(
		name = "chactNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chactNo")
	@BxmOmm_Field(length=20, decimal=0, description="자계좌번호", align="left", fill="")
	private String chactNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_moAcno= false;
	protected final boolean isSet_moAcno(){
		return this.isSet_moAcno;
	}
	private void setIsSet_moAcno(boolean value){
		this.isSet_moAcno= value;
	}
	/**
	 * 모계좌번호
	 */
	@XmlTransient
	public String getMoAcno(){
		return this.moAcno;
	}
	
	/**
	 * 모계좌번호
	 * 
	 * @param moAcno 모계좌번호
	 */
	public void setMoAcno(String moAcno){
		this.moAcno= moAcno;
		this.setIsSet_moAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chactNo= false;
	protected final boolean isSet_chactNo(){
		return this.isSet_chactNo;
	}
	private void setIsSet_chactNo(boolean value){
		this.isSet_chactNo= value;
	}
	/**
	 * 자계좌번호
	 */
	@XmlTransient
	public String getChactNo(){
		return this.chactNo;
	}
	
	/**
	 * 자계좌번호
	 * 
	 * @param chactNo 자계좌번호
	 */
	public void setChactNo(String chactNo){
		this.chactNo= chactNo;
		this.setIsSet_chactNo(true);
	}
				
	@Override
	public MNPMnyPinSafMngSelectSafGoalInf_IDT clone(){
		try{
			MNPMnyPinSafMngSelectSafGoalInf_IDT object= (MNPMnyPinSafMngSelectSafGoalInf_IDT)super.clone();
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
		
		result= prime * result + ((this.moAcno==null)?0:this.moAcno.hashCode());
		result= prime * result + ((this.chactNo==null)?0:this.chactNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngSelectSafGoalInf_IDT other= (MNPMnyPinSafMngSelectSafGoalInf_IDT)obj;
		{
			Object _moAcno= getMoAcno();
			Object __moAcno= other.getMoAcno();
			if ( _moAcno== null ) { if ( __moAcno!= null ) return false; }
			else if ( !_moAcno.equals(__moAcno) ) return false;
		}
		{
			Object _chactNo= getChactNo();
			Object __chactNo= other.getChactNo();
			if ( _chactNo== null ) { if ( __chactNo!= null ) return false; }
			else if ( !_chactNo.equals(__chactNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngSelectSafGoalInf_IDT.class.getName()).append(":\n");
		sb.append("\tmoAcno: ");
		sb.append(moAcno==null?"null":getMoAcno());
		sb.append("\n");
		sb.append("\tchactNo: ");
		sb.append(chactNo==null?"null":getChactNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* moAcno */
		messageLen+= 20; /* chactNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("moAcno");
		list.add("chactNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("moAcno", get("moAcno"));
		map.put("chactNo", get("chactNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1069843931:/* moAcno */
			return getMoAcno();
		case 738627758:/* chactNo */
			return getChactNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1069843931:/* moAcno */
			setMoAcno((String)value);
			break;
		case 738627758:/* chactNo */
			setChactNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
