/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"dpsAcno"
}, name="MNPMnyPinFncTrnInsertMnpImdtInt_DIDT")
@XmlRootElement(name="MNPMnyPinFncTrnInsertMnpImdtInt_DIDT")
@BxmCategory(logicalName="머니클립즉시이자받기.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnInsertMnpImdtInt_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -440818132L;
	
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpsAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsAcno= false;
	protected final boolean isSet_dpsAcno(){
		return this.isSet_dpsAcno;
	}
	private void setIsSet_dpsAcno(boolean value){
		this.isSet_dpsAcno= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpsAcno(){
		return this.dpsAcno;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpsAcno 수신계좌번호
	 */
	public void setDpsAcno(String dpsAcno){
		this.dpsAcno= dpsAcno;
		this.setIsSet_dpsAcno(true);
	}
				
	@Override
	public MNPMnyPinFncTrnInsertMnpImdtInt_DIDT clone(){
		try{
			MNPMnyPinFncTrnInsertMnpImdtInt_DIDT object= (MNPMnyPinFncTrnInsertMnpImdtInt_DIDT)super.clone();
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
		
		result= prime * result + ((this.dpsAcno==null)?0:this.dpsAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnInsertMnpImdtInt_DIDT other= (MNPMnyPinFncTrnInsertMnpImdtInt_DIDT)obj;
		{
			Object _dpsAcno= getDpsAcno();
			Object __dpsAcno= other.getDpsAcno();
			if ( _dpsAcno== null ) { if ( __dpsAcno!= null ) return false; }
			else if ( !_dpsAcno.equals(__dpsAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnInsertMnpImdtInt_DIDT.class.getName()).append(":\n");
		sb.append("\tdpsAcno: ");
		sb.append(dpsAcno==null?"null":getDpsAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* dpsAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsAcno", get("dpsAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			return getDpsAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			setDpsAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
