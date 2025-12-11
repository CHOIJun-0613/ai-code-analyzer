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
	"metMbhSrno", "metMbhNm", "metMbhAlsNm"
}, name="MetPbokCadAutList_DIDT")
@XmlRootElement(name="MetPbokCadAutList_DIDT")
@BxmCategory(logicalName="모임통장.카드권한.목록.DBM.입력.IO", description="") 
public class MetPbokCadAutList_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1182338528L;
	
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=40, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhAlsNm= false;
	protected final boolean isSet_metMbhAlsNm(){
		return this.isSet_metMbhAlsNm;
	}
	private void setIsSet_metMbhAlsNm(boolean value){
		this.isSet_metMbhAlsNm= value;
	}
	/**
	 * 모임회원별칭명
	 */
	@XmlTransient
	public String getMetMbhAlsNm(){
		return this.metMbhAlsNm;
	}
	
	/**
	 * 모임회원별칭명
	 * 
	 * @param metMbhAlsNm 모임회원별칭명
	 */
	public void setMetMbhAlsNm(String metMbhAlsNm){
		this.metMbhAlsNm= metMbhAlsNm;
		this.setIsSet_metMbhAlsNm(true);
	}
				
	@Override
	public MetPbokCadAutList_DIDT clone(){
		try{
			MetPbokCadAutList_DIDT object= (MetPbokCadAutList_DIDT)super.clone();
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
		
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokCadAutList_DIDT other= (MetPbokCadAutList_DIDT)obj;
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokCadAutList_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 50; /* metMbhNm */
		messageLen+= 40; /* metMbhAlsNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMbhSrno");
		list.add("metMbhNm");
		list.add("metMbhAlsNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
