/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"imgUrlNm"
}, name="MetPbokImgInfInq_DIDT")
@XmlRootElement(name="MetPbokImgInfInq_DIDT")
@BxmCategory(logicalName="모임통장.이미지.정보.조회.입력.IO", description="") 
public class MetPbokImgInfInq_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 104650690L;
	
	
	
	/**
	 * 이미지URL명
	 */
	@ApiModelProperty(
		name = "imgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="이미지URL명", align="left", fill="")
	private String imgUrlNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgUrlNm= false;
	protected final boolean isSet_imgUrlNm(){
		return this.isSet_imgUrlNm;
	}
	private void setIsSet_imgUrlNm(boolean value){
		this.isSet_imgUrlNm= value;
	}
	/**
	 * 이미지URL명
	 */
	@XmlTransient
	public String getImgUrlNm(){
		return this.imgUrlNm;
	}
	
	/**
	 * 이미지URL명
	 * 
	 * @param imgUrlNm 이미지URL명
	 */
	public void setImgUrlNm(String imgUrlNm){
		this.imgUrlNm= imgUrlNm;
		this.setIsSet_imgUrlNm(true);
	}
				
	@Override
	public MetPbokImgInfInq_DIDT clone(){
		try{
			MetPbokImgInfInq_DIDT object= (MetPbokImgInfInq_DIDT)super.clone();
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
		
		result= prime * result + ((this.imgUrlNm==null)?0:this.imgUrlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokImgInfInq_DIDT other= (MetPbokImgInfInq_DIDT)obj;
		{
			Object _imgUrlNm= getImgUrlNm();
			Object __imgUrlNm= other.getImgUrlNm();
			if ( _imgUrlNm== null ) { if ( __imgUrlNm!= null ) return false; }
			else if ( !_imgUrlNm.equals(__imgUrlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokImgInfInq_DIDT.class.getName()).append(":\n");
		sb.append("\timgUrlNm: ");
		sb.append(imgUrlNm==null?"null":getImgUrlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 100; /* imgUrlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("imgUrlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("imgUrlNm", get("imgUrlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -704050805:/* imgUrlNm */
			return getImgUrlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -704050805:/* imgUrlNm */
			setImgUrlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
