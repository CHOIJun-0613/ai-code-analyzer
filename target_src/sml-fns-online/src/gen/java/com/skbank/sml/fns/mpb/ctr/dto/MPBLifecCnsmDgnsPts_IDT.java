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
	"itcsno", "trnMm"
}, name="MPBLifecCnsmDgnsPts_IDT")
@XmlRootElement(name="MPBLifecCnsmDgnsPts_IDT")
@BxmCategory(logicalName="생활비.소비.진단.현황.컨트롤러.입력.IO", description="") 
public class MPBLifecCnsmDgnsPts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 7128633L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 거래월
	 */
	@ApiModelProperty(
		name = "trnMm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnMm")
	@BxmOmm_Field(length=2, decimal=0, description="거래월", align="left", fill="")
	private String trnMm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnMm= false;
	protected final boolean isSet_trnMm(){
		return this.isSet_trnMm;
	}
	private void setIsSet_trnMm(boolean value){
		this.isSet_trnMm= value;
	}
	/**
	 * 거래월
	 */
	@XmlTransient
	public String getTrnMm(){
		return this.trnMm;
	}
	
	/**
	 * 거래월
	 * 
	 * @param trnMm 거래월
	 */
	public void setTrnMm(String trnMm){
		this.trnMm= trnMm;
		this.setIsSet_trnMm(true);
	}
				
	@Override
	public MPBLifecCnsmDgnsPts_IDT clone(){
		try{
			MPBLifecCnsmDgnsPts_IDT object= (MPBLifecCnsmDgnsPts_IDT)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.trnMm==null)?0:this.trnMm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBLifecCnsmDgnsPts_IDT other= (MPBLifecCnsmDgnsPts_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _trnMm= getTrnMm();
			Object __trnMm= other.getTrnMm();
			if ( _trnMm== null ) { if ( __trnMm!= null ) return false; }
			else if ( !_trnMm.equals(__trnMm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBLifecCnsmDgnsPts_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\ttrnMm: ");
		sb.append(trnMm==null?"null":getTrnMm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 2; /* trnMm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("trnMm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("trnMm", get("trnMm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 110632816:/* trnMm */
			return getTrnMm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 110632816:/* trnMm */
			setTrnMm((String)value);
			break;
		default:
			break;
		}
	}
	
}
