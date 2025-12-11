/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
}, name="MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT")
@XmlRootElement(name="MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT")
@BxmCategory(logicalName="이체요청.정보.수정.컨트롤러.출력.IO", description="") 
public class MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 719473749L;
	
	
	
				
	@Override
	public MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT clone(){
		try{
			MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT object= (MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT)super.clone();
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		int result= 1;
		
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT.class.getName()).append(":\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		default:
			break;
		}
	}
	
}
