/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
	"coCusMstId"
}, name="PsnByactNm_DIDT")
@XmlRootElement(name="PsnByactNm_DIDT")
@BxmCategory(logicalName="개인.계좌별명.DBM.입력.IO", description="") 
public class UCM_ACT_NCM001SelectByactNm_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1077338357L;
	
	
	
	/**
	 * 기업고객마스터ID
	 */
	@ApiModelProperty(
		name = "coCusMstId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("coCusMstId")
	@BxmOmm_Field(length=10, decimal=0, description="기업고객마스터ID", align="left", fill="")
	private String coCusMstId= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_coCusMstId= false;
	protected final boolean isSet_coCusMstId(){
		return this.isSet_coCusMstId;
	}
	private void setIsSet_coCusMstId(boolean value){
		this.isSet_coCusMstId= value;
	}
	/**
	 * 기업고객마스터ID
	 */
	@XmlTransient
	public String getCoCusMstId(){
		return this.coCusMstId;
	}
	
	/**
	 * 기업고객마스터ID
	 * 
	 * @param coCusMstId 기업고객마스터ID
	 */
	public void setCoCusMstId(String coCusMstId){
		this.coCusMstId= coCusMstId;
		this.setIsSet_coCusMstId(true);
	}
				
	@Override
	public UCM_ACT_NCM001SelectByactNm_DIDT clone(){
		try{
			UCM_ACT_NCM001SelectByactNm_DIDT object= (UCM_ACT_NCM001SelectByactNm_DIDT)super.clone();
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
		
		result= prime * result + ((this.coCusMstId==null)?0:this.coCusMstId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_ACT_NCM001SelectByactNm_DIDT other= (UCM_ACT_NCM001SelectByactNm_DIDT)obj;
		{
			Object _coCusMstId= getCoCusMstId();
			Object __coCusMstId= other.getCoCusMstId();
			if ( _coCusMstId== null ) { if ( __coCusMstId!= null ) return false; }
			else if ( !_coCusMstId.equals(__coCusMstId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_ACT_NCM001SelectByactNm_DIDT.class.getName()).append(":\n");
		sb.append("\tcoCusMstId: ");
		sb.append(coCusMstId==null?"null":getCoCusMstId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* coCusMstId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("coCusMstId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("coCusMstId", get("coCusMstId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -404023276:/* coCusMstId */
			return getCoCusMstId();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -404023276:/* coCusMstId */
			setCoCusMstId((String)value);
			break;
		default:
			break;
		}
	}
	
}
