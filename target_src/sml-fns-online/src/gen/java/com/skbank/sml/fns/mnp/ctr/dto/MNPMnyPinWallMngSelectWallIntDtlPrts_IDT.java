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
	"dpsInpAcno", "inqBasYm"
}, name="MNPMnyPinWallMngSelectWallIntDtlPrts_IDT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntDtlPrts_IDT")
@BxmCategory(logicalName="머니클립지갑이자내역조회.입력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntDtlPrts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -61095895L;
	
	
	
	/**
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String dpsInpAcno= "";
	
	
	/**
	 * 조회기준년월
	 */
	@ApiModelProperty(
		name = "inqBasYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqBasYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회기준년월", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqBasYm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsInpAcno= false;
	protected final boolean isSet_dpsInpAcno(){
		return this.isSet_dpsInpAcno;
	}
	private void setIsSet_dpsInpAcno(boolean value){
		this.isSet_dpsInpAcno= value;
	}
	/**
	 * 수신입력계좌번호
	 */
	@XmlTransient
	public String getDpsInpAcno(){
		return this.dpsInpAcno;
	}
	
	/**
	 * 수신입력계좌번호
	 * 
	 * @param dpsInpAcno 수신입력계좌번호
	 */
	public void setDpsInpAcno(String dpsInpAcno){
		this.dpsInpAcno= dpsInpAcno;
		this.setIsSet_dpsInpAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqBasYm= false;
	protected final boolean isSet_inqBasYm(){
		return this.isSet_inqBasYm;
	}
	private void setIsSet_inqBasYm(boolean value){
		this.isSet_inqBasYm= value;
	}
	/**
	 * 조회기준년월
	 */
	@XmlTransient
	public String getInqBasYm(){
		return this.inqBasYm;
	}
	
	/**
	 * 조회기준년월
	 * 
	 * @param inqBasYm 조회기준년월
	 */
	public void setInqBasYm(String inqBasYm){
		this.inqBasYm= inqBasYm;
		this.setIsSet_inqBasYm(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntDtlPrts_IDT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntDtlPrts_IDT object= (MNPMnyPinWallMngSelectWallIntDtlPrts_IDT)super.clone();
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
		
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.inqBasYm==null)?0:this.inqBasYm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntDtlPrts_IDT other= (MNPMnyPinWallMngSelectWallIntDtlPrts_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _inqBasYm= getInqBasYm();
			Object __inqBasYm= other.getInqBasYm();
			if ( _inqBasYm== null ) { if ( __inqBasYm!= null ) return false; }
			else if ( !_inqBasYm.equals(__inqBasYm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntDtlPrts_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tinqBasYm: ");
		sb.append(inqBasYm==null?"null":getInqBasYm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 6; /* inqBasYm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("inqBasYm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("inqBasYm", get("inqBasYm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 451698108:/* inqBasYm */
			return getInqBasYm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case 451698108:/* inqBasYm */
			setInqBasYm((String)value);
			break;
		default:
			break;
		}
	}
	
}
