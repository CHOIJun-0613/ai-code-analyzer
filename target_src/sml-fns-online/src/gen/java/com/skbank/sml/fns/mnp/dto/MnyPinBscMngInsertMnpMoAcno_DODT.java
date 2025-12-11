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
	"newAcno"
}, name="MnyPinBscMngInsertMnpMoAcno_DODT")
@XmlRootElement(name="MnyPinBscMngInsertMnpMoAcno_DODT")
@BxmCategory(logicalName="머니클립.모.계좌.등록.컴포넌트.출력.IO", description="") 
public class MnyPinBscMngInsertMnpMoAcno_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1581658034L;
	
	
	
	/**
	 * 신규계좌번호
	 */
	@ApiModelProperty(
		name = "newAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newAcno")
	@BxmOmm_Field(length=13, decimal=0, description="신규계좌번호", align="left", fill="")
	private String newAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newAcno= false;
	protected final boolean isSet_newAcno(){
		return this.isSet_newAcno;
	}
	private void setIsSet_newAcno(boolean value){
		this.isSet_newAcno= value;
	}
	/**
	 * 신규계좌번호
	 */
	@XmlTransient
	public String getNewAcno(){
		return this.newAcno;
	}
	
	/**
	 * 신규계좌번호
	 * 
	 * @param newAcno 신규계좌번호
	 */
	public void setNewAcno(String newAcno){
		this.newAcno= newAcno;
		this.setIsSet_newAcno(true);
	}
				
	@Override
	public MnyPinBscMngInsertMnpMoAcno_DODT clone(){
		try{
			MnyPinBscMngInsertMnpMoAcno_DODT object= (MnyPinBscMngInsertMnpMoAcno_DODT)super.clone();
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
		
		result= prime * result + ((this.newAcno==null)?0:this.newAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinBscMngInsertMnpMoAcno_DODT other= (MnyPinBscMngInsertMnpMoAcno_DODT)obj;
		{
			Object _newAcno= getNewAcno();
			Object __newAcno= other.getNewAcno();
			if ( _newAcno== null ) { if ( __newAcno!= null ) return false; }
			else if ( !_newAcno.equals(__newAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinBscMngInsertMnpMoAcno_DODT.class.getName()).append(":\n");
		sb.append("\tnewAcno: ");
		sb.append(newAcno==null?"null":getNewAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* newAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("newAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("newAcno", get("newAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1844635427:/* newAcno */
			return getNewAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1844635427:/* newAcno */
			setNewAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
