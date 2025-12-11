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
	"agrtId", "agrtNm", "agrtTxt"
}, name="AgrtInfList_DODT")
@XmlRootElement(name="AgrtInfList_DODT")
@BxmCategory(logicalName="약관.정보.목록.DBM.출력.IO", description="") 
public class AgrtInfList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 573991409L;
	
	
	
	/**
	 * 약관ID
	 */
	@ApiModelProperty(
		name = "agrtId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtId")
	@BxmOmm_Field(length=10, decimal=0, description="약관ID", align="left", fill="")
	private String agrtId= "";
	
	
	/**
	 * 약관명
	 */
	@ApiModelProperty(
		name = "agrtNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtNm")
	@BxmOmm_Field(length=50, decimal=0, description="약관명", align="left", fill="")
	private String agrtNm= "";
	
	
	/**
	 * 약관내용
	 */
	@ApiModelProperty(
		name = "agrtTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtTxt")
	@BxmOmm_Field(length=4000, decimal=0, description="약관내용", align="left", fill="")
	private String agrtTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtId= false;
	protected final boolean isSet_agrtId(){
		return this.isSet_agrtId;
	}
	private void setIsSet_agrtId(boolean value){
		this.isSet_agrtId= value;
	}
	/**
	 * 약관ID
	 */
	@XmlTransient
	public String getAgrtId(){
		return this.agrtId;
	}
	
	/**
	 * 약관ID
	 * 
	 * @param agrtId 약관ID
	 */
	public void setAgrtId(String agrtId){
		this.agrtId= agrtId;
		this.setIsSet_agrtId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtNm= false;
	protected final boolean isSet_agrtNm(){
		return this.isSet_agrtNm;
	}
	private void setIsSet_agrtNm(boolean value){
		this.isSet_agrtNm= value;
	}
	/**
	 * 약관명
	 */
	@XmlTransient
	public String getAgrtNm(){
		return this.agrtNm;
	}
	
	/**
	 * 약관명
	 * 
	 * @param agrtNm 약관명
	 */
	public void setAgrtNm(String agrtNm){
		this.agrtNm= agrtNm;
		this.setIsSet_agrtNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtTxt= false;
	protected final boolean isSet_agrtTxt(){
		return this.isSet_agrtTxt;
	}
	private void setIsSet_agrtTxt(boolean value){
		this.isSet_agrtTxt= value;
	}
	/**
	 * 약관내용
	 */
	@XmlTransient
	public String getAgrtTxt(){
		return this.agrtTxt;
	}
	
	/**
	 * 약관내용
	 * 
	 * @param agrtTxt 약관내용
	 */
	public void setAgrtTxt(String agrtTxt){
		this.agrtTxt= agrtTxt;
		this.setIsSet_agrtTxt(true);
	}
				
	@Override
	public AgrtInfList_DODT clone(){
		try{
			AgrtInfList_DODT object= (AgrtInfList_DODT)super.clone();
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
		
		result= prime * result + ((this.agrtId==null)?0:this.agrtId.hashCode());
		result= prime * result + ((this.agrtNm==null)?0:this.agrtNm.hashCode());
		result= prime * result + ((this.agrtTxt==null)?0:this.agrtTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final AgrtInfList_DODT other= (AgrtInfList_DODT)obj;
		{
			Object _agrtId= getAgrtId();
			Object __agrtId= other.getAgrtId();
			if ( _agrtId== null ) { if ( __agrtId!= null ) return false; }
			else if ( !_agrtId.equals(__agrtId) ) return false;
		}
		{
			Object _agrtNm= getAgrtNm();
			Object __agrtNm= other.getAgrtNm();
			if ( _agrtNm== null ) { if ( __agrtNm!= null ) return false; }
			else if ( !_agrtNm.equals(__agrtNm) ) return false;
		}
		{
			Object _agrtTxt= getAgrtTxt();
			Object __agrtTxt= other.getAgrtTxt();
			if ( _agrtTxt== null ) { if ( __agrtTxt!= null ) return false; }
			else if ( !_agrtTxt.equals(__agrtTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(AgrtInfList_DODT.class.getName()).append(":\n");
		sb.append("\tagrtId: ");
		sb.append(agrtId==null?"null":getAgrtId());
		sb.append("\n");
		sb.append("\tagrtNm: ");
		sb.append(agrtNm==null?"null":getAgrtNm());
		sb.append("\n");
		sb.append("\tagrtTxt: ");
		sb.append(agrtTxt==null?"null":getAgrtTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* agrtId */
		messageLen+= 50; /* agrtNm */
		messageLen+= 4000; /* agrtTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("agrtId");
		list.add("agrtNm");
		list.add("agrtTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("agrtId", get("agrtId"));
		map.put("agrtNm", get("agrtNm"));
		map.put("agrtTxt", get("agrtTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1419306973:/* agrtId */
			return getAgrtId();
		case -1419306809:/* agrtNm */
			return getAgrtNm();
		case -1048831896:/* agrtTxt */
			return getAgrtTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1419306973:/* agrtId */
			setAgrtId((String)value);
			break;
		case -1419306809:/* agrtNm */
			setAgrtNm((String)value);
			break;
		case -1048831896:/* agrtTxt */
			setAgrtTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
