/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"mngCnt"
}, name="PBPPbokSpceDtlEstMngRawActatpminf_DODT")
@XmlRootElement(name="PBPPbokSpceDtlEstMngRawActatpminf_DODT")
@BxmCategory(logicalName="입출금계좌.자동납부.등록.DBM.출력.IO", description="") 
public class PBPPbokSpceDtlEstMngRawActatpminf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -784009613L;
	
	
	
	/**
	 * 관리건수
	 */
	@ApiModelProperty(
		name = "mngCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("mngCnt")
	@BxmOmm_Field(length=3, decimal=0, description="관리건수", align="right", fill="")
	private Integer mngCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mngCnt= false;
	protected final boolean isSet_mngCnt(){
		return this.isSet_mngCnt;
	}
	private void setIsSet_mngCnt(boolean value){
		this.isSet_mngCnt= value;
	}
	/**
	 * 관리건수
	 */
	@XmlTransient
	public Integer getMngCnt(){
		return this.mngCnt;
	}
	
	/**
	 * 관리건수
	 * 
	 * @param mngCnt 관리건수
	 */
	public void setMngCnt(Integer mngCnt){
		this.mngCnt= mngCnt;
		this.setIsSet_mngCnt(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstMngRawActatpminf_DODT clone(){
		try{
			PBPPbokSpceDtlEstMngRawActatpminf_DODT object= (PBPPbokSpceDtlEstMngRawActatpminf_DODT)super.clone();
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
		
		result= prime * result + ((this.mngCnt==null)?0:this.mngCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstMngRawActatpminf_DODT other= (PBPPbokSpceDtlEstMngRawActatpminf_DODT)obj;
		{
			Object _mngCnt= getMngCnt();
			Object __mngCnt= other.getMngCnt();
			if ( _mngCnt== null ) { if ( __mngCnt!= null ) return false; }
			else if ( !_mngCnt.equals(__mngCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstMngRawActatpminf_DODT.class.getName()).append(":\n");
		sb.append("\tmngCnt: ");
		sb.append(mngCnt==null?"null":getMngCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* mngCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mngCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mngCnt", get("mngCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1069666141:/* mngCnt */
			return getMngCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1069666141:/* mngCnt */
			setMngCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
