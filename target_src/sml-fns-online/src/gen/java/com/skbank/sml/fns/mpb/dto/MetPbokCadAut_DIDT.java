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
	"metMngNo", "metPbokCadAutList_DIDT"
}, name="MetPbokCadAut_DIDT")
@XmlRootElement(name="MetPbokCadAut_DIDT")
@BxmCategory(logicalName="모임통장.카드권한.DBM.입력.IO", description="") 
public class MetPbokCadAut_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -435022562L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임통장.카드권한.목록.DBM.입력.IO
	 */
	@ApiModelProperty(
		name = "metPbokCadAutList_DIDT"
		, dataType = "com.skbank.sml.fns.mpb.dto.MetPbokCadAutList_DIDT"
		)
	@XmlElement
	@JsonProperty("metPbokCadAutList_DIDT")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.카드권한.목록.DBM.입력.IO", align="left", fill="")
	private MetPbokCadAutList_DIDT metPbokCadAutList_DIDT= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokCadAutList_DIDT= false;
	protected final boolean isSet_metPbokCadAutList_DIDT(){
		return this.isSet_metPbokCadAutList_DIDT;
	}
	private void setIsSet_metPbokCadAutList_DIDT(boolean value){
		this.isSet_metPbokCadAutList_DIDT= value;
	}
	/**
	 * 모임통장.카드권한.목록.DBM.입력.IO
	 */
	@XmlTransient
	public MetPbokCadAutList_DIDT getMetPbokCadAutList_DIDT(){
		return this.metPbokCadAutList_DIDT;
	}
	
	/**
	 * 모임통장.카드권한.목록.DBM.입력.IO
	 * 
	 * @param metPbokCadAutList_DIDT 모임통장.카드권한.목록.DBM.입력.IO
	 */
	public void setMetPbokCadAutList_DIDT(MetPbokCadAutList_DIDT metPbokCadAutList_DIDT){
		this.metPbokCadAutList_DIDT= metPbokCadAutList_DIDT;
		this.setIsSet_metPbokCadAutList_DIDT(true);
	}
				
	@Override
	public MetPbokCadAut_DIDT clone(){
		try{
			MetPbokCadAut_DIDT object= (MetPbokCadAut_DIDT)super.clone();
			if ( this.metPbokCadAutList_DIDT== null ) object.metPbokCadAutList_DIDT= null;
			else object.metPbokCadAutList_DIDT= (MetPbokCadAutList_DIDT)this.metPbokCadAutList_DIDT.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metPbokCadAutList_DIDT==null)?0:this.metPbokCadAutList_DIDT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokCadAut_DIDT other= (MetPbokCadAut_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metPbokCadAutList_DIDT= getMetPbokCadAutList_DIDT();
			Object __metPbokCadAutList_DIDT= other.getMetPbokCadAutList_DIDT();
			if ( _metPbokCadAutList_DIDT== null ) { if ( __metPbokCadAutList_DIDT!= null ) return false; }
			else if ( !_metPbokCadAutList_DIDT.equals(__metPbokCadAutList_DIDT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokCadAut_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetPbokCadAutList_DIDT: ");
		sb.append(metPbokCadAutList_DIDT==null?"null":getMetPbokCadAutList_DIDT());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		if ( metPbokCadAutList_DIDT != null && !(metPbokCadAutList_DIDT instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			MetPbokCadAutList_DIDT temp= metPbokCadAutList_DIDT;
			if ( temp== null ) temp= new MetPbokCadAutList_DIDT();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* metPbokCadAutList_DIDT */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metPbokCadAutList_DIDT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metPbokCadAutList_DIDT", get("metPbokCadAutList_DIDT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 541531698:/* metPbokCadAutList_DIDT */
			return getMetPbokCadAutList_DIDT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 541531698:/* metPbokCadAutList_DIDT */
			setMetPbokCadAutList_DIDT((MetPbokCadAutList_DIDT)value);
			break;
		default:
			break;
		}
	}
	
}
