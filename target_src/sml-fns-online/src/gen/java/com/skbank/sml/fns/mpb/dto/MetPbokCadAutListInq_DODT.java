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
	"metMbhSrno", "metMbhNm"
}, name="MetPbokCadAutListInq_DODT")
@XmlRootElement(name="MetPbokCadAutListInq_DODT")
@BxmCategory(logicalName="모임통장.카드권한.목록.조회.DBM.출력.IO", description="") 
public class MetPbokCadAutListInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 82736642L;
	
	
	
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
				
	@Override
	public MetPbokCadAutListInq_DODT clone(){
		try{
			MetPbokCadAutListInq_DODT object= (MetPbokCadAutListInq_DODT)super.clone();
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
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokCadAutListInq_DODT other= (MetPbokCadAutListInq_DODT)obj;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokCadAutListInq_DODT.class.getName()).append(":\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 50; /* metMbhNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMbhSrno");
		list.add("metMbhNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhNm", get("metMbhNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
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
		default:
			break;
		}
	}
	
}
