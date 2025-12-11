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
	"inqAcno", "inqStaYm"
}, name="MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT")
@BxmCategory(logicalName="머니클립지갑목표상세내역조회.컨트롤러.입력.IO", description="") 
public class MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -111799773L;
	
	
	
	/**
	 * 조회계좌번호
	 */
	@ApiModelProperty(
		name = "inqAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqAcno")
	@BxmOmm_Field(length=16, decimal=0, description="조회계좌번호", align="left", fill="")
	private String inqAcno= "";
	
	
	/**
	 * 조회시작년월
	 */
	@ApiModelProperty(
		name = "inqStaYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회시작년월", align="left", fill="")
	private String inqStaYm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqAcno= false;
	protected final boolean isSet_inqAcno(){
		return this.isSet_inqAcno;
	}
	private void setIsSet_inqAcno(boolean value){
		this.isSet_inqAcno= value;
	}
	/**
	 * 조회계좌번호
	 */
	@XmlTransient
	public String getInqAcno(){
		return this.inqAcno;
	}
	
	/**
	 * 조회계좌번호
	 * 
	 * @param inqAcno 조회계좌번호
	 */
	public void setInqAcno(String inqAcno){
		this.inqAcno= inqAcno;
		this.setIsSet_inqAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaYm= false;
	protected final boolean isSet_inqStaYm(){
		return this.isSet_inqStaYm;
	}
	private void setIsSet_inqStaYm(boolean value){
		this.isSet_inqStaYm= value;
	}
	/**
	 * 조회시작년월
	 */
	@XmlTransient
	public String getInqStaYm(){
		return this.inqStaYm;
	}
	
	/**
	 * 조회시작년월
	 * 
	 * @param inqStaYm 조회시작년월
	 */
	public void setInqStaYm(String inqStaYm){
		this.inqStaYm= inqStaYm;
		this.setIsSet_inqStaYm(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT clone(){
		try{
			MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT object= (MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT)super.clone();
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
		
		result= prime * result + ((this.inqAcno==null)?0:this.inqAcno.hashCode());
		result= prime * result + ((this.inqStaYm==null)?0:this.inqStaYm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT other= (MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT)obj;
		{
			Object _inqAcno= getInqAcno();
			Object __inqAcno= other.getInqAcno();
			if ( _inqAcno== null ) { if ( __inqAcno!= null ) return false; }
			else if ( !_inqAcno.equals(__inqAcno) ) return false;
		}
		{
			Object _inqStaYm= getInqStaYm();
			Object __inqStaYm= other.getInqStaYm();
			if ( _inqStaYm== null ) { if ( __inqStaYm!= null ) return false; }
			else if ( !_inqStaYm.equals(__inqStaYm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT.class.getName()).append(":\n");
		sb.append("\tinqAcno: ");
		sb.append(inqAcno==null?"null":getInqAcno());
		sb.append("\n");
		sb.append("\tinqStaYm: ");
		sb.append(inqStaYm==null?"null":getInqStaYm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 16; /* inqAcno */
		messageLen+= 6; /* inqStaYm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqAcno");
		list.add("inqStaYm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqAcno", get("inqAcno"));
		map.put("inqStaYm", get("inqStaYm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1954205551:/* inqAcno */
			return getInqAcno();
		case 467946696:/* inqStaYm */
			return getInqStaYm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1954205551:/* inqAcno */
			setInqAcno((String)value);
			break;
		case 467946696:/* inqStaYm */
			setInqStaYm((String)value);
			break;
		default:
			break;
		}
	}
	
}
